package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.View;
import com.ironsource.b9;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class k20 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Cdo f27987a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private eo f27988b;

    public k20(@NotNull Cdo mainClickConnector) {
        Intrinsics.checkNotNullParameter(mainClickConnector, "mainClickConnector");
        this.f27987a = mainClickConnector;
    }

    public final void a(@NotNull Uri uri, @NotNull View clickView) {
        Integer num;
        Map emptyMap;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter(b9.h.f15451L);
            if (queryParameter2 != null) {
                Intrinsics.checkNotNull(queryParameter2);
                num = StringsKt.toIntOrNull(queryParameter2);
            } else {
                num = null;
            }
            if (num == null) {
                this.f27987a.a(clickView, queryParameter);
                return;
            }
            eo eoVar = this.f27988b;
            if (eoVar == null || (emptyMap = eoVar.a()) == null) {
                emptyMap = MapsKt.emptyMap();
            }
            Cdo cdo = (Cdo) emptyMap.get(num);
            if (cdo != null) {
                cdo.a(clickView, queryParameter);
            }
        }
    }

    public final void a(@Nullable eo eoVar) {
        this.f27988b = eoVar;
    }
}
