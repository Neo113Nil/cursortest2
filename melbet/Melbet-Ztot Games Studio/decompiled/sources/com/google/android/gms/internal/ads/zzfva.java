package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes3.dex */
final class zzfva extends zzfvf {
    final /* synthetic */ zzfvb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfva(zzfvb zzfvbVar, zzfvh zzfvhVar, CharSequence charSequence) {
        super(zzfvhVar, charSequence);
        this.zza = zzfvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfuu.zzb(i, length, "index");
        while (i < length) {
            zzfvb zzfvbVar = this.zza;
            if (zzfvbVar.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
