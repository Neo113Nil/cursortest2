package y1;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import n2.p0;

/* loaded from: classes.dex */
class a implements n2.l {

    /* renamed from: a, reason: collision with root package name */
    private final n2.l f23242a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f23243b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f23244c;

    /* renamed from: d, reason: collision with root package name */
    private CipherInputStream f23245d;

    public a(n2.l lVar, byte[] bArr, byte[] bArr2) {
        this.f23242a = lVar;
        this.f23243b = bArr;
        this.f23244c = bArr2;
    }

    @Override // n2.l
    public final long b(n2.p pVar) {
        try {
            Cipher q7 = q();
            try {
                q7.init(2, new SecretKeySpec(this.f23243b, "AES"), new IvParameterSpec(this.f23244c));
                n2.n nVar = new n2.n(this.f23242a, pVar);
                this.f23245d = new CipherInputStream(nVar, q7);
                nVar.f();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e7) {
                throw new RuntimeException(e7);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // n2.l
    public void close() {
        if (this.f23245d != null) {
            this.f23245d = null;
            this.f23242a.close();
        }
    }

    @Override // n2.l
    public final void d(p0 p0Var) {
        o2.a.e(p0Var);
        this.f23242a.d(p0Var);
    }

    @Override // n2.l
    public final Map<String, List<String>> g() {
        return this.f23242a.g();
    }

    @Override // n2.l
    public final Uri k() {
        return this.f23242a.k();
    }

    protected Cipher q() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // n2.i
    public final int read(byte[] bArr, int i7, int i8) {
        o2.a.e(this.f23245d);
        int read = this.f23245d.read(bArr, i7, i8);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
