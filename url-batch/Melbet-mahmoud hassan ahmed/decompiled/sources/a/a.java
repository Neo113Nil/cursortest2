package a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0000a extends Binder implements a {
        public AbstractBinderC0000a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
            if (i7 == 2) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                q3(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i7 == 3) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                t2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i7 == 4) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                p5(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else if (i7 == 5) {
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                X4(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else {
                if (i7 != 6) {
                    if (i7 != 1598968902) {
                        return super.onTransact(i7, parcel, parcel2, i8);
                    }
                    parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                    return true;
                }
                parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                B5(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void B5(int i7, Uri uri, boolean z6, Bundle bundle);

    void X4(String str, Bundle bundle);

    void p5(Bundle bundle);

    void q3(int i7, Bundle bundle);

    void t2(String str, Bundle bundle);
}
