package H1;

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

/* loaded from: classes.dex */
public final class c extends I1.a {
    public static final Parcelable.Creator<c> CREATOR = new E1.l(9);

    /* renamed from: u, reason: collision with root package name */
    public static final Scope[] f3237u = new Scope[0];

    /* renamed from: v, reason: collision with root package name */
    public static final E1.d[] f3238v = new E1.d[0];

    /* renamed from: d, reason: collision with root package name */
    public final int f3239d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3240e;

    /* renamed from: i, reason: collision with root package name */
    public final int f3241i;

    /* renamed from: j, reason: collision with root package name */
    public String f3242j;

    /* renamed from: k, reason: collision with root package name */
    public IBinder f3243k;

    /* renamed from: l, reason: collision with root package name */
    public Scope[] f3244l;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f3245m;

    /* renamed from: n, reason: collision with root package name */
    public Account f3246n;

    /* renamed from: o, reason: collision with root package name */
    public E1.d[] f3247o;

    /* renamed from: p, reason: collision with root package name */
    public E1.d[] f3248p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3249q;

    /* renamed from: r, reason: collision with root package name */
    public final int f3250r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f3251s;

    /* renamed from: t, reason: collision with root package name */
    public final String f3252t;

    public c(int i2, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, E1.d[] dVarArr, E1.d[] dVarArr2, boolean z4, int i6, boolean z5, String str2) {
        scopeArr = scopeArr == null ? f3237u : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        E1.d[] dVarArr3 = f3238v;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f3239d = i2;
        this.f3240e = i4;
        this.f3241i = i5;
        if ("com.google.android.gms".equals(str)) {
            this.f3242j = "com.google.android.gms";
        } else {
            this.f3242j = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i7 = AbstractBinderC0248a.f3230b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface a4 = queryLocalInterface instanceof d ? (d) queryLocalInterface : new A(iBinder);
                if (a4 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((A) a4).a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f3246n = account2;
        } else {
            this.f3243k = iBinder;
            this.f3246n = account;
        }
        this.f3244l = scopeArr;
        this.f3245m = bundle;
        this.f3247o = dVarArr;
        this.f3248p = dVarArr2;
        this.f3249q = z4;
        this.f3250r = i6;
        this.f3251s = z5;
        this.f3252t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        E1.l.a(this, parcel, i2);
    }
}
