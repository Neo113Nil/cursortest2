package U0;

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
public final class e extends V0.a {
    public static final Parcelable.Creator<e> CREATOR = new I.j(13);

    /* renamed from: t, reason: collision with root package name */
    public static final Scope[] f2515t = new Scope[0];

    /* renamed from: u, reason: collision with root package name */
    public static final R0.c[] f2516u = new R0.c[0];

    /* renamed from: f, reason: collision with root package name */
    public final int f2517f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2518g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2519h;

    /* renamed from: i, reason: collision with root package name */
    public String f2520i;

    /* renamed from: j, reason: collision with root package name */
    public IBinder f2521j;

    /* renamed from: k, reason: collision with root package name */
    public Scope[] f2522k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f2523l;

    /* renamed from: m, reason: collision with root package name */
    public Account f2524m;

    /* renamed from: n, reason: collision with root package name */
    public R0.c[] f2525n;

    /* renamed from: o, reason: collision with root package name */
    public R0.c[] f2526o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f2527p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2528q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2529r;

    /* renamed from: s, reason: collision with root package name */
    public final String f2530s;

    public e(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, R0.c[] cVarArr, R0.c[] cVarArr2, boolean z5, int i10, boolean z6, String str2) {
        scopeArr = scopeArr == null ? f2515t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        R0.c[] cVarArr3 = f2516u;
        cVarArr = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr2 = cVarArr2 == null ? cVarArr3 : cVarArr2;
        this.f2517f = i7;
        this.f2518g = i8;
        this.f2519h = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f2520i = "com.google.android.gms";
        } else {
            this.f2520i = str;
        }
        if (i7 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i11 = AbstractBinderC0210a.f2507d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                f d7 = queryLocalInterface instanceof f ? (f) queryLocalInterface : new D(iBinder);
                if (d7 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((D) d7).b();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f2524m = account2;
        } else {
            this.f2521j = iBinder;
            this.f2524m = account;
        }
        this.f2522k = scopeArr;
        this.f2523l = bundle;
        this.f2525n = cVarArr;
        this.f2526o = cVarArr2;
        this.f2527p = z5;
        this.f2528q = i10;
        this.f2529r = z6;
        this.f2530s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        I.j.a(this, parcel, i7);
    }
}
