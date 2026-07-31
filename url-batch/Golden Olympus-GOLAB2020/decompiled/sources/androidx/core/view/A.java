package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1351q;
import androidx.lifecycle.InterfaceC1354u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class A {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f11879a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f11880b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f11881c = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC1346l f11882a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1351q f11883b;

        a(AbstractC1346l abstractC1346l, InterfaceC1351q interfaceC1351q) {
            this.f11882a = abstractC1346l;
            this.f11883b = interfaceC1351q;
            abstractC1346l.addObserver(interfaceC1351q);
        }

        void a() {
            this.f11882a.removeObserver(this.f11883b);
            this.f11883b = null;
        }
    }

    public A(Runnable runnable) {
        this.f11879a = runnable;
    }

    public static /* synthetic */ void a(A a4, AbstractC1346l.b bVar, C c4, InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
        a4.getClass();
        if (aVar == AbstractC1346l.a.f(bVar)) {
            a4.c(c4);
            return;
        }
        if (aVar == AbstractC1346l.a.ON_DESTROY) {
            a4.j(c4);
        } else if (aVar == AbstractC1346l.a.d(bVar)) {
            a4.f11880b.remove(c4);
            a4.f11879a.run();
        }
    }

    public static /* synthetic */ void b(A a4, C c4, InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
        a4.getClass();
        if (aVar == AbstractC1346l.a.ON_DESTROY) {
            a4.j(c4);
        }
    }

    public void c(C c4) {
        this.f11880b.add(c4);
        this.f11879a.run();
    }

    public void d(final C c4, InterfaceC1354u interfaceC1354u) {
        c(c4);
        AbstractC1346l lifecycle = interfaceC1354u.getLifecycle();
        a aVar = (a) this.f11881c.remove(c4);
        if (aVar != null) {
            aVar.a();
        }
        this.f11881c.put(c4, new a(lifecycle, new InterfaceC1351q() { // from class: androidx.core.view.z
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u2, AbstractC1346l.a aVar2) {
                A.b(A.this, c4, interfaceC1354u2, aVar2);
            }
        }));
    }

    public void e(final C c4, InterfaceC1354u interfaceC1354u, final AbstractC1346l.b bVar) {
        AbstractC1346l lifecycle = interfaceC1354u.getLifecycle();
        a aVar = (a) this.f11881c.remove(c4);
        if (aVar != null) {
            aVar.a();
        }
        this.f11881c.put(c4, new a(lifecycle, new InterfaceC1351q() { // from class: androidx.core.view.y
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u2, AbstractC1346l.a aVar2) {
                A.a(A.this, bVar, c4, interfaceC1354u2, aVar2);
            }
        }));
    }

    public void f(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f11880b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).c(menu, menuInflater);
        }
    }

    public void g(Menu menu) {
        Iterator it = this.f11880b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).b(menu);
        }
    }

    public boolean h(MenuItem menuItem) {
        Iterator it = this.f11880b.iterator();
        while (it.hasNext()) {
            if (((C) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(Menu menu) {
        Iterator it = this.f11880b.iterator();
        while (it.hasNext()) {
            ((C) it.next()).d(menu);
        }
    }

    public void j(C c4) {
        this.f11880b.remove(c4);
        a aVar = (a) this.f11881c.remove(c4);
        if (aVar != null) {
            aVar.a();
        }
        this.f11879a.run();
    }
}
