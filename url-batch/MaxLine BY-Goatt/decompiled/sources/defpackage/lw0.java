package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lw0 {
    public final int a;

    public lw0(int i) {
        this.a = i;
        if (i > 0) {
            return;
        }
        lh.c(in1.l(i, "Provided count ", " should be larger than zero"));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lw0) {
            return this.a == ((lw0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.a;
    }
}
