package V0;

import L0.j;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import d1.k;

/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1.e f1601a;

    public f(d1.e eVar) {
        this.f1601a = eVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i3, parcel, parcel2, i4)) {
            return true;
        }
        if (i3 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i5 = a.f1594a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        H0.b createFromParcel2 = parcel.readInt() == 0 ? null : H0.b.CREATOR.createFromParcel(parcel);
        H0.a aVar = createFromParcel2 != null ? new H0.a(createFromParcel2.f599a, createFromParcel2.f600b) : null;
        int i6 = createFromParcel.f2677a;
        k kVar = this.f1601a.f4931a;
        if (i6 <= 0) {
            kVar.e(aVar);
            return true;
        }
        kVar.d(createFromParcel.f2679c != null ? new j(createFromParcel) : new L0.d(createFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
