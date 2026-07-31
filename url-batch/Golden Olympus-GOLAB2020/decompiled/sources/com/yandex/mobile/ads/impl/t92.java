package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t92 implements xp1<List<? extends bb2>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2308w1 f32257a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xp1<ss> f32258b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final pn0 f32259c;

    public t92(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2308w1 adBreak, @NotNull xp1<ss> instreamAdBreakRequestListener, @NotNull pn0 instreamVideoAdBreakCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(instreamAdBreakRequestListener, "instreamAdBreakRequestListener");
        Intrinsics.checkNotNullParameter(instreamVideoAdBreakCreator, "instreamVideoAdBreakCreator");
        this.f32257a = adBreak;
        this.f32258b = instreamAdBreakRequestListener;
        this.f32259c = instreamVideoAdBreakCreator;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(@NotNull hb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f32258b.a(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(List<? extends bb2> list) {
        List<? extends bb2> result = list;
        Intrinsics.checkNotNullParameter(result, "result");
        ss a4 = this.f32259c.a(this.f32257a, result);
        if (a4 != null) {
            this.f32258b.a((xp1<ss>) a4);
            return;
        }
        Intrinsics.checkNotNullParameter("Failed to parse ad break", "description");
        this.f32258b.a(new hb2(1, "Failed to parse ad break"));
    }
}
