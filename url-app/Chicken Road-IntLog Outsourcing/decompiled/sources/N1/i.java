package N1;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final q f2019a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2021c;

    public i(int i2, Class cls, int i3) {
        this(q.a(cls), i2, i3);
    }

    public static i a(Class cls) {
        return new i(1, cls, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2019a.equals(iVar.f2019a) && this.f2020b == iVar.f2020b && this.f2021c == iVar.f2021c;
    }

    public final int hashCode() {
        return ((((this.f2019a.hashCode() ^ 1000003) * 1000003) ^ this.f2020b) * 1000003) ^ this.f2021c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2019a);
        sb.append(", type=");
        int i2 = this.f2020b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i3 = this.f2021c;
        if (i3 == 0) {
            str = "direct";
        } else if (i3 == 1) {
            str = "provider";
        } else {
            if (i3 != 2) {
                throw new AssertionError(AbstractC0279e.d(i3, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return AbstractC0279e.h(sb, str, "}");
    }

    public i(q qVar, int i2, int i3) {
        this.f2019a = qVar;
        this.f2020b = i2;
        this.f2021c = i3;
    }
}
