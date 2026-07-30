package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class hr2 implements uc2 {
    public final zs0 m;
    public final String n;
    public boolean o;

    public hr2(zs0 zs0Var, String str) {
        this.m = zs0Var;
        this.n = str;
    }

    public final void b() {
        if (this.o) {
            s03.P(21, "statement is closed");
            throw null;
        }
    }
}
