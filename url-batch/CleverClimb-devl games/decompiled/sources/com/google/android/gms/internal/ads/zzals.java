package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzals {
    private final List<String> zzctc = new ArrayList();
    private final List<Double> zzctd = new ArrayList();
    private final List<Double> zzcte = new ArrayList();

    public final zzals zza(String str, double d2, double d3) {
        int i = 0;
        while (i < this.zzctc.size()) {
            double doubleValue = this.zzcte.get(i).doubleValue();
            double doubleValue2 = this.zzctd.get(i).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.zzctc.add(i, str);
        this.zzcte.add(i, Double.valueOf(d2));
        this.zzctd.add(i, Double.valueOf(d3));
        return this;
    }

    public final zzalp zzrz() {
        return new zzalp(this);
    }
}
