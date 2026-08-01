package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
/* loaded from: classes2.dex */
final class zzfug extends zzfuj {
    final /* synthetic */ zzfuh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfug(zzfuh zzfuhVar, zzful zzfulVar, CharSequence charSequence) {
        super(zzfulVar, charSequence);
        this.zza = zzfuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final int zzc(int i) {
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < this.zzb.length()) {
            return i2;
        }
        return -1;
    }
}
