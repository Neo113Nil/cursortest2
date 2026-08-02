package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class cnh extends cng {
    protected final bst a;

    public cnh(int i, bst bstVar) {
        super(i);
        this.a = bstVar;
    }

    @Override // defpackage.cng
    public final void b(Executor executor, Runnable runnable) {
        ((ddi) this.a.a).h(executor, new cnk(runnable, 1));
    }

    protected abstract void e(coc cocVar);

    @Override // defpackage.cnn
    public final void f(Status status) {
        this.a.d(new cmm(status));
    }

    @Override // defpackage.cnn
    public final void g(Exception exc) {
        this.a.d(exc);
    }

    @Override // defpackage.cnn
    public final void h(coc cocVar) {
        try {
            e(cocVar);
        } catch (DeadObjectException e) {
            f(cnn.j(e));
            throw e;
        } catch (RemoteException e2) {
            f(cnn.j(e2));
        } catch (RuntimeException e3) {
            g(e3);
        }
    }

    @Override // defpackage.cnn
    public void i(fwm fwmVar, boolean z) {
    }
}
