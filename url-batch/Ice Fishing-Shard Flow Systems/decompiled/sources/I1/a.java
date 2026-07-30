package I1;

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
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import n.w1;
import o1.C0798a;
import org.json.JSONException;
import r1.InterfaceC0844c;
import r1.k;
import r1.l;
import t1.q;
import t1.u;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a implements InterfaceC0844c {

    /* renamed from: E, reason: collision with root package name */
    public final boolean f1264E;

    /* renamed from: F, reason: collision with root package name */
    public final w1 f1265F;

    /* renamed from: G, reason: collision with root package name */
    public final Bundle f1266G;

    /* renamed from: H, reason: collision with root package name */
    public final Integer f1267H;

    public a(Context context, Looper looper, w1 w1Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, w1Var, kVar, lVar);
        this.f1264E = true;
        this.f1265F = w1Var;
        this.f1266G = bundle;
        this.f1267H = (Integer) w1Var.f6947o;
    }

    @Override // r1.InterfaceC0844c
    public final int a() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a, r1.InterfaceC0844c
    public final boolean b() {
        return this.f1264E;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle g() {
        w1 w1Var = this.f1265F;
        boolean equals = this.f4384h.getPackageName().equals((String) w1Var.f6944l);
        Bundle bundle = this.f1266G;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) w1Var.f6944l);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void q(d dVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.f1265F.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f4384h;
                ReentrantLock reentrantLock = C0798a.f7116c;
                u.f(context);
                ReentrantLock reentrantLock2 = C0798a.f7116c;
                reentrantLock2.lock();
                try {
                    if (C0798a.f7117d == null) {
                        C0798a.f7117d = new C0798a(context.getApplicationContext());
                    }
                    C0798a c0798a = C0798a.f7117d;
                    reentrantLock2.unlock();
                    String a7 = c0798a.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a7)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(a7).length());
                        sb.append("googleSignInAccount:");
                        sb.append(a7);
                        String a8 = c0798a.a(sb.toString());
                        if (a8 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.a(a8);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.f1267H;
                            u.f(num);
                            q qVar = new q(2, account, num.intValue(), googleSignInAccount);
                            f fVar = (f) i();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(fVar.f289f);
                            int i2 = C1.b.f290a;
                            obtain.writeInt(1);
                            int Q = AbstractC1053a.Q(obtain, 20293);
                            AbstractC1053a.P(obtain, 1, 4);
                            obtain.writeInt(1);
                            AbstractC1053a.J(obtain, 2, qVar, 0);
                            AbstractC1053a.S(obtain, Q);
                            obtain.writeStrongBinder(dVar);
                            fVar.b(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = this.f1267H;
            u.f(num2);
            q qVar2 = new q(2, account, num2.intValue(), googleSignInAccount);
            f fVar2 = (f) i();
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(fVar2.f289f);
            int i22 = C1.b.f290a;
            obtain2.writeInt(1);
            int Q4 = AbstractC1053a.Q(obtain2, 20293);
            AbstractC1053a.P(obtain2, 1, 4);
            obtain2.writeInt(1);
            AbstractC1053a.J(obtain2, 2, qVar2, 0);
            AbstractC1053a.S(obtain2, Q4);
            obtain2.writeStrongBinder(dVar);
            fVar2.b(obtain2, 12);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.a(new h(1, new q1.b(8, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }
}
