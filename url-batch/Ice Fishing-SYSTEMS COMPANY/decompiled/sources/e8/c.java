package e8;

import a.AbstractC0415a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f37356n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f37357a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37359c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37360d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37361e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f37362f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f37363g;

    /* renamed from: h, reason: collision with root package name */
    public final int f37364h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f37365j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f37366k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f37367l;

    /* renamed from: m, reason: collision with root package name */
    public String f37368m;

    static {
        int i = N7.a.f2200w;
        N7.c unit = N7.c.f2206w;
        kotlin.jvm.internal.h.e(unit, "unit");
        long f6 = N7.a.f(unit.compareTo(unit) <= 0 ? AbstractC0415a.p(com.bumptech.glide.d.f(Integer.MAX_VALUE, unit, N7.c.f2204u)) : AbstractC0415a.D(Integer.MAX_VALUE, unit), unit);
        if (f6 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + f6).toString());
    }

    public c(boolean z8, boolean z9, int i, int i4, boolean z10, boolean z11, boolean z12, int i9, int i10, boolean z13, boolean z14, boolean z15, String str) {
        this.f37357a = z8;
        this.f37358b = z9;
        this.f37359c = i;
        this.f37360d = i4;
        this.f37361e = z10;
        this.f37362f = z11;
        this.f37363g = z12;
        this.f37364h = i9;
        this.i = i10;
        this.f37365j = z13;
        this.f37366k = z14;
        this.f37367l = z15;
        this.f37368m = str;
    }

    public final String toString() {
        String str = this.f37368m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f37357a) {
            sb.append("no-cache, ");
        }
        if (this.f37358b) {
            sb.append("no-store, ");
        }
        int i = this.f37359c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i4 = this.f37360d;
        if (i4 != -1) {
            sb.append("s-maxage=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f37361e) {
            sb.append("private, ");
        }
        if (this.f37362f) {
            sb.append("public, ");
        }
        if (this.f37363g) {
            sb.append("must-revalidate, ");
        }
        int i9 = this.f37364h;
        if (i9 != -1) {
            sb.append("max-stale=");
            sb.append(i9);
            sb.append(", ");
        }
        int i10 = this.i;
        if (i10 != -1) {
            sb.append("min-fresh=");
            sb.append(i10);
            sb.append(", ");
        }
        if (this.f37365j) {
            sb.append("only-if-cached, ");
        }
        if (this.f37366k) {
            sb.append("no-transform, ");
        }
        if (this.f37367l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        kotlin.jvm.internal.h.d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        this.f37368m = sb2;
        return sb2;
    }
}
