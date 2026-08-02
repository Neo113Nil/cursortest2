package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.j implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UtilityServiceProvider f9721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f9721a = utilityServiceProvider;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f9721a);
    }
}
