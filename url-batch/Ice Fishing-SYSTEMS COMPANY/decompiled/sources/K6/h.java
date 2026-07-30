package K6;

import D.y;
import W6.i;
import W6.k;
import b6.C0530a;
import i6.j;
import i6.l;
import i6.o;
import i6.q;
import i6.s;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final D5.a f1659a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1660b;

    /* renamed from: c, reason: collision with root package name */
    public final k f1661c;

    /* renamed from: d, reason: collision with root package name */
    public final C0530a f1662d;

    /* renamed from: e, reason: collision with root package name */
    public volatile o f1663e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile l f1664f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile j f1665g = null;

    /* renamed from: h, reason: collision with root package name */
    public volatile C0530a f1666h = null;

    public h(D5.a aVar, int i, k kVar, C0530a c0530a) {
        this.f1659a = aVar;
        this.f1661c = kVar;
        this.f1660b = i;
        this.f1662d = c0530a;
    }

    public static boolean e(Object obj) {
        return obj.getClass().getSimpleName().startsWith("Noop");
    }

    @Override // K6.b
    public final a a(int i) {
        return new g(this, i);
    }

    public final b6.c b() {
        C0530a c0530a = this.f1666h;
        if (c0530a != null) {
            return c0530a;
        }
        I1.f fVar = new I1.f(2);
        fVar.d(i.f3477a, this.f1661c.f3488a);
        g6.e eVar = i.f3478b;
        k kVar = this.f1661c;
        if (kVar.f3489b == null) {
            synchronized (kVar) {
                try {
                    if (kVar.f3489b == null) {
                        kVar.f3489b = kVar.f3488a + "/" + ((AtomicInteger) k.f3487d.computeIfAbsent(kVar.f3488a, new G6.b(16))).getAndIncrement();
                    }
                } finally {
                }
            }
        }
        fVar.d(eVar, kVar.f3489b);
        fVar.f(this.f1662d);
        C0530a b9 = fVar.b();
        this.f1666h = b9;
        return b9;
    }

    public final b6.c c(C0530a c0530a, String str) {
        b6.c b9 = b();
        boolean z8 = (str == null || str.isEmpty()) ? false : true;
        if (!z8 && c0530a.isEmpty()) {
            return b9;
        }
        I1.f d2 = ((C0530a) b9).d();
        if (z8) {
            d2.d(i.f3479c, str);
        }
        d2.f(c0530a);
        return d2.b();
    }

    public final o d() {
        o oVar = this.f1663e;
        if (oVar != null && !e(oVar)) {
            return oVar;
        }
        String e6 = y.e(this.f1660b);
        o build = f().a(y.c(this.f1660b).concat(".inflight")).d("{" + e6 + "}").c("The number of " + e6 + "s which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)").build();
        this.f1663e = build;
        return build;
    }

    public final q f() {
        s sVar = (s) this.f1659a.get();
        if (sVar == null) {
            sVar = i6.h.f38327n;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f1661c.f3488a).mo50build();
    }
}
