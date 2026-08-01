package u7;

import a7.k;
import a7.l;
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
import c7.c0;
import c7.i;
import c7.v;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import m.g2;
import o7.g;
import org.json.JSONException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends i {
    public final boolean F;
    public final g2 G;
    public final Bundle H;
    public final Integer I;

    public a(Context context, Looper looper, g2 g2Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, g2Var, kVar, lVar);
        this.F = true;
        this.G = g2Var;
        this.H = bundle;
        this.I = (Integer) g2Var.f6083u;
    }

    @Override // c7.f
    public final IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // c7.f
    public final Bundle i() {
        g2 g2Var = this.G;
        boolean equals = this.f1884h.getPackageName().equals((String) g2Var.f6080r);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) g2Var.f6080r);
        }
        return bundle;
    }

    @Override // c7.f
    public final int j() {
        return 12451000;
    }

    @Override // c7.f
    public final String n() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // c7.f
    public final String o() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // c7.f
    public final boolean s() {
        return this.F;
    }

    public final void v(g gVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f1884h;
                ReentrantLock reentrantLock = x6.a.f10515c;
                c0.g(context);
                ReentrantLock reentrantLock2 = x6.a.f10515c;
                reentrantLock2.lock();
                try {
                    if (x6.a.f10516d == null) {
                        x6.a.f10516d = new x6.a(context.getApplicationContext());
                    }
                    x6.a aVar = x6.a.f10516d;
                    reentrantLock2.unlock();
                    String a9 = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a9)) {
                        StringBuilder sb2 = new StringBuilder(20 + String.valueOf(a9).length());
                        sb2.append("googleSignInAccount:");
                        sb2.append(a9);
                        String a10 = aVar.a(sb2.toString());
                        if (a10 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.b(a10);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.I;
                            c0.g(num);
                            v vVar = new v(2, account, num.intValue(), googleSignInAccount);
                            c cVar = (c) m();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(cVar.f2666f);
                            int i3 = m7.a.f6567a;
                            obtain.writeInt(1);
                            int Z = cf.c.Z(obtain, 20293);
                            cf.c.Y(obtain, 1, 4);
                            obtain.writeInt(1);
                            cf.c.U(obtain, 2, vVar, 0);
                            cf.c.a0(obtain, Z);
                            obtain.writeStrongBinder(gVar);
                            cVar.C(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = this.I;
            c0.g(num2);
            v vVar2 = new v(2, account, num2.intValue(), googleSignInAccount);
            c cVar2 = (c) m();
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(cVar2.f2666f);
            int i32 = m7.a.f6567a;
            obtain2.writeInt(1);
            int Z2 = cf.c.Z(obtain2, 20293);
            cf.c.Y(obtain2, 1, 4);
            obtain2.writeInt(1);
            cf.c.U(obtain2, 2, vVar2, 0);
            cf.c.a0(obtain2, Z2);
            obtain2.writeStrongBinder(gVar);
            cVar2.C(obtain2, 12);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                gVar.C(new e(1, new z6.b(8, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }
}
