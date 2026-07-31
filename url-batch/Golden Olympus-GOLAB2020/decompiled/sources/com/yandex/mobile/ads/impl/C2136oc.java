package com.yandex.mobile.ads.impl;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.oc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2136oc {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29971a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final byte[] f29972b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final byte[] f29973c;

    public C2136oc(@NotNull String algorithm, @NotNull byte[] password, @NotNull byte[] iV) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(iV, "iV");
        this.f29971a = algorithm;
        this.f29972b = password;
        this.f29973c = iV;
    }

    @NotNull
    public final byte[] a(@NotNull byte[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f29972b, "AES");
        Cipher cipher = Cipher.getInstance(this.f29971a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f29973c));
        byte[] doFinal = cipher.doFinal(input);
        Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return doFinal;
    }
}
