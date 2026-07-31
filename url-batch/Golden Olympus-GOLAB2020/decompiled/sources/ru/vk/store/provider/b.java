package ru.vk.store.provider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* renamed from: ru.vk.store.provider.b$a$a, reason: collision with other inner class name */
        public static class C0266a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45858a;

            public C0266a(IBinder iBinder) {
                this.f45858a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45858a;
            }

            @Override // ru.vk.store.provider.b
            public void onError(int i4, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.RuStorePaymentInfoProviderCallback");
                    obtain.writeInt(i4);
                    obtain.writeString(str);
                    this.f45858a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // ru.vk.store.provider.b
            public void onSuccess(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.RuStorePaymentInfoProviderCallback");
                    obtain.writeString(str);
                    this.f45858a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "ru.vk.store.provider.RuStorePaymentInfoProviderCallback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.RuStorePaymentInfoProviderCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0266a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("ru.vk.store.provider.RuStorePaymentInfoProviderCallback");
            }
            if (i4 == 1598968902) {
                parcel2.writeString("ru.vk.store.provider.RuStorePaymentInfoProviderCallback");
                return true;
            }
            if (i4 == 1) {
                onSuccess(parcel.readString());
                parcel2.writeNoException();
            } else {
                if (i4 != 2) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                }
                onError(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void onError(int i4, String str);

    void onSuccess(String str);
}
