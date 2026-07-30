package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* loaded from: classes2.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final Spatializer f26078a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26079b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f26080c;

    /* renamed from: d, reason: collision with root package name */
    public final J f26081d;

    public L(Context context, Runnable runnable, Boolean bool) {
        Spatializer spatializer;
        int immersiveAudioLevel;
        AudioManager b9 = context == null ? null : AbstractC2655Lg.b(context);
        if (b9 == null || (bool != null && bool.booleanValue())) {
            this.f26078a = null;
            this.f26079b = false;
            this.f26080c = null;
            this.f26081d = null;
            return;
        }
        spatializer = b9.getSpatializer();
        this.f26078a = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f26079b = immersiveAudioLevel != 0;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        Handler handler = new Handler(myLooper);
        this.f26080c = handler;
        J j9 = new J(this, runnable);
        this.f26081d = j9;
        spatializer.addOnSpatializerStateChangedListener(new K(handler, 0), j9);
    }

    public final List a() {
        boolean isAvailable;
        Spatializer spatializer;
        boolean isEnabled;
        Spatializer spatializer2 = this.f26078a;
        if (spatializer2 != null && this.f26079b) {
            isAvailable = spatializer2.isAvailable();
            if (isAvailable && (spatializer = this.f26078a) != null) {
                isEnabled = spatializer.isEnabled();
                if (isEnabled) {
                    if (Build.VERSION.SDK_INT < 36) {
                        return UB.j(252);
                    }
                    Spatializer spatializer3 = this.f26078a;
                    spatializer3.getClass();
                    return P.d.c(spatializer3).getSpatializedChannelMasks();
                }
            }
        }
        SB sb = UB.f27942u;
        return C3675oC.f33115x;
    }
}
