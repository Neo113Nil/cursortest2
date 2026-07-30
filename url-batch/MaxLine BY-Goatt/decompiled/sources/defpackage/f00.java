package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f00 {
    public final c00 a;

    public f00(c00 c00Var) {
        this.a = c00Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f00) {
            return this.a.equals(((f00) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
