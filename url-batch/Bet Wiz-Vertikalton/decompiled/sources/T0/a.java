package T0;

import q.AbstractC0285e;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f842a;

    /* renamed from: b, reason: collision with root package name */
    public final int f843b;

    /* renamed from: c, reason: collision with root package name */
    public final int f844c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f845e;

    public a(boolean z2, int i, int i2, int i3, int i4) {
        c.g("type", i4);
        this.f842a = i;
        this.f843b = i2;
        this.f844c = i3;
        this.d = i4;
        this.f845e = z2;
    }

    public static a b(a aVar, boolean z2) {
        int i = aVar.d;
        c.g("type", i);
        return new a(z2, aVar.f842a, aVar.f843b, aVar.f844c, i);
    }

    public final boolean a() {
        int a2 = AbstractC0285e.a(this.d);
        if (a2 == 0 || a2 == 1) {
            return true;
        }
        if (a2 == 2) {
            return this.f845e;
        }
        if (a2 == 3 || a2 == 4) {
            return true;
        }
        throw new V0.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f842a == aVar.f842a && this.f843b == aVar.f843b && this.f844c == aVar.f844c && this.d == aVar.d && this.f845e == aVar.f845e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f845e) + ((AbstractC0285e.a(this.d) + ((Integer.hashCode(this.f844c) + ((Integer.hashCode(this.f843b) + (Integer.hashCode(this.f842a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        boolean z2 = this.f845e;
        StringBuilder sb = new StringBuilder("CircuitNode(id=");
        sb.append(this.f842a);
        sb.append(", row=");
        sb.append(this.f843b);
        sb.append(", col=");
        sb.append(this.f844c);
        sb.append(", type=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "JUNCTION" : "WIRE" : "SWITCH" : "TARGET" : "SOURCE");
        sb.append(", switchOn=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
