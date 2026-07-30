package u4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class a extends Binder implements IInterface {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9051c = 1;

    public a(String str) {
        attachInterface(this, str);
    }

    public boolean e(int i7, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (this.f9051c) {
            case 1:
                if (i7 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i7, parcel, parcel2, i8)) {
                    return true;
                }
                return e(i7, parcel, parcel2);
            default:
                return super.onTransact(i7, parcel, parcel2, i8);
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
