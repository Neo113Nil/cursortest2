package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2503b implements Z8 {

    /* renamed from: a, reason: collision with root package name */
    public final AESEncrypter f38688a;

    public C2503b() {
        this(new C2476a(Ia.j().f()));
    }

    @Override // io.appmetrica.analytics.impl.Z8
    @NonNull
    public final S8 a(@NonNull C2773l6 c2773l6) {
        byte[] encrypt;
        String encodeToString;
        String value = c2773l6.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.f38688a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                c2773l6.setValue(encodeToString);
                return new S8(c2773l6, EnumC2513b9.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        c2773l6.setValue(encodeToString);
        return new S8(c2773l6, EnumC2513b9.AES_VALUE_ENCRYPTION);
    }

    public C2503b(C2476a c2476a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c2476a.b(), c2476a.a()));
    }

    public C2503b(AESEncrypter aESEncrypter) {
        this.f38688a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.Z8
    @NonNull
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.f38688a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    @NonNull
    public final EnumC2513b9 a() {
        return EnumC2513b9.AES_VALUE_ENCRYPTION;
    }
}
