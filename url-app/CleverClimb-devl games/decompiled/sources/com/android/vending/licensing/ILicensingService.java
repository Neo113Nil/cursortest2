package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.android.vending.licensing.a;

/* loaded from: classes.dex */
public interface ILicensingService extends IInterface {

    public static abstract class a extends Binder implements ILicensingService {

        /* renamed from: com.android.vending.licensing.ILicensingService$a$a, reason: collision with other inner class name */
        private static class C0294a implements ILicensingService {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f2256a;

            C0294a(IBinder iBinder) {
                this.f2256a = iBinder;
            }

            @Override // com.android.vending.licensing.ILicensingService
            public void a(long j, String str, com.android.vending.licensing.a aVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    obtain.writeLong(j);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f2256a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2256a;
            }
        }

        public static ILicensingService a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ILicensingService)) ? new C0294a(iBinder) : (ILicensingService) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.android.vending.licensing.ILicensingService");
                a(parcel.readLong(), parcel.readString(), a.AbstractBinderC0295a.a(parcel.readStrongBinder()));
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.android.vending.licensing.ILicensingService");
            return true;
        }
    }

    void a(long j, String str, com.android.vending.licensing.a aVar);
}
