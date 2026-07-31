package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l02 implements InterfaceC2283v<k02> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wx1 f28380a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final t02 f28381b;

    public l02(@NotNull wx1 showSocialActionsReporter, @NotNull t02 socialActionRenderer) {
        Intrinsics.checkNotNullParameter(showSocialActionsReporter, "showSocialActionsReporter");
        Intrinsics.checkNotNullParameter(socialActionRenderer, "socialActionRenderer");
        this.f28380a = showSocialActionsReporter;
        this.f28381b = socialActionRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2283v
    public final ve0 a(View view, k02 k02Var) {
        k02 action = k02Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f28380a.a(action.c());
        this.f28381b.a(view, action);
        return new ve0(false);
    }
}
