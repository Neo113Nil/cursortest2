package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a02 extends l02 {
    public final float c;
    public final float d;

    public a02(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a02)) {
            return false;
        }
        a02 a02Var = (a02) obj;
        return Float.compare(this.c, a02Var.c) == 0 && Float.compare(this.d, a02Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return q40.n(sb, this.d, ')');
    }
}
