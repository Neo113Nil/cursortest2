package a0;

import h2.AbstractC0508a;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237b {

    /* renamed from: a, reason: collision with root package name */
    public float f4718a;

    /* renamed from: b, reason: collision with root package name */
    public float f4719b;

    /* renamed from: c, reason: collision with root package name */
    public float f4720c;

    /* renamed from: d, reason: collision with root package name */
    public float f4721d;

    public final void a(float f3, float f4, float f5, float f6) {
        this.f4718a = Math.max(f3, this.f4718a);
        this.f4719b = Math.max(f4, this.f4719b);
        this.f4720c = Math.min(f5, this.f4720c);
        this.f4721d = Math.min(f6, this.f4721d);
    }

    public final boolean b() {
        return this.f4718a >= this.f4720c || this.f4719b >= this.f4721d;
    }

    public final String toString() {
        return "MutableRect(" + AbstractC0508a.Y(this.f4718a) + ", " + AbstractC0508a.Y(this.f4719b) + ", " + AbstractC0508a.Y(this.f4720c) + ", " + AbstractC0508a.Y(this.f4721d) + ')';
    }
}
