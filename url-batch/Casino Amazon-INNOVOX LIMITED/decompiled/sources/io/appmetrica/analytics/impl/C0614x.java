package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.impl.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0614x extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0489s f1555a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0614x(C0489s c0489s) {
        super(1);
        this.f1555a = c0489s;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f1555a.e = (byte[]) obj;
        return Unit.INSTANCE;
    }
}
