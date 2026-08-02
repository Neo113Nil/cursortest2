package N0;

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
public final class d extends O0.a {
    public static final Parcelable.Creator<d> CREATOR = new H.h(14);
    public static final Scope[] o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final K0.d[] f1002p = new K0.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f1003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1005c;

    /* renamed from: d, reason: collision with root package name */
    public String f1006d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f1007e;
    public Scope[] f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f1008g;

    /* renamed from: h, reason: collision with root package name */
    public Account f1009h;

    /* renamed from: i, reason: collision with root package name */
    public K0.d[] f1010i;

    /* renamed from: j, reason: collision with root package name */
    public K0.d[] f1011j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1012k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1013l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1014m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1015n;

    public d(int i3, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, K0.d[] dVarArr, K0.d[] dVarArr2, boolean z, int i6, boolean z2, String str2) {
        scopeArr = scopeArr == null ? o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        K0.d[] dVarArr3 = f1002p;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f1003a = i3;
        this.f1004b = i4;
        this.f1005c = i5;
        if ("com.google.android.gms".equals(str)) {
            this.f1006d = "com.google.android.gms";
        } else {
            this.f1006d = str;
        }
        if (i3 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i7 = AbstractBinderC0062a.f996c;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface c3 = queryLocalInterface instanceof e ? (e) queryLocalInterface : new C(iBinder);
                if (c3 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((C) c3).a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f1009h = account2;
        } else {
            this.f1007e = iBinder;
            this.f1009h = account;
        }
        this.f = scopeArr;
        this.f1008g = bundle;
        this.f1010i = dVarArr;
        this.f1011j = dVarArr2;
        this.f1012k = z;
        this.f1013l = i6;
        this.f1014m = z2;
        this.f1015n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        H.h.a(this, parcel, i3);
    }
}
