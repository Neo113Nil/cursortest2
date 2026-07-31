package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gd2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26113a;

    public gd2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f26113a = applicationContext;
    }

    @NotNull
    public final Map a(@NotNull LinkedHashMap rawEvents, @Nullable oh2 oh2Var) {
        Intrinsics.checkNotNullParameter(rawEvents, "rawEvents");
        int i4 = ew1.f25476l;
        du1 a4 = ew1.a.a().a(this.f26113a);
        if (a4 != null && a4.l0()) {
            return rawEvents;
        }
        Map mutableMap = MapsKt.toMutableMap(rawEvents);
        List<String> a5 = oh2Var != null ? oh2Var.a() : null;
        List list = (List) mutableMap.get(com.ironsource.c9.f15701e);
        if (a5 != null) {
            mutableMap.put(com.ironsource.c9.f15701e, a5);
        } else {
            mutableMap.remove(com.ironsource.c9.f15701e);
        }
        if (list != null) {
            mutableMap.put("render_impression", list);
            return mutableMap;
        }
        mutableMap.remove("render_impression");
        return mutableMap;
    }
}
