package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahd {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public ahd(int i, float f, float f2, float f3, long j) {
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
        if (obj != null && getClass() == obj.getClass()) {
            ahd ahdVar = (ahd) obj;
            return this.c == ahdVar.c && this.d == ahdVar.d && this.b == ahdVar.b && this.a == ahdVar.a && this.e == ahdVar.e;
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = (((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b);
        long j = this.e;
        return (((floatToIntBits * 31) + this.a) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ")";
    }

    public ahd() {
        this(2, 0.0f, 0.0f, 0.0f, 0L);
    }
}
