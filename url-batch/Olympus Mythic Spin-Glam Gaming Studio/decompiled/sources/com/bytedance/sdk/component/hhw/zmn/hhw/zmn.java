package com.bytedance.sdk.component.hhw.zmn.hhw;

import com.bytedance.sdk.component.hhw.zmn.nps;

/* loaded from: classes6.dex */
public class zmn {
    private static volatile fs zmn;

    public static fs zmn() {
        if (zmn == null) {
            synchronized (fs.class) {
                try {
                    if (zmn == null) {
                        zmn = new zn(nps.hhw().btk(), new hhw(nps.hhw().btk()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }
}
