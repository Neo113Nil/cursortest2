package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pu extends BiometricPrompt$AuthenticationCallback {
    final /* synthetic */ pi a;

    public pu(pi piVar) {
        this.a = piVar;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.i(i, charSequence);
    }

    public final void onAuthenticationFailed() {
        this.a.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r3 = r2.getIdentityCredential();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        r3 = r2.getPresentationSession();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        r3 = r2.getKeyAgreement();
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r2 = r7.getCryptoObject();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        Cipher cipher;
        Signature signature;
        Mac mac;
        long operationHandle;
        KeyAgreement keyAgreement;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        pc pcVar = null;
        if (authenticationResult != null && cryptoObject != null) {
            cipher = cryptoObject.getCipher();
            if (cipher != null) {
                pcVar = new pc(cipher);
            } else {
                signature = cryptoObject.getSignature();
                if (signature != null) {
                    pcVar = new pc(signature);
                } else {
                    mac = cryptoObject.getMac();
                    if (mac != null) {
                        pcVar = new pc(mac);
                    } else if (Build.VERSION.SDK_INT >= 30 && identityCredential != null) {
                        pcVar = new pc(identityCredential);
                    } else if (Build.VERSION.SDK_INT >= 33 && presentationSession != null) {
                        pcVar = new pc(presentationSession);
                    } else if (Build.VERSION.SDK_INT >= 36 && ow.h() >= 3600001 && keyAgreement != null) {
                        pcVar = new pc(keyAgreement);
                    } else if (Build.VERSION.SDK_INT >= 35) {
                        operationHandle = cryptoObject.getOperationHandle();
                        if (operationHandle != 0) {
                            pcVar = new pc(operationHandle);
                        }
                    }
                }
            }
        }
        int i = -1;
        if (Build.VERSION.SDK_INT >= 30) {
            if (authenticationResult != null) {
                i = authenticationResult.getAuthenticationType();
            }
        } else if (Build.VERSION.SDK_INT != 29) {
            i = 2;
        }
        this.a.q(new bsh(pcVar, i));
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
    }
}
