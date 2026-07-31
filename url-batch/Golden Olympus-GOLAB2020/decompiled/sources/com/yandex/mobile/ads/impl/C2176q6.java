package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.AdQualityVerifierAdapter;
import com.yandex.mobile.ads.impl.do1;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.q6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2176q6 {
    @Nullable
    public static AdQualityVerifierAdapter a() {
        Object m243constructorimpl;
        Intrinsics.checkNotNullParameter("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", "adapterName");
        try {
            Result.Companion companion = Result.Companion;
            Object a4 = do1.a.a("com.yandex.mobile.ads.quality.AdQualityVerifierAdapter", new Object[0]);
            m243constructorimpl = Result.m243constructorimpl(a4 instanceof AdQualityVerifierAdapter ? (AdQualityVerifierAdapter) a4 : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        Throwable d4 = Result.d(m243constructorimpl);
        if (d4 != null) {
            d4.getMessage();
            ap0.b(new Object[0]);
        }
        return (AdQualityVerifierAdapter) (Result.m244isFailureimpl(m243constructorimpl) ? null : m243constructorimpl);
    }
}
