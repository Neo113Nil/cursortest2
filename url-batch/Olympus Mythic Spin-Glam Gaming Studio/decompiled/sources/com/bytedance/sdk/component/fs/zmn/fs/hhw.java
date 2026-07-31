package com.bytedance.sdk.component.fs.zmn.fs;

/* loaded from: classes3.dex */
final class hhw {
    static long fs;
    static btk zmn;

    private hhw() {
    }

    static btk zmn() {
        synchronized (hhw.class) {
            btk btkVar = zmn;
            if (btkVar != null) {
                zmn = btkVar.hhw;
                btkVar.hhw = null;
                fs -= 8192;
                return btkVar;
            }
            return new btk();
        }
    }

    static void zmn(btk btkVar) {
        if (btkVar.hhw != null || btkVar.nps != null) {
            throw new IllegalArgumentException();
        }
        if (btkVar.fb) {
            return;
        }
        synchronized (hhw.class) {
            try {
                long j = fs;
                if (j + 8192 > 65536) {
                    return;
                }
                fs = j + 8192;
                btkVar.hhw = zmn;
                btkVar.zn = 0;
                btkVar.fs = 0;
                zmn = btkVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
