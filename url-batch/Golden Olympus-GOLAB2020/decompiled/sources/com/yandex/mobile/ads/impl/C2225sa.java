package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.in0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2225sa {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f31640a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final di2 f31641b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f31642c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1820b5 f31643d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final we2 f31644e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final n60 f31645f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2225sa(Context context, um2 um2Var, am2 am2Var) {
        this(context, um2Var, am2Var, r4, new C1820b5(), new we2(), new n60());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    @NotNull
    public final mm0 a() {
        Context context = this.f31642c;
        vu1 vu1Var = this.f31640a;
        tr0 tr0Var = new tr0(context, vu1Var, this.f31641b, new nl0(context, vu1Var));
        C2361y8 adStateDataController = new C2361y8(new C1800a9(null), new C2288v4(null), new C1939g4());
        mi1 mi1Var = new mi1();
        de2 de2Var = new de2(-9223372036854775807L);
        q60 q60Var = new q60();
        ki1 playerStateController = new ki1(mi1Var, de2Var, q60Var, new qi1(q60Var), new ai1(q60Var));
        de2 a4 = playerStateController.a();
        q60 c4 = playerStateController.c();
        lj1 positionProviderHolder = new lj1(null, null);
        C1916f5 adPlayerEventsController = new C1916f5(new C2315w8(new y70(positionProviderHolder, a4)));
        ze2 videoPlayerEventsController = new ze2();
        C2373yk bindingControllerHolder = new C2373yk(null);
        this.f31645f.getClass();
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoEventsController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        C1800a9 b4 = adStateDataController.b();
        C2288v4 c5 = adStateDataController.c();
        q60 c6 = playerStateController.c();
        de2 a5 = playerStateController.a();
        C2240t2 c2240t2 = new C2240t2(bindingControllerHolder, adStateDataController, playerStateController, adPlayerEventsController, adStateDataController.b(), adStateDataController.c(), playerStateController.c(), playerStateController.e(), playerStateController.d(), new C2380z4());
        ae2 ae2Var = new ae2(c5, a5, positionProviderHolder, videoPlayerEventsController, new yd2(positionProviderHolder, a5));
        ii1 ii1Var = new ii1(b4, c2240t2, ae2Var, adPlayerEventsController);
        xh1 xh1Var = new xh1(c5, positionProviderHolder, a5, ii1Var, new qr0(positionProviderHolder, a5));
        ci1 ci1Var = new ci1(b4, adPlayerEventsController, new C2271ua());
        y70 y70Var = new y70(positionProviderHolder, a5);
        C2219s4 c2219s4 = new C2219s4(adStateDataController, y70Var, ae2Var, adStateDataController.b(), adStateDataController.c());
        C2288v4 c7 = adStateDataController.c();
        C1939g4 a6 = adStateDataController.a();
        mi1 d4 = playerStateController.d();
        lh1 lh1Var = new lh1(bindingControllerHolder, playerStateController, adStateDataController, ae2Var, y70Var, c2240t2, c2219s4, c7, a6, d4, playerStateController.c(), new sf2(d4, ae2Var));
        l60 l60Var = new l60(bindingControllerHolder, c6, xh1Var, ii1Var, ci1Var, new y42(c5, playerStateController, new C2317wa(bindingControllerHolder, c5, a5, positionProviderHolder), lh1Var, playerStateController.d(), playerStateController.a(), new b82()), lh1Var);
        C2334x4 c2334x4 = new C2334x4(a4, new C1985i2(a4));
        this.f31643d.getClass();
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        C1800a9 b5 = adStateDataController.b();
        C2288v4 c8 = adStateDataController.c();
        de2 a7 = playerStateController.a();
        q60 c9 = playerStateController.c();
        ll1 ll1Var = new ll1(new C2381z5(b5, playerStateController, playerStateController.d(), playerStateController.c()));
        c9.a(ll1Var);
        C2011j5 c2011j5 = new C2011j5(adStateDataController, new C2033k3(a7, c8, new C1985i2(a7)), new jn0());
        C1800a9 b6 = adStateDataController.b();
        C1939g4 a8 = adStateDataController.a();
        mi1 d5 = playerStateController.d();
        ai1 b7 = playerStateController.b();
        C1892e5 c1892e5 = new C1892e5(adStateDataController, playerStateController);
        int i4 = in0.f27295g;
        y50 y50Var = new y50(b5, playerStateController, ll1Var, c2011j5, new C1964h5(adStateDataController, playerStateController, adPlayerEventsController, b6, a8, d5, b7, c1892e5, in0.a.a()), adPlayerEventsController, playerStateController.d(), playerStateController.e());
        this.f31644e.getClass();
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        C1800a9 b8 = adStateDataController.b();
        q60 c10 = playerStateController.c();
        ll1 ll1Var2 = new ll1(new hf2(b8, playerStateController, positionProviderHolder, playerStateController.a(), playerStateController.d()));
        c10.a(ll1Var2);
        ow1 ow1Var = new ow1(ll1Var2, playerStateController.e(), videoPlayerEventsController);
        Context context2 = this.f31642c;
        vu1 vu1Var2 = this.f31640a;
        Context applicationContext = context2.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new mm0(adStateDataController, c2334x4, new C2327wk(context2, vu1Var2, y50Var, ow1Var, applicationContext), bindingControllerHolder, tr0Var, playerStateController, new e60(bindingControllerHolder, adStateDataController, adPlayerEventsController, c4, this.f31640a.c(), adStateDataController.b(), adStateDataController.a(), adStateDataController.c(), new C2271ua(), new Handler(Looper.getMainLooper())), positionProviderHolder, l60Var, new cb2(), adStateDataController.b(), adStateDataController.c(), playerStateController.c(), playerStateController.d());
    }

    public C2225sa(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull am2 vmapRequestConfig, @NotNull Context applicationContext, @NotNull C1820b5 adPlayerCreator, @NotNull we2 videoPlayerCreator, @NotNull n60 exoPlayerListenerCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(vmapRequestConfig, "vmapRequestConfig");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(adPlayerCreator, "adPlayerCreator");
        Intrinsics.checkNotNullParameter(videoPlayerCreator, "videoPlayerCreator");
        Intrinsics.checkNotNullParameter(exoPlayerListenerCreator, "exoPlayerListenerCreator");
        this.f31640a = sdkEnvironmentModule;
        this.f31641b = vmapRequestConfig;
        this.f31642c = applicationContext;
        this.f31643d = adPlayerCreator;
        this.f31644e = videoPlayerCreator;
        this.f31645f = exoPlayerListenerCreator;
    }
}
