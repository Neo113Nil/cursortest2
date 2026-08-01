package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class hv {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public hv(int i, float f, float f2, float f3, long j) {
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
        if (obj != null && hv.class == obj.getClass()) {
            hv hvVar = (hv) obj;
            return this.c == hvVar.c && this.d == hvVar.d && this.b == hvVar.b && this.a == hvVar.a && this.e == hvVar.e;
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
