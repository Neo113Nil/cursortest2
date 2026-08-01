package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class sg0 implements eb0 {
    public final ig0 f;
    public final String g;
    public boolean h;

    public sg0(ig0 ig0Var, String str) {
        this.f = ig0Var;
        this.g = str;
    }

    public final void i() {
        if (this.h) {
            gk0.S("statement is closed", 21);
            throw null;
        }
    }
}
