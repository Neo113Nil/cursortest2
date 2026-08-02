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

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cqb extends cri {
    public static final Parcelable.Creator CREATOR = new cqc(0);
    static final Scope[] a = new Scope[0];
    static final cli[] b = new cli[0];
    final int c;
    final int d;
    final int e;
    String f;
    IBinder g;
    Scope[] h;
    Bundle i;
    Account j;
    cli[] k;
    cli[] l;
    boolean m;
    int n;
    boolean o;
    public String p;

    public cqb(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, cli[] cliVarArr, cli[] cliVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? a : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cliVarArr = cliVarArr == null ? b : cliVarArr;
        cliVarArr2 = cliVarArr2 == null ? b : cliVarArr2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f = "com.google.android.gms";
        } else {
            this.f = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                cqp cqpVar = queryLocalInterface instanceof cqp ? (cqp) queryLocalInterface : new cqp(iBinder);
                if (cqpVar != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Parcel b2 = cqpVar.b(2, cqpVar.a());
                            Account account3 = (Account) bmt.a(b2, Account.CREATOR);
                            b2.recycle();
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
            this.j = account2;
        } else {
            this.g = iBinder;
            this.j = account;
        }
        this.h = scopeArr;
        this.i = bundle;
        this.k = cliVarArr;
        this.l = cliVarArr2;
        this.m = z;
        this.n = i4;
        this.o = z2;
        this.p = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cqc.a(this, parcel, i);
    }
}
