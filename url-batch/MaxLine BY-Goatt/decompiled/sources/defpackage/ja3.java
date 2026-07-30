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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ja3 extends y93 implements uv0, vv0 {
    public static final u93 o = la3.a;
    public final Context h;
    public final Handler i;
    public final u93 j;
    public final Set k;
    public final sf l;
    public dl2 m;
    public my1 n;

    public ja3(Context context, bb3 bb3Var, sf sfVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.h = context;
        this.i = bb3Var;
        this.l = sfVar;
        this.k = (Set) sfVar.a;
        this.j = o;
    }

    @Override // defpackage.uv0
    public final void b(int i) {
        my1 my1Var = this.n;
        aa3 aa3Var = (aa3) ((wv0) my1Var.r).v.get((oe) my1Var.o);
        if (aa3Var != null) {
            if (aa3Var.o) {
                aa3Var.p(new c10(17));
            } else {
                aa3Var.b(i);
            }
        }
    }

    @Override // defpackage.vv0
    public final void c(c10 c10Var) {
        this.n.a(c10Var);
    }

    @Override // defpackage.uv0
    public final void d() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        dl2 dl2Var = this.m;
        dl2Var.getClass();
        boolean z = false;
        try {
            dl2Var.M.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = dl2Var.o;
                    ReentrantLock reentrantLock = gp2.c;
                    ll3.v(context);
                    ReentrantLock reentrantLock2 = gp2.c;
                    reentrantLock2.lock();
                    try {
                        if (gp2.d == null) {
                            gp2.d = new gp2(context.getApplicationContext());
                        }
                        gp2 gp2Var = gp2.d;
                        reentrantLock2.unlock();
                        String a = gp2Var.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a)) {
                            String a2 = gp2Var.a("googleSignInAccount:" + a);
                            if (a2 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a2);
                                } catch (JSONException unused) {
                                }
                                Integer num = dl2Var.O;
                                ll3.v(num);
                                ab3 ab3Var = new ab3(2, account, num.intValue(), googleSignInAccount);
                                na3 na3Var = (na3) dl2Var.t();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(na3Var.i);
                                int i = fa3.a;
                                obtain.writeInt(1);
                                int b0 = yk3.b0(obtain, 20293);
                                yk3.d0(obtain, 1, 4);
                                obtain.writeInt(1);
                                yk3.V(obtain, 2, ab3Var, 0);
                                yk3.c0(obtain, b0);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                na3Var.h.transact(12, obtain, obtain2, 0);
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
                na3Var.h.transact(12, obtain, obtain2, 0);
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
            Integer num2 = dl2Var.O;
            ll3.v(num2);
            ab3 ab3Var2 = new ab3(2, account, num2.intValue(), googleSignInAccount);
            na3 na3Var2 = (na3) dl2Var.t();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(na3Var2.i);
            int i2 = fa3.a;
            obtain.writeInt(1);
            int b02 = yk3.b0(obtain, 20293);
            yk3.d0(obtain, 1, 4);
            obtain.writeInt(1);
            yk3.V(obtain, 2, ab3Var2, 0);
            yk3.c0(obtain, b02);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.i.post(new iu0(14, this, new ua3(1, new c10(8, null), null), z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
