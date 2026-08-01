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
    public final j f3364a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3366c;

    public a(p pVar) {
        this.f3366c = pVar;
        this.f3364a = new j(((v1.p) pVar.d).f4091a.a());
    }

    @Override // v1.v
    public final x a() {
        return this.f3364a;
    }

    @Override // v1.v
    public long b(v1.f fVar, long j2) {
        p pVar = this.f3366c;
        X0.d.e(fVar, "sink");
        try {
            return ((v1.p) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3264c).k();
            e();
            throw e2;
        }
    }

    public final void e() {
        p pVar = this.f3366c;
        int i = pVar.f3262a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3262a);
        }
        j jVar = this.f3364a;
        x xVar = jVar.f4078e;
        jVar.f4078e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3262a = 6;
    }
}
