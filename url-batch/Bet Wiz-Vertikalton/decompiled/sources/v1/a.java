package v1;

import C1.j;
import C1.v;
import C1.x;
import java.io.IOException;
import t1.m;
import t1.p;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f4040a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4042c;

    public a(p pVar) {
        this.f4042c = pVar;
        this.f4040a = new j(((C1.p) pVar.d).f200a.a());
    }

    @Override // C1.v
    public final x a() {
        return this.f4040a;
    }

    @Override // C1.v
    public long b(C1.f fVar, long j2) {
        p pVar = this.f4042c;
        e1.d.e(fVar, "sink");
        try {
            return ((C1.p) pVar.d).b(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f3794c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f4042c;
        int i = pVar.f3792a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f3792a);
        }
        j jVar = this.f4040a;
        x xVar = jVar.f186e;
        jVar.f186e = x.d;
        xVar.a();
        xVar.b();
        pVar.f3792a = 6;
    }
}
