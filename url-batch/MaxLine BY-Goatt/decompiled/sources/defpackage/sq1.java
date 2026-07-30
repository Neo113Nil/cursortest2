package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sq1 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public sq1(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sq1.class == obj.getClass()) {
            sq1 sq1Var = (sq1) obj;
            return this.c == sq1Var.c && this.d == sq1Var.d && this.b == sq1Var.b && this.a == sq1Var.a && this.e == sq1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + q40.e(this.a, q40.d(this.b, q40.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
