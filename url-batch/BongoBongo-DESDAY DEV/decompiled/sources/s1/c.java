package s1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3588n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3589a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3590b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3591c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3592e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3593f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3594g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3595h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3596j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3597k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3598l;

    /* renamed from: m, reason: collision with root package name */
    public String f3599m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h1.d.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f3589a = z2;
        this.f3590b = z3;
        this.f3591c = i;
        this.d = i2;
        this.f3592e = z4;
        this.f3593f = z5;
        this.f3594g = z6;
        this.f3595h = i3;
        this.i = i4;
        this.f3596j = z7;
        this.f3597k = z8;
        this.f3598l = z9;
        this.f3599m = str;
    }

    public final String toString() {
        String str = this.f3599m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3589a) {
            sb.append("no-cache, ");
        }
        if (this.f3590b) {
            sb.append("no-store, ");
        }
        int i = this.f3591c;
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
        if (this.f3592e) {
            sb.append("private, ");
        }
        if (this.f3593f) {
            sb.append("public, ");
        }
        if (this.f3594g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f3595h;
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
        if (this.f3596j) {
            sb.append("only-if-cached, ");
        }
        if (this.f3597k) {
            sb.append("no-transform, ");
        }
        if (this.f3598l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        h1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f3599m = sb2;
        return sb2;
    }
}
