package q1;

import java.io.IOException;
import o1.m;
import o1.p;
import x1.j;
import x1.v;
import x1.x;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f3511a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3513c;

    public a(p pVar) {
        this.f3513c = pVar;
        this.f3511a = new j(((x1.p) pVar.d).f4254a.a());
    }

    @Override // x1.v
    public final x a() {
        return this.f3511a;
    }

    @Override // x1.v
    public long b(x1.f fVar, long j2) {
        p pVar = this.f3513c;
        Z0.d.e(fVar, "sink");
        try {
            return ((x1.p) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3427c).k();
            f();
            throw e2;
        }
    }

    public final void f() {
        p pVar = this.f3513c;
        int i = pVar.f3425a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3425a);
        }
        j jVar = this.f3511a;
        x xVar = jVar.f4240e;
        jVar.f4240e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3425a = 6;
    }
}
