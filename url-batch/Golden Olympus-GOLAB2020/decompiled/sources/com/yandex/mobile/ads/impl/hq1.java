package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdTheme;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hq1 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26890a;

        static {
            int[] iArr = new int[AdTheme.values().length];
            try {
                iArr[AdTheme.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdTheme.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26890a = iArr;
        }
    }

    @NotNull
    public static gq1 a(@NotNull AdTheme adTheme) {
        Intrinsics.checkNotNullParameter(adTheme, "adTheme");
        int i4 = a.f26890a[adTheme.ordinal()];
        if (i4 == 1) {
            return gq1.f26274d;
        }
        if (i4 == 2) {
            return gq1.f26273c;
        }
        throw new W1.m();
    }
}
