package y5;

import v5.C0975a;
import x5.C1018h;
import z5.InterfaceC1060a;

/* loaded from: classes.dex */
public final class f extends n {
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final C1018h f8677k;

    public f(M5.a aVar, C0975a c0975a, long j, long j7, K4.h hVar, I4.i iVar, C4.i iVar2, C1018h c1018h) {
        super(aVar, c0975a, j, j7, hVar, iVar, iVar2, null);
        this.j = new Object();
        this.f8677k = c1018h;
    }

    @Override // y5.n
    public final InterfaceC1060a b() {
        D4.a a7;
        C1047a c1047a;
        synchronized (this.j) {
            M5.a aVar = this.f8701a;
            C0975a c0975a = this.f8702b;
            long j = this.f8703c;
            long j7 = this.f8704d;
            K4.h hVar = this.f8705e;
            I4.i iVar = this.f8706f;
            C4.j jVar = this.f8707g;
            synchronized (this.j) {
                try {
                    C1018h c1018h = this.f8677k;
                    a7 = c1018h == null ? D4.a.f355m : c1018h.a();
                } finally {
                }
            }
            D4.a aVar2 = a7;
            C1018h c1018h2 = this.f8677k;
            c1047a = new C1047a(aVar, c0975a, j, j7, hVar, iVar, c1018h2 == null ? 0 : c1018h2.f8387i, aVar2, jVar);
        }
        return c1047a;
    }
}
