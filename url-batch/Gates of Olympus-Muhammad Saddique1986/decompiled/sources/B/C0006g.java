package B;

import I.C0143d;
import I.C0167p;
import e2.InterfaceC0422a;
import e2.InterfaceC0426e;
import h2.AbstractC0508a;

/* renamed from: B.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f399h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f400i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0006g(U.q qVar, InterfaceC0422a interfaceC0422a, boolean z3, int i3) {
        super(2);
        this.f399h = qVar;
        this.f400i = interfaceC0422a;
        this.f397f = z3;
        this.f398g = i3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        int i3 = this.f396e;
        C0167p c0167p = (C0167p) obj;
        ((Number) obj2).intValue();
        switch (i3) {
            case 0:
                int U3 = C0143d.U(this.f398g | 1);
                AbstractC0508a.i((U.q) this.f399h, (InterfaceC0422a) this.f400i, this.f397f, c0167p, U3);
                break;
            default:
                int U4 = C0143d.U(this.f398g | 1);
                O2.d.i(this.f397f, (N0.h) this.f399h, (a0) this.f400i, c0167p, U4);
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0006g(boolean z3, N0.h hVar, a0 a0Var, int i3) {
        super(2);
        this.f397f = z3;
        this.f399h = hVar;
        this.f400i = a0Var;
        this.f398g = i3;
    }
}
