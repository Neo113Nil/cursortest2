package u0;

import java.util.ArrayDeque;
import u0.f;
import u0.g;
import u0.h;

/* loaded from: classes.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f22426a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f22427b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f22428c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f22429d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f22430e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f22431f;

    /* renamed from: g, reason: collision with root package name */
    private int f22432g;

    /* renamed from: h, reason: collision with root package name */
    private int f22433h;

    /* renamed from: i, reason: collision with root package name */
    private I f22434i;

    /* renamed from: j, reason: collision with root package name */
    private E f22435j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22436k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22437l;

    /* renamed from: m, reason: collision with root package name */
    private int f22438m;

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.u();
        }
    }

    protected j(I[] iArr, O[] oArr) {
        this.f22430e = iArr;
        this.f22432g = iArr.length;
        for (int i7 = 0; i7 < this.f22432g; i7++) {
            this.f22430e[i7] = h();
        }
        this.f22431f = oArr;
        this.f22433h = oArr.length;
        for (int i8 = 0; i8 < this.f22433h; i8++) {
            this.f22431f[i8] = i();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f22426a = aVar;
        aVar.start();
    }

    private boolean g() {
        return !this.f22428c.isEmpty() && this.f22433h > 0;
    }

    private boolean l() {
        E j7;
        synchronized (this.f22427b) {
            while (!this.f22437l && !g()) {
                this.f22427b.wait();
            }
            if (this.f22437l) {
                return false;
            }
            I removeFirst = this.f22428c.removeFirst();
            O[] oArr = this.f22431f;
            int i7 = this.f22433h - 1;
            this.f22433h = i7;
            O o7 = oArr[i7];
            boolean z6 = this.f22436k;
            this.f22436k = false;
            if (removeFirst.m()) {
                o7.g(4);
            } else {
                if (removeFirst.l()) {
                    o7.g(Integer.MIN_VALUE);
                }
                if (removeFirst.n()) {
                    o7.g(134217728);
                }
                try {
                    j7 = k(removeFirst, o7, z6);
                } catch (OutOfMemoryError | RuntimeException e7) {
                    j7 = j(e7);
                }
                if (j7 != null) {
                    synchronized (this.f22427b) {
                        this.f22435j = j7;
                    }
                    return false;
                }
            }
            synchronized (this.f22427b) {
                if (!this.f22436k) {
                    if (o7.l()) {
                        this.f22438m++;
                    } else {
                        o7.f22420h = this.f22438m;
                        this.f22438m = 0;
                        this.f22429d.addLast(o7);
                        r(removeFirst);
                    }
                }
                o7.q();
                r(removeFirst);
            }
            return true;
        }
    }

    private void o() {
        if (g()) {
            this.f22427b.notify();
        }
    }

    private void p() {
        E e7 = this.f22435j;
        if (e7 != null) {
            throw e7;
        }
    }

    private void r(I i7) {
        i7.h();
        I[] iArr = this.f22430e;
        int i8 = this.f22432g;
        this.f22432g = i8 + 1;
        iArr[i8] = i7;
    }

    private void t(O o7) {
        o7.h();
        O[] oArr = this.f22431f;
        int i7 = this.f22433h;
        this.f22433h = i7 + 1;
        oArr[i7] = o7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        do {
            try {
            } catch (InterruptedException e7) {
                throw new IllegalStateException(e7);
            }
        } while (l());
    }

    @Override // u0.d
    public void a() {
        synchronized (this.f22427b) {
            this.f22437l = true;
            this.f22427b.notify();
        }
        try {
            this.f22426a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // u0.d
    public final void flush() {
        synchronized (this.f22427b) {
            this.f22436k = true;
            this.f22438m = 0;
            I i7 = this.f22434i;
            if (i7 != null) {
                r(i7);
                this.f22434i = null;
            }
            while (!this.f22428c.isEmpty()) {
                r(this.f22428c.removeFirst());
            }
            while (!this.f22429d.isEmpty()) {
                this.f22429d.removeFirst().q();
            }
        }
    }

    protected abstract I h();

    protected abstract O i();

    protected abstract E j(Throwable th);

    protected abstract E k(I i7, O o7, boolean z6);

    @Override // u0.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final I e() {
        I i7;
        synchronized (this.f22427b) {
            p();
            o2.a.f(this.f22434i == null);
            int i8 = this.f22432g;
            if (i8 == 0) {
                i7 = null;
            } else {
                I[] iArr = this.f22430e;
                int i9 = i8 - 1;
                this.f22432g = i9;
                i7 = iArr[i9];
            }
            this.f22434i = i7;
        }
        return i7;
    }

    @Override // u0.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final O d() {
        synchronized (this.f22427b) {
            p();
            if (this.f22429d.isEmpty()) {
                return null;
            }
            return this.f22429d.removeFirst();
        }
    }

    @Override // u0.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void c(I i7) {
        synchronized (this.f22427b) {
            p();
            o2.a.a(i7 == this.f22434i);
            this.f22428c.addLast(i7);
            o();
            this.f22434i = null;
        }
    }

    protected void s(O o7) {
        synchronized (this.f22427b) {
            t(o7);
            o();
        }
    }

    protected final void v(int i7) {
        o2.a.f(this.f22432g == this.f22430e.length);
        for (I i8 : this.f22430e) {
            i8.r(i7);
        }
    }
}
