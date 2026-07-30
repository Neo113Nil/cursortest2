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

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r40 extends t0 {
    public static final Parcelable.Creator<r40> CREATOR = new g2(25);
    public static final Scope[] s = new Scope[0];
    public static final vx[] t = new vx[0];
    public final int d;
    public final int e;
    public final int g;
    public String h;
    public IBinder i;
    public Scope[] j;
    public Bundle k;
    public Account l;
    public vx[] m;
    public vx[] n;
    public final boolean o;
    public final int p;
    public final boolean q;
    public final String r;

    public r40(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, vx[] vxVarArr, vx[] vxVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? s : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        vx[] vxVarArr3 = t;
        vxVarArr = vxVarArr == null ? vxVarArr3 : vxVarArr;
        vxVarArr2 = vxVarArr2 == null ? vxVarArr3 : vxVarArr2;
        this.d = i;
        this.e = i2;
        this.g = i3;
        if ("com.google.android.gms".equals(str)) {
            this.h = "com.google.android.gms";
        } else {
            this.h = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = a2.c;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface yu1Var = queryLocalInterface instanceof t60 ? (t60) queryLocalInterface : new yu1(iBinder);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        account2 = ((yu1) yu1Var).a();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.l = account2;
        } else {
            this.i = iBinder;
            this.l = account;
        }
        this.j = scopeArr;
        this.k = bundle;
        this.m = vxVarArr;
        this.n = vxVarArr2;
        this.o = z;
        this.p = i4;
        this.q = z2;
        this.r = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g2.a(this, parcel, i);
    }
}
