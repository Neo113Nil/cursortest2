package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class ga3 {
    public final int a;

    public ga3(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(aa3 aa3Var);

    public abstract mk0[] b(aa3 aa3Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(aa3 aa3Var);

    public abstract void f(tt1 tt1Var, boolean z);
}
