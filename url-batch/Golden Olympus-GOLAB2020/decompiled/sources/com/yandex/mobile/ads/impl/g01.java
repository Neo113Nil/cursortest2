package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g01 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f25959a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1937g2 f25960b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rl0 f25961c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final gm0 f25962d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final km0 f25963e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final tn0 f25964f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f25965g;

    public g01(@NotNull Context context, @NotNull C1937g2 adBreakStatusController, @NotNull rl0 instreamAdPlayerController, @NotNull gm0 instreamAdUiElementsManager, @NotNull km0 instreamAdViewsHolderManager, @NotNull tn0 adCreativePlaybackEventListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreakStatusController, "adBreakStatusController");
        Intrinsics.checkNotNullParameter(instreamAdPlayerController, "instreamAdPlayerController");
        Intrinsics.checkNotNullParameter(instreamAdUiElementsManager, "instreamAdUiElementsManager");
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        Intrinsics.checkNotNullParameter(adCreativePlaybackEventListener, "adCreativePlaybackEventListener");
        this.f25959a = context;
        this.f25960b = adBreakStatusController;
        this.f25961c = instreamAdPlayerController;
        this.f25962d = instreamAdUiElementsManager;
        this.f25963e = instreamAdViewsHolderManager;
        this.f25964f = adCreativePlaybackEventListener;
        this.f25965g = new LinkedHashMap();
    }

    @NotNull
    public final C1817b2 a(@NotNull ss adBreak) {
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        LinkedHashMap linkedHashMap = this.f25965g;
        Object obj = linkedHashMap.get(adBreak);
        if (obj == null) {
            Context applicationContext = this.f25959a.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            C1817b2 c1817b2 = new C1817b2(applicationContext, adBreak, this.f25961c, this.f25962d, this.f25963e, this.f25960b);
            c1817b2.a(this.f25964f);
            linkedHashMap.put(adBreak, c1817b2);
            obj = c1817b2;
        }
        return (C1817b2) obj;
    }
}
