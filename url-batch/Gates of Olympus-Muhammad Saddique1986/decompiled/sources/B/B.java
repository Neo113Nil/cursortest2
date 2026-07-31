package B;

import a0.C0238c;
import e2.InterfaceC0424c;

/* loaded from: classes.dex */
public final class B extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.Z f267f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(x.Z z3, int i3) {
        super(1);
        this.f266e = i3;
        this.f267f = z3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f266e) {
            case 0:
                n0.s sVar = (n0.s) obj;
                this.f267f.d(n0.q.h(sVar, false));
                sVar.a();
                break;
            default:
                this.f267f.c(((C0238c) obj).f4722a);
                break;
        }
        return R1.y.f4171a;
    }
}
