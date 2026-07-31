package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fa0 implements InterfaceC2283v<ea0> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final oa0 f25725a;

    public fa0(@NotNull oa0 feedbackRenderer) {
        Intrinsics.checkNotNullParameter(feedbackRenderer, "feedbackRenderer");
        this.f25725a = feedbackRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2283v
    public final ve0 a(View view, ea0 ea0Var) {
        ea0 action = ea0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        Context context = view.getContext();
        oa0 oa0Var = this.f25725a;
        Intrinsics.checkNotNull(context);
        oa0Var.a(context, action);
        return new ve0(false);
    }
}
