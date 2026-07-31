package o;

import R1.y;
import e2.InterfaceC0422a;

/* loaded from: classes.dex */
public final class o extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f2.k f7421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(InterfaceC0422a interfaceC0422a, boolean z3) {
        super(0);
        this.f7420e = z3;
        this.f7421f = (f2.k) interfaceC0422a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [e2.a, f2.k] */
    @Override // e2.InterfaceC0422a
    public final Object b() {
        if (this.f7420e) {
            this.f7421f.b();
        }
        return y.f4171a;
    }
}
