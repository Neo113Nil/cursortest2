package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ux0 extends vx0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux0(@NotNull C2286v2 adConfiguration) {
        super(adConfiguration);
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
    }

    @Override // com.yandex.mobile.ads.impl.vx0, com.yandex.mobile.ads.impl.u70
    @NotNull
    public final Map<String, Object> a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Map<String, Object> mutableMap = MapsKt.toMutableMap(super.a(context));
        vy1 q4 = a().q();
        if (q4 != null) {
            mutableMap.put("width", Integer.valueOf(q4.c(context)));
            mutableMap.put("height", Integer.valueOf(q4.a(context)));
        }
        return mutableMap;
    }
}
