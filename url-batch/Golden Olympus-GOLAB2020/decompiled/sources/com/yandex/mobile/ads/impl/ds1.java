package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ds1 implements mr {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f24744a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qp f24745b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mr f24746c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24747d;

    public ds1(@NotNull Context context, @NotNull o20 closeVerificationDialogController, @NotNull mr contentCloseListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(closeVerificationDialogController, "closeVerificationDialogController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f24744a = context;
        this.f24745b = closeVerificationDialogController;
        this.f24746c = contentCloseListener;
    }

    public final void a() {
        this.f24747d = true;
        this.f24745b.a();
    }

    @Override // com.yandex.mobile.ads.impl.mr
    public final void f() {
        if (this.f24747d) {
            this.f24746c.f();
        } else {
            this.f24745b.a(this.f24744a);
        }
    }
}
