package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rm {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public rm(sq1 sq1Var) {
        sq1Var.getClass();
        float f = sq1Var.c;
        float f2 = sq1Var.d;
        float f3 = sq1Var.b;
        int i = sq1Var.a;
        long j = sq1Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
