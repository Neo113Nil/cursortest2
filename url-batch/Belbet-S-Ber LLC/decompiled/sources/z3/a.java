package z3;

import g4.f;
import g4.j;
import g4.v;
import g4.x;
import java.io.IOException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: f, reason: collision with root package name */
    public final j f4150f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4151g;
    public final /* synthetic */ e h;

    public a(e eVar) {
        this.h = eVar;
        x a5 = eVar.f4158c.a();
        i3.d.e(a5, "delegate");
        j jVar = new j();
        jVar.f1938e = a5;
        this.f4150f = jVar;
    }

    @Override // g4.v
    public final x a() {
        return this.f4150f;
    }

    @Override // g4.v
    public long c(long j2, f fVar) {
        e eVar = this.h;
        i3.d.e(fVar, "sink");
        try {
            return eVar.f4158c.c(j2, fVar);
        } catch (IOException e4) {
            eVar.f4157b.k();
            m();
            throw e4;
        }
    }

    public final void m() {
        e eVar = this.h;
        int i = eVar.f4159e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + eVar.f4159e);
        }
        j jVar = this.f4150f;
        x xVar = jVar.f1938e;
        jVar.f1938e = x.d;
        xVar.a();
        xVar.b();
        eVar.f4159e = 6;
    }
}
