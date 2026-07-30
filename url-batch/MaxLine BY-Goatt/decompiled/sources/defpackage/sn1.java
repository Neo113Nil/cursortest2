package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sn1 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean b() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final String toString() {
        return "MutableRect(" + tk3.i0(this.a) + ", " + tk3.i0(this.b) + ", " + tk3.i0(this.c) + ", " + tk3.i0(this.d) + ')';
    }
}
