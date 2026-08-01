package o7;

import a4.j;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g extends Binder implements IInterface {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7550d;

    public g(int i3) {
        this.f7550d = i3;
        switch (i3) {
            case 2:
                break;
            default:
                attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
                break;
        }
    }

    public abstract void C(u7.e eVar);

    public boolean D(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i3 = this.f7550d;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        if (super.onTransact(r6, r7, r8, r9) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (super.onTransact(r6, r7, r8, r9) != false) goto L7;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i10) {
        int i11 = 1;
        switch (this.f7550d) {
            case 0:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i10)) {
                    return true;
                }
                return D(i3, parcel, parcel2);
            case 1:
                if (i3 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                switch (i3) {
                    case j.INTEGER_FIELD_NUMBER /* 3 */:
                        m7.a.b(parcel);
                        break;
                    case j.LONG_FIELD_NUMBER /* 4 */:
                        m7.a.b(parcel);
                        break;
                    case j.STRING_FIELD_NUMBER /* 5 */:
                    default:
                        return false;
                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                        m7.a.b(parcel);
                        break;
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        m7.a.b(parcel);
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        u7.e eVar = (u7.e) m7.a.a(parcel, u7.e.CREATOR);
                        m7.a.b(parcel);
                        C(eVar);
                        break;
                    case 9:
                        m7.a.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i3 > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                x7.f fVar = (x7.f) this;
                if (i3 != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i12 = z7.j.f10940a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(v4.a.j(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                z7.d dVar = fVar.g.f10534d;
                w7.g gVar = fVar.f10530f;
                synchronized (dVar.f10929f) {
                    dVar.f10928e.remove(gVar);
                }
                dVar.a().post(new z7.b(i11, dVar));
                fVar.f10529e.a("onRequestIntegrityToken", new Object[0]);
                fVar.g.f10533c.getClass();
                int i13 = bundle.getInt("error");
                x7.a aVar = i13 == 0 ? null : new x7.a(i13, null);
                if (aVar != null) {
                    fVar.f10530f.b(aVar);
                } else {
                    String string = bundle.getString("token");
                    if (string == null) {
                        fVar.f10530f.b(new x7.a(-100, null));
                    } else {
                        bundle.getLong("request.token.sid");
                        String str = fVar.g.f10532b;
                        ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("IntegrityDialogWrapper");
                        fVar.f10530f.c(new x7.j(string));
                    }
                }
                return true;
        }
    }

    public g(String str) {
        this.f7550d = 0;
        attachInterface(this, str);
    }
}
