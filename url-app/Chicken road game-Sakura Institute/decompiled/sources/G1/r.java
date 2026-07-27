package G1;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f3154a;

    public r(int i2) {
        this.f3154a = i2;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(l lVar);

    public abstract E1.d[] b(l lVar);

    public abstract void c(Status status);

    public abstract void d(RuntimeException runtimeException);

    public abstract void e(l lVar);

    public abstract void f(y.t tVar, boolean z4);
}
