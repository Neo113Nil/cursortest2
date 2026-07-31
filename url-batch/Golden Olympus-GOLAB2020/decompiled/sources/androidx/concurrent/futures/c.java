package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.b9;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        Object f11080a;

        /* renamed from: b, reason: collision with root package name */
        d f11081b;

        /* renamed from: c, reason: collision with root package name */
        private e f11082c = e.i();

        /* renamed from: d, reason: collision with root package name */
        private boolean f11083d;

        a() {
        }

        private void d() {
            this.f11080a = null;
            this.f11081b = null;
            this.f11082c = null;
        }

        void a() {
            this.f11080a = null;
            this.f11081b = null;
            this.f11082c.set(null);
        }

        public boolean b(Object obj) {
            this.f11083d = true;
            d dVar = this.f11081b;
            boolean z4 = dVar != null && dVar.b(obj);
            if (z4) {
                d();
            }
            return z4;
        }

        public boolean c() {
            this.f11083d = true;
            d dVar = this.f11081b;
            boolean z4 = dVar != null && dVar.a(true);
            if (z4) {
                d();
            }
            return z4;
        }

        public boolean e(Throwable th) {
            this.f11083d = true;
            d dVar = this.f11081b;
            boolean z4 = dVar != null && dVar.c(th);
            if (z4) {
                d();
            }
            return z4;
        }

        protected void finalize() {
            e eVar;
            d dVar = this.f11081b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f11080a));
            }
            if (this.f11083d || (eVar = this.f11082c) == null) {
                return;
            }
            eVar.set(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0085c {
        Object a(a aVar);
    }

    private static final class d implements ListenableFuture {

        /* renamed from: b, reason: collision with root package name */
        final WeakReference f11084b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.concurrent.futures.a f11085c = new a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String pendingToString() {
                a aVar = (a) d.this.f11084b.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f11080a + b9.i.f15552e;
            }
        }

        d(a aVar) {
            this.f11084b = new WeakReference(aVar);
        }

        boolean a(boolean z4) {
            return this.f11085c.cancel(z4);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(Runnable runnable, Executor executor) {
            this.f11085c.addListener(runnable, executor);
        }

        boolean b(Object obj) {
            return this.f11085c.set(obj);
        }

        boolean c(Throwable th) {
            return this.f11085c.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z4) {
            a aVar = (a) this.f11084b.get();
            boolean cancel = this.f11085c.cancel(z4);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f11085c.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f11085c.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f11085c.isDone();
        }

        public String toString() {
            return this.f11085c.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j4, TimeUnit timeUnit) {
            return this.f11085c.get(j4, timeUnit);
        }
    }

    public static ListenableFuture a(InterfaceC0085c interfaceC0085c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f11081b = dVar;
        aVar.f11080a = interfaceC0085c.getClass();
        try {
            Object a4 = interfaceC0085c.a(aVar);
            if (a4 != null) {
                aVar.f11080a = a4;
                return dVar;
            }
        } catch (Exception e4) {
            dVar.c(e4);
        }
        return dVar;
    }
}
