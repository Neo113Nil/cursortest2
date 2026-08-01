package n7;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import w7.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class d extends Binder implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f7173d;

    public d(e eVar, g gVar) {
        this.f7173d = gVar;
        Objects.requireNonNull(eVar);
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i10)) {
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i11 = a.f7171a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        String readString = parcel.readString();
        a7.f createFromParcel2 = parcel.readInt() != 0 ? a7.f.CREATOR.createFromParcel(parcel) : null;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(v4.a.n(new StringBuilder(String.valueOf(dataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", dataAvail));
        }
        a.a.b0(createFromParcel, readString, this.f7173d);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
