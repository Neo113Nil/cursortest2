package com.google.android.gms.internal.ads;

import com.facebook.react.uimanager.ViewProps;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public enum zzflw {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(ViewProps.NONE);

    private final String zzd;

    zzflw(String str) {
        this.zzd = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzd;
    }
}
