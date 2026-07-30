package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class nr1 extends Binder implements IInterface {
    public final /* synthetic */ int b;

    public nr1(String str) {
        this.b = 2;
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.b;
        return this;
    }

    public boolean d(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        if (super.onTransact(r5, r6, r7, r8) != false) goto L30;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z = false;
        int i3 = 1;
        switch (this.b) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                fr1 fr1Var = (fr1) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                int i4 = or1.a;
                Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(qy0.i(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                br1 br1Var = fr1Var.e.d;
                ng1 ng1Var = fr1Var.d;
                synchronized (br1Var.f) {
                    br1Var.e.remove(ng1Var);
                }
                br1Var.a().post(new yq1(i3, br1Var));
                fr1Var.c.a("onRequestIntegrityToken", new Object[0]);
                fr1Var.e.c.getClass();
                int i5 = bundle.getInt("error");
                ea0 ea0Var = i5 == 0 ? null : new ea0(i5, null);
                if (ea0Var != null) {
                    fr1Var.d.b(ea0Var);
                } else {
                    String string = bundle.getString("token");
                    if (string == null) {
                        fr1Var.d.b(new ea0(-100, null));
                    } else {
                        bundle.getLong("request.token.sid");
                        String str = fr1Var.e.b;
                        ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat("IntegrityDialogWrapper");
                        fr1Var.d.c(new mr1(string));
                    }
                }
                return true;
            case 1:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                ps1 ps1Var = (ps1) this;
                switch (i) {
                    case 3:
                        ls1.b(parcel);
                        break;
                    case 4:
                        ls1.b(parcel);
                        break;
                    case ry0.STRING_FIELD_NUMBER /* 5 */:
                    default:
                        return false;
                    case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                        ls1.b(parcel);
                        break;
                    case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                        ls1.b(parcel);
                        break;
                    case ry0.BYTES_FIELD_NUMBER /* 8 */:
                        at1 at1Var = (at1) ls1.a(parcel, at1.CREATOR);
                        ls1.b(parcel);
                        ps1Var.d.post(new lf(7, ps1Var, at1Var, z));
                        break;
                    case 9:
                        ls1.b(parcel);
                        break;
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return d(i, parcel, parcel2);
        }
    }

    public /* synthetic */ nr1(int i) {
        this.b = i;
    }
}
