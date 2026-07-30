package d0;

import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i3 extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2054i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2055j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ c1 f2056k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2057l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2058m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q.s0 f2059n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p1.w0 f2060o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2061p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f2062q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Integer f2063r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2064s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Integer f2065t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, c1 c1Var, int i7, int i8, q.s0 s0Var, p1.w0 w0Var, int i9, int i10, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f2052g = arrayList;
        this.f2053h = arrayList2;
        this.f2054i = arrayList3;
        this.f2055j = arrayList4;
        this.f2056k = c1Var;
        this.f2057l = i7;
        this.f2058m = i8;
        this.f2059n = s0Var;
        this.f2060o = w0Var;
        this.f2061p = i9;
        this.f2062q = i10;
        this.f2063r = num;
        this.f2064s = arrayList5;
        this.f2065t = num2;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        int i7;
        p1.m0 m0Var = (p1.m0) obj;
        ArrayList arrayList = this.f2052g;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            p1.m0.d(m0Var, (p1.n0) arrayList.get(i8), 0, 0);
        }
        ArrayList arrayList2 = this.f2053h;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            p1.m0.d(m0Var, (p1.n0) arrayList2.get(i9), 0, 0);
        }
        ArrayList arrayList3 = this.f2054i;
        int size3 = arrayList3.size();
        int i10 = 0;
        while (true) {
            i7 = this.f2061p;
            if (i10 >= size3) {
                break;
            }
            p1.n0 n0Var = (p1.n0) arrayList3.get(i10);
            int i11 = (this.f2057l - this.f2058m) / 2;
            p1.w0 w0Var = this.f2060o;
            p1.m0.d(m0Var, n0Var, this.f2059n.a(w0Var, w0Var.getLayoutDirection()) + i11, i7 - this.f2062q);
            i10++;
        }
        ArrayList arrayList4 = this.f2055j;
        int size4 = arrayList4.size();
        for (int i12 = 0; i12 < size4; i12++) {
            p1.n0 n0Var2 = (p1.n0) arrayList4.get(i12);
            Integer num = this.f2063r;
            p1.m0.d(m0Var, n0Var2, 0, i7 - (num != null ? num.intValue() : 0));
        }
        c1 c1Var = this.f2056k;
        if (c1Var != null) {
            ArrayList arrayList5 = this.f2064s;
            int size5 = arrayList5.size();
            for (int i13 = 0; i13 < size5; i13++) {
                p1.n0 n0Var3 = (p1.n0) arrayList5.get(i13);
                int i14 = c1Var.f1876a;
                Integer num2 = this.f2065t;
                r6.k.c(num2);
                p1.m0.d(m0Var, n0Var3, i14, i7 - num2.intValue());
            }
        }
        return d6.z.f2639a;
    }
}
