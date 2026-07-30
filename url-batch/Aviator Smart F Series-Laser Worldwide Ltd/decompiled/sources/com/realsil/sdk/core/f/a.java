package com.realsil.sdk.core.f;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class a {
    public static Object a(Intent intent, Class cls) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", cls);
            return parcelableExtra;
        }
        Parcelable parcelableExtra2 = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (cls.isInstance(parcelableExtra2)) {
            return parcelableExtra2;
        }
        return null;
    }
}
