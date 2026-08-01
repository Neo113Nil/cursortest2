package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzxk extends zzdj {
    public static final zzxk zzE;

    @Deprecated
    public static final zzxk zzF;
    public static final zzn zzG;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    private static final String zzam;
    private static final String zzan;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    private final SparseArray zzao;
    private final SparseBooleanArray zzap;

    static {
        zzxk zzxkVar = new zzxk(new zzxi());
        zzE = zzxkVar;
        zzF = zzxkVar;
        zzV = Integer.toString(1000, 36);
        zzW = Integer.toString(1001, 36);
        zzX = Integer.toString(1002, 36);
        zzY = Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        zzZ = Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        zzaa = Integer.toString(1005, 36);
        zzab = Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        zzac = Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        zzad = Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        zzae = Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        zzaf = Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        zzag = Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        zzah = Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        zzai = Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        zzaj = Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        zzak = Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        zzal = Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        zzam = Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        zzan = Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
        zzG = new zzn() { // from class: com.google.android.gms.internal.ads.zzxg
        };
    }

    private zzxk(zzxi zzxiVar) {
        super(zzxiVar);
        this.zzH = zzxiVar.zza;
        this.zzI = false;
        this.zzJ = zzxiVar.zzb;
        this.zzK = false;
        this.zzL = zzxiVar.zzc;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = zzxiVar.zzd;
        this.zzR = zzxiVar.zze;
        this.zzS = zzxiVar.zzf;
        this.zzT = false;
        this.zzU = zzxiVar.zzg;
        this.zzao = zzxiVar.zzh;
        this.zzap = zzxiVar.zzi;
    }

    public static zzxk zzd(Context context) {
        return new zzxk(new zzxi(context));
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxk zzxkVar = (zzxk) obj;
            if (super.equals(zzxkVar) && this.zzH == zzxkVar.zzH && this.zzJ == zzxkVar.zzJ && this.zzL == zzxkVar.zzL && this.zzQ == zzxkVar.zzQ && this.zzR == zzxkVar.zzR && this.zzS == zzxkVar.zzS && this.zzU == zzxkVar.zzU) {
                SparseBooleanArray sparseBooleanArray = this.zzap;
                SparseBooleanArray sparseBooleanArray2 = zzxkVar.zzap;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzao;
                            SparseArray sparseArray2 = zzxkVar.zzao;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwl zzwlVar = (zzwl) entry.getKey();
                                                if (map2.containsKey(zzwlVar) && zzfs.zzF(entry.getValue(), map2.get(zzwlVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdj
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzH ? 1 : 0)) * 961) + (this.zzJ ? 1 : 0)) * 961) + (this.zzL ? 1 : 0)) * 28629151) + (this.zzQ ? 1 : 0)) * 31) + (this.zzR ? 1 : 0)) * 31) + (this.zzS ? 1 : 0)) * 961) + (this.zzU ? 1 : 0)) * 31;
    }

    public final zzxi zzc() {
        return new zzxi(this, null);
    }

    @Deprecated
    public final zzxm zze(int i, zzwl zzwlVar) {
        Map map = (Map) this.zzao.get(i);
        if (map != null) {
            return (zzxm) map.get(zzwlVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzap.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzwl zzwlVar) {
        Map map = (Map) this.zzao.get(i);
        return map != null && map.containsKey(zzwlVar);
    }
}
