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
    public final j f3766a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3768c;

    public a(p pVar) {
        this.f3768c = pVar;
        this.f3766a = new j(((z1.p) pVar.d).f4287a.a());
    }

    @Override // z1.v
    public final x a() {
        return this.f3766a;
    }

    @Override // z1.v
    public long b(z1.f fVar, long j2) {
        p pVar = this.f3768c;
        b1.d.e(fVar, "sink");
        try {
            return ((z1.p) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3561c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f3768c;
        int i = pVar.f3559a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3559a);
        }
        j jVar = this.f3766a;
        x xVar = jVar.f4273e;
        jVar.f4273e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3559a = 6;
    }
}
