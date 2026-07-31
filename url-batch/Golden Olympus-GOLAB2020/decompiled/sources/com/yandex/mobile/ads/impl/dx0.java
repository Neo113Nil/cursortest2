package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dx0 implements f51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f24989a;

    public interface a {
        void a(@NotNull e51 e51Var);
    }

    public dx0(@NotNull a createEventControllerListener) {
        Intrinsics.checkNotNullParameter(createEventControllerListener, "createEventControllerListener");
        this.f24989a = createEventControllerListener;
    }

    @Override // com.yandex.mobile.ads.impl.f51
    @NotNull
    public final e51 a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        e51 e51Var = new e51(context, adConfiguration, adResponse);
        this.f24989a.a(e51Var);
        return e51Var;
    }
}
