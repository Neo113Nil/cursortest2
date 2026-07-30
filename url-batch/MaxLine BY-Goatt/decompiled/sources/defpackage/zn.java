package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zn {
    public final float a;

    public zn(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return Math.round((1.0f + this.a) * ((i2 - i) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zn) && Float.compare(this.a, ((zn) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return q40.n(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}
