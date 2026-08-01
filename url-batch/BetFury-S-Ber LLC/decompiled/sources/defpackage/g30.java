package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class g30 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public g30(int i, float f, float f2, float f3, long j) {
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
        if (obj != null && g30.class == obj.getClass()) {
            g30 g30Var = (g30) obj;
            return this.c == g30Var.c && this.d == g30Var.d && this.b == g30Var.b && this.a == g30Var.a && this.e == g30Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((Integer.hashCode(this.a) + ((Float.hashCode(this.b) + ((Float.hashCode(this.d) + (Float.hashCode(this.c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
