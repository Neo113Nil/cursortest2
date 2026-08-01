package o1;

import java.io.IOException;
import m1.m;
import m1.p;
import v1.j;
import v1.v;
import v1.x;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f3347a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3349c;

    public a(p pVar) {
        this.f3349c = pVar;
        this.f3347a = new j(((v1.p) pVar.d).f4074a.a());
    }

    @Override // v1.v
    public final x a() {
        return this.f3347a;
    }

    @Override // v1.v
    public long b(v1.f fVar, long j2) {
        p pVar = this.f3349c;
        X0.d.e(fVar, "sink");
        try {
            return ((v1.p) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3247c).k();
            e();
            throw e2;
        }
    }

    public final void e() {
        p pVar = this.f3349c;
        int i = pVar.f3245a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3245a);
        }
        j jVar = this.f3347a;
        x xVar = jVar.f4061e;
        jVar.f4061e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3245a = 6;
    }
}
