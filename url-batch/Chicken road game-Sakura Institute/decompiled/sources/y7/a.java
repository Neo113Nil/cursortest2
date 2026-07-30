package y7;

import f8.f;
import f8.g0;
import f8.i0;
import f8.o;
import java.io.IOException;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public final o f9921f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f9923h;

    public a(e eVar) {
        this.f9923h = eVar;
        i0 a3 = eVar.f9933c.a();
        k.f(a3, "delegate");
        o oVar = new o();
        oVar.f3627e = a3;
        this.f9921f = oVar;
    }

    @Override // f8.g0
    public final i0 a() {
        return this.f9921f;
    }

    public final void b() {
        e eVar = this.f9923h;
        int i7 = eVar.f9935e;
        if (i7 == 6) {
            return;
        }
        if (i7 != 5) {
            throw new IllegalStateException("state: " + eVar.f9935e);
        }
        o oVar = this.f9921f;
        i0 i0Var = oVar.f3627e;
        oVar.f3627e = i0.f3604d;
        i0Var.a();
        i0Var.b();
        eVar.f9935e = 6;
    }

    @Override // f8.g0
    public long v(long j8, f fVar) {
        e eVar = this.f9923h;
        k.f(fVar, "sink");
        try {
            return eVar.f9933c.v(j8, fVar);
        } catch (IOException e9) {
            eVar.f9932b.k();
            b();
            throw e9;
        }
    }
}
