package J6;

import D6.l;
import D6.s;
import T6.j;
import T6.q;
import T6.w;
import T6.y;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b implements w {

    /* renamed from: d, reason: collision with root package name */
    public final s f1394d;

    /* renamed from: e, reason: collision with root package name */
    public final j f1395e;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1396i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f1397l;

    public b(h hVar, s url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1397l = hVar;
        this.f1394d = url;
        this.f1395e = new j(((q) hVar.f1413c.f331i).f2640d.b());
    }

    public final void a(D6.q trailers) {
        D6.w wVar;
        l lVar;
        Intrinsics.checkNotNullParameter(trailers, "trailers");
        h hVar = this.f1397l;
        int i2 = hVar.f1414d;
        if (i2 == 6) {
            return;
        }
        if (i2 != 5) {
            throw new IllegalStateException("state: " + hVar.f1414d);
        }
        h.k(hVar, this.f1395e);
        hVar.f1414d = 6;
        if (trailers.size() <= 0 || (wVar = hVar.f1411a) == null || (lVar = wVar.j) == null) {
            return;
        }
        I6.h.b(lVar, this.f1394d, trailers);
    }

    @Override // T6.w
    public final y b() {
        return this.f1395e;
    }

    @Override // T6.w
    public long o(long j, T6.f sink) {
        h hVar = this.f1397l;
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return ((q) hVar.f1413c.f331i).o(j, sink);
        } catch (IOException e7) {
            hVar.f1412b.h();
            a(h.f1410f);
            throw e7;
        }
    }
}
