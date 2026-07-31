package ru.vk.store.provider.user;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* renamed from: ru.vk.store.provider.user.b$a$a, reason: collision with other inner class name */
        private static class C0269a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45860a;

            C0269a(IBinder iBinder) {
                this.f45860a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45860a;
            }
        }

        public a() {
            attachInterface(this, "ru.vk.store.provider.user.UserProfileProviderCallback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.user.UserProfileProviderCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0269a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("ru.vk.store.provider.user.UserProfileProviderCallback");
            }
            if (i4 == 1598968902) {
                parcel2.writeString("ru.vk.store.provider.user.UserProfileProviderCallback");
                return true;
            }
            if (i4 == 1) {
                onSuccess((Bundle) C0270b.b(parcel, Bundle.CREATOR));
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

    /* renamed from: ru.vk.store.provider.user.b$b, reason: collision with other inner class name */
    public static class C0270b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void onError(int i4, String str);

    void onSuccess(Bundle bundle);
}
