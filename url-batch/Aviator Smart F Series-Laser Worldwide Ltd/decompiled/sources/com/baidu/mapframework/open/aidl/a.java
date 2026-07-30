package com.baidu.mapframework.open.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: com.baidu.mapframework.open.aidl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0069a extends Binder implements a {

        /* renamed from: com.baidu.mapframework.open.aidl.a$a$a, reason: collision with other inner class name */
        private static class C0070a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static a f7886a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f7887b;

            C0070a(IBinder iBinder) {
                this.f7887b = iBinder;
            }

            @Override // com.baidu.mapframework.open.aidl.a
            public void a(b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IMapOpenService");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f7887b.transact(1, obtain, obtain2, 0) || AbstractBinderC0069a.a() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } else {
                        AbstractBinderC0069a.a().a(bVar);
                        obtain2.recycle();
                        obtain.recycle();
                    }
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7887b;
            }
        }

        public static a a() {
            return C0070a.f7886a;
        }

        public static a b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.baidu.mapframework.open.aidl.IMapOpenService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0070a(iBinder) : (a) queryLocalInterface;
        }
    }

    void a(b bVar);
}
