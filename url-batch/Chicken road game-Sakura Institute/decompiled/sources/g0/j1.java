package g0;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3759a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3760b;

    /* renamed from: c, reason: collision with root package name */
    public int f3761c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3762d;

    /* renamed from: e, reason: collision with root package name */
    public final i.p f3763e;

    /* renamed from: f, reason: collision with root package name */
    public final d6.o f3764f;

    public j1(int i7, ArrayList arrayList) {
        this.f3759a = arrayList;
        this.f3760b = i7;
        if (i7 < 0) {
            d.R("Invalid start index");
            throw null;
        }
        this.f3762d = new ArrayList();
        i.p pVar = new i.p();
        int size = arrayList.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            p0 p0Var = (p0) this.f3759a.get(i9);
            int i10 = p0Var.f3848c;
            int i11 = p0Var.f3849d;
            pVar.i(i10, new j0(i9, i8, i11));
            i8 += i11;
        }
        this.f3763e = pVar;
        this.f3764f = d6.a.d(new androidx.lifecycle.r0(7, this));
    }

    public final boolean a(int i7, int i8) {
        int i9;
        i.p pVar = this.f3763e;
        j0 j0Var = (j0) pVar.f(i7);
        if (j0Var == null) {
            return false;
        }
        int i10 = j0Var.f3757b;
        int i11 = i8 - j0Var.f3758c;
        j0Var.f3758c = i8;
        if (i11 == 0) {
            return true;
        }
        Object[] objArr = pVar.f4772c;
        long[] jArr = pVar.f4770a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j8 = jArr[i12];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j8) < 128) {
                        j0 j0Var2 = (j0) objArr[(i12 << 3) + i14];
                        if (j0Var2.f3757b >= i10 && !j0Var2.equals(j0Var) && (i9 = j0Var2.f3757b + i11) >= 0) {
                            j0Var2.f3757b = i9;
                        }
                    }
                    j8 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }
}
