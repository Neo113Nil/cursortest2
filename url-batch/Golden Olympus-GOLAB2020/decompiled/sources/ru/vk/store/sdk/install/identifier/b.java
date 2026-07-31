package ru.vk.store.sdk.install.identifier;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: ru.vk.store.sdk.install.identifier.b$a$a, reason: collision with other inner class name */
        public static class C0273a implements b {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f45862a;

            public C0273a(IBinder iBinder) {
                this.f45862a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f45862a;
            }

            @Override // ru.vk.store.sdk.install.identifier.b
            public void g(String str, ru.vk.store.sdk.install.identifier.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("ru.vk.store.sdk.install.identifier.InstallIdentifierProvider");
                    obtain.writeString(str);
                    obtain.writeStrongInterface(aVar);
                    this.f45862a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.sdk.install.identifier.InstallIdentifierProvider");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0273a(iBinder) : (b) queryLocalInterface;
        }
    }

    void g(String str, ru.vk.store.sdk.install.identifier.a aVar);
}
