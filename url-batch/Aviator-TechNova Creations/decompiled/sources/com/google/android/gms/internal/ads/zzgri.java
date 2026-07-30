package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgri extends zzgrp {
    final /* synthetic */ zzgqq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgri(zzgrr zzgrrVar, CharSequence charSequence, zzgqq zzgqqVar) {
        super(zzgrrVar, charSequence);
        this.zza = zzgqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    final int zzc(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzgrc.zzn(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    final int zzd(int i) {
        return i + 1;
    }
}
