package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements l2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UtilityServiceProvider f5467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(UtilityServiceProvider utilityServiceProvider) {
        super(0);
        this.f5467a = utilityServiceProvider;
    }

    @Override // l2.a
    public final Object invoke() {
        return new FirstExecutionConditionServiceImpl(this.f5467a);
    }
}
