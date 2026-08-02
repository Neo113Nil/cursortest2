package p0;

import T.C0097o;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f14674a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14675b;

    /* renamed from: c, reason: collision with root package name */
    public final long f14676c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14677d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14678e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14679f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14680g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14681h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14682i;

    /* renamed from: j, reason: collision with root package name */
    public final C0097o[] f14683j;

    /* renamed from: k, reason: collision with root package name */
    public final int f14684k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14685l;

    /* renamed from: m, reason: collision with root package name */
    public final String f14686m;
    public final List n;
    public final long[] o;

    /* renamed from: p, reason: collision with root package name */
    public final long f14687p;

    public b(String str, String str2, int i4, String str3, long j4, String str4, int i5, int i6, int i7, int i8, String str5, C0097o[] c0097oArr, List list, long[] jArr, long j5) {
        this.f14685l = str;
        this.f14686m = str2;
        this.f14674a = i4;
        this.f14675b = str3;
        this.f14676c = j4;
        this.f14677d = str4;
        this.f14678e = i5;
        this.f14679f = i6;
        this.f14680g = i7;
        this.f14681h = i8;
        this.f14682i = str5;
        this.f14683j = c0097oArr;
        this.n = list;
        this.o = jArr;
        this.f14687p = j5;
        this.f14684k = list.size();
    }

    public final b a(C0097o[] c0097oArr) {
        return new b(this.f14685l, this.f14686m, this.f14674a, this.f14675b, this.f14676c, this.f14677d, this.f14678e, this.f14679f, this.f14680g, this.f14681h, this.f14682i, c0097oArr, this.n, this.o, this.f14687p);
    }

    public final long b(int i4) {
        if (i4 == this.f14684k - 1) {
            return this.f14687p;
        }
        long[] jArr = this.o;
        return jArr[i4 + 1] - jArr[i4];
    }
}
