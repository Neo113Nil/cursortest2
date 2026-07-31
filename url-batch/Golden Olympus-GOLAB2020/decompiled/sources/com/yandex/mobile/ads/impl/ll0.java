package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ad2;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ll0 implements ad2.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rb2 f28638a;

    public ll0(@NotNull on0 videoAd, @NotNull rb2 infoDataProvider) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(infoDataProvider, "infoDataProvider");
        this.f28638a = infoDataProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ad2.b
    @NotNull
    public final jp1 a() {
        jp1 jp1Var = new jp1(new LinkedHashMap(), 2);
        jp1Var.b(this.f28638a.a(), "product_type");
        return jp1Var;
    }
}
