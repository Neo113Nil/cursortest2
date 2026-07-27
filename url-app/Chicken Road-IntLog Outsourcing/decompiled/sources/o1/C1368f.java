package o1;

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
import p1.AbstractC1380a;

/* renamed from: o1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368f extends AbstractC1380a {
    public static final Parcelable.Creator<C1368f> CREATOR = new C1357B(0);

    /* renamed from: o, reason: collision with root package name */
    public static final Scope[] f11535o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final l1.d[] f11536p = new l1.d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f11537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11538b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11539c;

    /* renamed from: d, reason: collision with root package name */
    public String f11540d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f11541e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f11542f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f11543g;

    /* renamed from: h, reason: collision with root package name */
    public Account f11544h;

    /* renamed from: i, reason: collision with root package name */
    public l1.d[] f11545i;

    /* renamed from: j, reason: collision with root package name */
    public l1.d[] f11546j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11547k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11548l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11549m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11550n;

    public C1368f(int i2, int i3, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, l1.d[] dVarArr, l1.d[] dVarArr2, boolean z, int i7, boolean z5, String str2) {
        scopeArr = scopeArr == null ? f11535o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        l1.d[] dVarArr3 = f11536p;
        dVarArr = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr2 = dVarArr2 == null ? dVarArr3 : dVarArr2;
        this.f11537a = i2;
        this.f11538b = i3;
        this.f11539c = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f11540d = "com.google.android.gms";
        } else {
            this.f11540d = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i8 = AbstractBinderC1363a.f11525e;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface c1362g = queryLocalInterface instanceof InterfaceC1369g ? (InterfaceC1369g) queryLocalInterface : new C1362G(iBinder);
                if (c1362g != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((C1362G) c1362g).b();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f11544h = account2;
        } else {
            this.f11541e = iBinder;
            this.f11544h = account;
        }
        this.f11542f = scopeArr;
        this.f11543g = bundle;
        this.f11545i = dVarArr;
        this.f11546j = dVarArr2;
        this.f11547k = z;
        this.f11548l = i7;
        this.f11549m = z5;
        this.f11550n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        C1357B.a(this, parcel, i2);
    }
}
