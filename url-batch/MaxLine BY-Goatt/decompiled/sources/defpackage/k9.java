package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k9 implements oj1 {
    public static final k9 b = new k9(0);
    public static final k9 c = new k9(1);
    public static final k9 d = new k9(2);
    public static final k9 e = new k9(3);
    public static final k9 f = new k9(4);
    public static final k9 g = new k9(5);
    public static final k9 h = new k9(6);
    public static final k9 i = new k9(7);
    public final /* synthetic */ int a;

    public /* synthetic */ k9(int i2) {
        this.a = i2;
    }

    public static final void c(ArrayList arrayList, a82 a82Var, qj1 qj1Var, ArrayList arrayList2, ArrayList arrayList3, a82 a82Var2, ArrayList arrayList4, a82 a82Var3, a82 a82Var4) {
        if (!arrayList.isEmpty()) {
            a82Var.m = qj1Var.R(12.0f) + a82Var.m;
        }
        arrayList.add(0, zv.M(arrayList2));
        arrayList3.add(Integer.valueOf(a82Var2.m));
        arrayList4.add(Integer.valueOf(a82Var.m));
        a82Var.m += a82Var2.m;
        a82Var3.m = Math.max(a82Var3.m, a82Var4.m);
        arrayList2.clear();
        a82Var4.m = 0;
        a82Var2.m = 0;
    }

    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        pj1 G;
        pj1 G2;
        pj1 G3;
        pj1 G4;
        pj1 G5;
        pj1 G6;
        pj1 G7;
        pj1 G8;
        pj1 G9;
        pj1 G10;
        pj1 G11;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    n12 c2 = ((jj1) list.get(i4)).c(j);
                    i2 = Math.max(i2, c2.m);
                    i3 = Math.max(i3, c2.n);
                    arrayList.add(c2);
                }
                if (list.isEmpty()) {
                    i2 = u10.j(j);
                    i3 = u10.i(j);
                }
                G = qj1Var.G(i2, i3, mi1.c(), new j9(0, arrayList));
                return G;
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    G2 = qj1Var.G(0, 0, mi1.c(), o3.x);
                    return G2;
                }
                if (size2 == 1) {
                    n12 c3 = ((jj1) list.get(0)).c(j);
                    G3 = qj1Var.G(c3.m, c3.n, mi1.c(), new bb(c3, 0));
                    return G3;
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < size3; i7++) {
                    n12 c4 = ((jj1) list.get(i7)).c(j);
                    i5 = Math.max(i5, c4.m);
                    i6 = Math.max(i6, c4.n);
                    arrayList2.add(c4);
                }
                G4 = qj1Var.G(i5, i6, mi1.c(), new j9(1, arrayList2));
                return G4;
            case 2:
                G5 = qj1Var.G(u10.j(j), u10.i(j), mi1.c(), new zd(1));
                return G5;
            case 3:
                G6 = qj1Var.G(u10.j(j), u10.i(j), mi1.c(), o3.B);
                return G6;
            case 4:
                G7 = qj1Var.G(u10.h(j), u10.g(j), mi1.c(), o3.N);
                return G7;
            case 5:
                G8 = qj1Var.G(u10.j(j), u10.i(j), mi1.c(), bl0.v);
                return G8;
            case 6:
                ArrayList arrayList3 = new ArrayList(list.size());
                Integer num = 0;
                int size4 = list.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    arrayList3.add(((jj1) list.get(i8)).c(j));
                }
                int size5 = arrayList3.size();
                Integer num2 = num;
                for (int i9 = 0; i9 < size5; i9++) {
                    num2 = Integer.valueOf(Math.max(num2.intValue(), ((n12) arrayList3.get(i9)).m));
                }
                int intValue = num2.intValue();
                int size6 = arrayList3.size();
                for (int i10 = 0; i10 < size6; i10++) {
                    num = Integer.valueOf(Math.max(num.intValue(), ((n12) arrayList3.get(i10)).n));
                }
                G9 = qj1Var.G(intValue, num.intValue(), mi1.c(), new j9(4, arrayList3));
                return G9;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                G10 = qj1Var.G(u10.f(j) ? u10.h(j) : 0, u10.e(j) ? u10.g(j) : 0, mi1.c(), gs1.I);
                return G10;
            default:
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                a82 a82Var = new a82();
                a82 a82Var2 = new a82();
                ArrayList arrayList7 = new ArrayList();
                a82 a82Var3 = new a82();
                int i11 = 0;
                a82 a82Var4 = new a82();
                int size7 = list.size();
                while (i11 < size7) {
                    n12 c5 = ((jj1) list.get(i11)).c(j);
                    int i12 = i11;
                    if (!arrayList7.isEmpty()) {
                        if (qj1Var.R(8.0f) + a82Var3.m + c5.m > u10.h(j)) {
                            c(arrayList4, a82Var2, qj1Var, arrayList7, arrayList5, a82Var4, arrayList6, a82Var, a82Var3);
                        }
                    }
                    if (!arrayList7.isEmpty()) {
                        a82Var3.m = qj1Var.R(8.0f) + a82Var3.m;
                    }
                    arrayList7.add(c5);
                    a82Var3.m += c5.m;
                    a82Var4.m = Math.max(a82Var4.m, c5.n);
                    i11 = i12 + 1;
                }
                if (!arrayList7.isEmpty()) {
                    c(arrayList4, a82Var2, qj1Var, arrayList7, arrayList5, a82Var4, arrayList6, a82Var, a82Var3);
                }
                int max = Math.max(a82Var.m, u10.j(j));
                G11 = qj1Var.G(max, Math.max(a82Var2.m, u10.i(j)), mi1.c(), new w5(arrayList4, qj1Var, max, arrayList6));
                return G11;
        }
    }
}
