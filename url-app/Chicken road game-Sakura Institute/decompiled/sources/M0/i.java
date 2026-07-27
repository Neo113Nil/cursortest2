package M0;

import A.AbstractC0017m;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final i f3549e = new i(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3550a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3551b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3552c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3553d;

    public i(int i2, int i4, int i5, int i6) {
        this.f3550a = i2;
        this.f3551b = i4;
        this.f3552c = i5;
        this.f3553d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3550a == iVar.f3550a && this.f3551b == iVar.f3551b && this.f3552c == iVar.f3552c && this.f3553d == iVar.f3553d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3553d) + AbstractC0784j.c(this.f3552c, AbstractC0784j.c(this.f3551b, Integer.hashCode(this.f3550a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f3550a);
        sb.append(", ");
        sb.append(this.f3551b);
        sb.append(", ");
        sb.append(this.f3552c);
        sb.append(", ");
        return AbstractC0017m.l(sb, this.f3553d, ')');
    }
}
