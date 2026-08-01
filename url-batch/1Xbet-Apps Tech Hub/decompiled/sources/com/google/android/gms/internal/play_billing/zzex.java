package com.google.android.gms.internal.play_billing;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public enum zzex {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzba.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzex(Object obj) {
        this.zzk = obj;
    }
}
