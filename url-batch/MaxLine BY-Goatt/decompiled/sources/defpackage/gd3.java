package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gd3 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public gd3(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        ll3.s(str);
        ll3.s(str2);
        ll3.p(j >= 0);
        ll3.p(j2 >= 0);
        ll3.p(j3 >= 0);
        ll3.p(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final gd3 a(long j) {
        return new gd3(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    public final gd3 b(Long l, Long l2, Boolean bool) {
        return new gd3(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }
}
