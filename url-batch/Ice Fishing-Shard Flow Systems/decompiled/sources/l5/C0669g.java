package l5;

import J4.j;
import J4.k;
import J4.l;
import java.util.Collections;
import java.util.List;

/* renamed from: l5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0669g extends AbstractC0663a {

    /* renamed from: b, reason: collision with root package name */
    public final int f6295b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6296c = System.nanoTime();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0670h f6297d;

    public C0669g(C0670h c0670h, int i2) {
        this.f6297d = c0670h;
        this.f6295b = i2;
        c0670h.d().a(i2, c0670h.b());
    }

    @Override // l5.AbstractC0663a
    public final void a(String str, C4.b bVar) {
        C0670h c0670h = this.f6297d;
        c0670h.d().a(-this.f6295b, c0670h.b());
        C0670h c0670h2 = this.f6297d;
        long j = this.f6295b;
        l lVar = c0670h2.f6303f;
        if (lVar == null || C0670h.e(lVar)) {
            String b7 = r4.f.b(c0670h2.f6299b);
            lVar = c0670h2.f().d(r4.f.a(c0670h2.f6299b).concat(".exported")).d("{" + b7 + "}").b("The number of " + b7 + "s for which the export has finished, either successful or failed").build();
            c0670h2.f6303f = lVar;
        }
        lVar.a(j, c0670h2.c(C4.b.f297l, str));
        long nanoTime = System.nanoTime() - this.f6296c;
        C0670h c0670h3 = this.f6297d;
        double d7 = nanoTime / 1.0E9d;
        j jVar = c0670h3.f6304g;
        if (jVar == null || C0670h.e(jVar)) {
            k c7 = c0670h3.f().c("otel.sdk.exporter.operation.duration").e().c();
            List list = Collections.EMPTY_LIST;
            jVar = c7.g().build();
            c0670h3.f6304g = jVar;
        }
        jVar.g(d7, c0670h3.c(bVar, str));
    }
}
