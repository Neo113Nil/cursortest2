package defpackage;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hyj implements hwg {
    private static final String a = "hyj";
    private final hwg b;

    public hyj() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.b = new hyi(keyStore);
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }

    private static void c() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.hwg
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return this.b.a(bArr, bArr2);
        } catch (GeneralSecurityException e) {
            e = e;
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.a(bArr, bArr2);
        } catch (ProviderException e2) {
            e = e2;
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.a(bArr, bArr2);
        } catch (BadPaddingException e3) {
            throw e3;
        }
    }

    @Override // defpackage.hwg
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return this.b.b(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.b.b(bArr, bArr2);
        }
    }
}
