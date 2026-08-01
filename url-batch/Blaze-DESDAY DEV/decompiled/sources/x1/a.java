package x1;

import E1.j;
import E1.v;
import E1.x;
import java.io.IOException;
import v1.m;
import v1.p;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f4146a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4148c;

    public a(p pVar) {
        this.f4148c = pVar;
        this.f4146a = new j(((E1.p) pVar.d).f221a.a());
    }

    @Override // E1.v
    public final x a() {
        return this.f4146a;
    }

    @Override // E1.v
    public long d(E1.f fVar, long j2) {
        p pVar = this.f4148c;
        g1.d.e(fVar, "sink");
        try {
            return ((E1.p) pVar.d).d(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f4081c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f4148c;
        int i = pVar.f4079a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f4079a);
        }
        j jVar = this.f4146a;
        x xVar = jVar.f207e;
        jVar.f207e = x.d;
        xVar.a();
        xVar.b();
        pVar.f4079a = 6;
    }
}
