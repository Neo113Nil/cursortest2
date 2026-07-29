package b.a.c;

import b.aa;
import b.ac;
import b.u;
import java.io.IOException;
import java.util.List;

/* compiled from: RealInterceptorChain.java */
/* loaded from: classes.dex */
public final class g implements u.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<u> f1865a;

    /* renamed from: b, reason: collision with root package name */
    private final b.a.b.g f1866b;

    /* renamed from: c, reason: collision with root package name */
    private final c f1867c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a.b.c f1868d;
    private final int e;
    private final aa f;
    private int g;

    public g(List<u> list, b.a.b.g gVar, c cVar, b.a.b.c cVar2, int i, aa aaVar) {
        this.f1865a = list;
        this.f1868d = cVar2;
        this.f1866b = gVar;
        this.f1867c = cVar;
        this.e = i;
        this.f = aaVar;
    }

    public b.i b() {
        return this.f1868d;
    }

    public b.a.b.g c() {
        return this.f1866b;
    }

    public c d() {
        return this.f1867c;
    }

    @Override // b.u.a
    public aa a() {
        return this.f;
    }

    @Override // b.u.a
    public ac a(aa aaVar) throws IOException {
        return a(aaVar, this.f1866b, this.f1867c, this.f1868d);
    }

    public ac a(aa aaVar, b.a.b.g gVar, c cVar, b.a.b.c cVar2) throws IOException {
        if (this.e >= this.f1865a.size()) {
            throw new AssertionError();
        }
        this.g++;
        if (this.f1867c != null && !this.f1868d.a(aaVar.a())) {
            throw new IllegalStateException("network interceptor " + this.f1865a.get(this.e - 1) + " must retain the same host and port");
        }
        if (this.f1867c != null && this.g > 1) {
            throw new IllegalStateException("network interceptor " + this.f1865a.get(this.e - 1) + " must call proceed() exactly once");
        }
        g gVar2 = new g(this.f1865a, gVar, cVar, cVar2, this.e + 1, aaVar);
        u uVar = this.f1865a.get(this.e);
        ac intercept = uVar.intercept(gVar2);
        if (cVar != null && this.e + 1 < this.f1865a.size() && gVar2.g != 1) {
            throw new IllegalStateException("network interceptor " + uVar + " must call proceed() exactly once");
        }
        if (intercept != null) {
            return intercept;
        }
        throw new NullPointerException("interceptor " + uVar + " returned null");
    }
}
