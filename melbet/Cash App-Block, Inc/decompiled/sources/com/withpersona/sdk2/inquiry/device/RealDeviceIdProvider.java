package com.withpersona.sdk2.inquiry.device;

import android.content.Context;
import android.content.SharedPreferences;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes9.dex */
public final class RealDeviceIdProvider {
    public final Context context;
    public String deviceId;
    public final Lazy prefs$delegate;

    public RealDeviceIdProvider(Context context) {
        context.getClass();
        this.context = context;
        this.prefs$delegate = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 4));
    }

    public final void setDeviceId(String str) {
        if ((!str.equals(this.deviceId) ? str : null) != null) {
            this.deviceId = str;
            ((SharedPreferences) this.prefs$delegate.getValue()).edit().putString("DEVICE_ID", this.deviceId).apply();
        }
    }
}
