package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class B extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f37196a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(r rVar) {
        super(1);
        this.f37196a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f37196a.f39691j = (byte[]) obj;
        return Unit.f41027a;
    }
}
