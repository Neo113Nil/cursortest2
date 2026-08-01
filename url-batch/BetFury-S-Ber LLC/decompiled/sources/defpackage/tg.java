package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class tg extends j implements og {
    public static final sg g = new sg(sl.g, new rg(0));

    public tg() {
        super(sl.g);
    }

    @Override // defpackage.j, defpackage.qg
    public final qg D(pg pgVar) {
        pgVar.getClass();
        if (pgVar instanceof sg) {
            sg sgVar = (sg) pgVar;
            pg pgVar2 = this.f;
            if (pgVar2 != sgVar && sgVar.g != pgVar2) {
                return this;
            }
            if (sgVar.a(this) == null) {
                return this;
            }
        } else if (sl.g != pgVar) {
            return this;
        }
        return um.f;
    }

    public abstract void O(qg qgVar, Runnable runnable);

    public boolean P(qg qgVar) {
        return !(this instanceof pk0);
    }

    public tg Q(int i) {
        mv.g(i);
        return new px(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + bi.D(this);
    }

    @Override // defpackage.j, defpackage.qg
    public final og w(pg pgVar) {
        og a;
        pgVar.getClass();
        if (pgVar instanceof sg) {
            sg sgVar = (sg) pgVar;
            pg pgVar2 = this.f;
            if ((pgVar2 == sgVar || sgVar.g == pgVar2) && (a = sgVar.a(this)) != null) {
                return a;
            }
        } else if (sl.g == pgVar) {
            return this;
        }
        return null;
    }
}
