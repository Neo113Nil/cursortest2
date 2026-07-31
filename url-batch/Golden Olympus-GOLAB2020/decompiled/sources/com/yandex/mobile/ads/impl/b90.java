package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a90 f23632a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f23633b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final k10 f23634c;

    public b90(@NotNull a90 feedDivContextFactory, @NotNull mp1 reporter, @NotNull k10 div2ViewFactory) {
        Intrinsics.checkNotNullParameter(feedDivContextFactory, "feedDivContextFactory");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(div2ViewFactory, "div2ViewFactory");
        this.f23632a = feedDivContextFactory;
        this.f23633b = reporter;
        this.f23634c = div2ViewFactory;
    }

    @Nullable
    public final pk1 a(@NotNull q20 divKitDesign, @NotNull pz1 ad) {
        Intrinsics.checkNotNullParameter(divKitDesign, "divKitDesign");
        Intrinsics.checkNotNullParameter(ad, "ad");
        try {
            Cdo cdo = new Cdo();
            k20 k20Var = new k20(cdo);
            z80 div2Context = this.f23632a.a(k20Var);
            div2Context.a(divKitDesign.b(), ad);
            this.f23634c.getClass();
            Intrinsics.checkNotNullParameter(div2Context, "div2Context");
            Div2View div2View = new Div2View(div2Context, null, 0, 6, null);
            div2View.setData(divKitDesign.b(), divKitDesign.c());
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            div2View.measure(makeMeasureSpec, makeMeasureSpec);
            return new pk1(divKitDesign, div2View, cdo, k20Var);
        } catch (Throwable th) {
            ap0.b(new Object[0]);
            this.f23633b.reportError("Failed to preload feed view", th);
            return null;
        }
    }
}
