package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xs1 extends ms1 {
    public final e30 b;
    public final ng1 c;
    public final j41 d;

    public xs1(e30 e30Var, ng1 ng1Var, j41 j41Var) {
        super(2);
        this.c = ng1Var;
        this.b = e30Var;
        this.d = j41Var;
        if (e30Var.a) {
            dd0.e("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.ms1
    public final boolean a(es1 es1Var) {
        return this.b.a;
    }

    @Override // defpackage.ms1
    public final vx[] b(es1 es1Var) {
        return (vx[]) this.b.b;
    }

    @Override // defpackage.ms1
    public final void c(Status status) {
        this.d.getClass();
        this.c.b(status.g != null ? new z21(status) : new g8(status));
    }

    @Override // defpackage.ms1
    public final void d(Exception exc) {
        this.c.b(exc);
    }

    @Override // defpackage.ms1
    public final void e(es1 es1Var) {
        ng1 ng1Var = this.c;
        try {
            this.b.b(es1Var.c, ng1Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(ms1.g(e2));
        } catch (RuntimeException e3) {
            ng1Var.b(e3);
        }
    }

    @Override // defpackage.ms1
    public final void f(c51 c51Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) c51Var.g;
        ng1 ng1Var = this.c;
        map.put(ng1Var, valueOf);
        ng1Var.a.addOnCompleteListener(new c51(c51Var, ng1Var));
    }
}
