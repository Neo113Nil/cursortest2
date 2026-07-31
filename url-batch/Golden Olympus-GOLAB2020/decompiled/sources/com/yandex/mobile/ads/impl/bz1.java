package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bz1 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23988a;

        static {
            int[] iArr = new int[lz1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i4 = lz1.f28813d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23988a = iArr;
        }
    }

    @NotNull
    public static az1 a(@Nullable C2243t5 c2243t5) {
        C2266u5 b4;
        lz1 c4 = (c2243t5 == null || (b4 = c2243t5.b()) == null) ? null : b4.c();
        int i4 = c4 == null ? -1 : a.f23988a[c4.ordinal()];
        if (i4 != -1) {
            if (i4 == 1) {
                return new yh2();
            }
            if (i4 != 2) {
                throw new W1.m();
            }
        }
        return new d00();
    }
}
