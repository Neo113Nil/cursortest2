package p1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3305n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3306a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3308c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3309e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3310f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3311g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3312j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3313k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3314l;

    /* renamed from: m, reason: collision with root package name */
    public String f3315m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e1.d.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f3306a = z2;
        this.f3307b = z3;
        this.f3308c = i;
        this.d = i2;
        this.f3309e = z4;
        this.f3310f = z5;
        this.f3311g = z6;
        this.h = i3;
        this.i = i4;
        this.f3312j = z7;
        this.f3313k = z8;
        this.f3314l = z9;
        this.f3315m = str;
    }

    public final String toString() {
        String str = this.f3315m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3306a) {
            sb.append("no-cache, ");
        }
        if (this.f3307b) {
            sb.append("no-store, ");
        }
        int i = this.f3308c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f3309e) {
            sb.append("private, ");
        }
        if (this.f3310f) {
            sb.append("public, ");
        }
        if (this.f3311g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f3312j) {
            sb.append("only-if-cached, ");
        }
        if (this.f3313k) {
            sb.append("no-transform, ");
        }
        if (this.f3314l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        e1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f3315m = sb2;
        return sb2;
    }
}
