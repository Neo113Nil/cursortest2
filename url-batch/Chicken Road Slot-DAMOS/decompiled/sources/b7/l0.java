package b7;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1312a;

    public l0(int i3) {
        this.f1312a = i3;
    }

    public static Status h(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract z6.d[] a(b0 b0Var);

    public abstract boolean b(b0 b0Var);

    public abstract int c(b0 b0Var);

    public abstract void d(Status status);

    public abstract void e(Exception exc);

    public abstract void f(c6.c cVar, boolean z10);

    public abstract void g(b0 b0Var);
}
