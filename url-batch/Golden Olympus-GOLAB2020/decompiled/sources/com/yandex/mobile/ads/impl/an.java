package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class an {
    @NotNull
    public static mq a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new mq(CollectionsKt.listOf((Object[]) new InterfaceC2183qd[]{new C1809ai(), new d42(context.getResources().getColor(R.color.monetization_ads_internal_text_color_white))}));
    }
}
