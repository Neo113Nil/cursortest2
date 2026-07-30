package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.i;

/* loaded from: classes3.dex */
public enum zzob {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(i.DOUBLE_EPSILON)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzka.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzob(Object obj) {
        this.zzk = obj;
    }
}
