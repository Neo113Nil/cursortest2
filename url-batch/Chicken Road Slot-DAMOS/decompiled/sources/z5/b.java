package z5;

import a6.g;
import a6.h;
import c6.p;
import java.util.ArrayList;
import p.e;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final g f10857a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10858b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10859c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10860d;

    /* renamed from: e, reason: collision with root package name */
    public e f10861e;

    public b(g gVar) {
        gVar.getClass();
        this.f10857a = gVar;
        this.f10858b = new ArrayList();
        this.f10859c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable iterable) {
        iterable.getClass();
        this.f10858b.clear();
        this.f10859c.clear();
        ArrayList arrayList = this.f10858b;
        for (Object obj : iterable) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f10858b;
        ArrayList arrayList3 = this.f10859c;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            arrayList3.add(((p) obj2).f1839a);
        }
        boolean isEmpty = this.f10858b.isEmpty();
        g gVar = this.f10857a;
        if (isEmpty) {
            gVar.b(this);
        } else {
            gVar.getClass();
            synchronized (gVar.f304c) {
                try {
                    if (gVar.f305d.add(this)) {
                        if (gVar.f305d.size() == 1) {
                            gVar.f306e = gVar.a();
                            o.d().a(h.f307a, gVar.getClass().getSimpleName() + ": initial state = " + gVar.f306e);
                            gVar.d();
                        }
                        Object obj3 = gVar.f306e;
                        this.f10860d = obj3;
                        d(this.f10861e, obj3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f10861e, this.f10860d);
    }

    public final void d(e eVar, Object obj) {
        if (this.f10858b.isEmpty() || eVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f10858b;
            arrayList.getClass();
            synchronized (eVar.f7590r) {
                y5.b bVar = (y5.b) eVar.f7588e;
                if (bVar != null) {
                    bVar.b(arrayList);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f10858b;
        arrayList2.getClass();
        synchronized (eVar.f7590r) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i3 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    if (eVar.c(((p) obj2).f1839a)) {
                        arrayList3.add(obj2);
                    }
                }
                int size2 = arrayList3.size();
                while (i3 < size2) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    o.d().a(y5.c.f10623a, "Constraints met for " + ((p) obj3));
                }
                y5.b bVar2 = (y5.b) eVar.f7588e;
                if (bVar2 != null) {
                    bVar2.c(arrayList3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
