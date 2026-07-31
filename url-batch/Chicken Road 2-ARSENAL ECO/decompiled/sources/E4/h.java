package E4;

import D3.M;
import Q4.k;
import Q4.m;
import c4.C0289h;
import c4.j;
import c4.l;
import c4.o;
import c4.q;
import c4.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f678a;

    /* renamed from: b, reason: collision with root package name */
    public final int f679b;

    /* renamed from: c, reason: collision with root package name */
    public final m f680c;

    /* renamed from: d, reason: collision with root package name */
    public final V3.c f681d;

    /* renamed from: e, reason: collision with root package name */
    public volatile o f682e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile l f683f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile j f684g = null;

    /* renamed from: h, reason: collision with root package name */
    public volatile V3.a f685h = null;

    public h(Supplier supplier, int i7, m mVar, V3.a aVar) {
        this.f678a = supplier;
        this.f680c = mVar;
        this.f679b = i7;
        this.f681d = aVar;
    }

    public static boolean e(Object obj) {
        return obj.getClass().getSimpleName().startsWith("Noop");
    }

    @Override // E4.b
    public final a a(int i7) {
        return new g(this, i7);
    }

    public final V3.c b() {
        V3.a aVar = this.f685h;
        if (aVar != null) {
            return aVar;
        }
        M m4 = new M(27);
        m4.u(k.f2028a, this.f680c.f2039c);
        a4.e eVar = k.f2029b;
        m mVar = this.f680c;
        if (mVar.f2040d == null) {
            synchronized (mVar) {
                try {
                    if (mVar.f2040d == null) {
                        mVar.f2040d = mVar.f2039c + "/" + ((AtomicInteger) m.f2038f.computeIfAbsent(mVar.f2039c, new A4.b(16))).getAndIncrement();
                    }
                } finally {
                }
            }
        }
        m4.u(eVar, mVar.f2040d);
        m4.w(this.f681d);
        V3.a t6 = m4.t();
        this.f685h = t6;
        return t6;
    }

    public final V3.c c(V3.c cVar, String str) {
        V3.c b7 = b();
        boolean z5 = (str == null || str.isEmpty()) ? false : true;
        if (!z5 && cVar.isEmpty()) {
            return b7;
        }
        M e4 = ((V3.a) b7).e();
        if (z5) {
            e4.u(k.f2030c, str);
        }
        e4.w(cVar);
        return e4.t();
    }

    public final o d() {
        o oVar = this.f682e;
        if (oVar != null && !e(oVar)) {
            return oVar;
        }
        String e4 = C1.c.e(this.f679b);
        o mo1build = f().a(C1.c.d(this.f679b).concat(".inflight")).mo2c("{" + e4 + "}").mo0a("The number of " + e4 + "s which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)").mo1build();
        this.f682e = mo1build;
        return mo1build;
    }

    public final q f() {
        s sVar = (s) this.f678a.get();
        if (sVar == null) {
            sVar = C0289h.f3817f;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f680c.f2039c).build();
    }
}
