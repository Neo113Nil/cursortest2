package R4;

import D3.M;
import d4.InterfaceC0326h;
import f5.C0387a;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final C0387a f2132a;

    /* renamed from: b, reason: collision with root package name */
    public final O4.a f2133b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2134c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2135d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0326h f2136e;

    /* renamed from: f, reason: collision with root package name */
    public final b4.i f2137f;

    /* renamed from: g, reason: collision with root package name */
    public final V3.g f2138g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2139h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final Q4.b f2140i;

    public o(C0387a c0387a, O4.a aVar, long j4, long j7, InterfaceC0326h interfaceC0326h, b4.i iVar, V3.g gVar, Q4.b bVar) {
        this.f2132a = c0387a;
        this.f2133b = aVar;
        this.f2134c = j4;
        this.f2135d = j7;
        this.f2136e = interfaceC0326h;
        this.f2137f = iVar;
        this.f2138g = gVar;
        this.f2140i = bVar;
    }

    public final V3.a a() {
        synchronized (this.f2139h) {
            try {
                Q4.b bVar = this.f2140i;
                if (bVar != null && !bVar.isEmpty()) {
                    Q4.b bVar2 = this.f2140i;
                    bVar2.getClass();
                    M m4 = new M(27);
                    m4.w(bVar2);
                    return m4.t();
                }
                return V3.a.f2706i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public S4.a b() {
        c cVar;
        synchronized (this.f2139h) {
            C0387a c0387a = this.f2132a;
            O4.a aVar = this.f2133b;
            long j4 = this.f2134c;
            long j7 = this.f2135d;
            InterfaceC0326h interfaceC0326h = this.f2136e;
            b4.i iVar = this.f2137f;
            V3.g gVar = this.f2138g;
            V3.a a7 = a();
            Q4.b bVar = this.f2140i;
            cVar = new c(c0387a, aVar, j4, j7, interfaceC0326h, iVar, a7, bVar == null ? 0 : bVar.f2012h, gVar);
        }
        return cVar;
    }
}
