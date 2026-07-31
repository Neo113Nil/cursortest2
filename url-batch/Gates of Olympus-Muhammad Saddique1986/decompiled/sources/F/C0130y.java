package F;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import r.InterfaceC0859f;
import r.InterfaceC0860g;

/* renamed from: F.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130y extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ U.q f1885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0120t f1886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1887g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f1888h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f1889i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q.a f1890j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0.K f1891k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0860g f1892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0859f f1893m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0426e f1894n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q.a f1895o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1896p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1897q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0130y(U.q qVar, C0120t c0120t, long j3, long j4, long j5, Q.a aVar, C0.K k3, InterfaceC0860g interfaceC0860g, InterfaceC0859f interfaceC0859f, InterfaceC0426e interfaceC0426e, Q.a aVar2, int i3, int i4) {
        super(2);
        this.f1885e = qVar;
        this.f1886f = c0120t;
        this.f1887g = j3;
        this.f1888h = j4;
        this.f1889i = j5;
        this.f1890j = aVar;
        this.f1891k = k3;
        this.f1892l = interfaceC0860g;
        this.f1893m = interfaceC0859f;
        this.f1894n = interfaceC0426e;
        this.f1895o = aVar2;
        this.f1896p = i3;
        this.f1897q = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int U3 = C0143d.U(this.f1896p | 1);
        int U4 = C0143d.U(this.f1897q);
        Q.a aVar = this.f1895o;
        Q.a aVar2 = this.f1890j;
        InterfaceC0860g interfaceC0860g = this.f1892l;
        InterfaceC0859f interfaceC0859f = this.f1893m;
        AbstractC0132z.c(this.f1885e, this.f1886f, this.f1887g, this.f1888h, this.f1889i, aVar2, this.f1891k, interfaceC0860g, interfaceC0859f, this.f1894n, aVar, (C0167p) obj, U3, U4);
        return R1.y.f4171a;
    }
}
