package l5;

import J4.j;
import J4.l;
import J4.o;
import J4.q;
import J4.s;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import x5.C1013c;
import x5.k;
import x5.m;

/* renamed from: l5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670h implements InterfaceC0664b {

    /* renamed from: a, reason: collision with root package name */
    public final Supplier f6298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6299b;

    /* renamed from: c, reason: collision with root package name */
    public final m f6300c;

    /* renamed from: d, reason: collision with root package name */
    public final C4.f f6301d;

    /* renamed from: e, reason: collision with root package name */
    public volatile o f6302e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile l f6303f = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile j f6304g = null;

    /* renamed from: h, reason: collision with root package name */
    public volatile C4.b f6305h = null;

    public C0670h(Supplier supplier, int i2, m mVar, C4.b bVar) {
        this.f6298a = supplier;
        this.f6300c = mVar;
        this.f6299b = i2;
        this.f6301d = bVar;
    }

    public static boolean e(Object obj) {
        return obj.getClass().getSimpleName().startsWith("Noop");
    }

    @Override // l5.InterfaceC0664b
    public final AbstractC0663a a(int i2) {
        return new C0669g(this, i2);
    }

    public final C4.f b() {
        C4.b bVar = this.f6305h;
        if (bVar != null) {
            return bVar;
        }
        C4.d dVar = new C4.d(0);
        dVar.e(k.f8392a, this.f6300c.f8403a);
        H4.e eVar = k.f8393b;
        m mVar = this.f6300c;
        if (mVar.f8404b == null) {
            synchronized (mVar) {
                try {
                    if (mVar.f8404b == null) {
                        mVar.f8404b = mVar.f8403a + "/" + ((AtomicInteger) m.f8402d.computeIfAbsent(mVar.f8403a, new C1013c(0))).getAndIncrement();
                    }
                } finally {
                }
            }
        }
        dVar.e(eVar, mVar.f8404b);
        dVar.g(this.f6301d);
        C4.b b7 = dVar.b();
        this.f6305h = b7;
        return b7;
    }

    public final C4.f c(C4.f fVar, String str) {
        C4.f b7 = b();
        boolean z7 = (str == null || str.isEmpty()) ? false : true;
        if (!z7 && fVar.isEmpty()) {
            return b7;
        }
        C4.d e7 = ((C4.b) b7).e();
        if (z7) {
            e7.e(k.f8394c, str);
        }
        e7.g(fVar);
        return e7.b();
    }

    public final o d() {
        o oVar = this.f6302e;
        if (oVar != null && !e(oVar)) {
            return oVar;
        }
        String b7 = r4.f.b(this.f6299b);
        o mo1build = f().a(r4.f.a(this.f6299b).concat(".inflight")).mo2d("{" + b7 + "}").mo0b("The number of " + b7 + "s which were passed to the exporter, but that have not been exported yet (neither successful, nor failed)").mo1build();
        this.f6302e = mo1build;
        return mo1build;
    }

    public final q f() {
        s sVar = (s) this.f6298a.get();
        if (sVar == null) {
            sVar = J4.h.f1386d;
        }
        return sVar.a("io.opentelemetry.exporters." + this.f6300c.f8403a).mo5build();
    }
}
