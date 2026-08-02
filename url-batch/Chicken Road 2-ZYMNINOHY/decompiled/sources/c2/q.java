package c2;

import a2.C0164d;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f5699a;

    public q(int i4) {
        this.f5699a = i4;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(m mVar);

    public abstract C0164d[] b(m mVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(m mVar);

    public abstract void f(l2.e eVar, boolean z);
}
