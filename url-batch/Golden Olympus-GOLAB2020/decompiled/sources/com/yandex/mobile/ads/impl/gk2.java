package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gk2 implements xp1<List<? extends bb2>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final xp1<List<bb2>> f26203a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final hk2 f26204b;

    public gk2(@NotNull Context context, @NotNull bb2 wrapperAd, @NotNull xp1<List<bb2>> requestListener, @NotNull hk2 wrapperAdResponseConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(wrapperAdResponseConfigurator, "wrapperAdResponseConfigurator");
        this.f26203a = requestListener;
        this.f26204b = wrapperAdResponseConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(@NotNull hb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f26203a.a(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(List<? extends bb2> list) {
        List<? extends bb2> response = list;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f26203a.a((xp1<List<bb2>>) this.f26204b.a(response));
    }
}
