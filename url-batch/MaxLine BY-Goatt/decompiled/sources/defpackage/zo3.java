package defpackage;

import android.content.Intent;
import android.os.SystemClock;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zo3 extends uc3 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo3(Object obj, qk3 qk3Var, int i) {
        super(qk3Var);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.uc3
    public final void a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                o42 o42Var = (o42) obj;
                ep3 ep3Var = (ep3) o42Var.d;
                ep3Var.v();
                pj3 pj3Var = (pj3) ep3Var.m;
                pj3Var.w.getClass();
                o42Var.b(false, false, SystemClock.elapsedRealtime());
                se3 se3Var = pj3Var.z;
                pj3.j(se3Var);
                pj3Var.w.getClass();
                se3Var.z(SystemClock.elapsedRealtime());
                break;
            case 1:
                kp3 kp3Var = (kp3) obj;
                kp3Var.A();
                vh3 vh3Var = ((pj3) kp3Var.m).r;
                pj3.m(vh3Var);
                vh3Var.z.b("Starting upload from DelayedRunnable");
                kp3Var.n.q();
                break;
            default:
                oq3 oq3Var = (oq3) obj;
                oq3Var.c().v();
                String str = (String) oq3Var.C.pollFirst();
                if (str != null) {
                    oq3Var.e().getClass();
                    oq3Var.U = SystemClock.elapsedRealtime();
                    oq3Var.a().z.c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    oq3.S(oq3Var.x.m, intent);
                }
                oq3Var.H();
                break;
        }
    }
}
