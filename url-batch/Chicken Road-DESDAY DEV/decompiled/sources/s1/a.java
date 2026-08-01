package s1;

import java.io.IOException;
import q1.m;
import q1.p;
import z1.j;
import z1.v;
import z1.x;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f3689a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3691c;

    public a(p pVar) {
        this.f3691c = pVar;
        this.f3689a = new j(((z1.p) pVar.d).f4286a.a());
    }

    @Override // z1.v
    public final x a() {
        return this.f3689a;
    }

    @Override // z1.v
    public long b(z1.f fVar, long j2) {
        p pVar = this.f3691c;
        b1.d.e(fVar, "sink");
        try {
            return ((z1.p) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3508c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f3691c;
        int i = pVar.f3506a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3506a);
        }
        j jVar = this.f3689a;
        x xVar = jVar.f4272e;
        jVar.f4272e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3506a = 6;
    }
}
