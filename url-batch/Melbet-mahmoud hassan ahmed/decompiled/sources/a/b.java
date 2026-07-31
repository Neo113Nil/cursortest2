package a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: a.b$a$a, reason: collision with other inner class name */
        private static class C0001a implements b {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f0f;

            C0001a(IBinder iBinder) {
                this.f0f = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f0f;
            }

            @Override // a.b
            public boolean k4(a.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f0f.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public boolean w5(long j7) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j7);
                    this.f0f.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0001a(iBinder) : (b) queryLocalInterface;
        }
    }

    boolean k4(a.a aVar);

    boolean w5(long j7);
}
