package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;

/* loaded from: classes.dex */
public final class I7 implements AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0441de f6139a = new C0441de();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f6139a;
    }
}
