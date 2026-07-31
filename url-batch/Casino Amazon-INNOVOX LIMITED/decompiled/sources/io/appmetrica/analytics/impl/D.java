package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class D extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0489s f804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C0489s c0489s) {
        super(1);
        this.f804a = c0489s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f804a.c = (byte[]) obj;
        return Unit.INSTANCE;
    }
}
