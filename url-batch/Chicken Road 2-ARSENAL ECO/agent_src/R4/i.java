package R4;

import f4.C0374a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2112f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f2113g = new AtomicBoolean(false);

    public i(ArrayList arrayList) {
        this.f2112f = arrayList;
    }

    @Override // R4.g
    public final O4.c c() {
        ArrayList arrayList = this.f2112f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            arrayList2.add(((g) obj).c());
        }
        return O4.c.d(arrayList2);
    }

    @Override // R4.g
    public final O4.c shutdown() {
        if (this.f2113g.getAndSet(true)) {
            return O4.c.f1787e;
        }
        ArrayList arrayList = this.f2112f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            arrayList2.add(((g) obj).shutdown());
        }
        return O4.c.d(arrayList2);
    }

    @Override // R4.g
    public final void x(C0374a c0374a, o oVar) {
        ArrayList arrayList = this.f2112f;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((g) obj).x(c0374a, oVar);
        }
    }
}
