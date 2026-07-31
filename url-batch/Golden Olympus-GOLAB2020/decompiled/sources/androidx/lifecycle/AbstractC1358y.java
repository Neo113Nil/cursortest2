package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import java.util.Map;
import l.C3250b;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1358y {

    /* renamed from: k, reason: collision with root package name */
    static final Object f12688k = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f12689a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private C3250b f12690b = new C3250b();

    /* renamed from: c, reason: collision with root package name */
    int f12691c = 0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12692d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f12693e;

    /* renamed from: f, reason: collision with root package name */
    volatile Object f12694f;

    /* renamed from: g, reason: collision with root package name */
    private int f12695g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12696h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12697i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f12698j;

    /* renamed from: androidx.lifecycle.y$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC1358y.this.f12689a) {
                obj = AbstractC1358y.this.f12694f;
                AbstractC1358y.this.f12694f = AbstractC1358y.f12688k;
            }
            AbstractC1358y.this.o(obj);
        }
    }

    /* renamed from: androidx.lifecycle.y$b */
    private class b extends d {
        b(C c4) {
            super(c4);
        }

        @Override // androidx.lifecycle.AbstractC1358y.d
        boolean d() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.y$c */
    class c extends d implements InterfaceC1351q {

        /* renamed from: f, reason: collision with root package name */
        final InterfaceC1354u f12701f;

        c(InterfaceC1354u interfaceC1354u, C c4) {
            super(c4);
            this.f12701f = interfaceC1354u;
        }

        @Override // androidx.lifecycle.AbstractC1358y.d
        void b() {
            this.f12701f.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.AbstractC1358y.d
        boolean c(InterfaceC1354u interfaceC1354u) {
            return this.f12701f == interfaceC1354u;
        }

        @Override // androidx.lifecycle.AbstractC1358y.d
        boolean d() {
            return this.f12701f.getLifecycle().getCurrentState().d(AbstractC1346l.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC1351q
        public void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
            AbstractC1346l.b currentState = this.f12701f.getLifecycle().getCurrentState();
            if (currentState == AbstractC1346l.b.DESTROYED) {
                AbstractC1358y.this.n(this.f12703b);
                return;
            }
            AbstractC1346l.b bVar = null;
            while (bVar != currentState) {
                a(d());
                bVar = currentState;
                currentState = this.f12701f.getLifecycle().getCurrentState();
            }
        }
    }

    /* renamed from: androidx.lifecycle.y$d */
    private abstract class d {

        /* renamed from: b, reason: collision with root package name */
        final C f12703b;

        /* renamed from: c, reason: collision with root package name */
        boolean f12704c;

        /* renamed from: d, reason: collision with root package name */
        int f12705d = -1;

        d(C c4) {
            this.f12703b = c4;
        }

        void a(boolean z4) {
            if (z4 == this.f12704c) {
                return;
            }
            this.f12704c = z4;
            AbstractC1358y.this.c(z4 ? 1 : -1);
            if (this.f12704c) {
                AbstractC1358y.this.e(this);
            }
        }

        void b() {
        }

        boolean c(InterfaceC1354u interfaceC1354u) {
            return false;
        }

        abstract boolean d();
    }

    public AbstractC1358y() {
        Object obj = f12688k;
        this.f12694f = obj;
        this.f12698j = new a();
        this.f12693e = obj;
        this.f12695g = -1;
    }

    static void b(String str) {
        if (k.c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(d dVar) {
        if (dVar.f12704c) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i4 = dVar.f12705d;
            int i5 = this.f12695g;
            if (i4 >= i5) {
                return;
            }
            dVar.f12705d = i5;
            dVar.f12703b.d(this.f12693e);
        }
    }

    void c(int i4) {
        int i5 = this.f12691c;
        this.f12691c = i4 + i5;
        if (this.f12692d) {
            return;
        }
        this.f12692d = true;
        while (true) {
            try {
                int i6 = this.f12691c;
                if (i5 == i6) {
                    this.f12692d = false;
                    return;
                }
                boolean z4 = i5 == 0 && i6 > 0;
                boolean z5 = i5 > 0 && i6 == 0;
                if (z4) {
                    k();
                } else if (z5) {
                    l();
                }
                i5 = i6;
            } catch (Throwable th) {
                this.f12692d = false;
                throw th;
            }
        }
    }

    void e(d dVar) {
        if (this.f12696h) {
            this.f12697i = true;
            return;
        }
        this.f12696h = true;
        do {
            this.f12697i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                C3250b.d e4 = this.f12690b.e();
                while (e4.hasNext()) {
                    d((d) ((Map.Entry) e4.next()).getValue());
                    if (this.f12697i) {
                        break;
                    }
                }
            }
        } while (this.f12697i);
        this.f12696h = false;
    }

    public Object f() {
        Object obj = this.f12693e;
        if (obj != f12688k) {
            return obj;
        }
        return null;
    }

    int g() {
        return this.f12695g;
    }

    public boolean h() {
        return this.f12691c > 0;
    }

    public void i(InterfaceC1354u interfaceC1354u, C c4) {
        b("observe");
        if (interfaceC1354u.getLifecycle().getCurrentState() == AbstractC1346l.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC1354u, c4);
        d dVar = (d) this.f12690b.h(c4, cVar);
        if (dVar != null && !dVar.c(interfaceC1354u)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC1354u.getLifecycle().addObserver(cVar);
    }

    public void j(C c4) {
        b("observeForever");
        b bVar = new b(c4);
        d dVar = (d) this.f12690b.h(c4, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.a(true);
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m(Object obj) {
        boolean z4;
        synchronized (this.f12689a) {
            z4 = this.f12694f == f12688k;
            this.f12694f = obj;
        }
        if (z4) {
            k.c.f().c(this.f12698j);
        }
    }

    public void n(C c4) {
        b("removeObserver");
        d dVar = (d) this.f12690b.i(c4);
        if (dVar == null) {
            return;
        }
        dVar.b();
        dVar.a(false);
    }

    protected void o(Object obj) {
        b("setValue");
        this.f12695g++;
        this.f12693e = obj;
        e(null);
    }
}
