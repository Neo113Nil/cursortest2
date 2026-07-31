package A0;

import java.util.concurrent.Executor;
import z0.InterfaceC3542c;
import z0.InterfaceC3543d;
import z0.i;

/* loaded from: classes.dex */
public class b implements InterfaceC3542c {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC3543d f17a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f18b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19c = new Object();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f19c) {
                try {
                    InterfaceC3543d interfaceC3543d = b.this.f17a;
                    if (interfaceC3543d != null) {
                        interfaceC3543d.onCanceled();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public b(Executor executor, InterfaceC3543d interfaceC3543d) {
        this.f17a = interfaceC3543d;
        this.f18b = executor;
    }

    @Override // z0.InterfaceC3542c
    public final void a(i iVar) {
        if (((g) iVar).f40h) {
            this.f18b.execute(new a());
        }
    }

    @Override // z0.InterfaceC3542c
    public void cancel() {
        synchronized (this.f19c) {
            this.f17a = null;
        }
    }
}
