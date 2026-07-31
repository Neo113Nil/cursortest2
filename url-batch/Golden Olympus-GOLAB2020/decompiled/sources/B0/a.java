package B0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: B0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0002a {

        /* renamed from: B0.a$a$a, reason: collision with other inner class name */
        private static class C0003a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f171a;

            C0003a(IBinder iBinder) {
                this.f171a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f171a;
            }

            @Override // B0.a
            public boolean e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(i());
                    this.f171a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // B0.a
            public String getOaid() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(i());
                    this.f171a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String i() {
                return "com.uodis.opendevice.aidl.OpenDeviceIdentifierService";
            }
        }

        public static a a(IBinder iBinder) {
            return new C0003a(iBinder);
        }
    }

    boolean e();

    String getOaid();
}
