package i1;

import U0.C0212c;
import U0.o;
import U0.t;
import a.AbstractC0219a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c1.AbstractC0277b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import k.v0;
import org.json.JSONException;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420a extends com.google.android.gms.common.internal.a implements S0.a {

    /* renamed from: D, reason: collision with root package name */
    public final boolean f4417D;

    /* renamed from: E, reason: collision with root package name */
    public final v0 f4418E;

    /* renamed from: F, reason: collision with root package name */
    public final Bundle f4419F;

    /* renamed from: G, reason: collision with root package name */
    public final Integer f4420G;

    public C0420a(Context context, Looper looper, v0 v0Var, Bundle bundle, S0.e eVar, S0.f fVar) {
        super(context, looper, 44, v0Var, eVar, fVar);
        this.f4417D = true;
        this.f4418E = v0Var;
        this.f4419F = bundle;
        this.f4420G = (Integer) v0Var.f5142l;
    }

    @Override // S0.a
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, S0.a
    public final boolean m() {
        return this.f4417D;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C0424e ? (C0424e) queryLocalInterface : new C0424e(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle q() {
        v0 v0Var = this.f4418E;
        boolean equals = this.f3873h.getPackageName().equals((String) v0Var.f5139i);
        Bundle bundle = this.f4419F;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) v0Var.f5139i);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void x() {
        j(new C0212c(this));
    }

    public final void y(AbstractBinderC0422c abstractBinderC0422c) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.f4418E.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f3873h;
                ReentrantLock reentrantLock = P0.a.f1872c;
                t.f(context);
                ReentrantLock reentrantLock2 = P0.a.f1872c;
                reentrantLock2.lock();
                try {
                    if (P0.a.f1873d == null) {
                        P0.a.f1873d = new P0.a(context.getApplicationContext());
                    }
                    P0.a aVar = P0.a.f1873d;
                    reentrantLock2.unlock();
                    String a7 = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a7)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(a7).length());
                        sb.append("googleSignInAccount:");
                        sb.append(a7);
                        String a8 = aVar.a(sb.toString());
                        if (a8 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.a(a8);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.f4420G;
                            t.f(num);
                            o oVar = new o(2, account, num.intValue(), googleSignInAccount);
                            C0424e c0424e = (C0424e) r();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(c0424e.f3774e);
                            int i7 = AbstractC0277b.f3775a;
                            obtain.writeInt(1);
                            int O6 = AbstractC0219a.O(obtain, 20293);
                            AbstractC0219a.R(obtain, 1, 4);
                            obtain.writeInt(1);
                            AbstractC0219a.I(obtain, 2, oVar, 0);
                            AbstractC0219a.Q(obtain, O6);
                            obtain.writeStrongBinder(abstractBinderC0422c);
                            c0424e.b(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = this.f4420G;
            t.f(num2);
            o oVar2 = new o(2, account, num2.intValue(), googleSignInAccount);
            C0424e c0424e2 = (C0424e) r();
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(c0424e2.f3774e);
            int i72 = AbstractC0277b.f3775a;
            obtain2.writeInt(1);
            int O62 = AbstractC0219a.O(obtain2, 20293);
            AbstractC0219a.R(obtain2, 1, 4);
            obtain2.writeInt(1);
            AbstractC0219a.I(obtain2, 2, oVar2, 0);
            AbstractC0219a.Q(obtain2, O62);
            obtain2.writeStrongBinder(abstractBinderC0422c);
            c0424e2.b(obtain2, 12);
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                abstractBinderC0422c.a(new g(1, new R0.a(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }
}
