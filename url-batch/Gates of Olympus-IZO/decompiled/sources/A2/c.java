package A2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f46n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f51e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f52f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f53g;

    /* renamed from: h, reason: collision with root package name */
    public final int f54h;

    /* renamed from: i, reason: collision with root package name */
    public final int f55i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f56j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f57k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f58l;

    /* renamed from: m, reason: collision with root package name */
    public String f59m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Z1.i.f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z3, boolean z4, int i3, int i4, boolean z5, boolean z6, boolean z7, int i5, int i6, boolean z8, boolean z9, boolean z10, String str) {
        this.f47a = z3;
        this.f48b = z4;
        this.f49c = i3;
        this.f50d = i4;
        this.f51e = z5;
        this.f52f = z6;
        this.f53g = z7;
        this.f54h = i5;
        this.f55i = i6;
        this.f56j = z8;
        this.f57k = z9;
        this.f58l = z10;
        this.f59m = str;
    }

    public final String toString() {
        String str = this.f59m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f47a) {
            sb.append("no-cache, ");
        }
        if (this.f48b) {
            sb.append("no-store, ");
        }
        int i3 = this.f49c;
        if (i3 != -1) {
            sb.append("max-age=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.f50d;
        if (i4 != -1) {
            sb.append("s-maxage=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f51e) {
            sb.append("private, ");
        }
        if (this.f52f) {
            sb.append("public, ");
        }
        if (this.f53g) {
            sb.append("must-revalidate, ");
        }
        int i5 = this.f54h;
        if (i5 != -1) {
            sb.append("max-stale=");
            sb.append(i5);
            sb.append(", ");
        }
        int i6 = this.f55i;
        if (i6 != -1) {
            sb.append("min-fresh=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f56j) {
            sb.append("only-if-cached, ");
        }
        if (this.f57k) {
            sb.append("no-transform, ");
        }
        if (this.f58l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Z1.i.e(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f59m = sb2;
        return sb2;
    }
}
