package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3286h extends C2683Na {

    /* renamed from: F, reason: collision with root package name */
    public static final C3286h f31120F = new C3286h(new C3232g());

    /* renamed from: A, reason: collision with root package name */
    public final boolean f31121A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f31122B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f31123C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f31124D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f31125E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f31126w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f31127x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f31128y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f31129z;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public C3286h(C3232g c3232g) {
        super(c3232g);
        this.f31126w = c3232g.f30934w;
        this.f31127x = c3232g.f30935x;
        this.f31128y = c3232g.f30936y;
        this.f31129z = c3232g.f30937z;
        this.f31121A = c3232g.f30929A;
        this.f31122B = c3232g.f30930B;
        this.f31123C = c3232g.f30931C;
        this.f31124D = c3232g.f30932D;
        this.f31125E = c3232g.f30933E;
    }

    @Override // com.google.android.gms.internal.ads.C2683Na
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3286h.class == obj.getClass()) {
            C3286h c3286h = (C3286h) obj;
            if (super.equals(c3286h) && this.f31126w == c3286h.f31126w && this.f31127x == c3286h.f31127x && this.f31128y == c3286h.f31128y && this.f31129z == c3286h.f31129z && this.f31121A == c3286h.f31121A && this.f31122B == c3286h.f31122B && this.f31123C == c3286h.f31123C) {
                SparseBooleanArray sparseBooleanArray = this.f31125E;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = c3286h.f31125E;
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f31124D;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = c3286h.f31124D;
                            if (sparseArray2.size() == size2) {
                                for (int i4 = 0; i4 < size2; i4++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i4));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i4);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                C3041cR c3041cR = (C3041cR) entry.getKey();
                                                if (map2.containsKey(c3041cR) && Objects.equals(entry.getValue(), map2.get(c3041cR))) {
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

    @Override // com.google.android.gms.internal.ads.C2683Na
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f31126w ? 1 : 0)) * 961) + (this.f31127x ? 1 : 0)) * 961) + (this.f31128y ? 1 : 0)) * 28629151) + (this.f31129z ? 1 : 0)) * 31) + (this.f31121A ? 1 : 0)) * 31) + (this.f31122B ? 1 : 0)) * 961) + (this.f31123C ? 1 : 0)) * 31;
    }
}
