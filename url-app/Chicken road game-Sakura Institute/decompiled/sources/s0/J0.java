package s0;

import java.util.List;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0.i f10063a;

    /* renamed from: b, reason: collision with root package name */
    public final i.r f10064b;

    public J0(y0.n nVar, i.q qVar) {
        this.f10063a = nVar.f11587d;
        int[] iArr = i.k.f6923a;
        this.f10064b = new i.r();
        List h4 = y0.n.h(nVar, true, 4);
        int size = h4.size();
        for (int i2 = 0; i2 < size; i2++) {
            y0.n nVar2 = (y0.n) h4.get(i2);
            if (qVar.b(nVar2.f11590g)) {
                this.f10064b.a(nVar2.f11590g);
            }
        }
    }
}
