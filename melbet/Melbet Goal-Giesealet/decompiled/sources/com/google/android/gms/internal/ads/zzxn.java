package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzxn extends zzbj {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzxn() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    protected final zzxn zzx(zzbk zzbkVar) {
        super.zza(zzbkVar);
        return this;
    }

    public final zzxn zzy(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i) == z) {
            return this;
        }
        if (z) {
            sparseBooleanArray.put(i, true);
            return this;
        }
        sparseBooleanArray.delete(i);
        return this;
    }

    final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    /* synthetic */ zzxn(zzxo zzxoVar, byte[] bArr) {
        super(zzxoVar);
        this.zza = zzxoVar.zzK;
        this.zzb = zzxoVar.zzM;
        this.zzc = zzxoVar.zzO;
        this.zzd = zzxoVar.zzT;
        this.zze = zzxoVar.zzU;
        this.zzf = zzxoVar.zzV;
        this.zzg = zzxoVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray zze = zzxoVar.zze();
            if (i < zze.size()) {
                sparseArray.put(zze.keyAt(i), new HashMap((Map) zze.valueAt(i)));
                i++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzxoVar.zzf().clone();
                return;
            }
        }
    }
}
