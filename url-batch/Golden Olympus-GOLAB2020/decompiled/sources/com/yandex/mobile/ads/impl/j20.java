package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import android.content.Context;
import androidx.lifecycle.InterfaceC1354u;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j20 implements q00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1165z4 f27437a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z10 f27438b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final DivConfiguration f27439c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f27440d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final InterfaceC1354u f27441e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final c30 f27442f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final w10 f27443g;

    public /* synthetic */ j20(C1165z4 c1165z4, z10 z10Var, DivConfiguration divConfiguration, mp1 mp1Var, InterfaceC1354u interfaceC1354u) {
        this(c1165z4, z10Var, divConfiguration, mp1Var, interfaceC1354u, new c30(), new w10());
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView container = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(container, "container");
        try {
            Context context = container.getContext();
            c30 c30Var = this.f27442f;
            Intrinsics.checkNotNull(context);
            DivConfiguration divConfiguration = this.f27439c;
            InterfaceC1354u interfaceC1354u = this.f27441e;
            c30Var.getClass();
            Div2View a4 = c30.a(context, divConfiguration, interfaceC1354u);
            container.addView(a4);
            this.f27443g.getClass();
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            a4.setData(this.f27437a, new DivDataTag(uuid));
            j10.a(a4).a(this.f27438b);
        } catch (Throwable th) {
            ap0.b(new Object[0]);
            this.f27440d.reportError("Failed to bind DivKit", th);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }

    public j20(@NotNull C1165z4 divData, @NotNull z10 divKitActionAdapter, @NotNull DivConfiguration divConfiguration, @NotNull mp1 reporter, @Nullable InterfaceC1354u interfaceC1354u, @NotNull c30 divViewCreator, @NotNull w10 divDataTagCreator) {
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(divKitActionAdapter, "divKitActionAdapter");
        Intrinsics.checkNotNullParameter(divConfiguration, "divConfiguration");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divViewCreator, "divViewCreator");
        Intrinsics.checkNotNullParameter(divDataTagCreator, "divDataTagCreator");
        this.f27437a = divData;
        this.f27438b = divKitActionAdapter;
        this.f27439c = divConfiguration;
        this.f27440d = reporter;
        this.f27441e = interfaceC1354u;
        this.f27442f = divViewCreator;
        this.f27443g = divDataTagCreator;
    }
}
