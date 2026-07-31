package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class En {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Dn a(Throwable th, int i4, int i5) {
        StackTraceElement[] stackTraceElementArr;
        Dn dn;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ArrayList arrayList = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(new Dl(stackTraceElement));
        }
        Throwable cause = th.getCause();
        ArrayList arrayList2 = null;
        if (cause != null) {
            if (i5 >= i4) {
                cause = null;
            }
            if (cause != null) {
                dn = a(cause, 30, i5 + 1);
                if (i5 < i4) {
                    Throwable[] suppressed = th.getSuppressed();
                    arrayList2 = new ArrayList(suppressed.length);
                    for (Throwable th2 : suppressed) {
                        arrayList2.add(a(th2, 1, i5));
                    }
                }
                return new Dn(name, message, arrayList, dn, arrayList2);
            }
        }
        dn = null;
        if (i5 < i4) {
        }
        return new Dn(name, message, arrayList, dn, arrayList2);
    }
}
