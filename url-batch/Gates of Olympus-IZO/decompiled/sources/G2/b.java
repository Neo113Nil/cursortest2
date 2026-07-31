package G2;

import E2.k;
import E2.o;
import N2.C0150f;
import N2.F;
import N2.H;
import N2.n;
import N2.z;
import Z1.i;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements F {

    /* renamed from: d, reason: collision with root package name */
    public final n f1582d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f1584f;

    public b(o oVar) {
        this.f1584f = oVar;
        this.f1582d = new n(((z) oVar.f848d).f2973d.c());
    }

    public final void a() {
        o oVar = this.f1584f;
        int i3 = oVar.f845a;
        if (i3 == 6) {
            return;
        }
        if (i3 != 5) {
            throw new IllegalStateException("state: " + oVar.f845a);
        }
        n nVar = this.f1582d;
        H h3 = nVar.f2948e;
        nVar.f2948e = H.f2905d;
        h3.a();
        h3.b();
        oVar.f845a = 6;
    }

    @Override // N2.F
    public final H c() {
        return this.f1582d;
    }

    @Override // N2.F
    public long l(C0150f c0150f, long j3) {
        o oVar = this.f1584f;
        i.f(c0150f, "sink");
        try {
            return ((z) oVar.f848d).l(c0150f, j3);
        } catch (IOException e3) {
            ((k) oVar.f847c).k();
            a();
            throw e3;
        }
    }
}
