package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class zt1 implements uu1, qr0, mr0, lr0 {
    public final /* synthetic */ int d;
    public final Executor e;
    public final en g;
    public final zu1 h;

    public /* synthetic */ zt1(Executor executor, en enVar, zu1 zu1Var, int i) {
        this.d = i;
        this.e = executor;
        this.g = enVar;
        this.h = zu1Var;
    }

    @Override // defpackage.lr0
    public void a() {
        this.h.n();
    }

    @Override // defpackage.uu1
    public final void b(Task task) {
        int i = this.d;
        Executor executor = this.e;
        boolean z = false;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                executor.execute(new lf(8, this, task, z));
                break;
            default:
                executor.execute(new lf(9, this, task, z));
                break;
        }
    }

    @Override // defpackage.mr0
    public void d(Exception exc) {
        this.h.l(exc);
    }

    @Override // defpackage.qr0
    public void h(Object obj) {
        this.h.m(obj);
    }
}
