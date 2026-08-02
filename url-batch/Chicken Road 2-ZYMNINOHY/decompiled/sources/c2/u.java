package c2;

import E1.C0035k;
import a2.C0162b;
import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.play_billing.AbstractBinderC0310e;
import f2.C0420b;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import m2.AbstractC1309a;
import m2.HandlerC1312d;
import org.json.JSONException;
import s2.C1411a;

/* loaded from: classes.dex */
public final class u extends AbstractBinderC0310e implements b2.g, b2.h {

    /* renamed from: i, reason: collision with root package name */
    public static final C0420b f5712i = r2.b.f15200a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5713b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f5714c;

    /* renamed from: d, reason: collision with root package name */
    public final C0420b f5715d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f5716e;

    /* renamed from: f, reason: collision with root package name */
    public final L1.h f5717f;

    /* renamed from: g, reason: collision with root package name */
    public C1411a f5718g;

    /* renamed from: h, reason: collision with root package name */
    public C0035k f5719h;

    public u(Context context, HandlerC1312d handlerC1312d, L1.h hVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f5713b = context;
        this.f5714c = handlerC1312d;
        this.f5717f = hVar;
        this.f5716e = (Set) hVar.f1635c;
        this.f5715d = f5712i;
    }

    @Override // b2.g
    public final void a(int i4) {
        C0035k c0035k = this.f5719h;
        m mVar = (m) ((C0286c) c0035k.f629f).f5671j.get((C0284a) c0035k.f626c);
        if (mVar != null) {
            if (mVar.f5690i) {
                mVar.p(new C0162b(17));
            } else {
                mVar.a(i4);
            }
        }
    }

    @Override // b2.g
    public final void b() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        C1411a c1411a = this.f5718g;
        c1411a.getClass();
        try {
            c1411a.z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = c1411a.f5780c;
                    ReentrantLock reentrantLock = Z1.a.f3834c;
                    d2.s.c(context);
                    ReentrantLock reentrantLock2 = Z1.a.f3834c;
                    reentrantLock2.lock();
                    try {
                        if (Z1.a.f3835d == null) {
                            Z1.a.f3835d = new Z1.a(context.getApplicationContext());
                        }
                        Z1.a aVar = Z1.a.f3835d;
                        reentrantLock2.unlock();
                        String a3 = aVar.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a3)) {
                            String a4 = aVar.a("googleSignInAccount:" + a3);
                            if (a4 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.a(a4);
                                } catch (JSONException unused) {
                                }
                                Integer num = c1411a.f15229B;
                                d2.s.c(num);
                                d2.n nVar = new d2.n(2, account, num.intValue(), googleSignInAccount);
                                s2.d dVar = (s2.d) c1411a.q();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(dVar.f5942c);
                                int i4 = AbstractC1309a.f14497a;
                                obtain.writeInt(1);
                                int D3 = O3.l.D(obtain, 20293);
                                O3.l.G(obtain, 1, 4);
                                obtain.writeInt(1);
                                O3.l.z(obtain, 2, nVar, 0);
                                O3.l.F(obtain, D3);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                dVar.f5941b.transact(12, obtain, obtain2, 0);
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
                dVar.f5941b.transact(12, obtain, obtain2, 0);
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
            Integer num2 = c1411a.f15229B;
            d2.s.c(num2);
            d2.n nVar2 = new d2.n(2, account, num2.intValue(), googleSignInAccount);
            s2.d dVar2 = (s2.d) c1411a.q();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(dVar2.f5942c);
            int i42 = AbstractC1309a.f14497a;
            obtain.writeInt(1);
            int D32 = O3.l.D(obtain, 20293);
            O3.l.G(obtain, 1, 4);
            obtain.writeInt(1);
            O3.l.z(obtain, 2, nVar2, 0);
            O3.l.F(obtain, D32);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e4) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f5714c.post(new B.a(this, new s2.f(1, new C0162b(8, null), null), 14, false));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e4);
            }
        }
    }

    @Override // b2.h
    public final void c(C0162b c0162b) {
        this.f5719h.c(c0162b);
    }
}
