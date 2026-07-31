package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ox1 {

    /* renamed from: a, reason: collision with root package name */
    private int f30222a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f30223b = new int[10];

    public final int a(int i4) {
        return this.f30223b[i4];
    }

    public final int b() {
        if ((this.f30222a & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            return this.f30223b[7];
        }
        return 65535;
    }

    public final int c() {
        if ((this.f30222a & 16) != 0) {
            return this.f30223b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int d() {
        return Integer.bitCount(this.f30222a);
    }

    public final int a() {
        if ((this.f30222a & 2) != 0) {
            return this.f30223b[1];
        }
        return -1;
    }

    public final int b(int i4) {
        return (this.f30222a & 32) != 0 ? this.f30223b[5] : i4;
    }

    public final boolean c(int i4) {
        return ((1 << i4) & this.f30222a) != 0;
    }

    public final void a(@NotNull ox1 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i4 = 0; i4 < 10; i4++) {
            if (other.c(i4)) {
                a(i4, other.f30223b[i4]);
            }
        }
    }

    @NotNull
    public final void a(int i4, int i5) {
        if (i4 >= 0) {
            int[] iArr = this.f30223b;
            if (i4 >= iArr.length) {
                return;
            }
            this.f30222a = (1 << i4) | this.f30222a;
            iArr[i4] = i5;
        }
    }
}
