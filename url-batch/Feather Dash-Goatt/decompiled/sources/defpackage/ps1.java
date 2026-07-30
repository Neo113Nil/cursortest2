package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ps1 extends nr1 implements e50, f50 {
    public static final zr1 j = rs1.a;
    public final Context c;
    public final Handler d;
    public final zr1 e;
    public final Set f;
    public final jb g;
    public oa1 h;
    public gs1 i;

    public ps1(Context context, gt1 gt1Var, jb jbVar) {
        super(1);
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.c = context;
        this.d = gt1Var;
        this.g = jbVar;
        this.f = (Set) jbVar.c;
        this.e = j;
    }

    @Override // defpackage.e50
    public final void a(int i) {
        gs1 gs1Var = this.i;
        es1 es1Var = (es1) gs1Var.j.j.get(gs1Var.e);
        if (es1Var != null) {
            if (es1Var.j) {
                es1Var.p(new fm(17));
            } else {
                es1Var.a(i);
            }
        }
    }

    @Override // defpackage.f50
    public final void b(fm fmVar) {
        this.i.a(fmVar);
    }

    @Override // defpackage.e50
    public final void c() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        oa1 oa1Var = this.h;
        oa1Var.getClass();
        boolean z = false;
        try {
            oa1Var.z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = oa1Var.c;
                    ReentrantLock reentrantLock = oe1.c;
                    y90.i(context);
                    ReentrantLock reentrantLock2 = oe1.c;
                    reentrantLock2.lock();
                    try {
                        if (oe1.d == null) {
                            oe1.d = new oe1(context.getApplicationContext());
                        }
                        oe1 oe1Var = oe1.d;
                        reentrantLock2.unlock();
                        String a = oe1Var.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a)) {
                            String a2 = oe1Var.a("googleSignInAccount:" + a);
                            if (a2 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a2);
                                } catch (JSONException unused) {
                                }
                                Integer num = oa1Var.B;
                                y90.i(num);
                                ft1 ft1Var = new ft1(2, account, num.intValue(), googleSignInAccount);
                                ts1 ts1Var = (ts1) oa1Var.q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(ts1Var.c);
                                int i = ls1.a;
                                obtain.writeInt(1);
                                int P = y90.P(obtain, 20293);
                                y90.R(obtain, 1, 4);
                                obtain.writeInt(1);
                                y90.L(obtain, 2, ft1Var, 0);
                                y90.Q(obtain, P);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                ts1Var.b.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                ts1Var.b.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = oa1Var.B;
            y90.i(num2);
            ft1 ft1Var2 = new ft1(2, account, num2.intValue(), googleSignInAccount);
            ts1 ts1Var2 = (ts1) oa1Var.q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(ts1Var2.c);
            int i2 = ls1.a;
            obtain.writeInt(1);
            int P2 = y90.P(obtain, 20293);
            y90.R(obtain, 1, 4);
            obtain.writeInt(1);
            y90.L(obtain, 2, ft1Var2, 0);
            y90.Q(obtain, P2);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.d.post(new lf(7, this, new at1(1, new fm(8, null), null), z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
