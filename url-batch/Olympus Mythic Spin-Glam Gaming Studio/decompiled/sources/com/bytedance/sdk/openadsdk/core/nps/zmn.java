package com.bytedance.sdk.openadsdk.core.nps;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.openadsdk.core.nps.zn;

/* loaded from: classes5.dex */
public class zmn extends zn {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile zmn zmn;

    @Override // com.bytedance.sdk.openadsdk.core.nps.zn
    public /* bridge */ /* synthetic */ zn.C0176zn zmn() {
        return super.zmn();
    }

    public static zmn zmn(Context context) {
        if (zmn == null) {
            synchronized (zmn.class) {
                try {
                    if (zmn == null) {
                        zmn = new zmn(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    private zmn(Context context) {
        super(context);
    }
}
