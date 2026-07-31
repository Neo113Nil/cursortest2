package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class pn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f30500a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final el0 f30501b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f30502c;

    public /* synthetic */ pn0(Context context, vu1 vu1Var) {
        this(context, vu1Var, new el0());
    }

    @Nullable
    public final ss a(@NotNull C2308w1 adBreak, @NotNull List<bb2> videoAds) {
        ts a4;
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        String c4 = adBreak.c();
        if (c4 == null || (a4 = this.f30501b.a(adBreak.f())) == null) {
            return null;
        }
        long a5 = ci0.a();
        un0 un0Var = new un0(adBreak, a4, a5, new gz1(), new e10(adBreak), new nb2(), new ml0());
        Context context = this.f30502c;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ArrayList a6 = new sb2(context, un0Var).a(videoAds);
        if (a6.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a6, 10));
        int size = a6.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = a6.get(i4);
            i4++;
            arrayList.add((on0) ((ob2) obj).d());
        }
        return new ss(this.f30500a, a6, arrayList, c4, adBreak, a4, a5);
    }

    public pn0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull el0 adBreakPositionParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adBreakPositionParser, "adBreakPositionParser");
        this.f30500a = sdkEnvironmentModule;
        this.f30501b = adBreakPositionParser;
        this.f30502c = context.getApplicationContext();
    }
}
