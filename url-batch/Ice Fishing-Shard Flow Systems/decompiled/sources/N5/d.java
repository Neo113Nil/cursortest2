package N5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import v5.C0977c;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1842d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1843e;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1844i;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1845l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f1846m = new AtomicBoolean(false);

    public d(ArrayList arrayList) {
        int i2 = 0;
        this.f1845l = arrayList;
        this.f1842d = new ArrayList(arrayList.size());
        this.f1844i = new ArrayList(arrayList.size());
        this.f1843e = new ArrayList(arrayList.size());
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            j jVar = (j) obj;
            if (jVar.i()) {
                this.f1842d.add(jVar);
            }
            if (jVar instanceof d) {
                d dVar = (d) jVar;
                if (!dVar.f1843e.isEmpty()) {
                    this.f1843e.add(dVar);
                }
            }
            if (jVar.w()) {
                this.f1844i.add(jVar);
            }
        }
    }

    @Override // N5.j
    public final C0977c c() {
        ArrayList arrayList = this.f1845l;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(((j) obj).c());
        }
        return C0977c.d(arrayList2);
    }

    @Override // N5.j
    public final boolean i() {
        return !this.f1842d.isEmpty();
    }

    @Override // N5.j
    public final C0977c shutdown() {
        if (this.f1846m.getAndSet(true)) {
            return C0977c.f8229e;
        }
        ArrayList arrayList = this.f1845l;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(((j) obj).shutdown());
        }
        return C0977c.d(arrayList2);
    }

    public final String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.f1842d + ", spanProcessorsEnding=" + this.f1843e + ", spanProcessorsEnd=" + this.f1844i + ", spanProcessorsAll=" + this.f1845l + '}';
    }

    @Override // N5.j
    public final boolean w() {
        return !this.f1844i.isEmpty();
    }
}
