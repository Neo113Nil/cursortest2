package p;

import q2.AbstractC0834v;
import q2.C0821h;
import u.C1078e;

/* renamed from: p.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765h {

    /* renamed from: a, reason: collision with root package name */
    public final C1078e f7671a;

    /* renamed from: b, reason: collision with root package name */
    public final C0821h f7672b;

    public C0765h(C1078e c1078e, C0821h c0821h) {
        this.f7671a = c1078e;
        this.f7672b = c0821h;
    }

    public final String toString() {
        C0821h c0821h = this.f7672b;
        if (c0821h.f7904h.v(AbstractC0834v.f7932e) != null) {
            throw new ClassCastException();
        }
        StringBuilder sb = new StringBuilder("Request@");
        int hashCode = hashCode();
        n.r.i(16);
        String num = Integer.toString(hashCode, 16);
        f2.j.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.f7671a.b());
        sb.append(", continuation=");
        sb.append(c0821h);
        sb.append(')');
        return sb.toString();
    }
}
