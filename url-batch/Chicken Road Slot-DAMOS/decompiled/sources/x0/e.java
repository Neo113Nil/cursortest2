package x0;

import kotlin.text.CharsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f10227a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f10227a);
        sb2.append(")@");
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        sb2.append(num);
        return sb2.toString();
    }
}
