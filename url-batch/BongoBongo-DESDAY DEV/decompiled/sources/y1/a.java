package y1;

import F1.j;
import F1.v;
import F1.x;
import java.io.IOException;
import w1.m;
import w1.p;

/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f4342a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f4344c;

    public a(p pVar) {
        this.f4344c = pVar;
        this.f4342a = new j(((F1.p) pVar.d).f265a.a());
    }

    @Override // F1.v
    public final x a() {
        return this.f4342a;
    }

    @Override // F1.v
    public long d(F1.f fVar, long j2) {
        p pVar = this.f4344c;
        h1.d.e(fVar, "sink");
        try {
            return ((F1.p) pVar.d).d(fVar, j2);
        } catch (IOException e2) {
            ((m) pVar.f4274c).k();
            g();
            throw e2;
        }
    }

    public final void g() {
        p pVar = this.f4344c;
        int i = pVar.f4272a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + pVar.f4272a);
        }
        j jVar = this.f4342a;
        x xVar = jVar.f251e;
        jVar.f251e = x.d;
        xVar.a();
        xVar.b();
        pVar.f4272a = 6;
    }
}
