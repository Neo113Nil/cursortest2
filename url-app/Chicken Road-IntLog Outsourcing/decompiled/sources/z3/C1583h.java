package z3;

import L3.k;
import L3.m;
import X2.j;
import X2.l;
import X2.o;
import X2.q;
import X2.s;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: z3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583h implements InterfaceC1577b {

    /* renamed from: a, reason: collision with root package name */
    public final D3.h f12481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12482b;

    /* renamed from: c, reason: collision with root package name */
    public final m f12483c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.a f12484d;

    /* renamed from: e, reason: collision with root package name */
    public volatile o f12485e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile l f12486f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile j f12487g = null;

    /* renamed from: h, reason: collision with root package name */
    public volatile Q2.a f12488h = null;

    public C1583h(D3.h hVar, int i2, m mVar, Q2.a aVar) {
        this.f12481a = hVar;
        this.f12483c = mVar;
        this.f12482b = i2;
        this.f12484d = aVar;
    }

    public static boolean e(Object obj) {
        return obj.getClass().getSimpleName().startsWith("Noop");
    }

    @Override // z3.InterfaceC1577b
    public final AbstractC1576a a(int i2) {
        return new C1582g(this, i2);
    }

    public final Q2.c b() {
        Q2.a aVar = this.f12488h;
        if (aVar != null) {
            return aVar;
        }
        L3.j jVar = new L3.j(1);
        jVar.e(k.f1504a, this.f12483c.f1515c);
        V2.e eVar = k.f1505b;
        m mVar = this.f12483c;
        if (mVar.f1516d == null) {
            synchronized (mVar) {
                try {
                    if (mVar.f1516d == null) {
                        mVar.f1516d = mVar.f1515c + "/" + ((AtomicInteger) m.f1514f.computeIfAbsent(mVar.f1515c, new A3.b(10))).getAndIncrement();
                    }
                } finally {
                }
            }
        }
        jVar.e(eVar, mVar.f1516d);
        jVar.g(this.f12484d);
        Q2.a b6 = jVar.b();
        this.f12488h = b6;
        return b6;
    }

    public final Q2.c c(Q2.a aVar, String str) {
        Q2.c b6 = b();
        boolean z = (str == null || str.isEmpty()) ? false : true;
        if (!z && aVar.isEmpty()) {
            return b6;
        }
        L3.j e3 = ((Q2.a) b6).e();
        if (z) {
            e3.e(k.f1506c, str);
        }
        e3.g(aVar);
        return e3.b();
    }

    public final o d() {
        o oVar = this.f12485e;
        if (oVar != null && !e(oVar)) {
            return oVar;
        }
        String e3 = B0.o.e(this.f12482b);
        o mo1build = f().a(B0.o.d(this.f12482b).concat(".inflight")).mo2c("{" + e3 + "}").mo0a("The number of " + e3 + "s which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)").mo1build();
        this.f12485e = mo1build;
        return mo1build;
    }

    public final q f() {
        s sVar = (s) this.f12481a.get();
        if (sVar == null) {
            sVar = X2.h.f3518a;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f12483c.f1515c).build();
    }
}
