package u0;

import j.AbstractC0492j;
import j.C0498p;
import j.C0499q;
import java.util.List;

/* renamed from: u0.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1008y0 {

    /* renamed from: a, reason: collision with root package name */
    public final z0.i f8501a;

    /* renamed from: b, reason: collision with root package name */
    public final C0499q f8502b;

    public C1008y0(z0.n nVar, C0498p c0498p) {
        this.f8501a = nVar.f8991d;
        int[] iArr = AbstractC0492j.f5167a;
        this.f8502b = new C0499q();
        List h3 = z0.n.h(nVar, true, 4);
        int size = h3.size();
        for (int i3 = 0; i3 < size; i3++) {
            z0.n nVar2 = (z0.n) h3.get(i3);
            if (c0498p.b(nVar2.f8994g)) {
                this.f8502b.a(nVar2.f8994g);
            }
        }
    }
}
