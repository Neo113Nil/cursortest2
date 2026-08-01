package i1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f2648n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2649a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2650b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2651c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2652d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2653e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2654f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2655g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2656j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2657k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2658l;

    /* renamed from: m, reason: collision with root package name */
    public String f2659m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        X0.f.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f2649a = z2;
        this.f2650b = z3;
        this.f2651c = i;
        this.f2652d = i2;
        this.f2653e = z4;
        this.f2654f = z5;
        this.f2655g = z6;
        this.h = i3;
        this.i = i4;
        this.f2656j = z7;
        this.f2657k = z8;
        this.f2658l = z9;
        this.f2659m = str;
    }

    public final String toString() {
        String str = this.f2659m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f2649a) {
            sb.append("no-cache, ");
        }
        if (this.f2650b) {
            sb.append("no-store, ");
        }
        int i = this.f2651c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f2652d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.f2653e) {
            sb.append("private, ");
        }
        if (this.f2654f) {
            sb.append("public, ");
        }
        if (this.f2655g) {
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
        if (this.f2656j) {
            sb.append("only-if-cached, ");
        }
        if (this.f2657k) {
            sb.append("no-transform, ");
        }
        if (this.f2658l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        X0.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f2659m = sb2;
        return sb2;
    }
}
