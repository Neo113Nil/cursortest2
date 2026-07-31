package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: classes.dex */
public final class d84 extends ns0 {
    public static final d84 O;

    @Deprecated
    public static final d84 P;
    public static final my3<d84> Q;
    public final int B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    private final SparseArray<Map<hm0, h84>> M;
    private final SparseBooleanArray N;

    static {
        d84 d84Var = new d84(new f84());
        O = d84Var;
        P = d84Var;
        Q = new my3() { // from class: com.google.android.gms.internal.ads.b84
        };
    }

    private d84(f84 f84Var) {
        super(f84Var);
        this.C = f84Var.f5037k;
        this.D = false;
        this.E = f84Var.f5038l;
        this.F = f84Var.f5039m;
        this.G = false;
        this.H = false;
        this.I = false;
        this.B = 0;
        this.J = f84Var.f5040n;
        this.K = false;
        this.L = f84Var.f5041o;
        this.M = f84Var.f5042p;
        this.N = f84Var.f5043q;
    }

    public static d84 c(Context context) {
        return new d84(new f84(context));
    }

    public final f84 d() {
        return new f84(this, null);
    }

    public final h84 e(int i7, hm0 hm0Var) {
        Map<hm0, h84> map = this.M.get(i7);
        if (map != null) {
            return map.get(hm0Var);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ns0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d84.class == obj.getClass()) {
            d84 d84Var = (d84) obj;
            if (super.equals(d84Var) && this.C == d84Var.C && this.E == d84Var.E && this.F == d84Var.F && this.J == d84Var.J && this.L == d84Var.L) {
                SparseBooleanArray sparseBooleanArray = this.N;
                SparseBooleanArray sparseBooleanArray2 = d84Var.N;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            SparseArray<Map<hm0, h84>> sparseArray = this.M;
                            SparseArray<Map<hm0, h84>> sparseArray2 = d84Var.M;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i8 = 0; i8 < size2; i8++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                    if (indexOfKey >= 0) {
                                        Map<hm0, h84> valueAt = sparseArray.valueAt(i8);
                                        Map<hm0, h84> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                        if (valueAt2.size() == valueAt.size()) {
                                            for (Map.Entry<hm0, h84> entry : valueAt.entrySet()) {
                                                hm0 key = entry.getKey();
                                                if (valueAt2.containsKey(key) && n13.p(entry.getValue(), valueAt2.get(key))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f(int i7) {
        return this.N.get(i7);
    }

    public final boolean g(int i7, hm0 hm0Var) {
        Map<hm0, h84> map = this.M.get(i7);
        return map != null && map.containsKey(hm0Var);
    }

    @Override // com.google.android.gms.internal.ads.ns0
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 961) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 28629151) + (this.J ? 1 : 0)) * 961) + (this.L ? 1 : 0);
    }
}
