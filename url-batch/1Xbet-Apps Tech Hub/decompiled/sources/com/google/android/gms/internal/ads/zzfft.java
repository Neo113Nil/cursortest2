package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzfft implements zzhdp {
    private final zzffs zza;

    public zzfft(zzffs zzffsVar) {
        this.zza = zzffsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhec
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzhdx.zzb(defaultClock);
        return defaultClock;
    }
}
