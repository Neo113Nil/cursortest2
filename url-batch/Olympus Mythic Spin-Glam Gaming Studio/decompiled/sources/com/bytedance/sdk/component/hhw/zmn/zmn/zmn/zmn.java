package com.bytedance.sdk.component.hhw.zmn.zmn.zmn;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.sdk.component.hhw.zmn.zmn.zmn.fs;

/* loaded from: classes10.dex */
public class zmn extends fs {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile zmn zmn;

    @Override // com.bytedance.sdk.component.hhw.zmn.zmn.zmn.fs
    public /* bridge */ /* synthetic */ fs.C0133fs zmn() {
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
