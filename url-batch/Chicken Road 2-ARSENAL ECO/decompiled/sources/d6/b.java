package d6;

import X5.C0218b;
import X5.n;
import X5.o;
import X5.s;
import java.io.IOException;
import kotlin.jvm.internal.i;
import n6.j;
import n6.q;
import n6.w;
import n6.y;

/* loaded from: classes.dex */
public abstract class b implements w {

    /* renamed from: f, reason: collision with root package name */
    public final o f3972f;

    /* renamed from: g, reason: collision with root package name */
    public final j f3973g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3974h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h f3975i;

    public b(h hVar, o url) {
        i.e(url, "url");
        this.f3975i = hVar;
        this.f3972f = url;
        this.f3973g = new j(((q) hVar.f3991c.f73i).f5547f.b());
    }

    public final void a(n trailers) {
        s sVar;
        C0218b c0218b;
        i.e(trailers, "trailers");
        h hVar = this.f3975i;
        int i7 = hVar.f3992d;
        if (i7 == 6) {
            return;
        }
        if (i7 != 5) {
            throw new IllegalStateException("state: " + hVar.f3992d);
        }
        j jVar = this.f3973g;
        y yVar = jVar.f5529e;
        jVar.f5529e = y.f5562d;
        yVar.a();
        yVar.b();
        hVar.f3992d = 6;
        if (trailers.size() <= 0 || (sVar = hVar.f3989a) == null || (c0218b = sVar.f3020j) == null) {
            return;
        }
        c6.g.b(c0218b, this.f3972f, trailers);
    }

    @Override // n6.w
    public final y b() {
        return this.f3973g;
    }

    @Override // n6.w
    public long i(long j4, n6.f sink) {
        h hVar = this.f3975i;
        i.e(sink, "sink");
        try {
            return ((q) hVar.f3991c.f73i).i(j4, sink);
        } catch (IOException e4) {
            hVar.f3990b.h();
            a(h.f3988f);
            throw e4;
        }
    }
}
