package f3;

import M2.i;
import M2.j;
import O2.AbstractC0372i;
import O2.C0368e;
import O2.s;
import O2.w;
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
import m.c1;
import org.json.JSONException;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4502a extends AbstractC0372i implements M2.c {

    /* renamed from: X, reason: collision with root package name */
    public final boolean f37698X;
    public final c1 Y;

    /* renamed from: Z, reason: collision with root package name */
    public final Bundle f37699Z;

    /* renamed from: n0, reason: collision with root package name */
    public final Integer f37700n0;

    public C4502a(Context context, Looper looper, c1 c1Var, Bundle bundle, i iVar, j jVar) {
        super(context, looper, 44, c1Var, iVar, jVar);
        this.f37698X = true;
        this.Y = c1Var;
        this.f37699Z = bundle;
        this.f37700n0 = (Integer) c1Var.f39400z;
    }

    public final void A() {
        i(new C0368e(this));
    }

    public final void B(AbstractBinderC4504c abstractBinderC4504c) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.Y.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = this.f2382A;
                ReentrantLock reentrantLock = J2.a.f1394c;
                w.h(context);
                ReentrantLock reentrantLock2 = J2.a.f1394c;
                reentrantLock2.lock();
                try {
                    if (J2.a.f1395d == null) {
                        J2.a.f1395d = new J2.a(context.getApplicationContext());
                    }
                    J2.a aVar = J2.a.f1395d;
                    reentrantLock2.unlock();
                    String a9 = aVar.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(a9)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(a9).length());
                        sb.append("googleSignInAccount:");
                        sb.append(a9);
                        String a10 = aVar.a(sb.toString());
                        if (a10 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.a(a10);
                            } catch (JSONException unused) {
                            }
                            Integer num = this.f37700n0;
                            w.h(num);
                            s sVar = new s(2, account, num.intValue(), googleSignInAccount);
                            C4506e c4506e = (C4506e) u();
                            Parcel obtain = Parcel.obtain();
                            obtain.writeInterfaceToken(c4506e.f4244v);
                            int i = Z2.b.f4245a;
                            obtain.writeInt(1);
                            int B8 = S0.f.B(obtain, 20293);
                            S0.f.A(obtain, 1, 4);
                            obtain.writeInt(1);
                            S0.f.t(obtain, 2, sVar, 0);
                            S0.f.C(obtain, B8);
                            obtain.writeStrongBinder(abstractBinderC4504c);
                            c4506e.i0(obtain, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = this.f37700n0;
            w.h(num2);
            s sVar2 = new s(2, account, num2.intValue(), googleSignInAccount);
            C4506e c4506e2 = (C4506e) u();
            Parcel obtain2 = Parcel.obtain();
            obtain2.writeInterfaceToken(c4506e2.f4244v);
            int i4 = Z2.b.f4245a;
            obtain2.writeInt(1);
            int B82 = S0.f.B(obtain2, 20293);
            S0.f.A(obtain2, 1, 4);
            obtain2.writeInt(1);
            S0.f.t(obtain2, 2, sVar2, 0);
            S0.f.C(obtain2, B82);
            obtain2.writeStrongBinder(abstractBinderC4504c);
            c4506e2.i0(obtain2, 12);
        } catch (RemoteException e6) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                abstractBinderC4504c.i2(new C4508g(1, new L2.b(8, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e6);
            }
        }
    }

    @Override // O2.AbstractC0369f, M2.c
    public final int k() {
        return 12451000;
    }

    @Override // O2.AbstractC0369f, M2.c
    public final boolean n() {
        return this.f37698X;
    }

    @Override // O2.AbstractC0369f
    public final IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C4506e ? (C4506e) queryLocalInterface : new C4506e(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // O2.AbstractC0369f
    public final Bundle s() {
        c1 c1Var = this.Y;
        boolean equals = this.f2382A.getPackageName().equals((String) c1Var.f39397w);
        Bundle bundle = this.f37699Z;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c1Var.f39397w);
        }
        return bundle;
    }

    @Override // O2.AbstractC0369f
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // O2.AbstractC0369f
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
