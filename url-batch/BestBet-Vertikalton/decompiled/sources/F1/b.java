package F1;

import D1.m;
import D1.p;
import M1.j;
import M1.v;
import M1.x;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f271a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f272b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f273c;

    public b(p pVar) {
        this.f273c = pVar;
        this.f271a = new j(((M1.p) pVar.d).f817a.b());
    }

    public final void a() {
        p pVar = this.f273c;
        int i = pVar.f211a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f211a);
        }
        j jVar = this.f271a;
        x xVar = jVar.f803e;
        jVar.f803e = x.d;
        xVar.a();
        xVar.b();
        pVar.f211a = 6;
    }

    @Override // M1.v
    public final x b() {
        return this.f271a;
    }

    @Override // M1.v
    public long c(M1.f fVar, long j2) {
        p pVar = this.f273c;
        k1.e.e(fVar, "sink");
        try {
            return ((M1.p) pVar.d).c(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f213c).k();
            a();
            throw e2;
        }
    }
}
