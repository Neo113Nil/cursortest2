package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.util.Base64;
import f2.AbstractC2420c;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j01 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f27432a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27433b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j01(int i4, @NotNull String publicKey) {
        this(i4, publicKey, 0);
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
    }

    @SuppressLint({"TrulyRandom"})
    @Nullable
    public final byte[] a(@NotNull byte[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            byte[] decode = Base64.decode(this.f27432a, 0);
            if (decode == null) {
                return null;
            }
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[16];
            secureRandom.nextBytes(bArr2);
            secureRandom.nextBytes(bArr);
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
            Intrinsics.checkNotNull(generatePublic);
            return a(input, bArr2, bArr, generatePublic);
        } catch (Throwable th) {
            ap0.b(th);
            return null;
        }
    }

    private j01(int i4, String str, int i5) {
        this.f27432a = str;
        this.f27433b = i4;
    }

    private final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                AbstractC2420c.a(byteArrayOutputStream, null);
                Cipher cipher = Cipher.getInstance(com.ironsource.hk.f16599b);
                C2136oc c2136oc = new C2136oc(AESEncrypter.DEFAULT_ALGORITHM, bArr2, bArr3);
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.f27433b).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    byteArrayOutputStream.write(c2136oc.a(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    AbstractC2420c.a(byteArrayOutputStream, null);
                    return byteArray2;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            ap0.b(th);
            return null;
        }
    }
}
