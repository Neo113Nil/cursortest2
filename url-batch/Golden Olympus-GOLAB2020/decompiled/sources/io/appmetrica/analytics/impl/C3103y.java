package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3103y extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f40242a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3103y(r rVar) {
        super(1);
        this.f40242a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f40242a.f39690i = (byte[]) obj;
        return Unit.f41027a;
    }
}
