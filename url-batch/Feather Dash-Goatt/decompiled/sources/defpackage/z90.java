package defpackage;

import kotlin.text.CharsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z90 {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        return sb.toString();
    }
}
