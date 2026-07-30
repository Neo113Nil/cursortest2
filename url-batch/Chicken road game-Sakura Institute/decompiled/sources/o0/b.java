package o0;

import r6.k;
import v1.g;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f6815a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f6815a);
        sb.append(")@");
        int hashCode = hashCode();
        g.b(16);
        String num = Integer.toString(hashCode, 16);
        k.e(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }
}
