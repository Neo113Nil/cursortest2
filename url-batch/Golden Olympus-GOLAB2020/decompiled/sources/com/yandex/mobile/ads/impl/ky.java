package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ky implements InterfaceC2283v<jy> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ny f28351a;

    public ky(@NotNull ny deeplinkRenderer) {
        Intrinsics.checkNotNullParameter(deeplinkRenderer, "deeplinkRenderer");
        this.f28351a = deeplinkRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2283v
    public final ve0 a(View view, jy jyVar) {
        jy action = jyVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        Context context = view.getContext();
        ny nyVar = this.f28351a;
        Intrinsics.checkNotNull(context);
        nyVar.a(context, action);
        return new ve0(true);
    }
}
