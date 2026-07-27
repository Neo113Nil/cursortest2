package M3;

import a3.C0182a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1966a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1967b = new AtomicBoolean(false);

    public j(ArrayList arrayList) {
        this.f1966a = arrayList;
    }

    @Override // M3.h
    public final J3.c e() {
        ArrayList arrayList = this.f1966a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((h) it.next()).e());
        }
        return J3.c.d(arrayList2);
    }

    @Override // M3.h
    public final void r(C0182a c0182a, p pVar) {
        Iterator it = this.f1966a.iterator();
        while (it.hasNext()) {
            ((h) it.next()).r(c0182a, pVar);
        }
    }

    @Override // M3.h
    public final J3.c shutdown() {
        if (this.f1967b.getAndSet(true)) {
            return J3.c.f1361e;
        }
        ArrayList arrayList = this.f1966a;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((h) it.next()).shutdown());
        }
        return J3.c.d(arrayList2);
    }
}
