package F1;

import D1.m;
import D1.q;
import M1.j;
import M1.p;
import M1.v;
import M1.x;
import j1.h;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final j f319a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f321c;

    public b(q qVar) {
        this.f321c = qVar;
        this.f319a = new j(((p) qVar.f275d).f846a.b());
    }

    public final void a() {
        q qVar = this.f321c;
        int i = qVar.f272a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + qVar.f272a);
        }
        j jVar = this.f319a;
        x xVar = jVar.e;
        jVar.e = x.f860d;
        xVar.a();
        xVar.b();
        qVar.f272a = 6;
    }

    @Override // M1.v
    public final x b() {
        return this.f319a;
    }

    @Override // M1.v
    public long h(M1.f fVar, long j) {
        q qVar = this.f321c;
        h.e(fVar, "sink");
        try {
            return ((p) qVar.f275d).h(fVar, j);
        } catch (IOException e) {
            ((m) qVar.f274c).k();
            a();
            throw e;
        }
    }
}
