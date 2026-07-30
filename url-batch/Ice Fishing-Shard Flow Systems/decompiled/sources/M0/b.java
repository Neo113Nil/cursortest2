package M0;

import D0.j;
import G0.s;
import N0.f;
import N0.g;
import P0.p;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f1720a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1721b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1722c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1723d;

    /* renamed from: e, reason: collision with root package name */
    public j f1724e;

    public b(f tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f1720a = tracker;
        this.f1721b = new ArrayList();
        this.f1722c = new ArrayList();
    }

    public abstract boolean a(p pVar);

    public abstract boolean b(Object obj);

    public final void c(Iterable workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.f1721b.clear();
        this.f1722c.clear();
        ArrayList arrayList = this.f1721b;
        for (Object obj : workSpecs) {
            if (a((p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f1721b;
        ArrayList arrayList3 = this.f1722c;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            arrayList3.add(((p) obj2).f2220a);
        }
        if (this.f1721b.isEmpty()) {
            this.f1720a.b(this);
        } else {
            f fVar = this.f1720a;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            synchronized (fVar.f1786c) {
                try {
                    if (fVar.f1787d.add(this)) {
                        if (fVar.f1787d.size() == 1) {
                            fVar.f1788e = fVar.a();
                            s.d().a(g.f1789a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f1788e);
                            fVar.d();
                        }
                        Object obj3 = fVar.f1788e;
                        this.f1723d = obj3;
                        d(this.f1724e, obj3);
                    }
                    Unit unit = Unit.f6114a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f1724e, this.f1723d);
    }

    public final void d(j jVar, Object obj) {
        if (this.f1721b.isEmpty() || jVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList workSpecs = this.f1721b;
            Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
            synchronized (jVar.f332l) {
                L0.b bVar = (L0.b) jVar.f330e;
                if (bVar != null) {
                    bVar.b(workSpecs);
                    Unit unit = Unit.f6114a;
                }
            }
            return;
        }
        ArrayList workSpecs2 = this.f1721b;
        Intrinsics.checkNotNullParameter(workSpecs2, "workSpecs");
        synchronized (jVar.f332l) {
            try {
                ArrayList arrayList = new ArrayList();
                int size = workSpecs2.size();
                int i2 = 0;
                int i5 = 0;
                while (i5 < size) {
                    Object obj2 = workSpecs2.get(i5);
                    i5++;
                    if (jVar.x(((p) obj2).f2220a)) {
                        arrayList.add(obj2);
                    }
                }
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    s.d().a(L0.c.f1660a, "Constraints met for " + ((p) obj3));
                }
                L0.b bVar2 = (L0.b) jVar.f330e;
                if (bVar2 != null) {
                    bVar2.d(arrayList);
                    Unit unit2 = Unit.f6114a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
