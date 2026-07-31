package u0;

import j.AbstractC0536j;
import j.C0542p;
import j.C0543q;
import java.util.List;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    public final A0.i f9199a;

    /* renamed from: b, reason: collision with root package name */
    public final C0543q f9200b;

    public I0(A0.p pVar, C0542p c0542p) {
        this.f9199a = pVar.f142d;
        int[] iArr = AbstractC0536j.f6285a;
        this.f9200b = new C0543q();
        List h3 = A0.p.h(pVar, true, 4);
        int size = h3.size();
        for (int i3 = 0; i3 < size; i3++) {
            A0.p pVar2 = (A0.p) h3.get(i3);
            if (c0542p.b(pVar2.f145g)) {
                this.f9200b.a(pVar2.f145g);
            }
        }
    }
}
