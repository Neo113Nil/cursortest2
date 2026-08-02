package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cth extends bmr implements IInterface {
    public cth(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() {
        Parcel b = b(6, a());
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }
}
