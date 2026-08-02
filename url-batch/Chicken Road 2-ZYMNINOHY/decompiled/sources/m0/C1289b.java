package m0;

import E.AbstractC0005f;
import java.util.Objects;
import v2.f0;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1289b {

    /* renamed from: a, reason: collision with root package name */
    public final String f14341a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14342b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14343c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14344d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14345e;

    /* renamed from: f, reason: collision with root package name */
    public final String f14346f;

    /* renamed from: g, reason: collision with root package name */
    public final String f14347g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14348h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f14349i;

    /* renamed from: j, reason: collision with root package name */
    public final C1288a f14350j;

    public C1289b(K3.f fVar, f0 f0Var, C1288a c1288a) {
        this.f14341a = (String) fVar.f1553d;
        this.f14342b = fVar.f1550a;
        this.f14343c = (String) fVar.f1554e;
        this.f14344d = fVar.f1551b;
        this.f14346f = (String) fVar.f1556g;
        this.f14347g = (String) fVar.f1557h;
        this.f14345e = fVar.f1552c;
        this.f14348h = (String) fVar.f1558i;
        this.f14349i = f0Var;
        this.f14350j = c1288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1289b.class == obj.getClass()) {
            C1289b c1289b = (C1289b) obj;
            if (this.f14341a.equals(c1289b.f14341a) && this.f14342b == c1289b.f14342b && this.f14343c.equals(c1289b.f14343c) && this.f14344d == c1289b.f14344d && this.f14345e == c1289b.f14345e) {
                f0 f0Var = c1289b.f14349i;
                f0 f0Var2 = this.f14349i;
                f0Var2.getClass();
                if (v2.r.f(f0Var2, f0Var) && this.f14350j.equals(c1289b.f14350j) && Objects.equals(this.f14346f, c1289b.f14346f) && Objects.equals(this.f14347g, c1289b.f14347g) && Objects.equals(this.f14348h, c1289b.f14348h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f14350j.hashCode() + ((this.f14349i.hashCode() + ((((AbstractC0005f.f((AbstractC0005f.f(217, 31, this.f14341a) + this.f14342b) * 31, 31, this.f14343c) + this.f14344d) * 31) + this.f14345e) * 31)) * 31)) * 31;
        String str = this.f14346f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14347g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14348h;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
