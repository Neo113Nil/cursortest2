package com.facebook.bolts;

import defpackage.ah0;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AggregateException extends Exception {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 1;
    private final List<Throwable> innerThrowables;

    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || list.isEmpty()) ? null : list.get(0));
        List<Throwable> unmodifiableList = Collections.unmodifiableList(list == null ? ah0.m : list);
        unmodifiableList.getClass();
        this.innerThrowables = unmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStream.getClass();
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append((CharSequence) String.valueOf(i));
            printStream.append(": ");
            if (th != null) {
                th.printStackTrace(printStream);
            }
            printStream.append("\n");
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printWriter.getClass();
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append((CharSequence) String.valueOf(i));
            printWriter.append(": ");
            if (th != null) {
                th.printStackTrace(printWriter);
            }
            printWriter.append("\n");
        }
    }
}
