package X5;

import a.AbstractC0219a;
import a1.AbstractC0223a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f2891n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2892a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2893b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2894c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2895d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2896e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2897f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2898g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2899h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2900i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2901j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2902k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2903l;

    /* renamed from: m, reason: collision with root package name */
    public String f2904m;

    static {
        int i7 = G5.a.f864i;
        G5.c unit = G5.c.f869i;
        kotlin.jvm.internal.i.e(unit, "unit");
        long f7 = G5.a.f(unit.compareTo(unit) <= 0 ? AbstractC0219a.m(AbstractC0223a.f(Integer.MAX_VALUE, unit, G5.c.f867g)) : AbstractC0219a.C(Integer.MAX_VALUE, unit), unit);
        if (f7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + f7).toString());
    }

    public c(boolean z5, boolean z6, int i7, int i8, boolean z7, boolean z8, boolean z9, int i9, int i10, boolean z10, boolean z11, boolean z12, String str) {
        this.f2892a = z5;
        this.f2893b = z6;
        this.f2894c = i7;
        this.f2895d = i8;
        this.f2896e = z7;
        this.f2897f = z8;
        this.f2898g = z9;
        this.f2899h = i9;
        this.f2900i = i10;
        this.f2901j = z10;
        this.f2902k = z11;
        this.f2903l = z12;
        this.f2904m = str;
    }

    public final String toString() {
        String str = this.f2904m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2892a) {
            sb.append("no-cache, ");
        }
        if (this.f2893b) {
            sb.append("no-store, ");
        }
        int i7 = this.f2894c;
        if (i7 != -1) {
            sb.append("max-age=");
            sb.append(i7);
            sb.append(", ");
        }
        int i8 = this.f2895d;
        if (i8 != -1) {
            sb.append("s-maxage=");
            sb.append(i8);
            sb.append(", ");
        }
        if (this.f2896e) {
            sb.append("private, ");
        }
        if (this.f2897f) {
            sb.append("public, ");
        }
        if (this.f2898g) {
            sb.append("must-revalidate, ");
        }
        int i9 = this.f2899h;
        if (i9 != -1) {
            sb.append("max-stale=");
            sb.append(i9);
            sb.append(", ");
        }
        int i10 = this.f2900i;
        if (i10 != -1) {
            sb.append("min-fresh=");
            sb.append(i10);
            sb.append(", ");
        }
        if (this.f2901j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2902k) {
            sb.append("no-transform, ");
        }
        if (this.f2903l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        kotlin.jvm.internal.i.d(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        this.f2904m = sb2;
        return sb2;
    }
}
