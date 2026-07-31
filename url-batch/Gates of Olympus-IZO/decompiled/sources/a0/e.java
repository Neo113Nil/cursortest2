package a0;

import H2.AbstractC0080b;
import M1.B;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f3495a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3496b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3497c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3498d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3499e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3500f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3501g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3502h;

    static {
        long j3 = AbstractC0158a.f3483a;
        B.a(AbstractC0158a.b(j3), AbstractC0158a.c(j3));
    }

    public e(float f3, float f4, float f5, float f6, long j3, long j4, long j5, long j6) {
        this.f3495a = f3;
        this.f3496b = f4;
        this.f3497c = f5;
        this.f3498d = f6;
        this.f3499e = j3;
        this.f3500f = j4;
        this.f3501g = j5;
        this.f3502h = j6;
    }

    public final float a() {
        return this.f3498d - this.f3496b;
    }

    public final float b() {
        return this.f3497c - this.f3495a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f3495a, eVar.f3495a) == 0 && Float.compare(this.f3496b, eVar.f3496b) == 0 && Float.compare(this.f3497c, eVar.f3497c) == 0 && Float.compare(this.f3498d, eVar.f3498d) == 0 && AbstractC0158a.a(this.f3499e, eVar.f3499e) && AbstractC0158a.a(this.f3500f, eVar.f3500f) && AbstractC0158a.a(this.f3501g, eVar.f3501g) && AbstractC0158a.a(this.f3502h, eVar.f3502h);
    }

    public final int hashCode() {
        int a3 = AbstractC0080b.a(this.f3498d, AbstractC0080b.a(this.f3497c, AbstractC0080b.a(this.f3496b, Float.hashCode(this.f3495a) * 31, 31), 31), 31);
        int i3 = AbstractC0158a.f3484b;
        return Long.hashCode(this.f3502h) + AbstractC0080b.d(AbstractC0080b.d(AbstractC0080b.d(a3, 31, this.f3499e), 31, this.f3500f), 31, this.f3501g);
    }

    public final String toString() {
        String str = I2.d.N(this.f3495a) + ", " + I2.d.N(this.f3496b) + ", " + I2.d.N(this.f3497c) + ", " + I2.d.N(this.f3498d);
        long j3 = this.f3499e;
        long j4 = this.f3500f;
        boolean a3 = AbstractC0158a.a(j3, j4);
        long j5 = this.f3501g;
        long j6 = this.f3502h;
        if (!a3 || !AbstractC0158a.a(j4, j5) || !AbstractC0158a.a(j5, j6)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC0158a.d(j3)) + ", topRight=" + ((Object) AbstractC0158a.d(j4)) + ", bottomRight=" + ((Object) AbstractC0158a.d(j5)) + ", bottomLeft=" + ((Object) AbstractC0158a.d(j6)) + ')';
        }
        if (AbstractC0158a.b(j3) == AbstractC0158a.c(j3)) {
            return "RoundRect(rect=" + str + ", radius=" + I2.d.N(AbstractC0158a.b(j3)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + I2.d.N(AbstractC0158a.b(j3)) + ", y=" + I2.d.N(AbstractC0158a.c(j3)) + ')';
    }
}
