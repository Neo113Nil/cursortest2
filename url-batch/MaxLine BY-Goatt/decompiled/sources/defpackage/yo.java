package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yo {
    public final float a;
    public final nn2 b;

    public yo(float f, nn2 nn2Var) {
        this.a = f;
        this.b = nn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo)) {
            return false;
        }
        yo yoVar = (yo) obj;
        return pc0.a(this.a, yoVar.a) && this.b.equals(yoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) pc0.b(this.a)) + ", brush=" + this.b + ')';
    }
}
