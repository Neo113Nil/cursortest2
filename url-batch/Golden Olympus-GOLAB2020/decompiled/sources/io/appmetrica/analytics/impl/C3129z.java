package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3129z extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f40293a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3129z(r rVar) {
        super(1);
        this.f40293a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f40293a.f39687f = (byte[]) obj;
        return Unit.f41027a;
    }
}
