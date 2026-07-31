package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1815b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2306w f23528a;

    public C1815b0(@NotNull C2286v2 adConfiguration, @NotNull C2360y7 adResponse, @NotNull po reporter, @NotNull f91 nativeOpenUrlHandlerCreator, @NotNull v61 nativeAdViewAdapter, @NotNull e51 nativeAdEventController, @NotNull C2306w actionHandlerProvider) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(actionHandlerProvider, "actionHandlerProvider");
        this.f23528a = actionHandlerProvider;
    }

    @NotNull
    public final ve0 a(@NotNull View view, @Nullable List<? extends InterfaceC2237t> list) {
        Intrinsics.checkNotNullParameter(view, "view");
        ve0 ve0Var = new ve0(list == null || list.isEmpty());
        if (list != null) {
            for (InterfaceC2237t interfaceC2237t : list) {
                C2306w c2306w = this.f23528a;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                InterfaceC2283v<? extends InterfaceC2237t> a4 = c2306w.a(context, interfaceC2237t);
                if (a4 == null) {
                    a4 = null;
                }
                if (a4 != null) {
                    ve0Var = new ve0(ve0Var.a() || a4.a(view, interfaceC2237t).a());
                }
            }
        }
        return ve0Var;
    }
}
