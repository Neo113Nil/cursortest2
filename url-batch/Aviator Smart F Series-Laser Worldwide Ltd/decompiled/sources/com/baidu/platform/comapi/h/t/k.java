package com.baidu.platform.comapi.h.t;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes2.dex */
public class k {
    private static AudioManager a(Context context) {
        if (context != null) {
            return (AudioManager) context.getSystemService("audio");
        }
        return null;
    }

    public static int b(Context context) {
        if (a(context) == null) {
            return 0;
        }
        return a(context).getStreamVolume(3);
    }

    public static void a(Context context, int i8) {
        if (a(context) == null) {
            return;
        }
        a(context).setStreamVolume(3, i8, 0);
        if (a(context).isBluetoothScoOn()) {
            com.baidu.platform.comapi.h.g.a.c("VolumeUtil", "phone state isBluetoothScoOn volume=" + i8);
            a(context).setStreamVolume(6, i8, 0);
        }
    }
}
