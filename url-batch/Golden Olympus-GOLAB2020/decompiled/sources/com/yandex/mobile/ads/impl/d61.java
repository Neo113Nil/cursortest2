package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d61 implements qc1<n61> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bq1<n61> f24461a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pi2<n61> f24462b;

    public /* synthetic */ d61(bq1 bq1Var) {
        this(bq1Var, new o61(bq1Var));
    }

    @Override // com.yandex.mobile.ads.impl.qc1
    @NotNull
    public final mi2 a(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return kc1.a(adConfiguration, this.f24462b);
    }

    public d61(@NotNull bq1<n61> requestPolicy, @NotNull pi2<n61> responseBodyParser) {
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        this.f24461a = requestPolicy;
        this.f24462b = responseBodyParser;
    }
}
