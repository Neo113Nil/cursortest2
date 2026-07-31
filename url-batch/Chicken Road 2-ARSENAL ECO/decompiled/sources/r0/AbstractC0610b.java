package r0;

import java.util.ArrayList;
import kotlin.jvm.internal.i;
import l0.q;
import q0.AbstractC0595c;
import q0.InterfaceC0594b;
import s0.AbstractC0627e;
import s0.AbstractC0628f;
import u0.C0686p;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0610b {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0627e f5841a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5842b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5843c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5844d;

    /* renamed from: e, reason: collision with root package name */
    public B0.c f5845e;

    public AbstractC0610b(AbstractC0627e tracker) {
        i.e(tracker, "tracker");
        this.f5841a = tracker;
        this.f5842b = new ArrayList();
        this.f5843c = new ArrayList();
    }

    public abstract boolean a(C0686p c0686p);

    public abstract boolean b(Object obj);

    public final void c(Iterable workSpecs) {
        i.e(workSpecs, "workSpecs");
        this.f5842b.clear();
        this.f5843c.clear();
        ArrayList arrayList = this.f5842b;
        for (Object obj : workSpecs) {
            if (a((C0686p) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = this.f5842b;
        ArrayList arrayList3 = this.f5843c;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            arrayList3.add(((C0686p) obj2).f6000a);
        }
        if (this.f5842b.isEmpty()) {
            this.f5841a.b(this);
        } else {
            AbstractC0627e abstractC0627e = this.f5841a;
            abstractC0627e.getClass();
            synchronized (abstractC0627e.f5871c) {
                try {
                    if (abstractC0627e.f5872d.add(this)) {
                        if (abstractC0627e.f5872d.size() == 1) {
                            abstractC0627e.f5873e = abstractC0627e.a();
                            q.d().a(AbstractC0628f.f5874a, abstractC0627e.getClass().getSimpleName() + ": initial state = " + abstractC0627e.f5873e);
                            abstractC0627e.d();
                        }
                        Object obj3 = abstractC0627e.f5873e;
                        this.f5844d = obj3;
                        d(this.f5845e, obj3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f5845e, this.f5844d);
    }

    public final void d(B0.c cVar, Object obj) {
        if (this.f5842b.isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList workSpecs = this.f5842b;
            i.e(workSpecs, "workSpecs");
            synchronized (cVar.f71g) {
                InterfaceC0594b interfaceC0594b = (InterfaceC0594b) cVar.f72h;
                if (interfaceC0594b != null) {
                    interfaceC0594b.c(workSpecs);
                }
            }
            return;
        }
        ArrayList workSpecs2 = this.f5842b;
        i.e(workSpecs2, "workSpecs");
        synchronized (cVar.f71g) {
            try {
                ArrayList arrayList = new ArrayList();
                int size = workSpecs2.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = workSpecs2.get(i8);
                    i8++;
                    if (cVar.d(((C0686p) obj2).f6000a)) {
                        arrayList.add(obj2);
                    }
                }
                int size2 = arrayList.size();
                while (i7 < size2) {
                    Object obj3 = arrayList.get(i7);
                    i7++;
                    q.d().a(AbstractC0595c.f5753a, "Constraints met for " + ((C0686p) obj3));
                }
                InterfaceC0594b interfaceC0594b2 = (InterfaceC0594b) cVar.f72h;
                if (interfaceC0594b2 != null) {
                    interfaceC0594b2.d(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
