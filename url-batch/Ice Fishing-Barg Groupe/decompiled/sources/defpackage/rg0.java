package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rg0 extends POWyO8hTM6YC {
    public t70[] BRwzKIf41E4i;
    public final boolean EcgxDIVH5in8;
    public final int OPXfSBeufaJ8;
    public Account QrzZRwfaDlRX;
    public final int RfyTYNmI9Srp;
    public final String S9EYkSpbGuxq;
    public final boolean XL4ISE6Oc65B;
    public Scope[] cpQdD2nAriOS;
    public String dgRBjINgWbAK;
    public t70[] gPXPFXrUH4XX;
    public Bundle r3s1LDPKFs1S;
    public final int rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;
    public IBinder x50lh2ztY7Y5;
    public static final Parcelable.Creator<rg0> CREATOR = new BUo4iHFctTZi(21);
    public static final Scope[] VhhvGxCb8gfr = new Scope[0];
    public static final t70[] S2OOm9zPNm0h = new t70[0];

    public rg0(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, t70[] t70VarArr, t70[] t70VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? VhhvGxCb8gfr : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        t70[] t70VarArr3 = S2OOm9zPNm0h;
        t70VarArr = t70VarArr == null ? t70VarArr3 : t70VarArr;
        t70VarArr2 = t70VarArr2 == null ? t70VarArr3 : t70VarArr2;
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = i2;
        this.wdg6QnbFHrFF = i3;
        if ("com.google.android.gms".equals(str)) {
            this.dgRBjINgWbAK = "com.google.android.gms";
        } else {
            this.dgRBjINgWbAK = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = FT2GK7JK5Ma2.Y1f8riQaR6yg;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                pm0 wx2Var = queryLocalInterface instanceof pm0 ? (pm0) queryLocalInterface : new wx2(iBinder);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        account2 = ((wx2) wx2Var).PxuCJdSBwIXG();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.QrzZRwfaDlRX = account2;
        } else {
            this.x50lh2ztY7Y5 = iBinder;
            this.QrzZRwfaDlRX = account;
        }
        this.cpQdD2nAriOS = scopeArr;
        this.r3s1LDPKFs1S = bundle;
        this.gPXPFXrUH4XX = t70VarArr;
        this.BRwzKIf41E4i = t70VarArr2;
        this.XL4ISE6Oc65B = z;
        this.RfyTYNmI9Srp = i4;
        this.EcgxDIVH5in8 = z2;
        this.S9EYkSpbGuxq = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BUo4iHFctTZi.PxuCJdSBwIXG(this, parcel, i);
    }
}
