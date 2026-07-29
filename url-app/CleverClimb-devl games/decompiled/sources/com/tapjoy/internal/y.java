package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class y {
    public static Object a(bb bbVar) {
        int i = 1;
        while (true) {
            try {
                return bbVar.call();
            } catch (OutOfMemoryError e) {
                if (i >= 10) {
                    throw e;
                }
                System.gc();
                i++;
            }
        }
    }
}
