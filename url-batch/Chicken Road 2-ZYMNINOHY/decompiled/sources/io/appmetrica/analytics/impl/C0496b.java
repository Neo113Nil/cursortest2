package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496b implements G8 {

    /* renamed from: a, reason: collision with root package name */
    public final AESEncrypter f11446a;

    public C0496b() {
        this(new C0470a(C0817na.k().g()));
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final C1126z8 a(P5 p5) {
        byte[] encrypt;
        String encodeToString;
        String value = p5.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.f11446a.encrypt(value.getBytes(CharEncoding.UTF_8));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                p5.setValue(encodeToString);
                return new C1126z8(p5, I8.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        p5.setValue(encodeToString);
        return new C1126z8(p5, I8.AES_VALUE_ENCRYPTION);
    }

    public C0496b(C0470a c0470a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0470a.b(), c0470a.a()));
    }

    public C0496b(AESEncrypter aESEncrypter) {
        this.f11446a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.f11446a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    public final I8 a() {
        return I8.AES_VALUE_ENCRYPTION;
    }
}
