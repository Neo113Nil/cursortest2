package defpackage;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ru {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public ru(int i, float f, float f2, float f3, long j) {
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
        if (obj != null && ru.class == obj.getClass()) {
            ru ruVar = (ru) obj;
            return this.c == ruVar.c && this.d == ruVar.d && this.b == ruVar.b && this.a == ruVar.a && this.e == ruVar.e;
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
