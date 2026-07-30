package O2;

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

/* renamed from: O2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371h extends P2.a {
    public static final Parcelable.Creator<C0371h> CREATOR = new F0.a(14);

    /* renamed from: H, reason: collision with root package name */
    public static final Scope[] f2415H = new Scope[0];

    /* renamed from: I, reason: collision with root package name */
    public static final L2.d[] f2416I = new L2.d[0];

    /* renamed from: A, reason: collision with root package name */
    public Account f2417A;

    /* renamed from: B, reason: collision with root package name */
    public L2.d[] f2418B;

    /* renamed from: C, reason: collision with root package name */
    public L2.d[] f2419C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f2420D;

    /* renamed from: E, reason: collision with root package name */
    public final int f2421E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2422F;

    /* renamed from: G, reason: collision with root package name */
    public final String f2423G;

    /* renamed from: n, reason: collision with root package name */
    public final int f2424n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2425u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2426v;

    /* renamed from: w, reason: collision with root package name */
    public String f2427w;

    /* renamed from: x, reason: collision with root package name */
    public IBinder f2428x;

    /* renamed from: y, reason: collision with root package name */
    public Scope[] f2429y;

    /* renamed from: z, reason: collision with root package name */
    public Bundle f2430z;

    public C0371h(int i, int i4, int i9, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, L2.d[] dVarArr, L2.d[] dVarArr2, boolean z8, int i10, boolean z9, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f2415H : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        L2.d[] dVarArr3 = f2416I;
        L2.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f2424n = i;
        this.f2425u = i4;
        this.f2426v = i9;
        if ("com.google.android.gms".equals(str)) {
            this.f2427w = "com.google.android.gms";
        } else {
            this.f2427w = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i11 = AbstractBinderC0364a.f2379n;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface k6 = queryLocalInterface instanceof InterfaceC0373j ? (InterfaceC0373j) queryLocalInterface : new K(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (k6 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            K k9 = (K) k6;
                            Parcel u02 = k9.u0(k9.A0(), 2);
                            Account account3 = (Account) b3.h.a(u02, Account.CREATOR);
                            u02.recycle();
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
            }
            this.f2417A = account2;
        } else {
            this.f2428x = iBinder;
            this.f2417A = account;
        }
        this.f2429y = scopeArr2;
        this.f2430z = bundle2;
        this.f2418B = dVarArr4;
        this.f2419C = dVarArr3;
        this.f2420D = z8;
        this.f2421E = i10;
        this.f2422F = z9;
        this.f2423G = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        F0.a.a(this, parcel, i);
    }
}
