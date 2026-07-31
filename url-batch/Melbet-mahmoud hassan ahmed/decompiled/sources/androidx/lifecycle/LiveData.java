package androidx.lifecycle;

import androidx.lifecycle.e;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: j, reason: collision with root package name */
    static final Object f860j = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Object f861a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private d.b<p<? super T>, LiveData<T>.b> f862b = new d.b<>();

    /* renamed from: c, reason: collision with root package name */
    int f863c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile Object f864d;

    /* renamed from: e, reason: collision with root package name */
    volatile Object f865e;

    /* renamed from: f, reason: collision with root package name */
    private int f866f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f867g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f868h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f869i;

    class LifecycleBoundObserver extends LiveData<T>.b implements g {

        /* renamed from: j, reason: collision with root package name */
        final i f870j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ LiveData f871k;

        @Override // androidx.lifecycle.g
        public void d(i iVar, e.b bVar) {
            if (this.f870j.a().b() == e.c.DESTROYED) {
                this.f871k.g(this.f873f);
            } else {
                g(j());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        void h() {
            this.f870j.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        boolean j() {
            return this.f870j.a().b().b(e.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f861a) {
                obj = LiveData.this.f865e;
                LiveData.this.f865e = LiveData.f860j;
            }
            LiveData.this.h(obj);
        }
    }

    private abstract class b {

        /* renamed from: f, reason: collision with root package name */
        final p<? super T> f873f;

        /* renamed from: g, reason: collision with root package name */
        boolean f874g;

        /* renamed from: h, reason: collision with root package name */
        int f875h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ LiveData f876i;

        void g(boolean z6) {
            if (z6 == this.f874g) {
                return;
            }
            this.f874g = z6;
            LiveData liveData = this.f876i;
            int i7 = liveData.f863c;
            boolean z7 = i7 == 0;
            liveData.f863c = i7 + (z6 ? 1 : -1);
            if (z7 && z6) {
                liveData.d();
            }
            LiveData liveData2 = this.f876i;
            if (liveData2.f863c == 0 && !this.f874g) {
                liveData2.e();
            }
            if (this.f874g) {
                this.f876i.c(this);
            }
        }

        void h() {
        }

        abstract boolean j();
    }

    public LiveData() {
        Object obj = f860j;
        this.f865e = obj;
        this.f869i = new a();
        this.f864d = obj;
        this.f866f = -1;
    }

    static void a(String str) {
        if (c.a.e().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void b(LiveData<T>.b bVar) {
        if (bVar.f874g) {
            if (!bVar.j()) {
                bVar.g(false);
                return;
            }
            int i7 = bVar.f875h;
            int i8 = this.f866f;
            if (i7 >= i8) {
                return;
            }
            bVar.f875h = i8;
            bVar.f873f.a((Object) this.f864d);
        }
    }

    void c(LiveData<T>.b bVar) {
        if (this.f867g) {
            this.f868h = true;
            return;
        }
        this.f867g = true;
        do {
            this.f868h = false;
            if (bVar != null) {
                b(bVar);
                bVar = null;
            } else {
                d.b<p<? super T>, LiveData<T>.b>.d k7 = this.f862b.k();
                while (k7.hasNext()) {
                    b((b) k7.next().getValue());
                    if (this.f868h) {
                        break;
                    }
                }
            }
        } while (this.f868h);
        this.f867g = false;
    }

    protected void d() {
    }

    protected void e() {
    }

    protected void f(T t6) {
        boolean z6;
        synchronized (this.f861a) {
            z6 = this.f865e == f860j;
            this.f865e = t6;
        }
        if (z6) {
            c.a.e().c(this.f869i);
        }
    }

    public void g(p<? super T> pVar) {
        a("removeObserver");
        LiveData<T>.b o7 = this.f862b.o(pVar);
        if (o7 == null) {
            return;
        }
        o7.h();
        o7.g(false);
    }

    protected void h(T t6) {
        a("setValue");
        this.f866f++;
        this.f864d = t6;
        c(null);
    }
}
