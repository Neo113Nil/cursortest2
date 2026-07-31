package Q;

import Z1.i;
import e2.AbstractC0381e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f3081a;

    public b(int i3) {
        this.f3081a = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f3081a);
        sb.append(")@");
        int hashCode = hashCode();
        AbstractC0381e.m(16);
        String num = Integer.toString(hashCode, 16);
        i.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }
}
