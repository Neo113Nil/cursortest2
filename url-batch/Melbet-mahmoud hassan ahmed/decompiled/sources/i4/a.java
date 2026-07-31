package i4;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import p3.f;
import r3.c;
import r3.f0;
import r3.o;

/* loaded from: classes.dex */
public class a extends r3.g<g> implements h4.f {
    public static final /* synthetic */ int M = 0;
    private final boolean I;
    private final r3.d J;
    private final Bundle K;
    private final Integer L;

    public a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, boolean z6, @RecentlyNonNull r3.d dVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull f.a aVar, @RecentlyNonNull f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.I = true;
        this.J = dVar;
        this.K = bundle;
        this.L = dVar.h();
    }

    @RecentlyNonNull
    public static Bundle k0(@RecentlyNonNull r3.d dVar) {
        dVar.g();
        Integer h7 = dVar.h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (h7 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", h7.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // r3.c
    @RecentlyNonNull
    protected final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // r3.c
    @RecentlyNonNull
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // h4.f
    public final void i() {
        c(new c.d());
    }

    @Override // r3.c
    public final int j() {
        return o3.j.f19861a;
    }

    @Override // r3.c, p3.a.f
    public final boolean o() {
        return this.I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h4.f
    public final void p(f fVar) {
        o.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b7 = this.J.b();
            ((g) C()).B3(new j(1, new f0(b7, ((Integer) o.i(this.L)).intValue(), "<<default account>>".equals(b7.name) ? m3.a.a(x()).b() : null)), fVar);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.b2(new l(1, new o3.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    @Override // r3.c
    @RecentlyNonNull
    protected final /* bridge */ /* synthetic */ IInterface s(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // r3.c
    @RecentlyNonNull
    protected final Bundle z() {
        if (!x().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }
}
