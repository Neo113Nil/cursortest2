package defpackage;

import kotlin.text.CharsKt;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v31 {
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
