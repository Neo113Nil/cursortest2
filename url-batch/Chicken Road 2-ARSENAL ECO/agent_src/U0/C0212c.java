package U0;

import D3.M;
import i1.C0420a;

/* renamed from: U0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212c implements InterfaceC0211b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0420a f2508a;

    public C0212c(C0420a c0420a) {
        this.f2508a = c0420a;
    }

    @Override // U0.InterfaceC0211b
    public final void a(R0.a aVar) {
        boolean b7 = aVar.b();
        C0420a c0420a = this.f2508a;
        if (b7) {
            c0420a.n(null, c0420a.f3865B);
            return;
        }
        M m4 = c0420a.f3885t;
        if (m4 != null) {
            ((S0.f) m4.f401g).onConnectionFailed(aVar);
        }
    }
}
