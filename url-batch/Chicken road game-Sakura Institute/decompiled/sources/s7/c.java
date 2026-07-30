package s7;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f8542n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8543a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8545c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8546d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8547e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8548f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8549g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8550h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8551i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8552j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8553k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8554l;

    /* renamed from: m, reason: collision with root package name */
    public String f8555m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        r6.k.f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z8, boolean z9, int i7, int i8, boolean z10, boolean z11, boolean z12, int i9, int i10, boolean z13, boolean z14, boolean z15, String str) {
        this.f8543a = z8;
        this.f8544b = z9;
        this.f8545c = i7;
        this.f8546d = i8;
        this.f8547e = z10;
        this.f8548f = z11;
        this.f8549g = z12;
        this.f8550h = i9;
        this.f8551i = i10;
        this.f8552j = z13;
        this.f8553k = z14;
        this.f8554l = z15;
        this.f8555m = str;
    }

    public final String toString() {
        String str = this.f8555m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f8543a) {
            sb.append("no-cache, ");
        }
        if (this.f8544b) {
            sb.append("no-store, ");
        }
        int i7 = this.f8545c;
        if (i7 != -1) {
            sb.append("max-age=");
            sb.append(i7);
            sb.append(", ");
        }
        int i8 = this.f8546d;
        if (i8 != -1) {
            sb.append("s-maxage=");
            sb.append(i8);
            sb.append(", ");
        }
        if (this.f8547e) {
            sb.append("private, ");
        }
        if (this.f8548f) {
            sb.append("public, ");
        }
        if (this.f8549g) {
            sb.append("must-revalidate, ");
        }
        int i9 = this.f8550h;
        if (i9 != -1) {
            sb.append("max-stale=");
            sb.append(i9);
            sb.append(", ");
        }
        int i10 = this.f8551i;
        if (i10 != -1) {
            sb.append("min-fresh=");
            sb.append(i10);
            sb.append(", ");
        }
        if (this.f8552j) {
            sb.append("only-if-cached, ");
        }
        if (this.f8553k) {
            sb.append("no-transform, ");
        }
        if (this.f8554l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        r6.k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f8555m = sb2;
        return sb2;
    }
}
