package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dfb implements aec {
    public static final hkh a = hkh.l("com/google/android/libraries/androidatgoogle/privacy/lifecycle/PrivacyScreenProcessObserver");
    public final kee b;
    private final Application c;

    public dfb(Application application, kee keeVar) {
        this.c = application;
        this.b = keeVar;
    }

    @Override // defpackage.aec
    public final void e(aer aerVar) {
        Executor mainExecutor;
        kee keeVar = this.b;
        int a2 = pb.b(((dev) keeVar.a).b).a(33023);
        if (a2 == 11 || a2 == 12) {
            return;
        }
        hvi u = dih.u(keeVar.r(), new dez(SystemClock.elapsedRealtime(), 0));
        ckt cktVar = new ckt(this, 3);
        mainExecutor = this.c.getMainExecutor();
        hnu.aS(u, cktVar, mainExecutor);
    }

    @Override // defpackage.aec
    public final void f(aer aerVar) {
        Executor mainExecutor;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        hvi r = this.b.r();
        dfa dfaVar = new dfa(this, elapsedRealtime);
        mainExecutor = this.c.getMainExecutor();
        hnu.aS(r, dfaVar, mainExecutor);
    }

    @Override // defpackage.aec
    public final /* synthetic */ void a(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void b(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }
}
