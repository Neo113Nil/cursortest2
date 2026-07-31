package ru.vk.store.provider.user;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: ru.vk.store.provider.user.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0267a extends Binder implements a {

        /* renamed from: ru.vk.store.provider.user.a$a$a, reason: collision with other inner class name */
        private static class C0268a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45859a;

            C0268a(IBinder iBinder) {
                this.f45859a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45859a;
            }

            @Override // ru.vk.store.provider.user.a
            public void b(String str, b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.user.UserProfileProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(bVar);
                    this.f45859a.transact(1, obtain, obtain2, 0);
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
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.user.UserProfileProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0268a(iBinder) : (a) queryLocalInterface;
        }
    }

    void b(String str, b bVar);
}
