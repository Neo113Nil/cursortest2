package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class hu2 implements ew, eu0 {
    public final /* synthetic */ ga1 m;

    public hu2(ga1 ga1Var) {
        this.m = ga1Var;
    }

    @Override // defpackage.ew
    public final long a() {
        return ((aw) this.m.get()).a;
    }

    @Override // defpackage.eu0
    public final tt0 b() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ew) || !(obj instanceof eu0)) {
            return false;
        }
        return this.m.equals(((eu0) obj).b());
    }

    public final int hashCode() {
        return this.m.hashCode();
    }
}
