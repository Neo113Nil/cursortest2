package i1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f2644n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2645a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2646b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2647c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2648d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2649e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2650f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2651g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2652j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2653k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2654l;

    /* renamed from: m, reason: collision with root package name */
    public String f2655m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        X0.f.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f2645a = z2;
        this.f2646b = z3;
        this.f2647c = i;
        this.f2648d = i2;
        this.f2649e = z4;
        this.f2650f = z5;
        this.f2651g = z6;
        this.h = i3;
        this.i = i4;
        this.f2652j = z7;
        this.f2653k = z8;
        this.f2654l = z9;
        this.f2655m = str;
    }

    public final String toString() {
        String str = this.f2655m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2645a) {
            sb.append("no-cache, ");
        }
        if (this.f2646b) {
            sb.append("no-store, ");
        }
        int i = this.f2647c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f2648d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f2649e) {
            sb.append("private, ");
        }
        if (this.f2650f) {
            sb.append("public, ");
        }
        if (this.f2651g) {
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
        if (this.f2652j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2653k) {
            sb.append("no-transform, ");
        }
        if (this.f2654l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        X0.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f2655m = sb2;
        return sb2;
    }
}
