package Q;

import f2.j;
import n.r;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f3947a;

    public b(int i3) {
        this.f3947a = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f3947a);
        sb.append(")@");
        int hashCode = hashCode();
        r.i(16);
        String num = Integer.toString(hashCode, 16);
        j.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }
}
