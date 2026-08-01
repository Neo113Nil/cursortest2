package c7;

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

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends d7.a {
    public boolean A;
    public final String B;

    /* renamed from: d, reason: collision with root package name */
    public final int f1911d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1912e;

    /* renamed from: i, reason: collision with root package name */
    public final int f1913i;

    /* renamed from: r, reason: collision with root package name */
    public String f1914r;

    /* renamed from: s, reason: collision with root package name */
    public IBinder f1915s;

    /* renamed from: t, reason: collision with root package name */
    public Scope[] f1916t;

    /* renamed from: u, reason: collision with root package name */
    public Bundle f1917u;

    /* renamed from: v, reason: collision with root package name */
    public Account f1918v;

    /* renamed from: w, reason: collision with root package name */
    public z6.d[] f1919w;

    /* renamed from: x, reason: collision with root package name */
    public z6.d[] f1920x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1921y;

    /* renamed from: z, reason: collision with root package name */
    public final int f1922z;
    public static final Parcelable.Creator<h> CREATOR = new p(8);
    public static final Scope[] C = new Scope[0];
    public static final z6.d[] D = new z6.d[0];

    public h(int i3, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, z6.d[] dVarArr, z6.d[] dVarArr2, boolean z10, int i12, boolean z11, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? C : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        z6.d[] dVarArr3 = D;
        z6.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f1911d = i3;
        this.f1912e = i10;
        this.f1913i = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f1914r = "com.google.android.gms";
        } else {
            this.f1914r = str;
        }
        if (i3 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f1870e;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface q0Var = queryLocalInterface instanceof j ? (j) queryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        q0 q0Var2 = (q0) q0Var;
                        Parcel D2 = q0Var2.D(q0Var2.F(), 2);
                        Account account3 = (Account) o7.h.a(D2, Account.CREATOR);
                        D2.recycle();
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
            this.f1918v = account2;
        } else {
            this.f1915s = iBinder;
            this.f1918v = account;
        }
        this.f1916t = scopeArr2;
        this.f1917u = bundle2;
        this.f1919w = dVarArr4;
        this.f1920x = dVarArr3;
        this.f1921y = z10;
        this.f1922z = i12;
        this.A = z11;
        this.B = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        p.a(this, parcel, i3);
    }
}
