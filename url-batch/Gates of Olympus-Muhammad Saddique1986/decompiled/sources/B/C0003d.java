package B;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0426e;
import u0.AbstractC1101g0;
import u0.O0;

/* renamed from: B.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O0 f374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ U.q f377h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0013n f378i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003d(O0 o02, long j3, boolean z3, U.q qVar, InterfaceC0013n interfaceC0013n) {
        super(2);
        this.f374e = o02;
        this.f375f = j3;
        this.f376g = z3;
        this.f377h = qVar;
        this.f378i = interfaceC0013n;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            C0143d.a(AbstractC1101g0.f9365q.a(this.f374e), Q.f.b(-1426434671, new C0002c(this.f375f, this.f376g, this.f377h, this.f378i), c0167p), c0167p, 56);
        }
        return R1.y.f4171a;
    }
}
