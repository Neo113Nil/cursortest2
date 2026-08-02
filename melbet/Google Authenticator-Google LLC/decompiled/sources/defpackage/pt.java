package defpackage;

import android.hardware.fingerprint.FingerprintManager;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pt extends FingerprintManager.AuthenticationCallback {
    final /* synthetic */ kee a;

    public pt(kee keeVar) {
        this.a = keeVar;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        ((pv) this.a.a).b.i(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        ((pv) this.a.a).b.j();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        WeakReference weakReference = ((po) ((pv) this.a.a).b).a;
        if (weakReference.get() != null) {
            pq pqVar = (pq) weakReference.get();
            if (pqVar.q == null) {
                pqVar.q = new afc();
            }
            pq.p(pqVar.q, charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003b  */
    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        bvw bvwVar;
        FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
        pc pcVar = null;
        if (cryptoObject != null) {
            if (cryptoObject.getCipher() != null) {
                bvwVar = new bvw(cryptoObject.getCipher());
            } else if (cryptoObject.getSignature() != null) {
                bvwVar = new bvw(cryptoObject.getSignature());
            } else if (cryptoObject.getMac() != null) {
                bvwVar = new bvw(cryptoObject.getMac());
            }
            if (bvwVar != null) {
                Object obj = bvwVar.b;
                if (obj != null) {
                    pcVar = new pc((Cipher) obj);
                } else {
                    Object obj2 = bvwVar.a;
                    if (obj2 != null) {
                        pcVar = new pc((Signature) obj2);
                    } else {
                        Object obj3 = bvwVar.c;
                        if (obj3 != null) {
                            pcVar = new pc((Mac) obj3);
                        }
                    }
                }
            }
            ((pv) this.a.a).b.q(new bsh(pcVar, 2));
        }
        bvwVar = null;
        if (bvwVar != null) {
        }
        ((pv) this.a.a).b.q(new bsh(pcVar, 2));
    }
}
