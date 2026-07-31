package com.yandex.mobile.ads.impl;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3314H;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class du implements InterfaceC3314H {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC3314H.b f24760b = InterfaceC3314H.f42006M2;

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC3314H.a.a(this, r4, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b bVar) {
        return (E) InterfaceC3314H.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.b getKey() {
        return this.f24760b;
    }

    @Override // o2.InterfaceC3314H
    public final void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        exception.getMessage();
        ap0.c(new Object[0]);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.b bVar) {
        return InterfaceC3314H.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return InterfaceC3314H.a.d(this, coroutineContext);
    }
}
