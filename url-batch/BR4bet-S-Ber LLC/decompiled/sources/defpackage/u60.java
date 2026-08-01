package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class u60 extends ur implements le, gf {
    public final ye h;

    public u60(ye yeVar, boolean z) {
        super(z);
        r((ur) yeVar.h(ej.l));
        this.h = yeVar.g(this);
    }

    @Override // defpackage.ur
    public final String b() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.le
    public final ye d() {
        return this.h;
    }

    @Override // defpackage.le
    public final void e(Object obj) {
        Object A;
        Throwable th = obj instanceof q30 ? ((q30) obj).f : null;
        if (th != null) {
            obj = new kc(th);
        }
        do {
            A = A(ur.f.get(this), obj);
            if (A == kr.c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                kc kcVar = obj instanceof kc ? (kc) obj : null;
                throw new IllegalStateException(str, kcVar != null ? kcVar.a : null);
            }
        } while (A == kr.e);
    }

    @Override // defpackage.ur
    public final boolean p(Throwable th) {
        mz.t(this.h, th);
        return true;
    }

    @Override // defpackage.ur
    public final void q(lc lcVar) {
        mz.t(this.h, lcVar);
    }

    @Override // defpackage.ur
    public final void v(Object obj) {
        if (obj instanceof kc) {
            kc.b.get((kc) obj);
        }
    }
}
