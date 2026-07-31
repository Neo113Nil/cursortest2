package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.b;

/* loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* renamed from: androidx.room.c$a$a, reason: collision with other inner class name */
        private static class C0024a implements c {

            /* renamed from: f, reason: collision with root package name */
            private IBinder f1253f;

            C0024a(IBinder iBinder) {
                this.f1253f = iBinder;
            }

            @Override // androidx.room.c
            public int E3(b bVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeString(str);
                    this.f1253f.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.c
            public void S5(b bVar, int i7) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    obtain.writeInt(i7);
                    this.f1253f.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1253f;
            }

            @Override // androidx.room.c
            public void h5(int i7, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i7);
                    obtain.writeStringArray(strArr);
                    this.f1253f.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static c E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof c)) ? new C0024a(iBinder) : (c) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int E3 = E3(b.a.E(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(E3);
                return true;
            }
            if (i7 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                S5(b.a.E(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            }
            if (i7 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                h5(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i7 != 1598968902) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    int E3(b bVar, String str);

    void S5(b bVar, int i7);

    void h5(int i7, String[] strArr);
}
