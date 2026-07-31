package F;

import r.AbstractC0813j;
import r.C0806c;
import r.InterfaceC0808e;
import r.InterfaceC0809f;

/* renamed from: F.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038f extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.H f1229e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0.H f1231g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0808e f1232h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1233i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0.H f1234j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t0.O f1235k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0809f f1236l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0038f(r0.H h3, int i3, r0.H h4, InterfaceC0808e interfaceC0808e, long j3, r0.H h5, t0.O o3, InterfaceC0809f interfaceC0809f, int i4) {
        super(1);
        this.f1229e = h3;
        this.f1230f = i3;
        this.f1231g = h4;
        this.f1232h = interfaceC0808e;
        this.f1233i = j3;
        this.f1234j = h5;
        this.f1235k = o3;
        this.f1236l = interfaceC0809f;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        int max;
        int h3;
        r0.G g3 = (r0.G) obj;
        r0.H h4 = this.f1229e;
        int i3 = h4.f7115e;
        int i4 = this.f1230f;
        int i5 = 0;
        r0.G.f(g3, h4, 0, (i4 - i3) / 2);
        C0806c c0806c = AbstractC0813j.f7065e;
        InterfaceC0808e interfaceC0808e = this.f1232h;
        boolean a3 = Z1.i.a(interfaceC0808e, c0806c);
        r0.H h5 = this.f1231g;
        r0.H h6 = this.f1234j;
        long j3 = this.f1233i;
        if (a3) {
            int h7 = M0.a.h(j3);
            int i6 = h5.f7114d;
            max = (h7 - i6) / 2;
            int i7 = h4.f7114d;
            if (max < i7) {
                h3 = i7 - max;
            } else if (i6 + max > M0.a.h(j3) - h6.f7114d) {
                h3 = (M0.a.h(j3) - h6.f7114d) - (h5.f7114d + max);
            }
            max += h3;
        } else if (Z1.i.a(interfaceC0808e, AbstractC0813j.f7062b)) {
            max = (M0.a.h(j3) - h5.f7114d) - h6.f7114d;
        } else {
            max = Math.max(this.f1235k.k(AbstractC0044i.f1261b), h4.f7114d);
        }
        InterfaceC0809f interfaceC0809f = this.f1236l;
        if (Z1.i.a(interfaceC0809f, c0806c)) {
            i5 = (i4 - h5.f7115e) / 2;
        } else if (Z1.i.a(interfaceC0809f, AbstractC0813j.f7064d)) {
            i5 = i4 - h5.f7115e;
        }
        r0.G.f(g3, h5, max, i5);
        r0.G.f(g3, h6, M0.a.h(j3) - h6.f7114d, (i4 - h6.f7115e) / 2);
        return L1.z.f2729a;
    }
}
