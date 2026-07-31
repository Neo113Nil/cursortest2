package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bx0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.monetization.ads.mediation.base.a f23965a;

    public bx0(@NotNull com.monetization.ads.mediation.base.a mediatedAd) {
        Intrinsics.checkNotNullParameter(mediatedAd, "mediatedAd");
        this.f23965a = mediatedAd;
    }

    @Nullable
    public final MediatedAdObject a() {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(this.f23965a.getAdObject());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m244isFailureimpl(m243constructorimpl)) {
            m243constructorimpl = null;
        }
        return (MediatedAdObject) m243constructorimpl;
    }

    @NotNull
    public final MediatedAdapterInfo b() {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(this.f23965a.getAdapterInfo());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = new MediatedAdapterInfo.Builder().setAdapterVersion("null").setNetworkName("null").setNetworkSdkVersion("null").build();
        }
        return (MediatedAdapterInfo) m243constructorimpl;
    }

    public final boolean c() {
        Object m243constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(Boolean.valueOf(this.f23965a.getShouldTrackImpressionAutomatically()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m243constructorimpl = Result.m243constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.d(m243constructorimpl) != null) {
            m243constructorimpl = Boolean.TRUE;
        }
        return ((Boolean) m243constructorimpl).booleanValue();
    }
}
