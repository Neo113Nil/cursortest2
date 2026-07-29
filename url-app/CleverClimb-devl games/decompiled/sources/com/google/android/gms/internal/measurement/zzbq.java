package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public enum zzbq {
    NONE,
    GZIP;

    public static zzbq zzaa(String str) {
        return "GZIP".equalsIgnoreCase(str) ? GZIP : NONE;
    }
}
