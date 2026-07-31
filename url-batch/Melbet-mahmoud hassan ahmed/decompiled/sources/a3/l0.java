package a3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f101a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f102b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f103c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f104d;

    /* renamed from: e, reason: collision with root package name */
    private int f105e;

    /* synthetic */ l0(j0 j0Var, k0 k0Var) {
        List list;
        List list2;
        List list3;
        List list4;
        list = j0Var.f94b;
        int size = list.size();
        list2 = j0Var.f93a;
        this.f101a = (String[]) list2.toArray(new String[size]);
        list3 = j0Var.f94b;
        this.f102b = c(list3);
        list4 = j0Var.f95c;
        this.f103c = c(list4);
        this.f104d = new int[size];
        this.f105e = 0;
    }

    private static final double[] c(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = list.get(i7).doubleValue();
        }
        return dArr;
    }

    public final List<i0> a() {
        ArrayList arrayList = new ArrayList(this.f101a.length);
        int i7 = 0;
        while (true) {
            String[] strArr = this.f101a;
            if (i7 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i7];
            double d7 = this.f103c[i7];
            double d8 = this.f102b[i7];
            int i8 = this.f104d[i7];
            double d9 = i8;
            double d10 = this.f105e;
            Double.isNaN(d9);
            Double.isNaN(d10);
            arrayList.add(new i0(str, d7, d8, d9 / d10, i8));
            i7++;
        }
    }

    public final void b(double d7) {
        this.f105e++;
        int i7 = 0;
        while (true) {
            double[] dArr = this.f103c;
            if (i7 >= dArr.length) {
                return;
            }
            double d8 = dArr[i7];
            if (d8 <= d7 && d7 < this.f102b[i7]) {
                int[] iArr = this.f104d;
                iArr[i7] = iArr[i7] + 1;
            }
            if (d7 < d8) {
                return;
            } else {
                i7++;
            }
        }
    }
}
