package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.w92;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f24662a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ub2 f24663b;

    public dl0(@NotNull vu1 sdkEnvironmentModule, @NotNull ub2 videoAdLoader) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(videoAdLoader, "videoAdLoader");
        this.f24662a = sdkEnvironmentModule;
        this.f24663b = videoAdLoader;
    }

    public final void a(@NotNull Context context, @NotNull C2308w1 adBreak, @NotNull xp1 requestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        vu1 vu1Var = this.f24662a;
        t92 t92Var = new t92(context, vu1Var, adBreak, requestListener, new pn0(context, vu1Var));
        w92 w92Var = new w92(new w92.a(adBreak).c(), 0);
        this.f24663b.a(w92Var, new nn0(w92Var), t92Var);
    }
}
