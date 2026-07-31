package G2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f2139n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2140a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2141b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2142c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2143d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2144e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2145f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2146g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2147h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2148i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2149j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2150k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2151l;

    /* renamed from: m, reason: collision with root package name */
    public String f2152m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f2.j.f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z3, boolean z4, int i3, int i4, boolean z5, boolean z6, boolean z7, int i5, int i6, boolean z8, boolean z9, boolean z10, String str) {
        this.f2140a = z3;
        this.f2141b = z4;
        this.f2142c = i3;
        this.f2143d = i4;
        this.f2144e = z5;
        this.f2145f = z6;
        this.f2146g = z7;
        this.f2147h = i5;
        this.f2148i = i6;
        this.f2149j = z8;
        this.f2150k = z9;
        this.f2151l = z10;
        this.f2152m = str;
    }

    public final String toString() {
        String str = this.f2152m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2140a) {
            sb.append("no-cache, ");
        }
        if (this.f2141b) {
            sb.append("no-store, ");
        }
        int i3 = this.f2142c;
        if (i3 != -1) {
            sb.append("max-age=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f2143d;
        if (i4 != -1) {
            sb.append("s-maxage=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f2144e) {
            sb.append("private, ");
        }
        if (this.f2145f) {
            sb.append("public, ");
        }
        if (this.f2146g) {
            sb.append("must-revalidate, ");
        }
        int i5 = this.f2147h;
        if (i5 != -1) {
            sb.append("max-stale=");
            sb.append(i5);
            sb.append(", ");
        }
        int i6 = this.f2148i;
        if (i6 != -1) {
            sb.append("min-fresh=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f2149j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2150k) {
            sb.append("no-transform, ");
        }
        if (this.f2151l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        f2.j.e(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f2152m = sb2;
        return sb2;
    }
}
