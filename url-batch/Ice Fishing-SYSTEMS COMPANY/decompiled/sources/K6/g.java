package K6;

import D.y;
import b6.C0530a;
import i6.j;
import i6.k;
import i6.l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1656b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1657c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f1658d;

    public g(h hVar, int i) {
        this.f1658d = hVar;
        this.f1656b = i;
        hVar.d().e(i, hVar.b());
    }

    @Override // K6.a
    public final void a(C0530a c0530a, String str) {
        h hVar = this.f1658d;
        hVar.d().e(-this.f1656b, hVar.b());
        h hVar2 = this.f1658d;
        long j9 = this.f1656b;
        l lVar = hVar2.f1664f;
        if (lVar == null || h.e(lVar)) {
            String e6 = y.e(hVar2.f1660b);
            lVar = hVar2.f().d(y.c(hVar2.f1660b).concat(".exported")).d("{" + e6 + "}").c("The number of " + e6 + "s for which the export has finished, either successful or failed").build();
            hVar2.f1664f = lVar;
        }
        lVar.e(j9, hVar2.c(C0530a.f5557w, str));
        long nanoTime = System.nanoTime() - this.f1657c;
        h hVar3 = this.f1658d;
        double d2 = nanoTime / 1.0E9d;
        j jVar = hVar3.f1665g;
        if (jVar == null || h.e(jVar)) {
            k a9 = hVar3.f().c("otel.sdk.exporter.operation.duration").b().a();
            List list = Collections.EMPTY_LIST;
            jVar = a9.f().build();
            hVar3.f1665g = jVar;
        }
        jVar.f(d2, hVar3.c(c0530a, str));
    }
}
