package t3;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f3404n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3405a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3406b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3407c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3408e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3409f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3410g;
    public final int h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3411j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3412k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3413l;

    /* renamed from: m, reason: collision with root package name */
    public String f3414m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i3.d.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z4, boolean z5, int i, int i4, boolean z6, boolean z7, boolean z8, int i5, int i6, boolean z9, boolean z10, boolean z11, String str) {
        this.f3405a = z4;
        this.f3406b = z5;
        this.f3407c = i;
        this.d = i4;
        this.f3408e = z6;
        this.f3409f = z7;
        this.f3410g = z8;
        this.h = i5;
        this.i = i6;
        this.f3411j = z9;
        this.f3412k = z10;
        this.f3413l = z11;
        this.f3414m = str;
    }

    public final String toString() {
        String str = this.f3414m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f3405a) {
            sb.append("no-cache, ");
        }
        if (this.f3406b) {
            sb.append("no-store, ");
        }
        int i = this.f3407c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i4 = this.d;
        if (i4 != -1) {
            sb.append("s-maxage=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f3408e) {
            sb.append("private, ");
        }
        if (this.f3409f) {
            sb.append("public, ");
        }
        if (this.f3410g) {
            sb.append("must-revalidate, ");
        }
        int i5 = this.h;
        if (i5 != -1) {
            sb.append("max-stale=");
            sb.append(i5);
            sb.append(", ");
        }
        int i6 = this.i;
        if (i6 != -1) {
            sb.append("min-fresh=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f3411j) {
            sb.append("only-if-cached, ");
        }
        if (this.f3412k) {
            sb.append("no-transform, ");
        }
        if (this.f3413l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        i3.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f3414m = sb2;
        return sb2;
    }
}
