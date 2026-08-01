package y0;

import androidx.lifecycle.l0;
import g2.f;
import n.k;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class a extends l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final f f3611d = new f(26);
    public final k c = new k();

    @Override // androidx.lifecycle.l0
    public final void b() {
        k kVar = this.c;
        int i4 = kVar.h;
        if (i4 > 0) {
            kVar.g[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = kVar.g;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        kVar.h = 0;
    }
}
