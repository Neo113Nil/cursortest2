package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class iw {
    public final String a;
    public final long b;
    public final int c;

    public iw(String str, int i, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() == 0) {
            lh.e("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            lh.e("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iw iwVar = (iw) obj;
        if (this.c == iwVar.c && this.a.equals(iwVar.a)) {
            return o70.v(this.b, iwVar.b);
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, iw iwVar);

    public int hashCode() {
        return in1.h(this.a.hashCode() * 31, 31, this.b) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) o70.P(this.b)) + ')';
    }
}
