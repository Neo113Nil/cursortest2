package p1;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public class t extends k1.a implements x0.c {

    /* renamed from: e, reason: collision with root package name */
    public final x0.f f1073e;

    public t(v0.h hVar, x0.f fVar) {
        super(hVar, true);
        this.f1073e = fVar;
    }

    @Override // x0.c
    public final x0.c b() {
        x0.f fVar = this.f1073e;
        if (fVar != null) {
            return fVar;
        }
        return null;
    }

    @Override // k1.q0
    public final void l(Object obj) {
        v0.d m = a.a.m(this.f1073e);
        if (obj instanceof k1.j) {
            Throwable th = ((k1.j) obj).f689a;
            th.getClass();
            obj = new t0.c(th);
        }
        a.g(obj, m);
    }

    @Override // k1.q0
    public final void m(Object obj) {
        if (obj instanceof k1.j) {
            Throwable th = ((k1.j) obj).f689a;
            th.getClass();
            obj = new t0.c(th);
        }
        this.f1073e.f(obj);
    }
}
