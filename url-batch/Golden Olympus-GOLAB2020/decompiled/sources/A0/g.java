package A0;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import z0.InterfaceC3541b;
import z0.InterfaceC3542c;
import z0.InterfaceC3543d;
import z0.InterfaceC3544e;
import z0.h;
import z0.i;
import z0.k;

/* loaded from: classes.dex */
public class g extends i {

    /* renamed from: g, reason: collision with root package name */
    public boolean f39g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f40h;

    /* renamed from: i, reason: collision with root package name */
    public Object f41i;

    /* renamed from: j, reason: collision with root package name */
    public Exception f42j;

    /* renamed from: f, reason: collision with root package name */
    public final Object f38f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public List f43k = new ArrayList();

    public class a implements z0.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44a;

        public a(g gVar, h hVar, g gVar2) {
            this.f44a = gVar2;
        }

        @Override // z0.g
        public void onSuccess(Object obj) {
            try {
                throw null;
            } catch (Exception e4) {
                this.f44a.b(e4);
            }
        }
    }

    public class b implements z0.f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45a;

        public b(g gVar, g gVar2) {
            this.f45a = gVar2;
        }

        @Override // z0.f
        public void onFailure(Exception exc) {
            this.f45a.b(exc);
        }
    }

    public class c implements InterfaceC3543d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f46a;

        public c(g gVar, g gVar2) {
            this.f46a = gVar2;
        }

        @Override // z0.InterfaceC3543d
        public void onCanceled() {
            this.f46a.d();
        }
    }

    public class d implements InterfaceC3544e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f47a;

        public d(g gVar, InterfaceC3541b interfaceC3541b, g gVar2) {
            this.f47a = gVar2;
        }

        @Override // z0.InterfaceC3544e
        public void a(i iVar) {
            try {
                throw null;
            } catch (Exception e4) {
                this.f47a.b(e4);
            }
        }
    }

    public class e implements InterfaceC3544e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f48a;

        public e(g gVar, g gVar2, InterfaceC3541b interfaceC3541b) {
            this.f48a = gVar2;
        }

        @Override // z0.InterfaceC3544e
        public void a(i iVar) {
            if (((g) iVar).f40h) {
                this.f48a.d();
                return;
            }
            try {
                throw null;
            } catch (Exception e4) {
                this.f48a.b(e4);
            }
        }
    }

    public i a(InterfaceC3542c interfaceC3542c) {
        boolean isComplete;
        synchronized (this.f38f) {
            try {
                isComplete = isComplete();
                if (!isComplete) {
                    this.f43k.add(interfaceC3542c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (isComplete) {
            interfaceC3542c.a(this);
        }
        return this;
    }

    @Override // z0.i
    public i addOnCanceledListener(Activity activity, InterfaceC3543d interfaceC3543d) {
        A0.b bVar = new A0.b(k.a(), interfaceC3543d);
        A0.e.a(activity, bVar);
        return a(bVar);
    }

    @Override // z0.i
    public i addOnCompleteListener(Activity activity, InterfaceC3544e interfaceC3544e) {
        A0.c cVar = new A0.c(k.a(), interfaceC3544e);
        A0.e.a(activity, cVar);
        return a(cVar);
    }

    @Override // z0.i
    public i addOnFailureListener(z0.f fVar) {
        return a(new A0.d(k.a(), fVar));
    }

    public i addOnSuccessListener(Executor executor, z0.g gVar) {
        return a(new f(executor, gVar));
    }

    public final void b(Exception exc) {
        synchronized (this.f38f) {
            try {
                if (!this.f39g) {
                    this.f39g = true;
                    this.f42j = exc;
                    this.f38f.notifyAll();
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f38f) {
            try {
                if (!this.f39g) {
                    this.f39g = true;
                    this.f41i = obj;
                    this.f38f.notifyAll();
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z0.i
    public i continueWith(Executor executor, InterfaceC3541b interfaceC3541b) {
        g gVar = new g();
        addOnCompleteListener(executor, new e(this, gVar, interfaceC3541b));
        return gVar;
    }

    @Override // z0.i
    public i continueWithTask(Executor executor, InterfaceC3541b interfaceC3541b) {
        g gVar = new g();
        addOnCompleteListener(executor, new d(this, interfaceC3541b, gVar));
        return gVar;
    }

    public final boolean d() {
        synchronized (this.f38f) {
            try {
                if (this.f39g) {
                    return false;
                }
                this.f39g = true;
                this.f40h = true;
                this.f38f.notifyAll();
                e();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f38f) {
            Iterator it = this.f43k.iterator();
            while (it.hasNext()) {
                try {
                    ((InterfaceC3542c) it.next()).a(this);
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception e5) {
                    throw new RuntimeException(e5);
                }
            }
            this.f43k = null;
        }
    }

    @Override // z0.i
    public Exception getException() {
        Exception exc;
        synchronized (this.f38f) {
            exc = this.f42j;
        }
        return exc;
    }

    @Override // z0.i
    public Object getResult() {
        Object obj;
        synchronized (this.f38f) {
            try {
                if (this.f42j != null) {
                    throw new RuntimeException(this.f42j);
                }
                obj = this.f41i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean isComplete() {
        boolean z4;
        synchronized (this.f38f) {
            z4 = this.f39g;
        }
        return z4;
    }

    @Override // z0.i
    public boolean isSuccessful() {
        boolean z4;
        synchronized (this.f38f) {
            try {
                z4 = this.f39g && !this.f40h && this.f42j == null;
            } finally {
            }
        }
        return z4;
    }

    @Override // z0.i
    public i onSuccessTask(h hVar) {
        Executor a4 = k.a();
        g gVar = new g();
        addOnSuccessListener(a4, new a(this, hVar, gVar));
        addOnFailureListener(new b(this, gVar));
        a(new A0.b(k.a(), new c(this, gVar)));
        return gVar;
    }

    @Override // z0.i
    public i addOnCanceledListener(Executor executor, InterfaceC3543d interfaceC3543d) {
        return a(new A0.b(executor, interfaceC3543d));
    }

    @Override // z0.i
    public i addOnCompleteListener(Executor executor, InterfaceC3544e interfaceC3544e) {
        return a(new A0.c(executor, interfaceC3544e));
    }

    @Override // z0.i
    public i addOnSuccessListener(z0.g gVar) {
        return addOnSuccessListener(k.a(), gVar);
    }

    @Override // z0.i
    public i continueWith(InterfaceC3541b interfaceC3541b) {
        Executor a4 = k.a();
        g gVar = new g();
        addOnCompleteListener(a4, new e(this, gVar, interfaceC3541b));
        return gVar;
    }

    @Override // z0.i
    public i continueWithTask(InterfaceC3541b interfaceC3541b) {
        Executor a4 = k.a();
        g gVar = new g();
        addOnCompleteListener(a4, new d(this, interfaceC3541b, gVar));
        return gVar;
    }

    @Override // z0.i
    public i addOnCanceledListener(InterfaceC3543d interfaceC3543d) {
        return a(new A0.b(k.a(), interfaceC3543d));
    }

    @Override // z0.i
    public i addOnCompleteListener(InterfaceC3544e interfaceC3544e) {
        return addOnCompleteListener(k.a(), interfaceC3544e);
    }

    @Override // z0.i
    public i onSuccessTask(Executor executor, h hVar) {
        g gVar = new g();
        addOnSuccessListener(executor, new a(this, hVar, gVar));
        addOnFailureListener(new b(this, gVar));
        a(new A0.b(k.a(), new c(this, gVar)));
        return gVar;
    }
}
