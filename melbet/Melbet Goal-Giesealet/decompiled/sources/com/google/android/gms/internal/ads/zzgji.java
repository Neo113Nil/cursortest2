package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzgji extends zzgiv {
    final /* synthetic */ zzgjk zza;
    private final Object zzb;
    private int zzc;

    zzgji(zzgjk zzgjkVar, int i) {
        Objects.requireNonNull(zzgjkVar);
        this.zza = zzgjkVar;
        this.zzb = zzgjkVar.zzo(i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i != -1) {
            zzgjk zzgjkVar = this.zza;
            if (i < zzgjkVar.size() && Objects.equals(this.zzb, zzgjkVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgiv, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgiv, java.util.Map.Entry
    public final Object getValue() {
        zzgjk zzgjkVar = this.zza;
        Map zzc = zzgjkVar.zzc();
        if (zzc != null) {
            return zzc.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgjkVar.zzp(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgiv, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgjk zzgjkVar = this.zza;
        Map zzc = zzgjkVar.zzc();
        if (zzc != null) {
            return zzc.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            zzgjkVar.put(this.zzb, obj);
            return null;
        }
        Object zzp = zzgjkVar.zzp(i);
        zzgjkVar.zzq(this.zzc, obj);
        return zzp;
    }
}
