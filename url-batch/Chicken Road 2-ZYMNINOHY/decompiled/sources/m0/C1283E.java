package m0;

import W.J;
import android.net.Uri;
import java.util.Objects;
import v2.a0;
import v2.f0;

/* renamed from: m0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1283E {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f14315a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f14316b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14317c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14318d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14319e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14320f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f14321g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14322h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14323i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14324j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14325k;

    /* renamed from: l, reason: collision with root package name */
    public final String f14326l;

    public C1283E(C1282D c1282d) {
        this.f14315a = f0.a(c1282d.f14303a);
        this.f14316b = c1282d.f14304b.f();
        String str = c1282d.f14306d;
        String str2 = J.f3263a;
        this.f14317c = str;
        this.f14318d = c1282d.f14307e;
        this.f14319e = c1282d.f14308f;
        this.f14321g = c1282d.f14309g;
        this.f14322h = c1282d.f14310h;
        this.f14320f = c1282d.f14305c;
        this.f14323i = c1282d.f14311i;
        this.f14324j = c1282d.f14313k;
        this.f14325k = c1282d.f14314l;
        this.f14326l = c1282d.f14312j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1283E.class != obj.getClass()) {
            return false;
        }
        C1283E c1283e = (C1283E) obj;
        if (this.f14320f != c1283e.f14320f) {
            return false;
        }
        f0 f0Var = c1283e.f14315a;
        f0 f0Var2 = this.f14315a;
        f0Var2.getClass();
        return v2.r.f(f0Var2, f0Var) && this.f14316b.equals(c1283e.f14316b) && Objects.equals(this.f14318d, c1283e.f14318d) && Objects.equals(this.f14317c, c1283e.f14317c) && Objects.equals(this.f14319e, c1283e.f14319e) && Objects.equals(this.f14326l, c1283e.f14326l) && Objects.equals(this.f14321g, c1283e.f14321g) && Objects.equals(this.f14324j, c1283e.f14324j) && Objects.equals(this.f14325k, c1283e.f14325k) && Objects.equals(this.f14322h, c1283e.f14322h) && Objects.equals(this.f14323i, c1283e.f14323i);
    }

    public final int hashCode() {
        int hashCode = (this.f14316b.hashCode() + ((this.f14315a.hashCode() + 217) * 31)) * 31;
        String str = this.f14318d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14317c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14319e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f14320f) * 31;
        String str4 = this.f14326l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.f14321g;
        int hashCode6 = (hashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.f14324j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f14325k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f14322h;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f14323i;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
