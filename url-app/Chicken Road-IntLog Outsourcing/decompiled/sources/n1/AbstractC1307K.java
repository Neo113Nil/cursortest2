package n1;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: n1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1307K {

    /* renamed from: a, reason: collision with root package name */
    public final int f11319a;

    public AbstractC1307K(int i2) {
        this.f11319a = i2;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(C1300D c1300d);

    public abstract l1.d[] b(C1300D c1300d);

    public abstract void c(Status status);

    public abstract void d(RuntimeException runtimeException);

    public abstract void e(C1300D c1300d);

    public abstract void f(S s2, boolean z);
}
