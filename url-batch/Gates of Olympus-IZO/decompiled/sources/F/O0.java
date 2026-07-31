package F;

import x.C1050d;

/* loaded from: classes.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1050d f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final C1050d f1075b;

    /* renamed from: c, reason: collision with root package name */
    public final C1050d f1076c;

    /* renamed from: d, reason: collision with root package name */
    public final C1050d f1077d;

    /* renamed from: e, reason: collision with root package name */
    public final C1050d f1078e;

    public O0() {
        C1050d c1050d = N0.f1065a;
        C1050d c1050d2 = N0.f1066b;
        C1050d c1050d3 = N0.f1067c;
        C1050d c1050d4 = N0.f1068d;
        C1050d c1050d5 = N0.f1069e;
        this.f1074a = c1050d;
        this.f1075b = c1050d2;
        this.f1076c = c1050d3;
        this.f1077d = c1050d4;
        this.f1078e = c1050d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        return Z1.i.a(this.f1074a, o02.f1074a) && Z1.i.a(this.f1075b, o02.f1075b) && Z1.i.a(this.f1076c, o02.f1076c) && Z1.i.a(this.f1077d, o02.f1077d) && Z1.i.a(this.f1078e, o02.f1078e);
    }

    public final int hashCode() {
        return this.f1078e.hashCode() + ((this.f1077d.hashCode() + ((this.f1076c.hashCode() + ((this.f1075b.hashCode() + (this.f1074a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f1074a + ", small=" + this.f1075b + ", medium=" + this.f1076c + ", large=" + this.f1077d + ", extraLarge=" + this.f1078e + ')';
    }
}
