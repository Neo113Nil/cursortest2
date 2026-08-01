package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tx {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public tx(int i, float f, float f2, float f3, long j) {
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
        if (obj != null && tx.class == obj.getClass()) {
            tx txVar = (tx) obj;
            return this.c == txVar.c && this.d == txVar.d && this.b == txVar.b && this.a == txVar.a && this.e == txVar.e;
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
