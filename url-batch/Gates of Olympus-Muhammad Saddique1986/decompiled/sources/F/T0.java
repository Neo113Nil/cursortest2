package F;

import I.C0167p;
import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class T0 extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f1360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f1361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.k f1362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1 f1363h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0.Q f1364i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(boolean z3, boolean z4, q.k kVar, s1 s1Var, b0.Q q3) {
        super(2);
        this.f1360e = z3;
        this.f1361f = z4;
        this.f1362g = kVar;
        this.f1363h = s1Var;
        this.f1364i = q3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        C0167p c0167p = (C0167p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0167p.x()) {
            c0167p.L();
        } else {
            S0.f1353a.a(this.f1360e, this.f1361f, this.f1362g, null, this.f1363h, this.f1364i, 0.0f, 0.0f, c0167p, 100663296, 200);
        }
        return R1.y.f4171a;
    }
}
