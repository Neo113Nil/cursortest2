package l4;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f5995a;

    public o(int i7) {
        this.f5995a = i7;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(j jVar);

    public abstract j4.d[] b(j jVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(j jVar);

    public abstract void f(androidx.room.c cVar, boolean z8);
}
