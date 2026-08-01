package z1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f4817n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4818a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4819b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4820c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4821d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4822f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4823g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4824h;
    public final int i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4825k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f4826l;

    /* renamed from: m, reason: collision with root package name */
    public String f4827m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j1.h.e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public d(boolean z2, boolean z3, int i, int i2, boolean z4, boolean z5, boolean z6, int i3, int i4, boolean z7, boolean z8, boolean z9, String str) {
        this.f4818a = z2;
        this.f4819b = z3;
        this.f4820c = i;
        this.f4821d = i2;
        this.e = z4;
        this.f4822f = z5;
        this.f4823g = z6;
        this.f4824h = i3;
        this.i = i4;
        this.j = z7;
        this.f4825k = z8;
        this.f4826l = z9;
        this.f4827m = str;
    }

    public final String toString() {
        String str = this.f4827m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4818a) {
            sb.append("no-cache, ");
        }
        if (this.f4819b) {
            sb.append("no-store, ");
        }
        int i = this.f4820c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.f4821d;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f4822f) {
            sb.append("public, ");
        }
        if (this.f4823g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.f4824h;
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
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.f4825k) {
            sb.append("no-transform, ");
        }
        if (this.f4826l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        j1.h.d(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f4827m = sb2;
        return sb2;
    }
}
