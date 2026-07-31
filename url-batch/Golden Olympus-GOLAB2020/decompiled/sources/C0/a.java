package C0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: C0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0004a {

        /* renamed from: C0.a$a$a, reason: collision with other inner class name */
        private static class C0005a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f180a;

            C0005a(IBinder iBinder) {
                this.f180a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f180a;
            }

            @Override // C0.a
            public String c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(i());
                    this.f180a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // C0.a
            public void f(String str, String str2, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.huawei.android.hms.ppskit.IPPSChannelInfoService");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i4);
                    this.f180a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            String i() {
                return "com.huawei.android.hms.ppskit.IPPSChannelInfoService";
            }
        }

        public static a a(IBinder iBinder) {
            return new C0005a(iBinder);
        }
    }

    String c();

    void f(String str, String str2, int i4);
}
