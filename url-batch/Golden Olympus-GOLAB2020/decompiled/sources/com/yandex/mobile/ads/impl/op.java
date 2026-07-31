package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class op implements rp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Dialog f30129a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr f30130b;

    public op(@NotNull Dialog dialog, @NotNull mr contentCloseListener) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f30129a = dialog;
        this.f30130b = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void a() {
        c10.a(this.f30129a);
        this.f30130b.f();
    }

    @Override // com.yandex.mobile.ads.impl.rp
    public final void b() {
        c10.a(this.f30129a);
    }
}
