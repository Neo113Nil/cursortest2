package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import com.ironsource.mediationsdk.IronSourceSegment;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.sh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2232sh {
    @NotNull
    public static Set a(@NotNull ct nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Set b4 = kotlin.collections.T.b();
        if (nativeAdAssets.a() != null) {
            b4.add(IronSourceSegment.AGE);
        }
        if (nativeAdAssets.b() != null) {
            b4.add(b9.h.f15438E0);
        }
        if (nativeAdAssets.c() != null) {
            b4.add("call_to_action");
        }
        if (nativeAdAssets.d() != null) {
            b4.add(b9.i.f15522D);
        }
        if (nativeAdAssets.e() != null) {
            b4.add("favicon");
        }
        if (nativeAdAssets.g() != null) {
            b4.add(b9.h.f15444H0);
        }
        if (nativeAdAssets.h() != null) {
            b4.add(b9.h.f15446I0);
        }
        if (nativeAdAssets.i() != null) {
            b4.add(b9.h.f15446I0);
        }
        if (nativeAdAssets.j() != null) {
            b4.add("price");
        }
        if (nativeAdAssets.k() != null) {
            b4.add("rating");
        }
        if (nativeAdAssets.l() != null) {
            b4.add("review_count");
        }
        if (nativeAdAssets.m() != null) {
            b4.add("sponsored");
        }
        if (nativeAdAssets.n() != null) {
            b4.add(b9.h.f15436D0);
        }
        if (nativeAdAssets.o() != null) {
            b4.add("warning");
        }
        if (nativeAdAssets.f()) {
            b4.add("feedback");
        }
        return kotlin.collections.T.a(b4);
    }
}
