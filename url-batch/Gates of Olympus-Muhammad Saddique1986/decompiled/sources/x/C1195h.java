package x;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;

/* renamed from: x.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1195h extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f10125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ U.q f10126f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0.K f10127g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f10128h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10129i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f10130j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10131k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10132l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0.w f10133m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10134n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10135o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1195h(String str, U.q qVar, C0.K k3, InterfaceC0424c interfaceC0424c, int i3, boolean z3, int i4, int i5, b0.w wVar, int i6, int i7) {
        super(2);
        this.f10125e = str;
        this.f10126f = qVar;
        this.f10127g = k3;
        this.f10128h = interfaceC0424c;
        this.f10129i = i3;
        this.f10130j = z3;
        this.f10131k = i4;
        this.f10132l = i5;
        this.f10133m = wVar;
        this.f10134n = i6;
        this.f10135o = i7;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f10134n | 1);
        int i3 = this.f10131k;
        N.a(this.f10125e, this.f10126f, this.f10127g, this.f10128h, this.f10129i, this.f10130j, i3, this.f10132l, this.f10133m, (C0167p) obj, U3, this.f10135o);
        return R1.y.f4171a;
    }
}
