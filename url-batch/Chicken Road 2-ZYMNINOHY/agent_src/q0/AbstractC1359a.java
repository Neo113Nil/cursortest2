package q0;

import T.C0107z;
import a.AbstractC0124a;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1359a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14945a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f14946b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final f0.e f14947c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.e f14948d;

    /* renamed from: e, reason: collision with root package name */
    public Looper f14949e;

    /* renamed from: f, reason: collision with root package name */
    public T.T f14950f;

    /* renamed from: g, reason: collision with root package name */
    public b0.i f14951g;

    public AbstractC1359a() {
        int i4 = 0;
        C1353B c1353b = null;
        this.f14947c = new f0.e(new CopyOnWriteArrayList(), i4, c1353b);
        this.f14948d = new f0.e(new CopyOnWriteArrayList(), i4, c1353b);
    }

    public final f0.e a(C1353B c1353b) {
        return new f0.e(this.f14947c.f8493c, 0, c1353b);
    }

    public abstract InterfaceC1383z b(C1353B c1353b, B1.j jVar, long j4);

    public final void c(InterfaceC1354C interfaceC1354C) {
        HashSet hashSet = this.f14946b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC1354C);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        d();
    }

    public final void e(InterfaceC1354C interfaceC1354C) {
        this.f14949e.getClass();
        HashSet hashSet = this.f14946b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC1354C);
        if (isEmpty) {
            f();
        }
    }

    public T.T h() {
        return null;
    }

    public abstract C0107z i();

    public boolean j() {
        return true;
    }

    public abstract void k();

    public final void l(InterfaceC1354C interfaceC1354C, Y.A a3, b0.i iVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f14949e;
        AbstractC0124a.h(looper == null || looper == myLooper);
        this.f14951g = iVar;
        T.T t4 = this.f14950f;
        this.f14945a.add(interfaceC1354C);
        if (this.f14949e == null) {
            this.f14949e = myLooper;
            this.f14946b.add(interfaceC1354C);
            n(a3);
        } else if (t4 != null) {
            e(interfaceC1354C);
            interfaceC1354C.a(this, t4);
        }
    }

    public abstract void n(Y.A a3);

    public final void q(T.T t4) {
        this.f14950f = t4;
        ArrayList arrayList = this.f14945a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((InterfaceC1354C) obj).a(this, t4);
        }
    }

    public abstract void r(InterfaceC1383z interfaceC1383z);

    public final void s(InterfaceC1354C interfaceC1354C) {
        ArrayList arrayList = this.f14945a;
        arrayList.remove(interfaceC1354C);
        if (!arrayList.isEmpty()) {
            c(interfaceC1354C);
            return;
        }
        this.f14949e = null;
        this.f14950f = null;
        this.f14951g = null;
        this.f14946b.clear();
        t();
    }

    public abstract void t();

    public final void u(f0.f fVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14948d.f8493c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            f0.d dVar = (f0.d) it.next();
            if (dVar.f8490a == fVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void v(H h2) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f14947c.f8493c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1358G c1358g = (C1358G) it.next();
            if (c1358g.f14831b == h2) {
                copyOnWriteArrayList.remove(c1358g);
            }
        }
    }

    public abstract void w(C0107z c0107z);

    public void d() {
    }

    public void f() {
    }
}
