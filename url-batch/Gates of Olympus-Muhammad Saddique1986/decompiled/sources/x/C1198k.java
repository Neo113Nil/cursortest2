package x;

import R0.C0212a;
import a0.C0238c;
import e2.InterfaceC0424c;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1198k extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B.a0 f10158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1198k(B.a0 a0Var, int i3) {
        super(1);
        this.f10157e = i3;
        this.f10158f = a0Var;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f10157e) {
            case 0:
                return new C0212a(7, this.f10158f);
            default:
                long j3 = ((C0238c) obj).f4722a;
                this.f10158f.o();
                return R1.y.f4171a;
        }
    }
}
