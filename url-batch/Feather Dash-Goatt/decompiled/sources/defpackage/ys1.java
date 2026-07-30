package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ys1 extends ms1 {
    public final ng1 b;

    public ys1(ng1 ng1Var) {
        super(4);
        this.b = ng1Var;
    }

    @Override // defpackage.ms1
    public final boolean a(es1 es1Var) {
        if (es1Var.g.get(null) == null) {
            return false;
        }
        af.c();
        return false;
    }

    @Override // defpackage.ms1
    public final vx[] b(es1 es1Var) {
        if (es1Var.g.get(null) == null) {
            return null;
        }
        af.c();
        return null;
    }

    @Override // defpackage.ms1
    public final void c(Status status) {
        this.b.b(new g8(status));
    }

    @Override // defpackage.ms1
    public final void d(Exception exc) {
        this.b.b(exc);
    }

    @Override // defpackage.ms1
    public final void e(es1 es1Var) {
        try {
            h(es1Var);
        } catch (DeadObjectException e) {
            c(ms1.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(ms1.g(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    public final void h(es1 es1Var) {
        if (es1Var.g.remove(null) == null) {
            this.b.c(Boolean.FALSE);
        } else {
            af.c();
        }
    }

    @Override // defpackage.ms1
    public final /* bridge */ /* synthetic */ void f(c51 c51Var, boolean z) {
    }
}
