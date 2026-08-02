package M0;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c1.C0201a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class v extends X0.a implements L0.g, L0.h {

    /* renamed from: j, reason: collision with root package name */
    public static final P0.b f964j = b1.b.f2546a;

    /* renamed from: c, reason: collision with root package name */
    public final Context f965c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.e f966d;

    /* renamed from: e, reason: collision with root package name */
    public final P0.b f967e;
    public final Set f;

    /* renamed from: g, reason: collision with root package name */
    public final F1.c f968g;

    /* renamed from: h, reason: collision with root package name */
    public C0201a f969h;

    /* renamed from: i, reason: collision with root package name */
    public o f970i;

    public v(Context context, W0.e eVar, F1.c cVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f965c = context;
        this.f966d = eVar;
        this.f968g = cVar;
        this.f = (Set) cVar.f486a;
        this.f967e = f964j;
    }

    @Override // L0.g
    public final void a(int i3) {
        o oVar = this.f970i;
        m mVar = (m) ((c) oVar.f).f920j.get((a) oVar.f946c);
        if (mVar != null) {
            if (mVar.f937j) {
                mVar.p(new K0.b(17));
            } else {
                mVar.a(i3);
            }
        }
    }

    @Override // L0.g
    public final void b() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        boolean z = false;
        C0201a c0201a = this.f969h;
        c0201a.getClass();
        try {
            c0201a.z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = c0201a.f2684c;
                    ReentrantLock reentrantLock = J0.a.f625c;
                    N0.r.c(context);
                    ReentrantLock reentrantLock2 = J0.a.f625c;
                    reentrantLock2.lock();
                    try {
                        if (J0.a.f626d == null) {
                            J0.a.f626d = new J0.a(context.getApplicationContext());
                        }
                        J0.a aVar = J0.a.f626d;
                        reentrantLock2.unlock();
                        String a3 = aVar.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a3)) {
                            String a4 = aVar.a("googleSignInAccount:" + a3);
                            if (a4 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a4);
                                } catch (JSONException unused) {
                                }
                                Integer num = c0201a.f2618B;
                                N0.r.c(num);
                                N0.m mVar = new N0.m(2, account, num.intValue(), googleSignInAccount);
                                c1.c cVar = (c1.c) c0201a.q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(cVar.f1618d);
                                int i3 = W0.b.f1619a;
                                obtain.writeInt(1);
                                int S2 = C2.b.S(obtain, 20293);
                                C2.b.U(obtain, 1, 4);
                                obtain.writeInt(1);
                                C2.b.N(obtain, 2, mVar, 0);
                                C2.b.T(obtain, S2);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                cVar.f1617c.transact(12, obtain, obtain2, 0);
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
                cVar.f1617c.transact(12, obtain, obtain2, 0);
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
            Integer num2 = c0201a.f2618B;
            N0.r.c(num2);
            N0.m mVar2 = new N0.m(2, account, num2.intValue(), googleSignInAccount);
            c1.c cVar2 = (c1.c) c0201a.q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(cVar2.f1618d);
            int i32 = W0.b.f1619a;
            obtain.writeInt(1);
            int S22 = C2.b.S(obtain, 20293);
            C2.b.U(obtain, 1, 4);
            obtain.writeInt(1);
            C2.b.N(obtain, 2, mVar2, 0);
            C2.b.T(obtain, S22);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f966d.post(new B.a(this, new c1.e(1, new K0.b(8, null), null), 3, z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e3);
            }
        }
    }

    @Override // L0.h
    public final void c(K0.b bVar) {
        this.f970i.b(bVar);
    }
}
