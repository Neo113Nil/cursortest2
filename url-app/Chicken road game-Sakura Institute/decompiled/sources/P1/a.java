package P1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3782a = 1;

    public a(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public boolean d(int i2, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i4) {
        switch (this.f3782a) {
            case 1:
                if (i2 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i2, parcel, parcel2, i4)) {
                    return true;
                }
                return d(i2, parcel, parcel2);
            default:
                return super.onTransact(i2, parcel, parcel2, i4);
        }
    }
}
