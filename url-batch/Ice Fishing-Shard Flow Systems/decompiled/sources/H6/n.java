package H6;

import j5.C0583a;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final P0.s f1065d;

    /* renamed from: e, reason: collision with root package name */
    public volatile AtomicInteger f1066e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f1067i;

    public n(q qVar, P0.s responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        this.f1067i = qVar;
        this.f1065d = responseCallback;
        this.f1066e = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        D6.n nVar;
        String str = "OkHttp " + ((D6.s) this.f1067i.f1071e.f640c).f();
        q qVar = this.f1067i;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            qVar.f1073l.h();
            boolean z7 = false;
            try {
                try {
                    try {
                        this.f1065d.x(qVar.e());
                        nVar = qVar.f1070d.f598a;
                    } catch (IOException e7) {
                        e = e7;
                        z7 = true;
                        if (z7) {
                            N6.e eVar = N6.e.f1879a;
                            N6.e.f1879a.j("Callback failure for " + q.a(qVar), 4, e);
                        } else {
                            ((C0583a) this.f1065d.f2251d).accept(e);
                        }
                        nVar = qVar.f1070d.f598a;
                        nVar.d(this);
                    } catch (Throwable th) {
                        th = th;
                        z7 = true;
                        qVar.c();
                        if (!z7) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            ((C0583a) this.f1065d.f2251d).accept(iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        nVar = qVar.f1070d.f598a;
                        nVar.d(this);
                    }
                } catch (Throwable th2) {
                    qVar.f1070d.f598a.d(this);
                    throw th2;
                }
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th3) {
                th = th3;
            }
            nVar.d(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
