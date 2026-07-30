package s1;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: s1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0862D {

    /* renamed from: a, reason: collision with root package name */
    public final int f7607a;

    public AbstractC0862D(int i2) {
        this.f7607a = i2;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract q1.d[] a(v vVar);

    public abstract boolean b(v vVar);

    public abstract int c(v vVar);

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(P0.s sVar, boolean z7);

    public abstract void g(v vVar);
}
