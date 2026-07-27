package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;

/* loaded from: classes.dex */
public final class I7 implements AskForPermissionStrategyModuleProvider {

    /* renamed from: a, reason: collision with root package name */
    public final C0592de f6938a = new C0592de();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f6938a;
    }
}
