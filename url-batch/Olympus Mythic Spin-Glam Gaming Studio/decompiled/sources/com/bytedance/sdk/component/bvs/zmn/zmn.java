package com.bytedance.sdk.component.bvs.zmn;

/* loaded from: classes13.dex */
public class zmn {
    private static volatile zmn fs;
    private volatile fs zmn;

    private zmn() {
    }

    public static zmn zmn() {
        if (fs == null) {
            synchronized (zmn.class) {
                try {
                    if (fs == null) {
                        fs = new zmn();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    public void zmn(fs fsVar) {
        this.zmn = fsVar;
    }

    public fs fs() {
        return this.zmn;
    }
}
