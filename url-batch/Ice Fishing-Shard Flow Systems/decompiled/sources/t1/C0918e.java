package t1;

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
import u1.AbstractC0943a;

/* renamed from: t1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918e extends AbstractC0943a {
    public static final Parcelable.Creator<C0918e> CREATOR = new C0907D(2);

    /* renamed from: w, reason: collision with root package name */
    public static final Scope[] f7931w = new Scope[0];

    /* renamed from: x, reason: collision with root package name */
    public static final q1.d[] f7932x = new q1.d[0];

    /* renamed from: d, reason: collision with root package name */
    public final int f7933d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7934e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7935i;

    /* renamed from: l, reason: collision with root package name */
    public String f7936l;

    /* renamed from: m, reason: collision with root package name */
    public IBinder f7937m;

    /* renamed from: n, reason: collision with root package name */
    public Scope[] f7938n;

    /* renamed from: o, reason: collision with root package name */
    public Bundle f7939o;

    /* renamed from: p, reason: collision with root package name */
    public Account f7940p;

    /* renamed from: q, reason: collision with root package name */
    public q1.d[] f7941q;

    /* renamed from: r, reason: collision with root package name */
    public q1.d[] f7942r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f7943s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7944t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7945u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7946v;

    public C0918e(int i2, int i5, int i7, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, q1.d[] dVarArr, q1.d[] dVarArr2, boolean z7, int i8, boolean z8, String str2) {
        scopeArr = scopeArr == null ? f7931w : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        q1.d[] dVarArr3 = f7932x;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f7933d = i2;
        this.f7934e = i5;
        this.f7935i = i7;
        if ("com.google.android.gms".equals(str)) {
            this.f7936l = "com.google.android.gms";
        } else {
            this.f7936l = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i9 = AbstractBinderC0914a.f7923f;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC0919f c0912i = queryLocalInterface instanceof InterfaceC0919f ? (InterfaceC0919f) queryLocalInterface : new C0912I(iBinder);
                if (c0912i != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((C0912I) c0912i).b();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f7940p = account2;
        } else {
            this.f7937m = iBinder;
            this.f7940p = account;
        }
        this.f7938n = scopeArr;
        this.f7939o = bundle;
        this.f7941q = dVarArr;
        this.f7942r = dVarArr2;
        this.f7943s = z7;
        this.f7944t = i8;
        this.f7945u = z8;
        this.f7946v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        C0907D.a(this, parcel, i2);
    }
}
