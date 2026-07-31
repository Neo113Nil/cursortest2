package A0;

import java.util.concurrent.Executor;
import z0.InterfaceC3542c;
import z0.InterfaceC3544e;
import z0.i;

/* loaded from: classes.dex */
public class c implements InterfaceC3542c {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC3544e f21a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f22b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23c = new Object();

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f24b;

        public a(i iVar) {
            this.f24b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this.f23c) {
                try {
                    InterfaceC3544e interfaceC3544e = c.this.f21a;
                    if (interfaceC3544e != null) {
                        interfaceC3544e.a(this.f24b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public c(Executor executor, InterfaceC3544e interfaceC3544e) {
        this.f21a = interfaceC3544e;
        this.f22b = executor;
    }

    @Override // z0.InterfaceC3542c
    public final void a(i iVar) {
        this.f22b.execute(new a(iVar));
    }

    @Override // z0.InterfaceC3542c
    public void cancel() {
        synchronized (this.f23c) {
            this.f21a = null;
        }
    }
}
