package com.baidu.mapframework.open.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public interface IComOpenClient extends IInterface {
    String a(String str);

    boolean a(String str, String str2, Bundle bundle);

    public static abstract class a extends Binder implements IComOpenClient {
        public static IComOpenClient a() {
            return C0068a.f7884a;
        }

        public static IComOpenClient b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.baidu.mapframework.open.aidl.IComOpenClient");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IComOpenClient)) ? new C0068a(iBinder) : (IComOpenClient) queryLocalInterface;
        }

        /* renamed from: com.baidu.mapframework.open.aidl.IComOpenClient$a$a, reason: collision with other inner class name */
        private static class C0068a implements IComOpenClient {

            /* renamed from: a, reason: collision with root package name */
            public static IComOpenClient f7884a;

            /* renamed from: b, reason: collision with root package name */
            private IBinder f7885b;

            C0068a(IBinder iBinder) {
                this.f7885b = iBinder;
            }

            @Override // com.baidu.mapframework.open.aidl.IComOpenClient
            public String a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IComOpenClient");
                    obtain.writeString(str);
                    if (!this.f7885b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(str);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f7885b;
            }

            @Override // com.baidu.mapframework.open.aidl.IComOpenClient
            public boolean a(String str, String str2, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.baidu.mapframework.open.aidl.IComOpenClient");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f7885b.transact(2, obtain, obtain2, 0) && a.a() != null) {
                        boolean a8 = a.a().a(str, str2, bundle);
                        obtain2.recycle();
                        obtain.recycle();
                        return a8;
                    }
                    obtain2.readException();
                    boolean z7 = obtain2.readInt() != 0;
                    obtain2.recycle();
                    obtain.recycle();
                    return z7;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }
    }
}
