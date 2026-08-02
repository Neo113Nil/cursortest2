package t0;

import E.AbstractC0005f;
import T.Y;
import W.J;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Map;
import java.util.Objects;
import q0.j0;

/* loaded from: classes.dex */
public final class l extends Y {

    /* renamed from: F, reason: collision with root package name */
    public static final l f15326F = new l(new C1436k());

    /* renamed from: A, reason: collision with root package name */
    public final boolean f15327A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f15328B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f15329C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f15330D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f15331E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15332w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f15333x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f15334y;
    public final boolean z;

    static {
        AbstractC0005f.s(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1001, 1002, 1003, 1004);
        AbstractC0005f.s(1005, 1006, 1007, 1008, 1009);
        AbstractC0005f.s(1010, 1011, 1012, 1013, 1014);
        J.G(1015);
        J.G(1016);
        J.G(1017);
        J.G(1018);
    }

    public l(C1436k c1436k) {
        super(c1436k);
        this.f15332w = c1436k.f15323w;
        this.f15333x = c1436k.f15324x;
        this.f15334y = c1436k.f15325y;
        this.z = c1436k.z;
        this.f15327A = c1436k.f15318A;
        this.f15328B = c1436k.f15319B;
        this.f15329C = c1436k.f15320C;
        this.f15330D = c1436k.f15321D;
        this.f15331E = c1436k.f15322E;
    }

    @Override // T.Y
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (super.equals(lVar) && this.f15332w == lVar.f15332w && this.f15333x == lVar.f15333x && this.f15334y == lVar.f15334y && this.z == lVar.z && this.f15327A == lVar.f15327A && this.f15328B == lVar.f15328B && this.f15329C == lVar.f15329C) {
                SparseBooleanArray sparseBooleanArray = lVar.f15331E;
                SparseBooleanArray sparseBooleanArray2 = this.f15331E;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            SparseArray sparseArray = lVar.f15330D;
                            SparseArray sparseArray2 = this.f15330D;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i5 = 0; i5 < size2; i5++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i5));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i5);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                j0 j0Var = (j0) entry.getKey();
                                                if (map2.containsKey(j0Var) && Objects.equals(entry.getValue(), map2.get(j0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i4)) < 0) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // T.Y
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f15332w ? 1 : 0)) * 961) + (this.f15333x ? 1 : 0)) * 961) + (this.f15334y ? 1 : 0)) * 28629151) + (this.z ? 1 : 0)) * 31) + (this.f15327A ? 1 : 0)) * 31) + (this.f15328B ? 1 : 0)) * 961) + (this.f15329C ? 1 : 0)) * 31;
    }
}
