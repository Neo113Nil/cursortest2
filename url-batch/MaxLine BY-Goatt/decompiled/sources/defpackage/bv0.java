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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bv0 extends i1 {
    public final int m;
    public final int n;
    public final int o;
    public String p;
    public IBinder q;
    public Scope[] r;
    public Bundle s;
    public Account t;
    public mk0[] u;
    public mk0[] v;
    public final boolean w;
    public final int x;
    public final boolean y;
    public final String z;
    public static final Parcelable.Creator<bv0> CREATOR = new va3(20);
    public static final Scope[] A = new Scope[0];
    public static final mk0[] B = new mk0[0];

    public bv0(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, mk0[] mk0VarArr, mk0[] mk0VarArr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? A : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        mk0[] mk0VarArr3 = B;
        mk0[] mk0VarArr4 = mk0VarArr == null ? mk0VarArr3 : mk0VarArr;
        mk0VarArr3 = mk0VarArr2 != null ? mk0VarArr2 : mk0VarArr3;
        this.m = i;
        this.n = i2;
        this.o = i3;
        if ("com.google.android.gms".equals(str)) {
            this.p = "com.google.android.gms";
        } else {
            this.p = str;
        }
        if (i < 2) {
            account2 = null;
            if (iBinder != null) {
                int i5 = q2.h;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                nz0 ws3Var = queryLocalInterface instanceof nz0 ? (nz0) queryLocalInterface : new ws3(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        ws3 ws3Var2 = (ws3) ws3Var;
                        Parcel b = ws3Var2.b(ws3Var2.d(), 2);
                        Account account3 = (Account) wd3.a(b, Account.CREATOR);
                        b.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
        } else {
            this.q = iBinder;
            account2 = account;
        }
        this.t = account2;
        this.r = scopeArr2;
        this.s = bundle2;
        this.u = mk0VarArr4;
        this.v = mk0VarArr3;
        this.w = z;
        this.x = i4;
        this.y = z2;
        this.z = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        va3.a(this, parcel, i);
    }
}
