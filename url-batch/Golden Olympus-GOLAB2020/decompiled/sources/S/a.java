package S;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
class a {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f9181g = new ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    private c f9185d;

    /* renamed from: a, reason: collision with root package name */
    private final g f9182a = new g();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f9183b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final C0061a f9184c = new C0061a();

    /* renamed from: e, reason: collision with root package name */
    long f9186e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9187f = false;

    /* renamed from: S.a$a, reason: collision with other inner class name */
    class C0061a {
        C0061a() {
        }

        void a() {
            a.this.f9186e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f9186e);
            if (a.this.f9183b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    interface b {
        boolean a(long j4);
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0061a f9189a;

        c(C0061a c0061a) {
            this.f9189a = c0061a;
        }

        abstract void a();
    }

    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f9190b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f9191c;

        /* renamed from: S.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0062a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0062a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j4) {
                d.this.f9189a.a();
            }
        }

        d(C0061a c0061a) {
            super(c0061a);
            this.f9190b = Choreographer.getInstance();
            this.f9191c = new ChoreographerFrameCallbackC0062a();
        }

        @Override // S.a.c
        void a() {
            this.f9190b.postFrameCallback(this.f9191c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f9187f) {
            for (int size = this.f9183b.size() - 1; size >= 0; size--) {
                if (this.f9183b.get(size) == null) {
                    this.f9183b.remove(size);
                }
            }
            this.f9187f = false;
        }
    }

    public static a d() {
        ThreadLocal threadLocal = f9181g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return (a) threadLocal.get();
    }

    private boolean f(b bVar, long j4) {
        Long l4 = (Long) this.f9182a.get(bVar);
        if (l4 == null) {
            return true;
        }
        if (l4.longValue() >= j4) {
            return false;
        }
        this.f9182a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j4) {
        if (this.f9183b.size() == 0) {
            e().a();
        }
        if (!this.f9183b.contains(bVar)) {
            this.f9183b.add(bVar);
        }
        if (j4 > 0) {
            this.f9182a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j4));
        }
    }

    void c(long j4) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i4 = 0; i4 < this.f9183b.size(); i4++) {
            b bVar = (b) this.f9183b.get(i4);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j4);
            }
        }
        b();
    }

    c e() {
        if (this.f9185d == null) {
            this.f9185d = new d(this.f9184c);
        }
        return this.f9185d;
    }

    public void g(b bVar) {
        this.f9182a.remove(bVar);
        int indexOf = this.f9183b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f9183b.set(indexOf, null);
            this.f9187f = true;
        }
    }
}
