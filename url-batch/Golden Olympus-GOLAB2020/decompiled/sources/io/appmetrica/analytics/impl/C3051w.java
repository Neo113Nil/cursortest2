package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3051w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f39994a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3051w(r rVar) {
        super(1);
        this.f39994a = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f39994a.f39686e = (byte[]) obj;
        return Unit.f41027a;
    }
}
