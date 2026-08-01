package u1;

import B1.j;
import B1.v;
import B1.x;
import java.io.IOException;
import s1.m;
import s1.p;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f3817a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3819c;

    public a(p pVar) {
        this.f3819c = pVar;
        this.f3817a = new j(((B1.p) pVar.d).f87a.a());
    }

    @Override // B1.v
    public final x a() {
        return this.f3817a;
    }

    @Override // B1.v
    public long c(B1.f fVar, long j2) {
        p pVar = this.f3819c;
        d1.d.e(fVar, "sink");
        try {
            return ((B1.p) pVar.d).c(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3755c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f3819c;
        int i = pVar.f3753a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3753a);
        }
        j jVar = this.f3817a;
        x xVar = jVar.f73e;
        jVar.f73e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3753a = 6;
    }
}
