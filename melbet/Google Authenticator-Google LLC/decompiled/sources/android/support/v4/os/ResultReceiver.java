package android.support.v4.os;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ag;
import defpackage.vs;
import defpackage.vt;
import defpackage.vu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ag(5);
    vu a;

    public ResultReceiver(Parcel parcel) {
        vu vsVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            vsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            vsVar = (queryLocalInterface == null || !(queryLocalInterface instanceof vu)) ? new vs(readStrongBinder) : (vu) queryLocalInterface;
        }
        this.a = vsVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new vt();
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }
}
