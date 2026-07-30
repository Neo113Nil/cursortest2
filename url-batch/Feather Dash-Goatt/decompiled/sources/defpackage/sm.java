package defpackage;

import kotlin.text.CharsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class sm {
    public final fe a;
    public final tf b;

    public sm(fe feVar, tf tfVar) {
        this.a = feVar;
        this.b = tfVar;
    }

    public final String toString() {
        tf tfVar = this.b;
        if (tfVar.i.d(on.e) != null) {
            af.c();
            return null;
        }
        StringBuilder sb = new StringBuilder("Request@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        sb.append("(currentBounds()=");
        sb.append(this.a.invoke());
        sb.append(", continuation=");
        sb.append(tfVar);
        sb.append(')');
        return sb.toString();
    }
}
