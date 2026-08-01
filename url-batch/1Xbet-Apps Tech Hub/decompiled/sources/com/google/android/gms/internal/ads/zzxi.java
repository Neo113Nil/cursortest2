package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzxi extends zzdi {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    @Deprecated
    public zzxi() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    private final void zzx() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdi
    public final /* synthetic */ zzdi zzf(int i, int i2, boolean z) {
        super.zzf(i, i2, true);
        return this;
    }

    public final zzxi zzp(int i, boolean z) {
        if (this.zzi.get(i) != z) {
            if (z) {
                this.zzi.put(i, true);
            } else {
                this.zzi.delete(i);
            }
        }
        return this;
    }

    public zzxi(Context context) {
        super.zze(context);
        Point zzu = zzfs.zzu(context);
        zzf(zzu.x, zzu.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzx();
    }

    /* synthetic */ zzxi(zzxk zzxkVar, zzxh zzxhVar) {
        super(zzxkVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.zza = zzxkVar.zzH;
        this.zzb = zzxkVar.zzJ;
        this.zzc = zzxkVar.zzL;
        this.zzd = zzxkVar.zzQ;
        this.zze = zzxkVar.zzR;
        this.zzf = zzxkVar.zzS;
        this.zzg = zzxkVar.zzU;
        sparseArray = zzxkVar.zzao;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.zzh = sparseArray2;
        sparseBooleanArray = zzxkVar.zzap;
        this.zzi = sparseBooleanArray.clone();
    }
}
