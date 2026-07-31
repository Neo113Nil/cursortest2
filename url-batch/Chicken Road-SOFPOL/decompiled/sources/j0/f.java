package j0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements p6.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3631d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3632e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3633f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3634g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3635h;

    public /* synthetic */ f(ArrayList arrayList, w1.n0 n0Var, int i, ArrayList arrayList2) {
        float f6 = j.f3706a;
        this.f3633f = arrayList;
        this.f3635h = n0Var;
        this.f3632e = i;
        this.f3634g = arrayList2;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f3631d) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f3633f;
                w1.n0 n0Var = (w1.n0) this.f3635h;
                float f6 = j.f3708c;
                ArrayList arrayList2 = (ArrayList) this.f3634g;
                u1.k0 k0Var = (u1.k0) obj;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    List list = (List) arrayList.get(i);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i8 = 0;
                    while (i8 < size2) {
                        iArr[i8] = ((u1.l0) list.get(i8)).f7230d + (i8 < s6.a.t(list) ? n0Var.H(f6) : 0);
                        i8++;
                    }
                    int[] iArr2 = new int[size2];
                    x.i.f8222b.c(n0Var, this.f3632e, iArr, n0Var.getLayoutDirection(), iArr2);
                    int size3 = list.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        u1.k0.g(k0Var, (u1.l0) list.get(i9), iArr2[i9], ((Number) arrayList2.get(i)).intValue());
                    }
                }
                return c6.m.f1757a;
            case 1:
                m0.e0 e0Var = (m0.e0) this.f3633f;
                u0.d dVar = (u0.d) this.f3634g;
                o.d0 d0Var = (o.d0) this.f3635h;
                if (obj == e0Var) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof w0.u) {
                    int i10 = dVar.f7143a - this.f3632e;
                    int d8 = d0Var.d(obj);
                    d0Var.h(Math.min(i10, d8 >= 0 ? d0Var.f5436c[d8] : Integer.MAX_VALUE), obj);
                }
                return c6.m.f1757a;
            default:
                u1.l0[] l0VarArr = (u1.l0[]) this.f3633f;
                x.l0 l0Var = (x.l0) this.f3634g;
                int[] iArr3 = (int[]) this.f3635h;
                u1.k0 k0Var2 = (u1.k0) obj;
                int length = l0VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    u1.l0 l0Var2 = l0VarArr[i11];
                    int i13 = i12 + 1;
                    q6.i.b(l0Var2);
                    Object g3 = l0Var2.g();
                    x.j0 j0Var = g3 instanceof x.j0 ? (x.j0) g3 : null;
                    x.t tVar = j0Var != null ? j0Var.f8231c : null;
                    int i14 = this.f3632e;
                    u1.k0.g(k0Var2, l0Var2, iArr3[i12], tVar != null ? tVar.a(i14 - l0Var2.f7231e, r2.l.f6529d) : l0Var.f8242b.a(0, i14 - l0Var2.f7231e));
                    i11++;
                    i12 = i13;
                }
                return c6.m.f1757a;
        }
    }

    public /* synthetic */ f(m0.e0 e0Var, u0.d dVar, o.d0 d0Var, int i) {
        this.f3633f = e0Var;
        this.f3634g = dVar;
        this.f3635h = d0Var;
        this.f3632e = i;
    }

    public /* synthetic */ f(u1.l0[] l0VarArr, x.l0 l0Var, int i, int[] iArr) {
        this.f3633f = l0VarArr;
        this.f3634g = l0Var;
        this.f3632e = i;
        this.f3635h = iArr;
    }
}
