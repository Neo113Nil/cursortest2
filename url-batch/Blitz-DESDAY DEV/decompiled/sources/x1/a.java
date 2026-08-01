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
    public final j f4172a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4173b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4174c;

    public a(p pVar) {
        this.f4174c = pVar;
        this.f4172a = new j(((E1.p) pVar.d).f220a.a());
    }

    @Override // E1.v
    public final x a() {
        return this.f4172a;
    }

    @Override // E1.v
    public long d(E1.f fVar, long j2) {
        p pVar = this.f4174c;
        g1.d.e(fVar, "sink");
        try {
            return ((E1.p) pVar.d).d(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3911c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f4174c;
        int i = pVar.f3909a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3909a);
        }
        j jVar = this.f4172a;
        x xVar = jVar.f206e;
        jVar.f206e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3909a = 6;
    }
}
