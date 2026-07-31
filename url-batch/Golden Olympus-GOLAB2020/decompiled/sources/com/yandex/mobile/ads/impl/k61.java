package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k61 implements bq1<n61> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final br1<n61> f28079a;

    public /* synthetic */ k61(Context context, mp1 mp1Var) {
        this(context, mp1Var, new r61(context, mp1Var));
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final boolean a() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final n61 a(lc1 networkResponse) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        return this.f28079a.a(networkResponse);
    }

    public k61(@NotNull Context context, @NotNull mp1 reporter, @NotNull br1<n61> nativeAdResponseParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdResponseParser, "nativeAdResponseParser");
        this.f28079a = nativeAdResponseParser;
    }
}
