package A1;

import B.C0011l;
import R1.n;
import R1.v;
import com.gatesof.olympus.martu.marku.App;
import z1.InterfaceC1263a;

/* loaded from: classes.dex */
public final class h implements InterfaceC1263a {

    /* renamed from: d, reason: collision with root package name */
    public final App f215d;

    /* renamed from: e, reason: collision with root package name */
    public final String f216e;

    /* renamed from: f, reason: collision with root package name */
    public final C0011l f217f;

    /* renamed from: g, reason: collision with root package name */
    public final n f218g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f219h;

    public h(App app, String str, C0011l c0011l) {
        f2.j.f(c0011l, "callback");
        this.f215d = app;
        this.f216e = str;
        this.f217f = c0011l;
        this.f218g = R1.a.d(new A.h(2, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f218g.f4157e != v.f4168a) {
            ((g) this.f218g.getValue()).close();
        }
    }

    @Override // z1.InterfaceC1263a
    public final void setWriteAheadLoggingEnabled(boolean z3) {
        if (this.f218g.f4157e != v.f4168a) {
            g gVar = (g) this.f218g.getValue();
            f2.j.f(gVar, "sQLiteOpenHelper");
            gVar.setWriteAheadLoggingEnabled(z3);
        }
        this.f219h = z3;
    }

    @Override // z1.InterfaceC1263a
    public final c t() {
        return ((g) this.f218g.getValue()).a(true);
    }
}
