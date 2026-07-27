package o2;

import A.AbstractC0017m;
import j2.AbstractC0720j;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class v extends o {

    /* renamed from: i, reason: collision with root package name */
    public final String f8957i;

    public v(String str, s sVar) {
        super(sVar);
        this.f8957i = str;
    }

    @Override // o2.o
    public final int e(o oVar) {
        return this.f8957i.compareTo(((v) oVar).f8957i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f8957i.equals(vVar.f8957i) && this.f8945d.equals(vVar.f8945d);
    }

    @Override // o2.s
    public final s f(s sVar) {
        return new v(this.f8957i, sVar);
    }

    @Override // o2.s
    public final Object getValue() {
        return this.f8957i;
    }

    @Override // o2.o
    public final int h() {
        return 4;
    }

    public final int hashCode() {
        return this.f8945d.hashCode() + this.f8957i.hashCode();
    }

    @Override // o2.s
    public final String u(int i2) {
        int d4 = AbstractC0784j.d(i2);
        String str = this.f8957i;
        if (d4 == 0) {
            return j(i2) + "string:" + str;
        }
        if (d4 != 1) {
            throw new IllegalArgumentException("Invalid hash version for string node: ".concat(AbstractC0017m.w(i2)));
        }
        return j(i2) + "string:" + AbstractC0720j.f(str);
    }
}
