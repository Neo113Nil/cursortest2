package B;

import a0.C0238c;
import m.AbstractC0625j;
import x.EnumC1187E;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1187E f274a;

    /* renamed from: b, reason: collision with root package name */
    public final long f275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f276c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f277d;

    public E(EnumC1187E enumC1187E, long j3, int i3, boolean z3) {
        this.f274a = enumC1187E;
        this.f275b = j3;
        this.f276c = i3;
        this.f277d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e3 = (E) obj;
        return this.f274a == e3.f274a && C0238c.b(this.f275b, e3.f275b) && this.f276c == e3.f276c && this.f277d == e3.f277d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f277d) + ((AbstractC0625j.b(this.f276c) + A.k.c(this.f274a.hashCode() * 31, 31, this.f275b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f274a);
        sb.append(", position=");
        sb.append((Object) C0238c.j(this.f275b));
        sb.append(", anchor=");
        int i3 = this.f276c;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "Right" : "Middle" : "Left");
        sb.append(", visible=");
        sb.append(this.f277d);
        sb.append(')');
        return sb.toString();
    }
}
