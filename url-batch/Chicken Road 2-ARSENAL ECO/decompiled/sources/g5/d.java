package g5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4287f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4288g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4289h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4290i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f4291j = new AtomicBoolean(false);

    public d(ArrayList arrayList) {
        int i7 = 0;
        this.f4290i = arrayList;
        this.f4287f = new ArrayList(arrayList.size());
        this.f4289h = new ArrayList(arrayList.size());
        this.f4288g = new ArrayList(arrayList.size());
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            j jVar = (j) obj;
            if (jVar.j()) {
                this.f4287f.add(jVar);
            }
            if (jVar instanceof d) {
                d dVar = (d) jVar;
                if (!dVar.f4288g.isEmpty()) {
                    this.f4288g.add(dVar);
                }
            }
            if (jVar.z()) {
                this.f4289h.add(jVar);
            }
        }
    }

    @Override // g5.j
    public final O4.c c() {
        ArrayList arrayList = this.f4290i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            arrayList2.add(((j) obj).c());
        }
        return O4.c.d(arrayList2);
    }

    @Override // g5.j
    public final boolean j() {
        return !this.f4287f.isEmpty();
    }

    @Override // g5.j
    public final O4.c shutdown() {
        if (this.f4291j.getAndSet(true)) {
            return O4.c.f1787e;
        }
        ArrayList arrayList = this.f4290i;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            arrayList2.add(((j) obj).shutdown());
        }
        return O4.c.d(arrayList2);
    }

    public final String toString() {
        return "MultiSpanProcessor{spanProcessorsStart=" + this.f4287f + ", spanProcessorsEnding=" + this.f4288g + ", spanProcessorsEnd=" + this.f4289h + ", spanProcessorsAll=" + this.f4290i + '}';
    }

    @Override // g5.j
    public final boolean z() {
        return !this.f4289h.isEmpty();
    }
}
