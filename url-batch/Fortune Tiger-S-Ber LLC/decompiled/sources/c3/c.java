package c3;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f1017n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1018a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1019b;
    public final int c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1020d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1021e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1022f;
    public final boolean g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1023i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1024j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1025k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1026l;

    /* renamed from: m, reason: collision with root package name */
    public String f1027m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        u2.c.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z3, boolean z4, int i4, int i5, boolean z5, boolean z6, boolean z7, int i6, int i7, boolean z8, boolean z9, boolean z10, String str) {
        this.f1018a = z3;
        this.f1019b = z4;
        this.c = i4;
        this.f1020d = i5;
        this.f1021e = z5;
        this.f1022f = z6;
        this.g = z7;
        this.h = i6;
        this.f1023i = i7;
        this.f1024j = z8;
        this.f1025k = z9;
        this.f1026l = z10;
        this.f1027m = str;
    }

    public final String toString() {
        String str = this.f1027m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f1018a) {
            sb.append("no-cache, ");
        }
        if (this.f1019b) {
            sb.append("no-store, ");
        }
        int i4 = this.c;
        if (i4 != -1) {
            sb.append("max-age=");
            sb.append(i4);
            sb.append(", ");
        }
        int i5 = this.f1020d;
        if (i5 != -1) {
            sb.append("s-maxage=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f1021e) {
            sb.append("private, ");
        }
        if (this.f1022f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i6 = this.h;
        if (i6 != -1) {
            sb.append("max-stale=");
            sb.append(i6);
            sb.append(", ");
        }
        int i7 = this.f1023i;
        if (i7 != -1) {
            sb.append("min-fresh=");
            sb.append(i7);
            sb.append(", ");
        }
        if (this.f1024j) {
            sb.append("only-if-cached, ");
        }
        if (this.f1025k) {
            sb.append("no-transform, ");
        }
        if (this.f1026l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        u2.c.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f1027m = sb2;
        return sb2;
    }
}
