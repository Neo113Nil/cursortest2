package b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: b.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0034a extends Binder implements a {

        /* renamed from: b.a$a$a, reason: collision with other inner class name */
        private static class C0035a implements a {

            /* renamed from: g, reason: collision with root package name */
            public static a f1594g;

            /* renamed from: f, reason: collision with root package name */
            private IBinder f1595f;

            C0035a(IBinder iBinder) {
                this.f1595f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1595f;
            }

            @Override // b.a
            public void j6(int i7, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i7);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f1595f.transact(1, obtain, null, 1) || AbstractBinderC0034a.q0() == null) {
                        return;
                    }
                    AbstractBinderC0034a.q0().j6(i7, bundle);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0034a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static a E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0035a(iBinder) : (a) queryLocalInterface;
        }

        public static a q0() {
            return C0035a.f1594g;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                j6(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i7 != 1598968902) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }

    void j6(int i7, Bundle bundle);
}
