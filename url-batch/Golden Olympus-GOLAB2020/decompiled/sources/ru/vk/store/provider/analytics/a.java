package ru.vk.store.provider.analytics;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: ru.vk.store.provider.analytics.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0263a extends Binder implements a {

        /* renamed from: ru.vk.store.provider.analytics.a$a$a, reason: collision with other inner class name */
        private static class C0264a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45856a;

            C0264a(IBinder iBinder) {
                this.f45856a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45856a;
            }

            @Override // ru.vk.store.provider.analytics.a
            public void d(String str, String str2, Bundle bundle, ru.vk.store.provider.analytics.b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.analytics.AnalyticsProvider");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    b.b(obtain, bundle, 0);
                    obtain.writeStrongInterface(bVar);
                    this.f45856a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.analytics.AnalyticsProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0264a(iBinder) : (a) queryLocalInterface;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i4) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i4);
            }
        }
    }

    void d(String str, String str2, Bundle bundle, ru.vk.store.provider.analytics.b bVar);
}
