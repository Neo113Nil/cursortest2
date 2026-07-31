package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import h1.C2450k;
import h1.C2451l;

/* loaded from: classes2.dex */
public class OrientationLockListener {

    /* renamed from: a, reason: collision with root package name */
    public C2451l f22061a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f22062b;

    public OrientationLockListener(Context context) {
        this.f22062b = context;
        this.f22061a = new C2451l(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        C2451l c2451l = this.f22061a;
        c2451l.getClass();
        c2451l.f36751b = new C2450k(new Handler(Looper.getMainLooper()), this);
        c2451l.f36750a.getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, c2451l.f36751b);
    }

    public final native void nativeUpdateOrientationLockState(int i4);
}
