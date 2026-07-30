package m4;

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

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends n4.a {
    public static final Parcelable.Creator<c> CREATOR = new d4.a(12);

    /* renamed from: t, reason: collision with root package name */
    public static final Scope[] f6339t = new Scope[0];

    /* renamed from: u, reason: collision with root package name */
    public static final j4.d[] f6340u = new j4.d[0];

    /* renamed from: f, reason: collision with root package name */
    public final int f6341f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6342g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6343h;

    /* renamed from: i, reason: collision with root package name */
    public String f6344i;

    /* renamed from: j, reason: collision with root package name */
    public IBinder f6345j;

    /* renamed from: k, reason: collision with root package name */
    public Scope[] f6346k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f6347l;

    /* renamed from: m, reason: collision with root package name */
    public Account f6348m;

    /* renamed from: n, reason: collision with root package name */
    public j4.d[] f6349n;

    /* renamed from: o, reason: collision with root package name */
    public j4.d[] f6350o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6351p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6352q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6353r;

    /* renamed from: s, reason: collision with root package name */
    public final String f6354s;

    public c(int i7, int i8, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, j4.d[] dVarArr, j4.d[] dVarArr2, boolean z8, int i10, boolean z9, String str2) {
        scopeArr = scopeArr == null ? f6339t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        j4.d[] dVarArr3 = f6340u;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f6341f = i7;
        this.f6342g = i8;
        this.f6343h = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f6344i = "com.google.android.gms";
        } else {
            this.f6344i = str;
        }
        if (i7 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i11 = a.f6331d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface a0Var = queryLocalInterface instanceof d ? (d) queryLocalInterface : new a0(iBinder);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        account2 = ((a0) a0Var).a();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    }
                } finally {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f6348m = account2;
        } else {
            this.f6345j = iBinder;
            this.f6348m = account;
        }
        this.f6346k = scopeArr;
        this.f6347l = bundle;
        this.f6349n = dVarArr;
        this.f6350o = dVarArr2;
        this.f6351p = z8;
        this.f6352q = i10;
        this.f6353r = z9;
        this.f6354s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        d4.a.a(this, parcel, i7);
    }
}
