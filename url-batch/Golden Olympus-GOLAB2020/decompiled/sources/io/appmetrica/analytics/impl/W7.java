package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class W7 implements AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C2781le f38458a = new C2781le();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f38458a;
    }
}
