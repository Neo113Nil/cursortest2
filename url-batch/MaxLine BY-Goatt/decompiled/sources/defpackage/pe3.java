package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pe3 extends y93 {
    public ln h;
    public final int i;

    public pe3(ln lnVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.h = lnVar;
        this.i = i;
    }

    @Override // defpackage.y93
    public final boolean H(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) wd3.a(parcel, Bundle.CREATOR);
            wd3.b(parcel);
            ll3.w(this.h, "onPostInitComplete can be called only once per call to getRemoteService");
            ln lnVar = this.h;
            int i2 = this.i;
            lnVar.getClass();
            zf3 zf3Var = new zf3(lnVar, readInt, readStrongBinder, bundle);
            yc3 yc3Var = lnVar.r;
            yc3Var.sendMessage(yc3Var.obtainMessage(1, i2, -1, zf3Var));
            this.h = null;
        } else if (i == 2) {
            parcel.readInt();
            wd3.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            nl3 nl3Var = (nl3) wd3.a(parcel, nl3.CREATOR);
            wd3.b(parcel);
            ln lnVar2 = this.h;
            ll3.w(lnVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            ll3.v(nl3Var);
            lnVar2.H = nl3Var;
            Bundle bundle2 = nl3Var.m;
            ll3.w(this.h, "onPostInitComplete can be called only once per call to getRemoteService");
            ln lnVar3 = this.h;
            int i3 = this.i;
            lnVar3.getClass();
            zf3 zf3Var2 = new zf3(lnVar3, readInt2, readStrongBinder2, bundle2);
            yc3 yc3Var2 = lnVar3.r;
            yc3Var2.sendMessage(yc3Var2.obtainMessage(1, i3, -1, zf3Var2));
            this.h = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
