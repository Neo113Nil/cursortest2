package q;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import b.InterfaceC0260a;
import com.appsflyer.attribution.RequestError;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class f extends Binder implements InterfaceC0260a {

    /* renamed from: e, reason: collision with root package name */
    public final Handler f7284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f7285f;

    public f(a aVar) {
        this.f7285f = aVar;
        attachInterface(this, InterfaceC0260a.f4128a);
        this.f7284e = new Handler(Looper.getMainLooper());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i5) {
        String str = InterfaceC0260a.f4128a;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Handler handler = this.f7284e;
        a aVar = this.f7285f;
        switch (i2) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new J0.i(this, readInt, bundle, 3));
                    return true;
                }
                return true;
            case 3:
                String readString = parcel.readString();
                Bundle bundle2 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, readString, bundle2, 0));
                    return true;
                }
                return true;
            case 4:
                Bundle bundle3 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle3, 1));
                }
                parcel2.writeNoException();
                return true;
            case 5:
                String readString2 = parcel.readString();
                Bundle bundle4 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new c(this, readString2, bundle4, 1));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                int readInt2 = parcel.readInt();
                Uri uri = (Uri) AbstractC1053a.a(parcel, Uri.CREATOR);
                boolean z7 = parcel.readInt() != 0;
                Bundle bundle5 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new d(this, readInt2, uri, z7, bundle5));
                    return true;
                }
                return true;
            case S.j.DOUBLE_FIELD_NUMBER /* 7 */:
                Bundle extraCallbackWithResult = aVar == null ? null : aVar.extraCallbackWithResult(parcel.readString(), (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                if (extraCallbackWithResult == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                extraCallbackWithResult.writeToParcel(parcel2, 1);
                return true;
            case S.j.BYTES_FIELD_NUMBER /* 8 */:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Bundle bundle6 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new O0.c(this, readInt3, readInt4, bundle6));
                    return true;
                }
                return true;
            case 9:
                Bundle bundle7 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle7, 2));
                    return true;
                }
                return true;
            case 10:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                int readInt8 = parcel.readInt();
                int readInt9 = parcel.readInt();
                Bundle bundle8 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new e(this, readInt5, readInt6, readInt7, readInt8, readInt9, bundle8));
                    return true;
                }
                return true;
            case RequestError.STOP_TRACKING /* 11 */:
                Bundle bundle9 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle9, 3));
                    return true;
                }
                return true;
            case 12:
                Bundle bundle10 = (Bundle) AbstractC1053a.a(parcel, Bundle.CREATOR);
                if (aVar != null) {
                    handler.post(new b(this, bundle10, 0));
                    return true;
                }
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i5);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
