package d2;

import a2.C0164d;
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
import e2.AbstractC0408a;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386d extends AbstractC0408a {
    public static final Parcelable.Creator<C0386d> CREATOR = new H.h(21);
    public static final Scope[] o = new Scope[0];

    /* renamed from: p, reason: collision with root package name */
    public static final C0164d[] f8240p = new C0164d[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f8241a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8243c;

    /* renamed from: d, reason: collision with root package name */
    public String f8244d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f8245e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f8246f;

    /* renamed from: g, reason: collision with root package name */
    public Bundle f8247g;

    /* renamed from: h, reason: collision with root package name */
    public Account f8248h;

    /* renamed from: i, reason: collision with root package name */
    public C0164d[] f8249i;

    /* renamed from: j, reason: collision with root package name */
    public C0164d[] f8250j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8251k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8252l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8253m;
    public final String n;

    public C0386d(int i4, int i5, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0164d[] c0164dArr, C0164d[] c0164dArr2, boolean z, int i7, boolean z4, String str2) {
        scopeArr = scopeArr == null ? o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        C0164d[] c0164dArr3 = f8240p;
        c0164dArr = c0164dArr == null ? c0164dArr3 : c0164dArr;
        c0164dArr2 = c0164dArr2 == null ? c0164dArr3 : c0164dArr2;
        this.f8241a = i4;
        this.f8242b = i5;
        this.f8243c = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f8244d = "com.google.android.gms";
        } else {
            this.f8244d = str;
        }
        if (i4 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i8 = AbstractBinderC0383a.f8233b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface c0382d = queryLocalInterface instanceof InterfaceC0387e ? (InterfaceC0387e) queryLocalInterface : new C0382D(iBinder);
                if (c0382d != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = ((C0382D) c0382d).a();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f8248h = account2;
        } else {
            this.f8245e = iBinder;
            this.f8248h = account;
        }
        this.f8246f = scopeArr;
        this.f8247g = bundle;
        this.f8249i = c0164dArr;
        this.f8250j = c0164dArr2;
        this.f8251k = z;
        this.f8252l = i7;
        this.f8253m = z4;
        this.n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        H.h.a(this, parcel, i4);
    }
}
