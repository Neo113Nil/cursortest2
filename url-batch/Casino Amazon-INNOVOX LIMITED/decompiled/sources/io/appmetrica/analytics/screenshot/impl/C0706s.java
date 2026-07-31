package io.appmetrica.analytics.screenshot.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0706s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0709v f1743a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0706s(C0709v c0709v) {
        super(0);
        this.f1743a = c0709v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((C0711x) this.f1743a.b).a("ContentObserverScreenshotCaptor");
        return Unit.INSTANCE;
    }
}
