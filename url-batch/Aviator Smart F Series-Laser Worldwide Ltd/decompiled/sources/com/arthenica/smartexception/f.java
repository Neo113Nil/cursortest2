package com.arthenica.smartexception;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes.dex */
public class f {
    private final f cause;
    private final String className;
    private final String message;
    private final e[] stackTrace;
    private final f[] suppressed;

    public f(Throwable th) {
        this(th, Collections.newSetFromMap(new IdentityHashMap()));
    }

    public f getCause() {
        return this.cause;
    }

    public String getClassName() {
        return this.className;
    }

    public String getMessage() {
        return this.message;
    }

    public e[] getStackTrace() {
        return this.stackTrace;
    }

    public f[] getSuppressed() {
        return this.suppressed;
    }

    public f(Throwable th, Set<Throwable> set) {
        set.add(th);
        this.message = th.getMessage();
        if (th.getCause() == null || set.contains(th.getCause())) {
            this.cause = null;
        } else {
            this.cause = new f(th.getCause(), set);
        }
        this.className = th.getClass().getName();
        Throwable[] suppressed = th.getSuppressed();
        LinkedList linkedList = new LinkedList();
        int length = suppressed.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (!set.contains(suppressed[i8])) {
                linkedList.add(new f(suppressed[i8], set));
            }
        }
        this.suppressed = (f[]) linkedList.toArray(new f[0]);
        StackTraceElement[] stackTrace = th.getStackTrace();
        this.stackTrace = new e[stackTrace.length];
        int length2 = stackTrace.length;
        for (int i9 = 0; i9 < length2; i9++) {
            this.stackTrace[i9] = new e(stackTrace[i9]);
        }
    }

    public f(String str, f fVar, String str2, f[] fVarArr, e[] eVarArr) {
        this.message = str;
        this.cause = fVar;
        this.className = str2;
        this.suppressed = fVarArr;
        this.stackTrace = eVarArr;
    }
}
