package o2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o2.l;

/* loaded from: classes.dex */
public final class q<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d f19771a;

    /* renamed from: b, reason: collision with root package name */
    private final n f19772b;

    /* renamed from: c, reason: collision with root package name */
    private final b<T> f19773c;

    /* renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet<c<T>> f19774d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<Runnable> f19775e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<Runnable> f19776f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19777g;

    public interface a<T> {
        void invoke(T t6);
    }

    public interface b<T> {
        void a(T t6, l lVar);
    }

    private static final class c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f19778a;

        /* renamed from: b, reason: collision with root package name */
        private l.b f19779b = new l.b();

        /* renamed from: c, reason: collision with root package name */
        private boolean f19780c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f19781d;

        public c(T t6) {
            this.f19778a = t6;
        }

        public void a(int i7, a<T> aVar) {
            if (this.f19781d) {
                return;
            }
            if (i7 != -1) {
                this.f19779b.a(i7);
            }
            this.f19780c = true;
            aVar.invoke(this.f19778a);
        }

        public void b(b<T> bVar) {
            if (this.f19781d || !this.f19780c) {
                return;
            }
            l e7 = this.f19779b.e();
            this.f19779b = new l.b();
            this.f19780c = false;
            bVar.a(this.f19778a, e7);
        }

        public void c(b<T> bVar) {
            this.f19781d = true;
            if (this.f19780c) {
                bVar.a(this.f19778a, this.f19779b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f19778a.equals(((c) obj).f19778a);
        }

        public int hashCode() {
            return this.f19778a.hashCode();
        }
    }

    public q(Looper looper, d dVar, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dVar, bVar);
    }

    private q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, d dVar, b<T> bVar) {
        this.f19771a = dVar;
        this.f19774d = copyOnWriteArraySet;
        this.f19773c = bVar;
        this.f19775e = new ArrayDeque<>();
        this.f19776f = new ArrayDeque<>();
        this.f19772b = dVar.c(looper, new Handler.Callback() { // from class: o2.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean g7;
                g7 = q.this.g(message);
                return g7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator<c<T>> it = this.f19774d.iterator();
        while (it.hasNext()) {
            it.next().b(this.f19773c);
            if (this.f19772b.a(0)) {
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i7, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i7, aVar);
        }
    }

    public void c(T t6) {
        if (this.f19777g) {
            return;
        }
        o2.a.e(t6);
        this.f19774d.add(new c<>(t6));
    }

    public q<T> d(Looper looper, d dVar, b<T> bVar) {
        return new q<>(this.f19774d, looper, dVar, bVar);
    }

    public q<T> e(Looper looper, b<T> bVar) {
        return d(looper, this.f19771a, bVar);
    }

    public void f() {
        if (this.f19776f.isEmpty()) {
            return;
        }
        if (!this.f19772b.a(0)) {
            n nVar = this.f19772b;
            nVar.e(nVar.k(0));
        }
        boolean z6 = !this.f19775e.isEmpty();
        this.f19775e.addAll(this.f19776f);
        this.f19776f.clear();
        if (z6) {
            return;
        }
        while (!this.f19775e.isEmpty()) {
            this.f19775e.peekFirst().run();
            this.f19775e.removeFirst();
        }
    }

    public void i(final int i7, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f19774d);
        this.f19776f.add(new Runnable() { // from class: o2.p
            @Override // java.lang.Runnable
            public final void run() {
                q.h(copyOnWriteArraySet, i7, aVar);
            }
        });
    }

    public void j() {
        Iterator<c<T>> it = this.f19774d.iterator();
        while (it.hasNext()) {
            it.next().c(this.f19773c);
        }
        this.f19774d.clear();
        this.f19777g = true;
    }

    public void k(int i7, a<T> aVar) {
        i(i7, aVar);
        f();
    }
}
