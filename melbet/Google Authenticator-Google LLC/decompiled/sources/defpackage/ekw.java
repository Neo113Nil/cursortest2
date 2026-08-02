package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ekw extends eko implements ekz {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final ekq c;
    private eik d;

    public ekw(ekq ekqVar) {
        this.c = ekqVar;
    }

    @Override // defpackage.ekz
    public final void a(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.ekz
    public final void c(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.ekz
    public final void d(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (elh.d(applicationContext, elh.a(applicationContext, "Primes.onActivityStarted"))) {
            l(eik.c(activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 59, "ProcessImportanceForegroundSignalAdapter.java")).s("Activity started with background importance");
        }
    }

    @Override // defpackage.ekz
    public final void e(Activity activity) {
        eik c = eik.c(activity.getClass());
        this.d = c;
        Context applicationContext = activity.getApplicationContext();
        eli a = elh.a(applicationContext, "Primes.onActivityStopped");
        if (elh.d(applicationContext, a)) {
            return;
        }
        if (!a.a) {
            ((hkf) ((hkf) eiu.a.e()).i("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStopped", 78, "ProcessImportanceForegroundSignalAdapter.java")).u("Signaling app backgrounded from stopped activity (%s) without known process importance", c);
        }
        k(c);
    }

    @Override // defpackage.ekz
    public final void f(int i) {
        eik eikVar;
        if (i >= 20 && (eikVar = this.d) != null) {
            k(eikVar);
        }
        this.d = null;
    }

    @Override // defpackage.eko
    public final void g(eik eikVar) {
        this.c.g(eikVar);
    }

    @Override // defpackage.ekz
    public final void h() {
        this.d = null;
    }

    @Override // defpackage.eko
    public final void j(eik eikVar) {
        this.c.j(eikVar);
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void b(Activity activity) {
    }
}
