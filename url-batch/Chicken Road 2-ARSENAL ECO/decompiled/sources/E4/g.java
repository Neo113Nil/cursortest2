package E4;

import c4.j;
import c4.k;
import c4.l;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: b, reason: collision with root package name */
    public final int f675b;

    /* renamed from: c, reason: collision with root package name */
    public final long f676c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f677d;

    public g(h hVar, int i7) {
        this.f677d = hVar;
        this.f675b = i7;
        hVar.d().d(i7, hVar.b());
    }

    @Override // E4.a
    public final void a(String str, V3.a aVar) {
        h hVar = this.f677d;
        hVar.d().d(-this.f675b, hVar.b());
        h hVar2 = this.f677d;
        long j4 = this.f675b;
        l lVar = hVar2.f683f;
        if (lVar == null || h.e(lVar)) {
            String e4 = C1.c.e(hVar2.f679b);
            lVar = hVar2.f().d(C1.c.d(hVar2.f679b).concat(".exported")).c("{" + e4 + "}").a("The number of " + e4 + "s for which the export has finished, either successful or failed").build();
            hVar2.f683f = lVar;
        }
        lVar.d(j4, hVar2.c(V3.a.f2706i, str));
        long nanoTime = System.nanoTime() - this.f676c;
        h hVar3 = this.f677d;
        double d7 = nanoTime / 1.0E9d;
        j jVar = hVar3.f684g;
        if (jVar == null || h.e(jVar)) {
            k b7 = hVar3.f().c("otel.sdk.exporter.operation.duration").e().b();
            List list = Collections.EMPTY_LIST;
            jVar = b7.g().build();
            hVar3.f684g = jVar;
        }
        jVar.g(d7, hVar3.c(aVar, str));
    }
}
