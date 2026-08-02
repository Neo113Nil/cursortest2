package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kco implements kdh {
    static final kco a = new kco();

    @Override // defpackage.kdh
    public final boolean a(int i, Parcel parcel) {
        if (i == 1 && parcel.readInt() > 0) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            try {
                kdq c = kdq.c();
                try {
                    c.a().writeInt(0);
                    readStrongBinder.transact(2, c.a(), null, 1);
                    c.close();
                } finally {
                }
            } catch (RemoteException e) {
                kcp.a.logp(Level.WARNING, "io.grpc.binder.internal.BinderServer$GoAwayHandler", "handleTransaction", "Couldn't reply to post-shutdown() SETUP_TRANSPORT.", (Throwable) e);
            }
        }
        return false;
    }
}
