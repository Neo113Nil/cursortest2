package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525b implements L8 {

    /* renamed from: a, reason: collision with root package name */
    public final AESEncrypter f7901a;

    public C0525b() {
        this(new C0499a(C1027ua.k().g()));
    }

    @Override // io.appmetrica.analytics.impl.L8
    public final E8 a(W5 w5) {
        byte[] encrypt;
        String encodeToString;
        String value = w5.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.f7901a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                w5.setValue(encodeToString);
                return new E8(w5, N8.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        w5.setValue(encodeToString);
        return new E8(w5, N8.AES_VALUE_ENCRYPTION);
    }

    public C0525b(C0499a c0499a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0499a.b(), c0499a.a()));
    }

    public C0525b(AESEncrypter aESEncrypter) {
        this.f7901a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.L8
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            return this.f7901a.decrypt(Base64.decode(bArr, 0));
        } catch (Throwable unused) {
            return bArr2;
        }
    }

    public final N8 a() {
        return N8.AES_VALUE_ENCRYPTION;
    }
}
