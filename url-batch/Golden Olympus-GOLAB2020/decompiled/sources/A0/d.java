package A0;

import java.util.concurrent.Executor;
import z0.InterfaceC3542c;
import z0.i;

/* loaded from: classes.dex */
public class d implements InterfaceC3542c {

    /* renamed from: a, reason: collision with root package name */
    public z0.f f26a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f27b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28c = new Object();

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f29b;

        public a(i iVar) {
            this.f29b = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.f28c) {
                try {
                    z0.f fVar = d.this.f26a;
                    if (fVar != null) {
                        fVar.onFailure(this.f29b.getException());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public d(Executor executor, z0.f fVar) {
        this.f26a = fVar;
        this.f27b = executor;
    }

    @Override // z0.InterfaceC3542c
    public final void a(i iVar) {
        if (iVar.isSuccessful() || ((g) iVar).f40h) {
            return;
        }
        this.f27b.execute(new a(iVar));
    }

    @Override // z0.InterfaceC3542c
    public void cancel() {
        synchronized (this.f28c) {
            this.f26a = null;
        }
    }
}
