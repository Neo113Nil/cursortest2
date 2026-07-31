package ru.vk.store.provider.analytics;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* renamed from: ru.vk.store.provider.analytics.b$a$a, reason: collision with other inner class name */
        private static class C0265a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45857a;

            C0265a(IBinder iBinder) {
                this.f45857a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45857a;
            }
        }

        public a() {
            attachInterface(this, "ru.vk.store.provider.analytics.AnalyticsProviderCallback");
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0265a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
            }
            if (i4 == 1598968902) {
                parcel2.writeString("ru.vk.store.provider.analytics.AnalyticsProviderCallback");
                return true;
            }
            if (i4 == 1) {
                onSuccess();
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

    void onSuccess();
}
