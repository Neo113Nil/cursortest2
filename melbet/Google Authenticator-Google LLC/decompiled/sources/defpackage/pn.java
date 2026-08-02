package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.authenticator2.R;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pn extends bd {
    public pq a;
    public final Handler b = new Handler(Looper.getMainLooper());

    private final void aJ() {
        this.a.g = false;
        if (ao()) {
            by G = G();
            ps psVar = (ps) G.d("androidx.biometric.internal.FingerprintDialogFragment");
            if (psVar != null) {
                if (psVar.ao()) {
                    psVar.q(true, false);
                    return;
                }
                ae aeVar = new ae(G);
                aeVar.i(psVar);
                aeVar.h(true, true);
            }
        }
    }

    private final boolean aK() {
        return this.n.getBoolean("host_activity", true);
    }

    @Override // defpackage.bd
    public final void W(int i, int i2, Intent intent) {
        super.W(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            pq pqVar = this.a;
            pqVar.i = false;
            if (i2 != -1) {
                o(10, R(R.string.generic_error_user_canceled));
                return;
            }
            if (pqVar.l) {
                pqVar.l = false;
                i3 = -1;
            }
            aI(new bsh((Object) null, i3));
        }
    }

    public final void a(int i) {
        if (i == 3 || !this.a.k) {
            if (aH()) {
                this.a.f = i;
                if (i == 1) {
                    p(10, ox.d(x(), 10));
                }
            }
            px b = this.a.b();
            CancellationSignal cancellationSignal = b.a;
            if (cancellationSignal != null) {
                try {
                    cancellationSignal.cancel();
                } catch (NullPointerException e) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e);
                }
                b.a = null;
            }
            vr vrVar = b.b;
            if (vrVar != null) {
                try {
                    synchronized (vrVar) {
                        if (!vrVar.a) {
                            vrVar.a = true;
                            Object obj = vrVar.b;
                            if (obj != null) {
                                try {
                                    ((CancellationSignal) obj).cancel();
                                } catch (Throwable th) {
                                    synchronized (vrVar) {
                                        vrVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (vrVar) {
                                vrVar.notifyAll();
                            }
                        }
                    }
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e2);
                }
                b.b = null;
            }
        }
    }

    public final boolean aF() {
        return this.n.getBoolean("has_fingerprint", oy.f(x()));
    }

    public final boolean aG() {
        return Build.VERSION.SDK_INT <= 28 && pj.c(this.a.n);
    }

    public final boolean aH() {
        Context x = x();
        if (x != null && this.a.b != null) {
            String str = Build.MANUFACTURER;
            String str2 = Build.MODEL;
            if (Build.VERSION.SDK_INT == 28) {
                if (str != null) {
                    for (String str3 : x.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                        if (str.equalsIgnoreCase(str3)) {
                            return true;
                        }
                    }
                }
                if (ox.f(x, str2, R.array.crypto_fingerprint_fallback_prefixes)) {
                    return true;
                }
            }
        }
        return Build.VERSION.SDK_INT == 28 && !aF();
    }

    public final void aI(bsh bshVar) {
        pq pqVar = this.a;
        if (pqVar.h) {
            pqVar.h = false;
            new pl(2, (char[]) null).execute(new at(this, bshVar, 14));
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        d();
    }

    final void d() {
        aJ();
        pq pqVar = this.a;
        pqVar.g = false;
        if (!pqVar.i && ao()) {
            ae aeVar = new ae(G());
            aeVar.i(this);
            aeVar.h(true, true);
        }
        Context x = x();
        if (x != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && ox.e(x, str, R.array.delay_showing_prompt_models)) {
                pq pqVar2 = this.a;
                pqVar2.j = true;
                this.b.postDelayed(new pm(pqVar2, 0), 600L);
            }
        }
    }

    @Override // defpackage.bd
    public final void f(Bundle bundle) {
        super.f(bundle);
        pq pqVar = this.a;
        if (pqVar == null) {
            pqVar = pg.a(this, aK());
            this.a = pqVar;
        }
        if (pqVar.o == null) {
            pqVar.o = new afc();
        }
        pqVar.o.d(this, new ph(this, 1));
        pq pqVar2 = this.a;
        if (pqVar2.p == null) {
            pqVar2.p = new afc();
        }
        pqVar2.p.d(this, new ph(this, 0));
        pq pqVar3 = this.a;
        if (pqVar3.q == null) {
            pqVar3.q = new afc();
        }
        pqVar3.q.d(this, new ph(this, 2));
        pq pqVar4 = this.a;
        if (pqVar4.r == null) {
            pqVar4.r = new afc();
        }
        pqVar4.r.d(this, new ph(this, 3));
        pq pqVar5 = this.a;
        if (pqVar5.s == null) {
            pqVar5.s = new afc();
        }
        pqVar5.s.d(this, new ph(this, 4));
        pq pqVar6 = this.a;
        if (pqVar6.t == null) {
            pqVar6.t = new afc();
        }
        pqVar6.t.d(this, new ph(this, 5));
        pq pqVar7 = this.a;
        if (pqVar7.v == null) {
            pqVar7.v = new afc();
        }
        pqVar7.v.d(this, new ph(this, 6));
    }

    @Override // defpackage.bd
    public final void j() {
        super.j();
        if (Build.VERSION.SDK_INT == 29) {
            pq pqVar = this.a;
            if (pj.c(pqVar.n)) {
                pqVar.k = true;
                this.b.postDelayed(new pm(pqVar, 2, null), 250L);
            }
        }
    }

    @Override // defpackage.bd
    public final void k() {
        super.k();
        pq pqVar = this.a;
        if (!pqVar.g || pqVar.i) {
            return;
        }
        bg D = D();
        if (this.t) {
            if (D == null || !D.isChangingConfigurations()) {
                a(0);
            }
        }
    }

    public final void n() {
        Context x = x();
        KeyguardManager h = x != null ? oy.h(x) : null;
        if (h == null) {
            o(12, R(R.string.generic_error_no_keyguard));
            return;
        }
        CharSequence g = this.a.g();
        CharSequence f = this.a.f();
        CharSequence d = this.a.d();
        if (f == null) {
            f = d;
        }
        Intent createConfirmDeviceCredentialIntent = h.createConfirmDeviceCredentialIntent(g, f);
        if (createConfirmDeviceCredentialIntent == null) {
            o(14, R(R.string.generic_error_no_device_credential));
            return;
        }
        this.a.i = true;
        if (aH()) {
            aJ();
        }
        createConfirmDeviceCredentialIntent.setFlags(134742016);
        az(createConfirmDeviceCredentialIntent, 1);
    }

    public final void o(int i, CharSequence charSequence) {
        p(i, charSequence);
        d();
    }

    public final void p(int i, CharSequence charSequence) {
        pq pqVar = this.a;
        if (pqVar.i) {
            return;
        }
        if (!pqVar.h) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
        } else {
            pqVar.h = false;
            new pl(2, (char[]) null).execute(new mr(this, i, charSequence, 4, null));
        }
    }

    public final void q(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = R(R.string.default_error_msg);
        }
        this.a.l(2);
        this.a.k(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        bvw bvwVar;
        px b;
        vr vrVar;
        pv a;
        Object obj;
        FingerprintManager d;
        pq pqVar = this.a;
        if (pqVar.g) {
            return;
        }
        if (x() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        pqVar.g = true;
        pqVar.h = true;
        Context x = x();
        if (x != null) {
            if (!x.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                if (Build.VERSION.SDK_INT == 29) {
                    pq pqVar2 = this.a;
                    int i = pqVar2.n;
                    if (pj.f(i) && pj.c(i)) {
                        pqVar2.l = true;
                    }
                }
            }
            n();
            return;
        }
        FingerprintManager.CryptoObject cryptoObject = null;
        if (!aH()) {
            BiometricPrompt.Builder a2 = pi.a(y().getApplicationContext());
            CharSequence g = this.a.g();
            CharSequence f = this.a.f();
            CharSequence d2 = this.a.d();
            if (g != null) {
                pi.h(a2, g);
            }
            if (f != null) {
                pi.g(a2, f);
            }
            if (d2 != null) {
                pi.e(a2, d2);
            }
            CharSequence e = this.a.e();
            if (!TextUtils.isEmpty(e)) {
                pl plVar = new pl(2, (char[]) null);
                pq pqVar3 = this.a;
                if (pqVar3.c == null) {
                    pqVar3.c = new pp(pqVar3, 0);
                }
                pi.f(a2, e, plVar, pqVar3.c);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                pe peVar = this.a.a;
                pj.a(a2, peVar == null || peVar.d);
            }
            int i2 = this.a.n;
            if (Build.VERSION.SDK_INT >= 30) {
                pk.a(a2, i2);
            } else if (Build.VERSION.SDK_INT >= 29) {
                pj.b(a2, pj.c(i2));
            }
            if (Build.VERSION.SDK_INT >= 35) {
                pe peVar2 = this.a.a;
                new pl(2, (char[]) null);
                pq pqVar4 = this.a;
                if (pqVar4.d == null) {
                    pqVar4.d = new pp(pqVar4, 1, null);
                }
                DialogInterface.OnClickListener onClickListener = pqVar4.d;
            }
            BiometricPrompt b2 = pi.b(a2);
            Context x2 = x();
            BiometricPrompt.CryptoObject f2 = ow.f(this.a.b);
            px b3 = this.a.b();
            if (b3.a == null) {
                pk pkVar = b3.c;
                b3.a = new CancellationSignal();
            }
            CancellationSignal cancellationSignal = b3.a;
            pl plVar2 = new pl(0);
            pv a3 = this.a.a();
            if (a3.a == null) {
                a3.a = new pu(a3.b);
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback = a3.a;
            try {
                if (f2 == null) {
                    pi.c(b2, cancellationSignal, plVar2, biometricPrompt$AuthenticationCallback);
                    return;
                } else {
                    pi.d(b2, f2, cancellationSignal, plVar2, biometricPrompt$AuthenticationCallback);
                    return;
                }
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
                o(1, x2 != null ? x2.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = y().getApplicationContext();
        xi xiVar = new xi(applicationContext);
        int i3 = !xiVar.b() ? 12 : !xiVar.a() ? 11 : 0;
        if (i3 != 0) {
            o(i3, ox.d(applicationContext, i3));
            return;
        }
        if (!ao()) {
            return;
        }
        this.a.u = true;
        if (!ox.g(applicationContext, Build.MODEL)) {
            this.b.postDelayed(new nc(this, 5), 500L);
            boolean aK = aK();
            ps psVar = new ps();
            Bundle bundle = new Bundle();
            bundle.putBoolean("host_activity", aK);
            psVar.ah(bundle);
            psVar.o(G(), "androidx.biometric.internal.FingerprintDialogFragment");
        }
        pq pqVar5 = this.a;
        pqVar5.f = 0;
        pc pcVar = pqVar5.b;
        if (pcVar != null) {
            Cipher cipher = pcVar.b;
            if (cipher != null) {
                bvwVar = new bvw(cipher);
            } else {
                Signature signature = pcVar.a;
                if (signature != null) {
                    bvwVar = new bvw(signature);
                } else {
                    Mac mac = pcVar.c;
                    if (mac != null) {
                        bvwVar = new bvw(mac);
                    } else if (Build.VERSION.SDK_INT >= 30 && pcVar.e != null) {
                        Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                    } else if (Build.VERSION.SDK_INT >= 33 && pcVar.f != null) {
                        Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                    } else if (Build.VERSION.SDK_INT >= 36 && ow.h() >= 3600001 && pcVar.d != null) {
                        Log.e("CryptoObjectUtils", "Key agreement is not supported by FingerprintManager.");
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        Log.e("CryptoObjectUtils", "Operation handle is not supported by FingerprintManager.");
                    }
                }
            }
            b = this.a.b();
            if (b.b == null) {
                pk pkVar2 = b.c;
                b.b = new vr();
            }
            vrVar = b.b;
            a = this.a.a();
            if (a.c == null) {
                a.c = new kee(a);
            }
            kee keeVar = a.c;
            if (vrVar == null) {
                try {
                    synchronized (vrVar) {
                        if (vrVar.b == null) {
                            vrVar.b = new CancellationSignal();
                            if (vrVar.a) {
                                ((CancellationSignal) vrVar.b).cancel();
                            }
                        }
                        obj = vrVar.b;
                    }
                } catch (NullPointerException e3) {
                    Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e3);
                    o(1, ox.d(applicationContext, 1));
                    return;
                }
            } else {
                obj = null;
            }
            d = oy.d((Context) xiVar.a);
            if (d == null) {
                if (bvwVar != null) {
                    Object obj2 = bvwVar.b;
                    if (obj2 != null) {
                        cryptoObject = new FingerprintManager.CryptoObject((Cipher) obj2);
                    } else {
                        Object obj3 = bvwVar.a;
                        if (obj3 != null) {
                            cryptoObject = new FingerprintManager.CryptoObject((Signature) obj3);
                        } else {
                            Object obj4 = bvwVar.c;
                            if (obj4 != null) {
                                cryptoObject = new FingerprintManager.CryptoObject((Mac) obj4);
                            }
                        }
                    }
                }
                d.authenticate(cryptoObject, (CancellationSignal) obj, 0, new pt(keeVar), null);
                return;
            }
            return;
        }
        bvwVar = null;
        b = this.a.b();
        if (b.b == null) {
        }
        vrVar = b.b;
        a = this.a.a();
        if (a.c == null) {
        }
        kee keeVar2 = a.c;
        if (vrVar == null) {
        }
        d = oy.d((Context) xiVar.a);
        if (d == null) {
        }
    }
}
