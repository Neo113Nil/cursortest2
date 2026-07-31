package a0;

import A.k;
import a.AbstractC0235a;
import h2.AbstractC0508a;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240e {

    /* renamed from: a, reason: collision with root package name */
    public final float f4728a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4729b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4730c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4731d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4732e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4733f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4734g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4735h;

    static {
        long j3 = AbstractC0236a.f4716a;
        AbstractC0235a.b(AbstractC0236a.b(j3), AbstractC0236a.c(j3));
    }

    public C0240e(float f3, float f4, float f5, float f6, long j3, long j4, long j5, long j6) {
        this.f4728a = f3;
        this.f4729b = f4;
        this.f4730c = f5;
        this.f4731d = f6;
        this.f4732e = j3;
        this.f4733f = j4;
        this.f4734g = j5;
        this.f4735h = j6;
    }

    public final float a() {
        return this.f4731d - this.f4729b;
    }

    public final float b() {
        return this.f4730c - this.f4728a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0240e)) {
            return false;
        }
        C0240e c0240e = (C0240e) obj;
        return Float.compare(this.f4728a, c0240e.f4728a) == 0 && Float.compare(this.f4729b, c0240e.f4729b) == 0 && Float.compare(this.f4730c, c0240e.f4730c) == 0 && Float.compare(this.f4731d, c0240e.f4731d) == 0 && AbstractC0236a.a(this.f4732e, c0240e.f4732e) && AbstractC0236a.a(this.f4733f, c0240e.f4733f) && AbstractC0236a.a(this.f4734g, c0240e.f4734g) && AbstractC0236a.a(this.f4735h, c0240e.f4735h);
    }

    public final int hashCode() {
        int a3 = k.a(this.f4731d, k.a(this.f4730c, k.a(this.f4729b, Float.hashCode(this.f4728a) * 31, 31), 31), 31);
        int i3 = AbstractC0236a.f4717b;
        return Long.hashCode(this.f4735h) + k.c(k.c(k.c(a3, 31, this.f4732e), 31, this.f4733f), 31, this.f4734g);
    }

    public final String toString() {
        String str = AbstractC0508a.Y(this.f4728a) + ", " + AbstractC0508a.Y(this.f4729b) + ", " + AbstractC0508a.Y(this.f4730c) + ", " + AbstractC0508a.Y(this.f4731d);
        long j3 = this.f4732e;
        long j4 = this.f4733f;
        boolean a3 = AbstractC0236a.a(j3, j4);
        long j5 = this.f4734g;
        long j6 = this.f4735h;
        if (!a3 || !AbstractC0236a.a(j4, j5) || !AbstractC0236a.a(j5, j6)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC0236a.d(j3)) + ", topRight=" + ((Object) AbstractC0236a.d(j4)) + ", bottomRight=" + ((Object) AbstractC0236a.d(j5)) + ", bottomLeft=" + ((Object) AbstractC0236a.d(j6)) + ')';
        }
        if (AbstractC0236a.b(j3) == AbstractC0236a.c(j3)) {
            return "RoundRect(rect=" + str + ", radius=" + AbstractC0508a.Y(AbstractC0236a.b(j3)) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + AbstractC0508a.Y(AbstractC0236a.b(j3)) + ", y=" + AbstractC0508a.Y(AbstractC0236a.c(j3)) + ')';
    }
}
