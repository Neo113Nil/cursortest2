package g0;

import Y.A;
import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433a implements Y.h {

    /* renamed from: a, reason: collision with root package name */
    public final Y.h f8819a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8820b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8821c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f8822d;

    public C0433a(Y.h hVar, byte[] bArr, byte[] bArr2) {
        this.f8819a = hVar;
        this.f8820b = bArr;
        this.f8821c = bArr2;
    }

    @Override // Y.h
    public final Uri B() {
        return this.f8819a.B();
    }

    @Override // Y.h
    public final long b(Y.k kVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f8820b, "AES"), new IvParameterSpec(this.f8821c));
                Y.j jVar = new Y.j(this.f8819a, kVar);
                this.f8822d = new CipherInputStream(jVar, cipher);
                if (jVar.f3698d) {
                    return -1L;
                }
                jVar.f3695a.b(jVar.f3696b);
                jVar.f3698d = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e4) {
                throw new RuntimeException(e4);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // Y.h
    public final void close() {
        if (this.f8822d != null) {
            this.f8822d = null;
            this.f8819a.close();
        }
    }

    @Override // T.InterfaceC0090h
    public final int read(byte[] bArr, int i4, int i5) {
        this.f8822d.getClass();
        int read = this.f8822d.read(bArr, i4, i5);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    @Override // Y.h
    public final Map t() {
        return this.f8819a.t();
    }

    @Override // Y.h
    public final void y(A a3) {
        a3.getClass();
        this.f8819a.y(a3);
    }
}
