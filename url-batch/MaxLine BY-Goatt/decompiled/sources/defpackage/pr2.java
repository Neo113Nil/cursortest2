package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class pr2 extends r30 implements fu0 {
    private final int arity;

    public pr2(int i, o30 o30Var) {
        super(o30Var);
        this.arity = i;
    }

    @Override // defpackage.fu0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.hn
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        d82.a.getClass();
        return f82.a(this);
    }
}
