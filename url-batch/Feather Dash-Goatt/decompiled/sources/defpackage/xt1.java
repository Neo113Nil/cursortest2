package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.a;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xt1 extends nr1 {
    public a c;
    public final int d;

    public xt1(a aVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.c = aVar;
        this.d = i;
    }

    @Override // defpackage.nr1
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ut1.a(parcel, Bundle.CREATOR);
            ut1.b(parcel);
            y90.j(this.c, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar = this.c;
            int i2 = this.d;
            aVar.getClass();
            fu1 fu1Var = new fu1(aVar, readInt, readStrongBinder, bundle);
            pt1 pt1Var = aVar.e;
            pt1Var.sendMessage(pt1Var.obtainMessage(1, i2, -1, fu1Var));
            this.c = null;
        } else if (i == 2) {
            parcel.readInt();
            ut1.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            nu1 nu1Var = (nu1) ut1.a(parcel, nu1.CREATOR);
            ut1.b(parcel);
            a aVar2 = this.c;
            y90.j(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            y90.i(nu1Var);
            aVar2.u = nu1Var;
            Bundle bundle2 = nu1Var.d;
            y90.j(this.c, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = this.c;
            int i3 = this.d;
            aVar3.getClass();
            fu1 fu1Var2 = new fu1(aVar3, readInt2, readStrongBinder2, bundle2);
            pt1 pt1Var2 = aVar3.e;
            pt1Var2.sendMessage(pt1Var2.obtainMessage(1, i3, -1, fu1Var2));
            this.c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
