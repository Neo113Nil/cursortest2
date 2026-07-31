package y3;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class f extends a implements d {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // y3.d
    public final String I3() {
        Parcel q02 = q0(1, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // y3.d
    public final boolean b0(boolean z6) {
        Parcel E = E();
        c.a(E, true);
        Parcel q02 = q0(2, E);
        boolean b7 = c.b(q02);
        q02.recycle();
        return b7;
    }

    @Override // y3.d
    public final boolean c() {
        Parcel q02 = q0(6, E());
        boolean b7 = c.b(q02);
        q02.recycle();
        return b7;
    }
}
