package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iu1 implements uu1, qr0, mr0, lr0 {
    public final /* synthetic */ int d;
    public final Executor e;
    public final Object g;
    public final Object h;

    public iu1(Executor executor, lr0 lr0Var) {
        this.d = 0;
        this.g = new Object();
        this.e = executor;
        this.h = lr0Var;
    }

    @Override // defpackage.lr0
    public void a() {
        ((zu1) this.h).n();
    }

    @Override // defpackage.uu1
    public final void b(Task task) {
        boolean z = false;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (task.i()) {
                    synchronized (this.g) {
                    }
                    this.e.execute(new b4(8, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.g) {
                    try {
                        if (((OnCompleteListener) this.h) == null) {
                            return;
                        }
                        this.e.execute(new lf(10, this, task, z));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (task.isSuccessful() || task.i()) {
                    return;
                }
                synchronized (this.g) {
                }
                this.e.execute(new lf(12, this, task, z));
                return;
            case 3:
                if (task.isSuccessful()) {
                    synchronized (this.g) {
                    }
                    this.e.execute(new lf(13, this, task, z));
                    return;
                }
                return;
            default:
                this.e.execute(new lf(15, this, task, z));
                return;
        }
    }

    @Override // defpackage.mr0
    public void d(Exception exc) {
        ((zu1) this.h).l(exc);
    }

    @Override // defpackage.qr0
    public void h(Object obj) {
        ((zu1) this.h).m(obj);
    }

    public iu1(Executor executor, mr0 mr0Var) {
        this.d = 2;
        this.g = new Object();
        this.e = executor;
        this.h = mr0Var;
    }

    public iu1(Executor executor, qr0 qr0Var) {
        this.d = 3;
        this.g = new Object();
        this.e = executor;
        this.h = qr0Var;
    }

    public iu1(Executor executor, if1 if1Var, zu1 zu1Var) {
        this.d = 4;
        this.e = executor;
        this.g = if1Var;
        this.h = zu1Var;
    }

    public iu1(Executor executor, OnCompleteListener onCompleteListener) {
        this.d = 1;
        this.g = new Object();
        this.e = executor;
        this.h = onCompleteListener;
    }
}
