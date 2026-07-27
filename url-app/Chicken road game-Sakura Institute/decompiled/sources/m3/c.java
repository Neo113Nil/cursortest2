package m3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f8324n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8325a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8326b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8327c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8328d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8329e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8330f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f8331g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8332h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8333i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f8334j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8335k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8336l;

    /* renamed from: m, reason: collision with root package name */
    public String f8337m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public c(boolean z4, boolean z5, int i2, int i4, boolean z6, boolean z7, boolean z8, int i5, int i6, boolean z9, boolean z10, boolean z11, String str) {
        this.f8325a = z4;
        this.f8326b = z5;
        this.f8327c = i2;
        this.f8328d = i4;
        this.f8329e = z6;
        this.f8330f = z7;
        this.f8331g = z8;
        this.f8332h = i5;
        this.f8333i = i6;
        this.f8334j = z9;
        this.f8335k = z10;
        this.f8336l = z11;
        this.f8337m = str;
    }

    public final String toString() {
        String str = this.f8337m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f8325a) {
            sb.append("no-cache, ");
        }
        if (this.f8326b) {
            sb.append("no-store, ");
        }
        int i2 = this.f8327c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i4 = this.f8328d;
        if (i4 != -1) {
            sb.append("s-maxage=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.f8329e) {
            sb.append("private, ");
        }
        if (this.f8330f) {
            sb.append("public, ");
        }
        if (this.f8331g) {
            sb.append("must-revalidate, ");
        }
        int i5 = this.f8332h;
        if (i5 != -1) {
            sb.append("max-stale=");
            sb.append(i5);
            sb.append(", ");
        }
        int i6 = this.f8333i;
        if (i6 != -1) {
            sb.append("min-fresh=");
            sb.append(i6);
            sb.append(", ");
        }
        if (this.f8334j) {
            sb.append("only-if-cached, ");
        }
        if (this.f8335k) {
            sb.append("no-transform, ");
        }
        if (this.f8336l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f8337m = sb2;
        return sb2;
    }
}
