package u0;

import r0.s1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f22421a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f22422b;

    /* renamed from: c, reason: collision with root package name */
    public final s1 f22423c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22424d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22425e;

    public i(String str, s1 s1Var, s1 s1Var2, int i7, int i8) {
        o2.a.a(i7 == 0 || i8 == 0);
        this.f22421a = o2.a.d(str);
        this.f22422b = (s1) o2.a.e(s1Var);
        this.f22423c = (s1) o2.a.e(s1Var2);
        this.f22424d = i7;
        this.f22425e = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f22424d == iVar.f22424d && this.f22425e == iVar.f22425e && this.f22421a.equals(iVar.f22421a) && this.f22422b.equals(iVar.f22422b) && this.f22423c.equals(iVar.f22423c);
    }

    public int hashCode() {
        return ((((((((527 + this.f22424d) * 31) + this.f22425e) * 31) + this.f22421a.hashCode()) * 31) + this.f22422b.hashCode()) * 31) + this.f22423c.hashCode();
    }
}
