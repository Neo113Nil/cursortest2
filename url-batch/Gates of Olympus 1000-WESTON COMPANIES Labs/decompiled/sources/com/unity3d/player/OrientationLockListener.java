package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* loaded from: classes2.dex */
public class OrientationLockListener {
    public com.unity3d.player.a.M a;
    public final Context b;

    public final native void nativeUpdateOrientationLockState(int i);

    public OrientationLockListener(Context context) {
        this.b = context;
        this.a = new com.unity3d.player.a.M(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        com.unity3d.player.a.M m = this.a;
        m.getClass();
        m.b = new com.unity3d.player.a.L(new Handler(Looper.getMainLooper()), this);
        m.a.getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, m.b);
    }
}
