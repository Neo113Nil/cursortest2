package y5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import v5.C0977c;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8683d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8684e = new AtomicBoolean(false);

    public i(ArrayList arrayList) {
        this.f8683d = arrayList;
    }

    @Override // y5.g
    public final C0977c c() {
        ArrayList arrayList = this.f8683d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(((g) obj).c());
        }
        return C0977c.d(arrayList2);
    }

    @Override // y5.g
    public final C0977c shutdown() {
        if (this.f8684e.getAndSet(true)) {
            return C0977c.f8229e;
        }
        ArrayList arrayList = this.f8683d;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(((g) obj).shutdown());
        }
        return C0977c.d(arrayList2);
    }

    @Override // y5.g
    public final void v(M4.a aVar, n nVar) {
        ArrayList arrayList = this.f8683d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((g) obj).v(aVar, nVar);
        }
    }
}
