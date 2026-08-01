package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzwg {
    private int zza;
    private final SparseArray zzb;
    private final zzej zzc;

    public zzwg() {
        zzwf zzwfVar = new zzej() { // from class: com.google.android.gms.internal.ads.zzwf
        };
        throw null;
    }

    public final Object zzb() {
        return this.zzb.valueAt(this.zzb.size() - 1);
    }

    public final void zzc(int i, Object obj) {
        if (this.zza == -1) {
            zzef.zzf(this.zzb.size() == 0);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int keyAt = this.zzb.keyAt(r0.size() - 1);
            zzef.zzd(i >= keyAt);
            if (keyAt == i) {
                zzvz.zzm((zzvx) this.zzb.valueAt(r0.size() - 1));
            }
        }
        this.zzb.append(i, obj);
    }

    public final void zzd() {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzvz.zzm((zzvx) this.zzb.valueAt(i));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i) {
        int i2 = 0;
        while (i2 < this.zzb.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.zzb.keyAt(i3)) {
                return;
            }
            zzvz.zzm((zzvx) this.zzb.valueAt(i2));
            this.zzb.removeAt(i2);
            int i4 = this.zza;
            if (i4 > 0) {
                this.zza = i4 - 1;
            }
            i2 = i3;
        }
    }

    public final boolean zzf() {
        return this.zzb.size() == 0;
    }

    public zzwg(zzej zzejVar) {
        this.zzb = new SparseArray();
        this.zzc = zzejVar;
        this.zza = -1;
    }

    public final Object zza(int i) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i2 = this.zza;
            if (i2 > 0 && i < this.zzb.keyAt(i2)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }
}
