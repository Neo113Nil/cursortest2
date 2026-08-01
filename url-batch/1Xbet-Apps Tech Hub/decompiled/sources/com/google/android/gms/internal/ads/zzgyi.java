package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgyi extends zzguw {
    final zzgym zza;
    zzguy zzb = zzb();
    final /* synthetic */ zzgyo zzc;

    zzgyi(zzgyo zzgyoVar) {
        this.zzc = zzgyoVar;
        this.zza = new zzgym(zzgyoVar, null);
    }

    private final zzguy zzb() {
        zzgym zzgymVar = this.zza;
        if (zzgymVar.hasNext()) {
            return zzgymVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzguy
    public final byte zza() {
        zzguy zzguyVar = this.zzb;
        if (zzguyVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzguyVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
