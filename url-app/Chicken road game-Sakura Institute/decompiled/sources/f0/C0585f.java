package f0;

import A.AbstractC0017m;
import Z.C0323u;
import Z.K;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import y2.y;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585f {

    /* renamed from: k, reason: collision with root package name */
    public static final E1.i f6373k = new E1.i(10);

    /* renamed from: l, reason: collision with root package name */
    public static int f6374l;

    /* renamed from: a, reason: collision with root package name */
    public final String f6375a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6376b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6377c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6378d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6379e;

    /* renamed from: f, reason: collision with root package name */
    public final C0575F f6380f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6381g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6382h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6383i;

    /* renamed from: j, reason: collision with root package name */
    public final int f6384j;

    public C0585f(String str, float f4, float f5, float f6, float f7, C0575F c0575f, long j4, int i2, boolean z4) {
        int i4;
        synchronized (f6373k) {
            i4 = f6374l;
            f6374l = i4 + 1;
        }
        this.f6375a = str;
        this.f6376b = f4;
        this.f6377c = f5;
        this.f6378d = f6;
        this.f6379e = f7;
        this.f6380f = c0575f;
        this.f6381g = j4;
        this.f6382h = i2;
        this.f6383i = z4;
        this.f6384j = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0585f)) {
            return false;
        }
        C0585f c0585f = (C0585f) obj;
        return Intrinsics.a(this.f6375a, c0585f.f6375a) && M0.e.a(this.f6376b, c0585f.f6376b) && M0.e.a(this.f6377c, c0585f.f6377c) && this.f6378d == c0585f.f6378d && this.f6379e == c0585f.f6379e && this.f6380f.equals(c0585f.f6380f) && C0323u.c(this.f6381g, c0585f.f6381g) && K.o(this.f6382h, c0585f.f6382h) && this.f6383i == c0585f.f6383i;
    }

    public final int hashCode() {
        int hashCode = (this.f6380f.hashCode() + AbstractC0017m.a(this.f6379e, AbstractC0017m.a(this.f6378d, AbstractC0017m.a(this.f6377c, AbstractC0017m.a(this.f6376b, this.f6375a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i2 = C0323u.f4548h;
        y.a aVar = y2.y.f11688e;
        return Boolean.hashCode(this.f6383i) + AbstractC0784j.c(this.f6382h, AbstractC0017m.c(hashCode, 31, this.f6381g), 31);
    }
}
