package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class z92 extends y92 implements fu0 {
    public final int m;

    public z92(o30 o30Var) {
        super(o30Var);
        this.m = 2;
    }

    @Override // defpackage.fu0
    public final int getArity() {
        return this.m;
    }

    @Override // defpackage.hn
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        d82.a.getClass();
        return f82.a(this);
    }
}
