package ru.vk.store.provider;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface a extends IInterface {

    /* renamed from: ru.vk.store.provider.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0261a extends Binder implements a {

        /* renamed from: ru.vk.store.provider.a$a$a, reason: collision with other inner class name */
        public static class C0262a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45855a;

            public C0262a(IBinder iBinder) {
                this.f45855a = iBinder;
            }

            @Override // ru.vk.store.provider.a
            public void a(String str, boolean z4, b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.provider.RuStorePaymentInfoProvider");
                    obtain.writeString(str);
                    obtain.writeInt(z4 ? 1 : 0);
                    obtain.writeStrongInterface(bVar);
                    this.f45855a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45855a;
            }
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.RuStorePaymentInfoProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0262a(iBinder) : (a) queryLocalInterface;
        }
    }

    void a(String str, boolean z4, b bVar);
}
