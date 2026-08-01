package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class i implements we {
    public final xe f;

    public i(xe xeVar) {
        this.f = xeVar;
    }

    @Override // defpackage.ye
    public final Object f(Object obj, ho hoVar) {
        return hoVar.f(obj, this);
    }

    @Override // defpackage.ye
    public final ye g(ye yeVar) {
        return xf.E(this, yeVar);
    }

    @Override // defpackage.we
    public final xe getKey() {
        return this.f;
    }

    @Override // defpackage.ye
    public we h(xe xeVar) {
        xeVar.getClass();
        if (kr.b(getKey(), xeVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.ye
    public ye k(xe xeVar) {
        xeVar.getClass();
        return kr.b(getKey(), xeVar) ? gk.f : this;
    }
}
