package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class A extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f37144a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(r rVar) {
        super(1);
        this.f37144a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f37144a.f39688g = (byte[]) obj;
        return Unit.f41027a;
    }
}
