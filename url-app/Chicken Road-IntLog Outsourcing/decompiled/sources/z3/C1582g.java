package z3;

import B0.o;
import X2.j;
import X2.l;
import java.util.Collections;

/* renamed from: z3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1582g extends AbstractC1576a {

    /* renamed from: b, reason: collision with root package name */
    public final int f12478b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12479c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1583h f12480d;

    public C1582g(C1583h c1583h, int i2) {
        this.f12480d = c1583h;
        this.f12478b = i2;
        c1583h.d().d(i2, c1583h.b());
    }

    @Override // z3.AbstractC1576a
    public final void a(Q2.a aVar, String str) {
        C1583h c1583h = this.f12480d;
        c1583h.d().d(-this.f12478b, c1583h.b());
        C1583h c1583h2 = this.f12480d;
        long j2 = this.f12478b;
        l lVar = c1583h2.f12486f;
        if (lVar == null || C1583h.e(lVar)) {
            String e3 = o.e(c1583h2.f12482b);
            lVar = c1583h2.f().d(o.d(c1583h2.f12482b).concat(".exported")).c("{" + e3 + "}").a("The number of " + e3 + "s for which the export has finished, either successful or failed").build();
            c1583h2.f12486f = lVar;
        }
        lVar.d(j2, c1583h2.c(Q2.a.f2475d, str));
        long nanoTime = System.nanoTime() - this.f12479c;
        C1583h c1583h3 = this.f12480d;
        double d6 = nanoTime / 1.0E9d;
        j jVar = c1583h3.f12487g;
        if (jVar == null || C1583h.e(jVar)) {
            jVar = c1583h3.f().c("otel.sdk.exporter.operation.duration").e().b().g(Collections.emptyList()).build();
            c1583h3.f12487g = jVar;
        }
        jVar.g(d6, c1583h3.c(aVar, str));
    }
}
