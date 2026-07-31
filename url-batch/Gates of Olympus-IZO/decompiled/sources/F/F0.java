package F;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F0 extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ArrayList f926h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f927i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f928j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f929k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r.U f930l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r0.Q f931m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f932n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f933o;
    public final /* synthetic */ Integer p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ArrayList f934q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Integer f935r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, T t3, int i3, int i4, r.U u3, r0.Q q2, int i5, int i6, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f923e = arrayList;
        this.f924f = arrayList2;
        this.f925g = arrayList3;
        this.f926h = arrayList4;
        this.f927i = t3;
        this.f928j = i3;
        this.f929k = i4;
        this.f930l = u3;
        this.f931m = q2;
        this.f932n = i5;
        this.f933o = i6;
        this.p = num;
        this.f934q = arrayList5;
        this.f935r = num2;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        int i3;
        r0.G g3 = (r0.G) obj;
        ArrayList arrayList = this.f923e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            r0.G.d(g3, (r0.H) arrayList.get(i4), 0, 0);
        }
        ArrayList arrayList2 = this.f924f;
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            r0.G.d(g3, (r0.H) arrayList2.get(i5), 0, 0);
        }
        ArrayList arrayList3 = this.f925g;
        int size3 = arrayList3.size();
        int i6 = 0;
        while (true) {
            i3 = this.f932n;
            if (i6 >= size3) {
                break;
            }
            r0.H h3 = (r0.H) arrayList3.get(i6);
            int i7 = (this.f928j - this.f929k) / 2;
            r0.Q q2 = this.f931m;
            r0.G.d(g3, h3, this.f930l.d(q2, q2.getLayoutDirection()) + i7, i3 - this.f933o);
            i6++;
        }
        ArrayList arrayList4 = this.f926h;
        int size4 = arrayList4.size();
        for (int i8 = 0; i8 < size4; i8++) {
            r0.H h4 = (r0.H) arrayList4.get(i8);
            Integer num = this.p;
            r0.G.d(g3, h4, 0, i3 - (num != null ? num.intValue() : 0));
        }
        T t3 = this.f927i;
        if (t3 != null) {
            ArrayList arrayList5 = this.f934q;
            int size5 = arrayList5.size();
            for (int i9 = 0; i9 < size5; i9++) {
                r0.H h5 = (r0.H) arrayList5.get(i9);
                Integer num2 = this.f935r;
                Z1.i.c(num2);
                r0.G.d(g3, h5, t3.f1105a, i3 - num2.intValue());
            }
        }
        return L1.z.f2729a;
    }
}
