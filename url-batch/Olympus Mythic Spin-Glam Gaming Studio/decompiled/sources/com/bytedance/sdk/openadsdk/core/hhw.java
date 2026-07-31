package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.nps;

/* loaded from: classes5.dex */
public class hhw extends nps {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile hhw zmn;

    @Override // com.bytedance.sdk.openadsdk.core.nps
    public /* bridge */ /* synthetic */ nps.zn zmn() {
        return super.zmn();
    }

    public static hhw zmn(Context context) {
        if (zmn == null) {
            synchronized (hhw.class) {
                try {
                    if (zmn == null) {
                        zmn = new hhw(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private hhw(Context context) {
        super(context);
    }
}
