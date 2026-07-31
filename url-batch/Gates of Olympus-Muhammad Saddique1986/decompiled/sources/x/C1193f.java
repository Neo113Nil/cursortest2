package x;

import I.C0143d;
import I.C0167p;
import b0.AbstractC0347p;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import e2.InterfaceC0427f;

/* renamed from: x.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193f extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10096e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f10097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ U.q f10098g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0.K f10099h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ B.r f10100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0424c f10101j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q.k f10102k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0347p f10103l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f10104m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10105n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f10106o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O f10107p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f10108q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f10109r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0427f f10110s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f10111t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10112u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f10113v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f10114w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193f(I0.z zVar, InterfaceC0424c interfaceC0424c, U.q qVar, C0.K k3, B.r rVar, InterfaceC0424c interfaceC0424c2, q.k kVar, AbstractC0347p abstractC0347p, boolean z3, int i3, int i4, I0.m mVar, O o3, boolean z4, boolean z5, InterfaceC0427f interfaceC0427f, int i5, int i6) {
        super(2);
        this.f10113v = zVar;
        this.f10097f = interfaceC0424c;
        this.f10098g = qVar;
        this.f10099h = k3;
        this.f10100i = rVar;
        this.f10101j = interfaceC0424c2;
        this.f10102k = kVar;
        this.f10103l = abstractC0347p;
        this.f10104m = z3;
        this.f10105n = i3;
        this.f10106o = i4;
        this.f10114w = mVar;
        this.f10107p = o3;
        this.f10108q = z4;
        this.f10109r = z5;
        this.f10110s = interfaceC0427f;
        this.f10111t = i5;
        this.f10112u = i6;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        switch (this.f10096e) {
            case 0:
                ((Number) obj2).intValue();
                int U3 = C0143d.U(this.f10111t | 1);
                int U4 = C0143d.U(this.f10112u);
                AbstractC1194g.a((String) this.f10113v, this.f10097f, this.f10098g, this.f10104m, this.f10108q, this.f10099h, (P) this.f10114w, this.f10107p, this.f10109r, this.f10105n, this.f10106o, this.f10100i, this.f10101j, this.f10102k, this.f10103l, this.f10110s, c0167p, U3, U4);
                break;
            default:
                ((Number) obj2).intValue();
                int U5 = C0143d.U(this.f10111t | 1);
                int U6 = C0143d.U(this.f10112u);
                N.c((I0.z) this.f10113v, this.f10097f, this.f10098g, this.f10099h, this.f10100i, this.f10101j, this.f10102k, this.f10103l, this.f10104m, this.f10105n, this.f10106o, (I0.m) this.f10114w, this.f10107p, this.f10108q, this.f10109r, this.f10110s, c0167p, U5, U6);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193f(String str, InterfaceC0424c interfaceC0424c, U.q qVar, boolean z3, boolean z4, C0.K k3, P p3, O o3, boolean z5, int i3, int i4, B.r rVar, InterfaceC0424c interfaceC0424c2, q.k kVar, AbstractC0347p abstractC0347p, InterfaceC0427f interfaceC0427f, int i5, int i6) {
        super(2);
        this.f10113v = str;
        this.f10097f = interfaceC0424c;
        this.f10098g = qVar;
        this.f10104m = z3;
        this.f10108q = z4;
        this.f10099h = k3;
        this.f10114w = p3;
        this.f10107p = o3;
        this.f10109r = z5;
        this.f10105n = i3;
        this.f10106o = i4;
        this.f10100i = rVar;
        this.f10101j = interfaceC0424c2;
        this.f10102k = kVar;
        this.f10103l = abstractC0347p;
        this.f10110s = interfaceC0427f;
        this.f10111t = i5;
        this.f10112u = i6;
    }
}
