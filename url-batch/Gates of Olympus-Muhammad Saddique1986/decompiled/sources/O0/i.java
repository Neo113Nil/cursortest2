package O0;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f3735e = new i(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3738c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3739d;

    public i(int i3, int i4, int i5, int i6) {
        this.f3736a = i3;
        this.f3737b = i4;
        this.f3738c = i5;
        this.f3739d = i6;
    }

    public final int a() {
        return this.f3739d - this.f3737b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3736a == iVar.f3736a && this.f3737b == iVar.f3737b && this.f3738c == iVar.f3738c && this.f3739d == iVar.f3739d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3739d) + AbstractC0625j.a(this.f3738c, AbstractC0625j.a(this.f3737b, Integer.hashCode(this.f3736a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f3736a);
        sb.append(", ");
        sb.append(this.f3737b);
        sb.append(", ");
        sb.append(this.f3738c);
        sb.append(", ");
        return A.k.j(sb, this.f3739d, ')');
    }
}
