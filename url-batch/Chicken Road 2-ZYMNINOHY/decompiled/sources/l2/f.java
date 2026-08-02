package l2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import t2.j;

/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t2.d f14272a;

    public f(t2.d dVar) {
        this.f14272a = dVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i4, parcel, parcel2, i5)) {
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i6 = a.f14266a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        X1.b createFromParcel2 = parcel.readInt() == 0 ? null : X1.b.CREATOR.createFromParcel(parcel);
        X1.a aVar = createFromParcel2 != null ? new X1.a(createFromParcel2.f3609a, createFromParcel2.f3610b) : null;
        j jVar = this.f14272a.f15407a;
        if (createFromParcel.f5773a <= 0) {
            jVar.e(aVar);
            return true;
        }
        jVar.d(createFromParcel.f5775c != null ? new b2.j(createFromParcel) : new b2.d(createFromParcel));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
