package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class fs1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f25916a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1912f1 f25917b;

    /* renamed from: c, reason: collision with root package name */
    private final int f25918c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x20 f25919d;

    public /* synthetic */ fs1(C2286v2 c2286v2, InterfaceC1912f1 interfaceC1912f1, int i4) {
        this(c2286v2, interfaceC1912f1, i4, new x20());
    }

    private static nq a(C2360y7 c2360y7, f61 f61Var, C1792a1 c1792a1, InterfaceC2194r2 interfaceC2194r2, ds1 ds1Var, t42 t42Var, q20 q20Var, C2243t5 c2243t5) {
        d52 d52Var = new d52();
        s41 s41Var = new s41();
        a91 b4 = f61Var.b();
        return new nq(new es1(c2360y7, c1792a1, ds1Var, s41Var, b4, t42Var, q20Var, new jp()), new nr(c2360y7, c1792a1, interfaceC2194r2, b4, t42Var, q20Var), new ls1(c1792a1, d52Var, b4, t42Var), new kz1(c2243t5, c1792a1, s41Var, bz1.a(c2243t5)));
    }

    public fs1(@NotNull C2286v2 adConfiguration, @NotNull InterfaceC1912f1 adActivityListener, int i4, @NotNull x20 divKitIntegrationValidator) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        Intrinsics.checkNotNullParameter(divKitIntegrationValidator, "divKitIntegrationValidator");
        this.f25916a = adConfiguration;
        this.f25917b = adActivityListener;
        this.f25918c = i4;
        this.f25919d = divKitIntegrationValidator;
    }

    @Nullable
    public final u20 a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull f61 nativeAdPrivate, @NotNull C1792a1 adActivityEventController, @NotNull InterfaceC2194r2 adCompleteListener, @NotNull ds1 closeVerificationController, @NotNull t42 timeProviderContainer, @NotNull a20 divKitActionHandlerDelegate, @Nullable q20 q20Var, @Nullable C2243t5 c2243t5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(adCompleteListener, "adCompleteListener");
        Intrinsics.checkNotNullParameter(closeVerificationController, "closeVerificationController");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(divKitActionHandlerDelegate, "divKitActionHandlerDelegate");
        try {
            this.f25919d.getClass();
            if (!x20.a(context) || q20Var == null) {
                return null;
            }
            return new u20(q20Var.b(), this.f25916a, a(adResponse, nativeAdPrivate, adActivityEventController, adCompleteListener, closeVerificationController, timeProviderContainer, q20Var, c2243t5), this.f25917b, divKitActionHandlerDelegate, this.f25918c);
        } catch (Throwable unused) {
            return null;
        }
    }
}
