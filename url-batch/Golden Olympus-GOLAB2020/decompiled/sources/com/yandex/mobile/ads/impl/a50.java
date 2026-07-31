package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a50 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a50 f23162c = new a50(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23163a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23164b;

    public a50(int i4, @NotNull String publicKey) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        this.f23163a = publicKey;
        this.f23164b = i4;
    }

    @NotNull
    public final String b() {
        return this.f23163a;
    }

    public final int c() {
        return this.f23164b;
    }

    @NotNull
    public final String d() {
        return this.f23163a;
    }

    public final int e() {
        return this.f23164b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj;
        return Intrinsics.areEqual(this.f23163a, a50Var.f23163a) && this.f23164b == a50Var.f23164b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23164b) + (this.f23163a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "EncryptionParameters(publicKey=" + this.f23163a + ", version=" + this.f23164b + ")";
    }
}
