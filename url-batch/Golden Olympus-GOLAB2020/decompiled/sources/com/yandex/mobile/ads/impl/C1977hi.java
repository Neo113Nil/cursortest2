package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.vy1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1977hi extends eo1 implements InterfaceC2302vi {

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final vo0 f26751B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final C1953gi f26752C;

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final fe2 f26753D;

    /* renamed from: E, reason: collision with root package name */
    @NotNull
    private final C2024ji f26754E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final C2000ii f26755F;

    /* renamed from: G, reason: collision with root package name */
    @NotNull
    private final yf0 f26756G;

    /* renamed from: H, reason: collision with root package name */
    @Nullable
    private InterfaceC2072li f26757H;

    /* renamed from: I, reason: collision with root package name */
    @Nullable
    private InterfaceC2072li f26758I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1977hi(@NotNull Context context, @NotNull vo0 adView, @NotNull C1953gi bannerAdListener, @NotNull C2105n4 adLoadingPhasesManager, @NotNull fe2 videoEventController, @NotNull C2024ji bannerAdSizeValidator, @NotNull C2000ii adResponseControllerFactoryCreator, @NotNull yf0 htmlAdResponseReportManager) {
        super(context, adView, adLoadingPhasesManager);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(bannerAdListener, "bannerAdListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(bannerAdSizeValidator, "bannerAdSizeValidator");
        Intrinsics.checkNotNullParameter(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        this.f26751B = adView;
        this.f26752C = bannerAdListener;
        this.f26753D = videoEventController;
        this.f26754E = bannerAdSizeValidator;
        this.f26755F = adResponseControllerFactoryCreator;
        this.f26756G = htmlAdResponseReportManager;
        a(adView);
        bannerAdListener.a(htmlAdResponseReportManager);
    }

    private static void a(vo0 vo0Var) {
        vo0Var.setHorizontalScrollBarEnabled(false);
        vo0Var.setVerticalScrollBarEnabled(false);
        vo0Var.setVisibility(8);
        vo0Var.setBackgroundColor(0);
    }

    @Nullable
    public final String A() {
        InterfaceC2072li interfaceC2072li = this.f26758I;
        if (interfaceC2072li != null) {
            return interfaceC2072li.getAdInfo();
        }
        return null;
    }

    @NotNull
    public final vo0 B() {
        return this.f26751B;
    }

    @NotNull
    public final fe2 C() {
        return this.f26753D;
    }

    @Override // com.yandex.mobile.ads.impl.eo1, com.yandex.mobile.ads.impl.AbstractC2025jj
    public final void c() {
        super.c();
        this.f26752C.a((ls) null);
        og2.a(this.f26751B, true);
        this.f26751B.setVisibility(8);
        lh2.a((ViewGroup) this.f26751B);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public final void d() {
        InterfaceC2072li[] interfaceC2072liArr = {this.f26757H, this.f26758I};
        for (int i4 = 0; i4 < 2; i4++) {
            InterfaceC2072li interfaceC2072li = interfaceC2072liArr[i4];
            if (interfaceC2072li != null) {
                interfaceC2072li.a(k());
            }
        }
        super.d();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2302vi
    public final void onLeftApplication() {
        this.f26752C.b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2302vi
    public final void onReturnedToApplication() {
        this.f26752C.c();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public final void t() {
        super.t();
        InterfaceC2072li interfaceC2072li = this.f26757H;
        if (interfaceC2072li != this.f26758I) {
            InterfaceC2072li interfaceC2072li2 = new InterfaceC2072li[]{interfaceC2072li}[0];
            if (interfaceC2072li2 != null) {
                interfaceC2072li2.a(k());
            }
            this.f26757H = this.f26758I;
        }
        vy1 q4 = e().q();
        if (vy1.a.f33823d != (q4 != null ? q4.a() : null) || this.f26751B.getLayoutParams() == null) {
            return;
        }
        this.f26751B.getLayoutParams().height = -2;
    }

    public final boolean y() {
        C2360y7<String> j4 = j();
        vy1 M3 = j4 != null ? j4.M() : null;
        if (M3 == null) {
            return false;
        }
        vy1 q4 = e().q();
        C2360y7<String> j5 = j();
        return (j5 == null || q4 == null || !xy1.a(k(), j5, M3, this.f26754E, q4)) ? false : true;
    }

    public final void z() {
        this.f26752C.a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2302vi
    public final void a(@Nullable C1795a4 c1795a4) {
        this.f26752C.a(c1795a4);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj, com.yandex.mobile.ads.impl.qq1.b
    public final void a(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        super.a((C2360y7) adResponse);
        this.f26756G.a(adResponse);
        this.f26756G.a(e());
        InterfaceC2072li a4 = this.f26755F.a(adResponse).a(this);
        this.f26758I = a4;
        a4.a(k(), adResponse);
    }

    public final void a(@Nullable ls lsVar) {
        a(this.f26752C);
        this.f26752C.a(lsVar);
    }
}
