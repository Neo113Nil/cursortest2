package h1;

import e2.InterfaceC0424c;

/* renamed from: h1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488f extends X1.i implements InterfaceC0424c {

    /* renamed from: h, reason: collision with root package name */
    public int f6146h;

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        C0488f c0488f = new C0488f(1, (V1.d) obj);
        R1.y yVar = R1.y.f4171a;
        c0488f.q(yVar);
        return yVar;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        int i3 = this.f6146h;
        if (i3 == 0) {
            R1.a.e(obj);
            this.f6146h = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        R1.a.e(obj);
        return R1.y.f4171a;
    }
}
