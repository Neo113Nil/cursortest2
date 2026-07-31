package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class j extends e {

    /* renamed from: b, reason: collision with root package name */
    private d.a<h, a> f897b;

    /* renamed from: c, reason: collision with root package name */
    private e.c f898c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<i> f899d;

    /* renamed from: e, reason: collision with root package name */
    private int f900e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f901f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f902g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<e.c> f903h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f904i;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        e.c f905a;

        /* renamed from: b, reason: collision with root package name */
        g f906b;

        a(h hVar, e.c cVar) {
            this.f906b = m.f(hVar);
            this.f905a = cVar;
        }

        void a(i iVar, e.b bVar) {
            e.c d7 = bVar.d();
            this.f905a = j.k(this.f905a, d7);
            this.f906b.d(iVar, bVar);
            this.f905a = d7;
        }
    }

    public j(i iVar) {
        this(iVar, true);
    }

    private j(i iVar, boolean z6) {
        this.f897b = new d.a<>();
        this.f900e = 0;
        this.f901f = false;
        this.f902g = false;
        this.f903h = new ArrayList<>();
        this.f899d = new WeakReference<>(iVar);
        this.f898c = e.c.INITIALIZED;
        this.f904i = z6;
    }

    private void d(i iVar) {
        Iterator<Map.Entry<h, a>> descendingIterator = this.f897b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f902g) {
            Map.Entry<h, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f905a.compareTo(this.f898c) > 0 && !this.f902g && this.f897b.contains(next.getKey())) {
                e.b b7 = e.b.b(value.f905a);
                if (b7 == null) {
                    throw new IllegalStateException("no event down from " + value.f905a);
                }
                n(b7.d());
                value.a(iVar, b7);
                m();
            }
        }
    }

    private e.c e(h hVar) {
        Map.Entry<h, a> p7 = this.f897b.p(hVar);
        e.c cVar = null;
        e.c cVar2 = p7 != null ? p7.getValue().f905a : null;
        if (!this.f903h.isEmpty()) {
            cVar = this.f903h.get(r0.size() - 1);
        }
        return k(k(this.f898c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (!this.f904i || c.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void g(i iVar) {
        d.b<h, a>.d k7 = this.f897b.k();
        while (k7.hasNext() && !this.f902g) {
            Map.Entry next = k7.next();
            a aVar = (a) next.getValue();
            while (aVar.f905a.compareTo(this.f898c) < 0 && !this.f902g && this.f897b.contains(next.getKey())) {
                n(aVar.f905a);
                e.b e7 = e.b.e(aVar.f905a);
                if (e7 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f905a);
                }
                aVar.a(iVar, e7);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f897b.size() == 0) {
            return true;
        }
        e.c cVar = this.f897b.i().getValue().f905a;
        e.c cVar2 = this.f897b.l().getValue().f905a;
        return cVar == cVar2 && this.f898c == cVar2;
    }

    static e.c k(e.c cVar, e.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(e.c cVar) {
        if (this.f898c == cVar) {
            return;
        }
        this.f898c = cVar;
        if (this.f901f || this.f900e != 0) {
            this.f902g = true;
            return;
        }
        this.f901f = true;
        p();
        this.f901f = false;
    }

    private void m() {
        this.f903h.remove(r0.size() - 1);
    }

    private void n(e.c cVar) {
        this.f903h.add(cVar);
    }

    private void p() {
        i iVar = this.f899d.get();
        if (iVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean i7 = i();
            this.f902g = false;
            if (i7) {
                return;
            }
            if (this.f898c.compareTo(this.f897b.i().getValue().f905a) < 0) {
                d(iVar);
            }
            Map.Entry<h, a> l7 = this.f897b.l();
            if (!this.f902g && l7 != null && this.f898c.compareTo(l7.getValue().f905a) > 0) {
                g(iVar);
            }
        }
    }

    @Override // androidx.lifecycle.e
    public void a(h hVar) {
        i iVar;
        f("addObserver");
        e.c cVar = this.f898c;
        e.c cVar2 = e.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = e.c.INITIALIZED;
        }
        a aVar = new a(hVar, cVar2);
        if (this.f897b.n(hVar, aVar) == null && (iVar = this.f899d.get()) != null) {
            boolean z6 = this.f900e != 0 || this.f901f;
            e.c e7 = e(hVar);
            this.f900e++;
            while (aVar.f905a.compareTo(e7) < 0 && this.f897b.contains(hVar)) {
                n(aVar.f905a);
                e.b e8 = e.b.e(aVar.f905a);
                if (e8 == null) {
                    throw new IllegalStateException("no event up from " + aVar.f905a);
                }
                aVar.a(iVar, e8);
                m();
                e7 = e(hVar);
            }
            if (!z6) {
                p();
            }
            this.f900e--;
        }
    }

    @Override // androidx.lifecycle.e
    public e.c b() {
        return this.f898c;
    }

    @Override // androidx.lifecycle.e
    public void c(h hVar) {
        f("removeObserver");
        this.f897b.o(hVar);
    }

    public void h(e.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.d());
    }

    @Deprecated
    public void j(e.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(e.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}
