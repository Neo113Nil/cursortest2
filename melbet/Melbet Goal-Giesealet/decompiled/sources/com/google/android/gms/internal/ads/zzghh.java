package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes2.dex */
final class zzghh extends zzgho {
    final /* synthetic */ zzggo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzghh(zzghq zzghqVar, CharSequence charSequence, zzggo zzggoVar) {
        super(zzghqVar, charSequence);
        this.zza = zzggoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    final int zzc(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzghc.zzn(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgho
    final int zzd(int i) {
        return i + 1;
    }
}
