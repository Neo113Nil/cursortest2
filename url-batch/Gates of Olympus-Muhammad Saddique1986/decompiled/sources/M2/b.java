package M2;

import T2.C0231f;
import T2.F;
import T2.H;
import T2.n;
import T2.z;
import f2.j;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements F {

    /* renamed from: d, reason: collision with root package name */
    public final n f3482d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ K2.n f3484f;

    public b(K2.n nVar) {
        this.f3484f = nVar;
        this.f3482d = new n(((z) nVar.f3335d).f4453d.c());
    }

    public final void a() {
        K2.n nVar = this.f3484f;
        int i3 = nVar.f3332a;
        if (i3 == 6) {
            return;
        }
        if (i3 != 5) {
            throw new IllegalStateException("state: " + nVar.f3332a);
        }
        n nVar2 = this.f3482d;
        H h3 = nVar2.f4428e;
        nVar2.f4428e = H.f4385d;
        h3.a();
        h3.b();
        nVar.f3332a = 6;
    }

    @Override // T2.F
    public final H c() {
        return this.f3482d;
    }

    @Override // T2.F
    public long f(C0231f c0231f, long j3) {
        K2.n nVar = this.f3484f;
        j.f(c0231f, "sink");
        try {
            return ((z) nVar.f3335d).f(c0231f, j3);
        } catch (IOException e3) {
            ((K2.j) nVar.f3334c).k();
            a();
            throw e3;
        }
    }
}
