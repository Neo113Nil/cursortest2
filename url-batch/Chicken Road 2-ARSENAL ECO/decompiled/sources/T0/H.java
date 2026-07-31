package T0;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import u0.C0673c;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public final int f2244a;

    public H(int i7) {
        this.f2244a = i7;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(B b7);

    public abstract R0.c[] b(B b7);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(B b7);

    public abstract void f(C0673c c0673c, boolean z5);
}
