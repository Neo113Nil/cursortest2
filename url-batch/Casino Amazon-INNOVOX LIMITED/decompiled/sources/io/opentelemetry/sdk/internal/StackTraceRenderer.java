package io.opentelemetry.sdk.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes3.dex */
class StackTraceRenderer {
    private static final String CAUSED_BY = "Caused by: ";
    private static final String SUPPRESSED = "Suppressed: ";
    private final StringBuilder builder = new StringBuilder();
    private final int lengthLimit;
    private final Throwable throwable;

    StackTraceRenderer(Throwable th, int i) {
        this.throwable = th;
        this.lengthLimit = i;
    }

    String render() {
        if (this.builder.length() == 0) {
            appendStackTrace();
        }
        StringBuilder sb = this.builder;
        return sb.substring(0, Math.min(sb.length(), this.lengthLimit));
    }

    private void appendStackTrace() {
        this.builder.append(this.throwable).append(System.lineSeparator());
        if (isOverLimit()) {
            return;
        }
        StackTraceElement[] stackTrace = this.throwable.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            this.builder.append("\tat ").append(stackTraceElement).append(System.lineSeparator());
            if (isOverLimit()) {
                return;
            }
        }
        Set<Throwable> newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(this.throwable);
        for (Throwable th : this.throwable.getSuppressed()) {
            appendInnerStacktrace(stackTrace, th, "\t", SUPPRESSED, newSetFromMap);
        }
        Throwable cause = this.throwable.getCause();
        if (cause != null) {
            appendInnerStacktrace(stackTrace, cause, "", CAUSED_BY, newSetFromMap);
        }
    }

    private boolean appendInnerStacktrace(StackTraceElement[] stackTraceElementArr, Throwable th, String str, String str2, Set<Throwable> set) {
        if (set.contains(th)) {
            this.builder.append(str).append(str2).append("[CIRCULAR REFERENCE: ").append(th).append("]").append(System.lineSeparator());
            return true;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTraceElementArr.length - 1;
        int length2 = stackTrace.length - 1;
        while (length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTrace[length2])) {
            length--;
            length2--;
        }
        this.builder.append(str).append(str2).append(th).append(System.lineSeparator());
        if (isOverLimit()) {
            return true;
        }
        for (int i = 0; i <= length2; i++) {
            this.builder.append(str).append("\tat ").append(stackTrace[i]).append(System.lineSeparator());
            if (isOverLimit()) {
                return true;
            }
        }
        int length3 = (stackTrace.length - 1) - length2;
        if (length3 != 0) {
            this.builder.append(str).append("\t... ").append(length3).append(" more").append(System.lineSeparator());
            if (isOverLimit()) {
                return true;
            }
        }
        Throwable[] suppressed = th.getSuppressed();
        int length4 = suppressed.length;
        int i2 = 0;
        while (i2 < length4) {
            Set<Throwable> set2 = set;
            if (appendInnerStacktrace(stackTrace, suppressed[i2], str + "\t", SUPPRESSED, set2)) {
                return true;
            }
            i2++;
            set = set2;
        }
        Set<Throwable> set3 = set;
        Throwable cause = th.getCause();
        if (cause != null) {
            return appendInnerStacktrace(stackTrace, cause, str, CAUSED_BY, set3);
        }
        return false;
    }

    private boolean isOverLimit() {
        return this.builder.length() >= this.lengthLimit;
    }
}
