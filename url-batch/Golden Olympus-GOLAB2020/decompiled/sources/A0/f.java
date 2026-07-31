package A0;

import java.util.concurrent.Executor;
import z0.InterfaceC3542c;
import z0.i;

/* loaded from: classes.dex */
public class f implements InterfaceC3542c {

    /* renamed from: a, reason: collision with root package name */
    public z0.g f33a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f34b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f35c = new Object();

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f36b;

        public a(i iVar) {
            this.f36b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (f.this.f35c) {
                try {
                    z0.g gVar = f.this.f33a;
                    if (gVar != null) {
                        gVar.onSuccess(this.f36b.getResult());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public f(Executor executor, z0.g gVar) {
        this.f33a = gVar;
        this.f34b = executor;
    }

    @Override // z0.InterfaceC3542c
    public final void a(i iVar) {
        if (!iVar.isSuccessful() || ((g) iVar).f40h) {
            return;
        }
        this.f34b.execute(new a(iVar));
    }

    @Override // z0.InterfaceC3542c
    public void cancel() {
        synchronized (this.f35c) {
            this.f33a = null;
        }
    }
}
