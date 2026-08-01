package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class vb0 extends i implements ch {
    public final eg i;

    public vb0(qg qgVar, eg egVar) {
        super(qgVar, true);
        this.i = egVar;
    }

    @Override // defpackage.mw
    public final boolean E() {
        return true;
    }

    @Override // defpackage.mw
    public void a(Object obj) {
        mv.L(n9.z(this.i), d50.P(obj));
    }

    @Override // defpackage.mw
    public void b(Object obj) {
        this.i.e(d50.P(obj));
    }

    @Override // defpackage.ch
    public final ch c() {
        eg egVar = this.i;
        if (egVar != null) {
            return egVar;
        }
        return null;
    }
}
