package k8;

import e8.C4484b;
import e8.m;
import e8.o;
import e8.s;
import java.io.IOException;
import kotlin.jvm.internal.h;
import u8.i;
import u8.r;
import u8.x;
import u8.z;

/* loaded from: classes2.dex */
public abstract class a implements x {

    /* renamed from: n, reason: collision with root package name */
    public final o f38830n;

    /* renamed from: u, reason: collision with root package name */
    public final i f38831u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f38832v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f38833w;

    public a(g gVar, o url) {
        h.e(url, "url");
        this.f38833w = gVar;
        this.f38830n = url;
        this.f38831u = new i(((r) gVar.f38849c.f3964v).f41308n.L());
    }

    @Override // u8.x
    public final z L() {
        return this.f38831u;
    }

    public final void a(m trailers) {
        s sVar;
        C4484b c4484b;
        h.e(trailers, "trailers");
        g gVar = this.f38833w;
        int i = gVar.f38850d;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + gVar.f38850d);
        }
        i iVar = this.f38831u;
        z zVar = iVar.f41282e;
        iVar.f41282e = z.f41323d;
        zVar.a();
        zVar.b();
        gVar.f38850d = 6;
        if (trailers.size() <= 0 || (sVar = gVar.f38847a) == null || (c4484b = sVar.f37481j) == null) {
            return;
        }
        j8.g.b(c4484b, this.f38830n, trailers);
    }

    @Override // u8.x
    public long f(long j9, u8.e sink) {
        g gVar = this.f38833w;
        h.e(sink, "sink");
        try {
            return ((r) gVar.f38849c.f3964v).f(j9, sink);
        } catch (IOException e6) {
            gVar.f38848b.e();
            a(g.f38846f);
            throw e6;
        }
    }
}
