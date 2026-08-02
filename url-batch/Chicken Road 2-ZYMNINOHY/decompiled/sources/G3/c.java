package G3;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ int n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f869a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f871c;

    /* renamed from: d, reason: collision with root package name */
    public final int f872d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f873e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f874f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f875g;

    /* renamed from: h, reason: collision with root package name */
    public final int f876h;

    /* renamed from: i, reason: collision with root package name */
    public final int f877i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f878j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f879k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f880l;

    /* renamed from: m, reason: collision with root package name */
    public String f881m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z, boolean z4, int i4, int i5, boolean z5, boolean z6, boolean z7, int i6, int i7, boolean z8, boolean z9, boolean z10, String str) {
        this.f869a = z;
        this.f870b = z4;
        this.f871c = i4;
        this.f872d = i5;
        this.f873e = z5;
        this.f874f = z6;
        this.f875g = z7;
        this.f876h = i6;
        this.f877i = i7;
        this.f878j = z8;
        this.f879k = z9;
        this.f880l = z10;
        this.f881m = str;
    }

    public final String toString() {
        String str = this.f881m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f869a) {
            sb.append("no-cache, ");
        }
        if (this.f870b) {
            sb.append("no-store, ");
        }
        int i4 = this.f871c;
        if (i4 != -1) {
            sb.append("max-age=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f872d;
        if (i5 != -1) {
            sb.append("s-maxage=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f873e) {
            sb.append("private, ");
        }
        if (this.f874f) {
            sb.append("public, ");
        }
        if (this.f875g) {
            sb.append("must-revalidate, ");
        }
        int i6 = this.f876h;
        if (i6 != -1) {
            sb.append("max-stale=");
            sb.append(i6);
            sb.append(", ");
        }
        int i7 = this.f877i;
        if (i7 != -1) {
            sb.append("min-fresh=");
            sb.append(i7);
            sb.append(", ");
        }
        if (this.f878j) {
            sb.append("only-if-cached, ");
        }
        if (this.f879k) {
            sb.append("no-transform, ");
        }
        if (this.f880l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f881m = sb2;
        return sb2;
    }
}
