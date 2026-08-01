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
    public final j f3363a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3365c;

    public a(p pVar) {
        this.f3365c = pVar;
        this.f3363a = new j(((v1.p) pVar.d).f4090a.a());
    }

    @Override // v1.v
    public final x a() {
        return this.f3363a;
    }

    @Override // v1.v
    public long b(v1.f fVar, long j2) {
        p pVar = this.f3365c;
        X0.d.e(fVar, "sink");
        try {
            return ((v1.p) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3263c).k();
            e();
            throw e2;
        }
    }

    public final void e() {
        p pVar = this.f3365c;
        int i = pVar.f3261a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3261a);
        }
        j jVar = this.f3363a;
        x xVar = jVar.f4077e;
        jVar.f4077e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3261a = 6;
    }
}
