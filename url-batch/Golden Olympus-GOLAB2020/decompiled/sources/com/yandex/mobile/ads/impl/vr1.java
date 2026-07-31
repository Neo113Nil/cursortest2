package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vr1 implements id0<ur1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f33730a;

    public vr1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33730a = context;
    }

    @Override // com.yandex.mobile.ads.impl.id0
    public final ur1 a(C2360y7 adResponse, C2286v2 adConfiguration, rc0<ur1> fullScreenController) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        Context context = this.f33730a;
        om1 om1Var = new om1();
        return new ur1(context, adResponse, adConfiguration, fullScreenController, om1Var, new hs1(om1Var), new yf0(), new kc0(), new rt1(adConfiguration));
    }
}
