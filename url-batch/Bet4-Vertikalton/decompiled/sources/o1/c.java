package o1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3260n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3261a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3262b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3263c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3264e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3265f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3266g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3267j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3268k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3269l;

    /* renamed from: m, reason: collision with root package name */
    public String f3270m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d1.d.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f3261a = z2;
        this.f3262b = z3;
        this.f3263c = i;
        this.d = i2;
        this.f3264e = z4;
        this.f3265f = z5;
        this.f3266g = z6;
        this.h = i3;
        this.i = i4;
        this.f3267j = z7;
        this.f3268k = z8;
        this.f3269l = z9;
        this.f3270m = str;
    }

    public final String toString() {
        String str = this.f3270m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3261a) {
            sb.append("no-cache, ");
        }
        if (this.f3262b) {
            sb.append("no-store, ");
        }
        int i = this.f3263c;
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
        if (this.f3264e) {
            sb.append("private, ");
        }
        if (this.f3265f) {
            sb.append("public, ");
        }
        if (this.f3266g) {
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
        if (this.f3267j) {
            sb.append("only-if-cached, ");
        }
        if (this.f3268k) {
            sb.append("no-transform, ");
        }
        if (this.f3269l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        d1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f3270m = sb2;
        return sb2;
    }
}
