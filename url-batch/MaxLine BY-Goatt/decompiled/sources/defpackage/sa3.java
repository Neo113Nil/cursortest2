package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sa3 extends ga3 {
    public final kt2 b;

    public sa3(kt2 kt2Var) {
        super(4);
        this.b = kt2Var;
    }

    @Override // defpackage.ga3
    public final boolean a(aa3 aa3Var) {
        if (aa3Var.l.get(null) == null) {
            return false;
        }
        b71.o();
        return false;
    }

    @Override // defpackage.ga3
    public final mk0[] b(aa3 aa3Var) {
        if (aa3Var.l.get(null) == null) {
            return null;
        }
        b71.o();
        return null;
    }

    @Override // defpackage.ga3
    public final void c(Status status) {
        this.b.b(new ne(status));
    }

    @Override // defpackage.ga3
    public final void d(Exception exc) {
        this.b.b(exc);
    }

    @Override // defpackage.ga3
    public final void e(aa3 aa3Var) {
        try {
            h(aa3Var);
        } catch (DeadObjectException e) {
            c(ga3.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(ga3.g(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    public final void h(aa3 aa3Var) {
        if (aa3Var.l.remove(null) == null) {
            this.b.c(Boolean.FALSE);
        } else {
            b71.o();
        }
    }

    @Override // defpackage.ga3
    public final /* bridge */ /* synthetic */ void f(tt1 tt1Var, boolean z) {
    }
}
