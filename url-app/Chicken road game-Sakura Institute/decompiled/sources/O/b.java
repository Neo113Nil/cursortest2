package O;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f3624a;

    public b(int i2) {
        this.f3624a = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f3624a);
        sb.append(")@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }
}
