package M0;

import H2.AbstractC0080b;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f2769e = new h(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2770a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2771b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2772c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2773d;

    public h(int i3, int i4, int i5, int i6) {
        this.f2770a = i3;
        this.f2771b = i4;
        this.f2772c = i5;
        this.f2773d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2770a == hVar.f2770a && this.f2771b == hVar.f2771b && this.f2772c == hVar.f2772c && this.f2773d == hVar.f2773d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2773d) + AbstractC0080b.b(this.f2772c, AbstractC0080b.b(this.f2771b, Integer.hashCode(this.f2770a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.f2770a);
        sb.append(", ");
        sb.append(this.f2771b);
        sb.append(", ");
        sb.append(this.f2772c);
        sb.append(", ");
        return AbstractC0080b.k(sb, this.f2773d, ')');
    }
}
