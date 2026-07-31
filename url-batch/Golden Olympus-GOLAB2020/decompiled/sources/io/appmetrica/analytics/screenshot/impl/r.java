package io.appmetrica.analytics.screenshot.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3174u f40779a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C3174u c3174u) {
        super(0);
        this.f40779a = c3174u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((C3175v) this.f40779a.f40783b).a("ContentObserverScreenshotCaptor");
        return Unit.f41027a;
    }
}
