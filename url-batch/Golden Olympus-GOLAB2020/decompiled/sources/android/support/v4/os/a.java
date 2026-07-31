package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import io.jsonwebtoken.JwtParser;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: h0, reason: collision with root package name */
    public static final String f9834h0 = "android$support$v4$os$IResultReceiver".replace('$', JwtParser.SEPARATOR_CHAR);

    /* renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0073a extends Binder implements a {

        /* renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        private static class C0074a implements a {

            /* renamed from: a, reason: collision with root package name */
            private IBinder f9835a;

            C0074a(IBinder iBinder) {
                this.f9835a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f9835a;
            }
        }

        public AbstractBinderC0073a() {
            attachInterface(this, a.f9834h0);
        }

        public static a i(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(a.f9834h0);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0074a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = a.f9834h0;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i4 != 1) {
                return super.onTransact(i4, parcel, parcel2, i5);
            }
            h(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void h(int i4, Bundle bundle);
}
