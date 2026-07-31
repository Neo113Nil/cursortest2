package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wf0 implements qc1<String> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pi2<String> f34028a;

    public /* synthetic */ wf0() {
        this(new zf0());
    }

    @Override // com.yandex.mobile.ads.impl.qc1
    @NotNull
    public final mi2 a(@NotNull Context context, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return kc1.a(adConfiguration, this.f34028a);
    }

    public wf0(@NotNull pi2<String> responseBodyParser) {
        Intrinsics.checkNotNullParameter(responseBodyParser, "responseBodyParser");
        this.f34028a = responseBodyParser;
    }
}
