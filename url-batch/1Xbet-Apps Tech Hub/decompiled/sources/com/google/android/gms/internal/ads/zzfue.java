package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfue extends zzfuj {
    final /* synthetic */ zzfuf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfue(zzfuf zzfufVar, zzful zzfulVar, CharSequence charSequence) {
        super(zzfulVar, charSequence);
        this.zza = zzfufVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfty.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            zzfuf zzfufVar = this.zza;
            if (zzfufVar.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
