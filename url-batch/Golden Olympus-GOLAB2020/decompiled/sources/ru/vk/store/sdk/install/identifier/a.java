package ru.vk.store.sdk.install.identifier;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: ru.vk.store.sdk.install.identifier.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0271a extends Binder implements a {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* renamed from: ru.vk.store.sdk.install.identifier.a$a$a, reason: collision with other inner class name */
        public static class C0272a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45861a;

            public C0272a(IBinder iBinder) {
                this.f45861a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45861a;
            }

            @Override // ru.vk.store.sdk.install.identifier.a
            public void onError(int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.sdk.install.identifier.InstallIdentifierCallback");
                    obtain.writeInt(i4);
                    this.f45861a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ru.vk.store.sdk.install.identifier.a
            public void onSuccess(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.sdk.install.identifier.InstallIdentifierCallback");
                    obtain.writeString(str);
                    this.f45861a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0271a() {
            attachInterface(this, "ru.vk.store.sdk.install.identifier.InstallIdentifierCallback");
        }

        public static a asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.sdk.install.identifier.InstallIdentifierCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0272a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("ru.vk.store.sdk.install.identifier.InstallIdentifierCallback");
            }
            if (i4 == 1598968902) {
                parcel2.writeString("ru.vk.store.sdk.install.identifier.InstallIdentifierCallback");
                return true;
            }
            if (i4 == 1) {
                onSuccess(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i4 != 2) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                onError(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onError(int i4);

    void onSuccess(String str);
}
