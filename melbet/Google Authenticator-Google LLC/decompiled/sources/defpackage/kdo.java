package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class kdo {
    public static final Logger a = Logger.getLogger(kdo.class.getName());
    public static final ixa c = new ixa();
    protected final IBinder b;

    protected kdo(IBinder iBinder) {
        this.b = iBinder;
    }

    public abstract void a(int i, kdq kdqVar);

    public final boolean b(int i, Parcel parcel) {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
