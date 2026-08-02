package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqt extends bms implements IInterface {
    private cpo a;
    private final int b;

    public cqt(cpo cpoVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = cpoVar;
        this.b = i;
    }

    @Override // defpackage.bms
    protected final boolean A(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) bmt.a(parcel, Bundle.CREATOR);
            bmt.b(parcel);
            b(readInt, readStrongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            bmt.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            cpv cpvVar = (cpv) bmt.a(parcel, cpv.CREATOR);
            bmt.b(parcel);
            cpo cpoVar = this.a;
            oy.au(cpoVar, "onPostInitCompleteWithConnectionInfo can be called only once per call to getRemoteService");
            oy.at(cpvVar);
            cpoVar.n = cpvVar;
            if (cpoVar.e()) {
                cpw cpwVar = cpvVar.d;
                crd.a().b(cpwVar == null ? null : cpwVar.a);
            }
            b(readInt2, readStrongBinder2, cpvVar.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void b(int i, IBinder iBinder, Bundle bundle) {
        oy.au(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.z(i, iBinder, bundle, this.b);
        this.a = null;
    }
}
