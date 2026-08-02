package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnl extends cng {
    private final cpb a;
    private final bst b;

    public cnl(int i, cpb cpbVar, bst bstVar) {
        super(i);
        this.b = bstVar;
        this.a = cpbVar;
        if (i == 2 && cpbVar.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.cng
    public final int a(coc cocVar) {
        return this.a.c;
    }

    @Override // defpackage.cng
    public final void b(Executor executor, Runnable runnable) {
        ((ddi) this.b.a).h(executor, new cnk(runnable, 0));
    }

    @Override // defpackage.cng
    public final boolean c(coc cocVar) {
        return this.a.b;
    }

    @Override // defpackage.cng
    public final cli[] d(coc cocVar) {
        return this.a.a;
    }

    @Override // defpackage.cnn
    public final void f(Status status) {
        this.b.d(ox.o(status));
    }

    @Override // defpackage.cnn
    public final void g(Exception exc) {
        this.b.d(exc);
    }

    @Override // defpackage.cnn
    public final void h(coc cocVar) {
        try {
            cpb cpbVar = this.a;
            cpbVar.d.a.a(cocVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            f(cnn.j(e2));
        } catch (RuntimeException e3) {
            g(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.cnn
    public final void i(fwm fwmVar, boolean z) {
        ?? r0 = fwmVar.b;
        bst bstVar = this.b;
        r0.put(bstVar, Boolean.valueOf(z));
        ((ddi) bstVar.a).l(new cny(fwmVar, bstVar));
    }
}
