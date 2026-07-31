package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
final class qy extends kotlin.jvm.internal.s implements Function0<Long> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ry f30932b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    qy(ry ryVar) {
        super(0);
        this.f30932b = ryVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TimeUnit timeUnit;
        timeUnit = this.f30932b.f31469a;
        return Long.valueOf(timeUnit.toMillis(ry.a(this.f30932b)));
    }
}
