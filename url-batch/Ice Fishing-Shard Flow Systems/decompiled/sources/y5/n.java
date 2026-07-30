package y5;

import v5.C0975a;
import x5.C1012b;
import z5.InterfaceC1060a;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final M5.a f8701a;

    /* renamed from: b, reason: collision with root package name */
    public final C0975a f8702b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8703c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8704d;

    /* renamed from: e, reason: collision with root package name */
    public final K4.h f8705e;

    /* renamed from: f, reason: collision with root package name */
    public final I4.i f8706f;

    /* renamed from: g, reason: collision with root package name */
    public final C4.j f8707g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8708h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final C1012b f8709i;

    public n(M5.a aVar, C0975a c0975a, long j, long j7, K4.h hVar, I4.i iVar, C4.j jVar, C1012b c1012b) {
        this.f8701a = aVar;
        this.f8702b = c0975a;
        this.f8703c = j;
        this.f8704d = j7;
        this.f8705e = hVar;
        this.f8706f = iVar;
        this.f8707g = jVar;
        this.f8709i = c1012b;
    }

    public final C4.b a() {
        synchronized (this.f8708h) {
            try {
                C1012b c1012b = this.f8709i;
                if (c1012b != null && !c1012b.isEmpty()) {
                    C1012b c1012b2 = this.f8709i;
                    c1012b2.getClass();
                    C4.d dVar = new C4.d(0);
                    dVar.g(c1012b2);
                    return dVar.b();
                }
                return C4.b.f297l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public InterfaceC1060a b() {
        c cVar;
        synchronized (this.f8708h) {
            M5.a aVar = this.f8701a;
            C0975a c0975a = this.f8702b;
            long j = this.f8703c;
            long j7 = this.f8704d;
            K4.h hVar = this.f8705e;
            I4.i iVar = this.f8706f;
            C4.j jVar = this.f8707g;
            C4.b a7 = a();
            C1012b c1012b = this.f8709i;
            cVar = new c(aVar, c0975a, j, j7, hVar, iVar, a7, c1012b == null ? 0 : c1012b.f8376i, jVar);
        }
        return cVar;
    }
}
