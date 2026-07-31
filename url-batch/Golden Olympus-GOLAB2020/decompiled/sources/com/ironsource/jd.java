package com.ironsource;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class jd implements InterfaceC1487j0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f16842a;

    public jd(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f16842a = activity;
    }

    @Override // com.ironsource.InterfaceC1487j0
    public void a(@NotNull hd fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.f16842a);
    }
}
