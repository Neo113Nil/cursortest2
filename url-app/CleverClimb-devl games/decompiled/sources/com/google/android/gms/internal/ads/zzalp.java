package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@zzadh
/* loaded from: classes2.dex */
public final class zzalp {
    private final String[] zzcsu;
    private final double[] zzcsv;
    private final double[] zzcsw;
    private final int[] zzcsx;
    private int zzcsy;

    private zzalp(zzals zzalsVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzalsVar.zzctd;
        int size = list.size();
        list2 = zzalsVar.zzctc;
        this.zzcsu = (String[]) list2.toArray(new String[size]);
        list3 = zzalsVar.zzctd;
        this.zzcsv = zzo(list3);
        list4 = zzalsVar.zzcte;
        this.zzcsw = zzo(list4);
        this.zzcsx = new int[size];
        this.zzcsy = 0;
    }

    private static double[] zzo(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final void zza(double d2) {
        this.zzcsy++;
        for (int i = 0; i < this.zzcsw.length; i++) {
            if (this.zzcsw[i] <= d2 && d2 < this.zzcsv[i]) {
                int[] iArr = this.zzcsx;
                iArr[i] = iArr[i] + 1;
            }
            if (d2 < this.zzcsw[i]) {
                return;
            }
        }
    }

    public final List<zzalr> zzry() {
        ArrayList arrayList = new ArrayList(this.zzcsu.length);
        for (int i = 0; i < this.zzcsu.length; i++) {
            String str = this.zzcsu[i];
            double d2 = this.zzcsw[i];
            double d3 = this.zzcsv[i];
            double d4 = this.zzcsx[i];
            double d5 = this.zzcsy;
            Double.isNaN(d4);
            Double.isNaN(d5);
            arrayList.add(new zzalr(str, d2, d3, d4 / d5, this.zzcsx[i]));
        }
        return arrayList;
    }
}
