package D6;

import kotlin.jvm.internal.Intrinsics;
import m6.C0693a;
import m6.C0694b;
import z1.AbstractC1053a;

/* renamed from: D6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095c {

    /* renamed from: n, reason: collision with root package name */
    public static final l f466n;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f467a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f468b;

    /* renamed from: c, reason: collision with root package name */
    public final int f469c;

    /* renamed from: d, reason: collision with root package name */
    public final int f470d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f471e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f472f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f473g;

    /* renamed from: h, reason: collision with root package name */
    public final int f474h;

    /* renamed from: i, reason: collision with root package name */
    public final int f475i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f476k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f477l;

    /* renamed from: m, reason: collision with root package name */
    public String f478m;

    static {
        l lVar = new l();
        f466n = lVar;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        l lVar2 = new l();
        Intrinsics.checkNotNullParameter(lVar2, "<this>");
        Intrinsics.checkNotNullParameter(lVar2, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        l lVar3 = new l();
        Intrinsics.checkNotNullParameter(lVar3, "<this>");
        C0693a c0693a = C0694b.f6584e;
        m6.d unit = m6.d.f6592l;
        Intrinsics.checkNotNullParameter(unit, "unit");
        long f7 = C0694b.f(unit.compareTo(unit) <= 0 ? AbstractC1053a.t(m6.e.a(Integer.MAX_VALUE, unit, m6.d.f6590e)) : AbstractC1053a.G(Integer.MAX_VALUE, unit), unit);
        if (f7 >= 0) {
            Intrinsics.checkNotNullParameter(lVar3, "<this>");
        } else {
            throw new IllegalArgumentException(("maxStale < 0: " + f7).toString());
        }
    }

    public C0095c(boolean z7, boolean z8, int i2, int i5, boolean z9, boolean z10, boolean z11, int i7, int i8, boolean z12, boolean z13, boolean z14, String str) {
        this.f467a = z7;
        this.f468b = z8;
        this.f469c = i2;
        this.f470d = i5;
        this.f471e = z9;
        this.f472f = z10;
        this.f473g = z11;
        this.f474h = i7;
        this.f475i = i8;
        this.j = z12;
        this.f476k = z13;
        this.f477l = z14;
        this.f478m = str;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        String str = this.f478m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f467a) {
            sb.append("no-cache, ");
        }
        if (this.f468b) {
            sb.append("no-store, ");
        }
        int i2 = this.f469c;
        if (i2 != -1) {
            sb.append("max-age=");
            sb.append(i2);
            sb.append(", ");
        }
        int i5 = this.f470d;
        if (i5 != -1) {
            sb.append("s-maxage=");
            sb.append(i5);
            sb.append(", ");
        }
        if (this.f471e) {
            sb.append("private, ");
        }
        if (this.f472f) {
            sb.append("public, ");
        }
        if (this.f473g) {
            sb.append("must-revalidate, ");
        }
        int i7 = this.f474h;
        if (i7 != -1) {
            sb.append("max-stale=");
            sb.append(i7);
            sb.append(", ");
        }
        int i8 = this.f475i;
        if (i8 != -1) {
            sb.append("min-fresh=");
            sb.append(i8);
            sb.append(", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.f476k) {
            sb.append("no-transform, ");
        }
        if (this.f477l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String sb2 = sb.toString();
        this.f478m = sb2;
        return sb2;
    }
}
