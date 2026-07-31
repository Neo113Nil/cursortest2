package s;

import I.C0089d;
import I.C0113p;
import e2.AbstractC0381e;
import o.C0737m;
import r.InterfaceC0796H;
import r.InterfaceC0808e;
import r.InterfaceC0811h;

/* renamed from: s.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0859b extends Z1.j implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.l f7346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0880w f7347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0796H f7348h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f7349i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0737m f7350j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f7351k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y1.c f7352l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f7353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f7354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f7355o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0859b(U.l lVar, C0880w c0880w, InterfaceC0796H interfaceC0796H, boolean z3, Object obj, Object obj2, C0737m c0737m, boolean z4, Y1.c cVar, int i3, int i4) {
        super(2);
        this.f7345e = i4;
        this.f7346f = lVar;
        this.f7347g = c0880w;
        this.f7348h = interfaceC0796H;
        this.f7349i = z3;
        this.f7354n = obj;
        this.f7355o = obj2;
        this.f7350j = c0737m;
        this.f7351k = z4;
        this.f7352l = cVar;
        this.f7353m = i3;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f7345e) {
            case 0:
                ((Number) obj2).intValue();
                int T2 = C0089d.T(this.f7353m | 1);
                U.b bVar = (U.b) this.f7355o;
                C0737m c0737m = this.f7350j;
                AbstractC0381e.c(this.f7346f, this.f7347g, this.f7348h, this.f7349i, (InterfaceC0811h) this.f7354n, bVar, c0737m, this.f7351k, this.f7352l, (C0113p) obj, T2);
                break;
            default:
                ((Number) obj2).intValue();
                int T3 = C0089d.T(this.f7353m | 1);
                U.c cVar = (U.c) this.f7355o;
                C0737m c0737m2 = this.f7350j;
                AbstractC0381e.e(this.f7346f, this.f7347g, this.f7348h, this.f7349i, (InterfaceC0808e) this.f7354n, cVar, c0737m2, this.f7351k, this.f7352l, (C0113p) obj, T3);
                break;
        }
        return L1.z.f2729a;
    }
}
