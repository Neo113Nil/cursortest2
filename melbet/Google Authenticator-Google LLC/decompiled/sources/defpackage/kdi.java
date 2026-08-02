package defpackage;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdi extends Binder {
    private static final Logger b = Logger.getLogger(kdi.class.getName());
    public kdh a;

    public kdi(kdh kdhVar) {
        this.a = kdhVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        kdh kdhVar = this.a;
        if (kdhVar != null) {
            try {
                if ((i2 & 1) != 0) {
                    return kdhVar.a(i, parcel);
                }
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.Y(i2, "ignoring non-oneway transaction. flags="));
                return false;
            } catch (RuntimeException e) {
                b.logp(Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", a.Y(i, "failure sending transaction "), (Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}
