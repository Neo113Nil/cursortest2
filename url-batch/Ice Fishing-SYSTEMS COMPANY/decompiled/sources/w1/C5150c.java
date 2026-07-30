package w1;

import N1.l;
import u1.k;
import u1.x;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5150c extends l {

    /* renamed from: w, reason: collision with root package name */
    public k f41586w;

    @Override // N1.l
    public final int c(Object obj) {
        x xVar = (x) obj;
        if (xVar == null) {
            return 1;
        }
        return xVar.c();
    }

    @Override // N1.l
    public final void e(Object obj, Object obj2) {
        x xVar = (x) obj2;
        k kVar = this.f41586w;
        if (kVar == null || xVar == null) {
            return;
        }
        kVar.f41136e.o(xVar, true);
    }
}
