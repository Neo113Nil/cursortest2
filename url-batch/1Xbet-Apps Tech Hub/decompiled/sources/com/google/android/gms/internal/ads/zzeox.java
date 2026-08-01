package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzeox implements zzeux {
    private final String zza;

    public zzeox(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeux
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
