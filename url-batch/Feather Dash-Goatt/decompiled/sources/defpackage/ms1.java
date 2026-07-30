package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ms1 {
    public final int a;

    public ms1(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(es1 es1Var);

    public abstract vx[] b(es1 es1Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(es1 es1Var);

    public abstract void f(c51 c51Var, boolean z);
}
