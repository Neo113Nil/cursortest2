package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class r extends kotlin.jvm.internal.s implements Function0<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f43755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable th) {
        super(0);
        this.f43755a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Http request was failed with: " + this.f43755a;
    }
}
