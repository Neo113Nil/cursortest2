package h0;

import T.C0094l;

/* loaded from: classes.dex */
public abstract class j implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f9114a;

    /* renamed from: b, reason: collision with root package name */
    public final i f9115b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9116c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9117d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9118e;

    /* renamed from: f, reason: collision with root package name */
    public final C0094l f9119f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9120g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9121h;

    /* renamed from: i, reason: collision with root package name */
    public final long f9122i;

    /* renamed from: j, reason: collision with root package name */
    public final long f9123j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9124k;

    public j(String str, i iVar, long j4, int i4, long j5, C0094l c0094l, String str2, String str3, long j6, long j7, boolean z) {
        this.f9114a = str;
        this.f9115b = iVar;
        this.f9116c = j4;
        this.f9117d = i4;
        this.f9118e = j5;
        this.f9119f = c0094l;
        this.f9120g = str2;
        this.f9121h = str3;
        this.f9122i = j6;
        this.f9123j = j7;
        this.f9124k = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j4 = this.f9118e;
        if (j4 > longValue) {
            return 1;
        }
        return j4 < l4.longValue() ? -1 : 0;
    }
}
