package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cnn {
    public final int c;
    public boolean d = false;
    public boolean e = false;

    public cnn(int i) {
        this.c = i;
    }

    public static Status j(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void f(Status status);

    public abstract void g(Exception exc);

    public abstract void h(coc cocVar);

    public abstract void i(fwm fwmVar, boolean z);
}
