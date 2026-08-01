package i3;

import java.io.IOException;
import p3.f;
import p3.j;
import p3.v;
import p3.x;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class a implements v {

    /* renamed from: f, reason: collision with root package name */
    public final j f2106f;
    public boolean g;
    public final /* synthetic */ e h;

    public a(e eVar) {
        this.h = eVar;
        x a4 = eVar.c.a();
        u2.c.e(a4, "delegate");
        j jVar = new j();
        jVar.f3031e = a4;
        this.f2106f = jVar;
    }

    @Override // p3.v
    public final x a() {
        return this.f2106f;
    }

    @Override // p3.v
    public long c(long j4, f fVar) {
        e eVar = this.h;
        u2.c.e(fVar, "sink");
        try {
            return eVar.c.c(j4, fVar);
        } catch (IOException e4) {
            eVar.f2115b.k();
            m();
            throw e4;
        }
    }

    public final void m() {
        e eVar = this.h;
        int i4 = eVar.f2117e;
        if (i4 == 6) {
            return;
        }
        if (i4 != 5) {
            throw new IllegalStateException("state: " + eVar.f2117e);
        }
        j jVar = this.f2106f;
        x xVar = jVar.f3031e;
        jVar.f3031e = x.f3051d;
        xVar.a();
        xVar.b();
        eVar.f2117e = 6;
    }
}
