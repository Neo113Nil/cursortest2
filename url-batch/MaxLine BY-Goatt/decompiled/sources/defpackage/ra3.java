package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ra3 extends ga3 {
    public final kl3 b;
    public final kt2 c;
    public final fp2 d;

    public ra3(kl3 kl3Var, kt2 kt2Var, by1 by1Var) {
        super(2);
        this.c = kt2Var;
        this.b = kl3Var;
        this.d = by1Var;
        if (kl3Var.b) {
            lh.e("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.ga3
    public final boolean a(aa3 aa3Var) {
        return this.b.b;
    }

    @Override // defpackage.ga3
    public final mk0[] b(aa3 aa3Var) {
        return (mk0[]) this.b.c;
    }

    @Override // defpackage.ga3
    public final void c(Status status) {
        this.c.b(this.d.getException(status));
    }

    @Override // defpackage.ga3
    public final void d(Exception exc) {
        this.c.b(exc);
    }

    @Override // defpackage.ga3
    public final void e(aa3 aa3Var) {
        kt2 kt2Var = this.c;
        try {
            this.b.a(aa3Var.h, kt2Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(ga3.g(e2));
        } catch (RuntimeException e3) {
            kt2Var.b(e3);
        }
    }

    @Override // defpackage.ga3
    public final void f(tt1 tt1Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) tt1Var.o;
        kt2 kt2Var = this.c;
        map.put(kt2Var, valueOf);
        kt2Var.a.b(new tt1(18, tt1Var, kt2Var, false));
    }
}
