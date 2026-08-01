package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class bf extends i implements we {
    public static final af g = new af(ej.h, new ze(0));

    public bf() {
        super(ej.h);
    }

    @Override // defpackage.i, defpackage.ye
    public final we h(xe xeVar) {
        we weVar;
        xeVar.getClass();
        if (xeVar instanceof af) {
            af afVar = (af) xeVar;
            xe xeVar2 = this.f;
            if ((xeVar2 == afVar || afVar.g == xeVar2) && (weVar = (we) afVar.f.g(this)) != null) {
                return weVar;
            }
        } else if (ej.h == xeVar) {
            return this;
        }
        return null;
    }

    @Override // defpackage.i, defpackage.ye
    public final ye k(xe xeVar) {
        xeVar.getClass();
        if (xeVar instanceof af) {
            af afVar = (af) xeVar;
            xe xeVar2 = this.f;
            if (xeVar2 != afVar && afVar.g != xeVar2) {
                return this;
            }
            if (((we) afVar.f.g(this)) == null) {
                return this;
            }
        } else if (ej.h != xeVar) {
            return this;
        }
        return gk.f;
    }

    public abstract void q(ye yeVar, Runnable runnable);

    public boolean r(ye yeVar) {
        return !(this instanceof ua0);
    }

    public bf s(int i) {
        kr.i(i);
        return new qs(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + xf.s(this);
    }
}
