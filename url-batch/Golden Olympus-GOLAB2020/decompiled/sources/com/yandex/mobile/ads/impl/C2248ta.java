package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.in0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ta, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2248ta {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f32260a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final di2 f32261b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Context f32262c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C1844c5 f32263d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xe2 f32264e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final o60 f32265f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2248ta(Context context, um2 um2Var, am2 am2Var) {
        this(context, um2Var, am2Var, r4, new C1844c5(), new xe2(), new o60());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    @NotNull
    public final lm0 a() {
        Context context = this.f32262c;
        vu1 vu1Var = this.f32260a;
        sr0 sr0Var = new sr0(context, vu1Var, this.f32261b, new nl0(context, vu1Var));
        C2384z8 adStateDataController = new C2384z8(new C1824b9(null), new C2311w4(null), new C1963h4());
        ni1 ni1Var = new ni1();
        ee2 ee2Var = new ee2(-9223372036854775807L);
        r60 r60Var = new r60();
        li1 playerStateController = new li1(ni1Var, ee2Var, r60Var, new ri1(r60Var), new bi1(r60Var));
        ee2 a4 = playerStateController.a();
        r60 c4 = playerStateController.c();
        mj1 positionProviderHolder = new mj1(null, null);
        C1940g5 adPlayerEventsController = new C1940g5(new C2338x8(new z70(positionProviderHolder, a4)));
        ye2 videoPlayerEventsController = new ye2();
        C2396zk bindingControllerHolder = new C2396zk(null);
        this.f32265f.getClass();
        Intrinsics.checkNotNullParameter(bindingControllerHolder, "bindingControllerHolder");
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoEventsController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        C1824b9 b4 = adStateDataController.b();
        C2311w4 c5 = adStateDataController.c();
        r60 c6 = playerStateController.c();
        ee2 a5 = playerStateController.a();
        C2263u2 c2263u2 = new C2263u2(bindingControllerHolder, adStateDataController, playerStateController, adPlayerEventsController, adStateDataController.b(), adStateDataController.c(), playerStateController.c(), playerStateController.e(), playerStateController.d(), new C1796a5());
        be2 be2Var = new be2(c5, a5, positionProviderHolder, videoPlayerEventsController, new zd2(positionProviderHolder, a5));
        ji1 ji1Var = new ji1(b4, c2263u2, be2Var, adPlayerEventsController);
        yh1 yh1Var = new yh1(c5, positionProviderHolder, a5, ji1Var, new rr0(positionProviderHolder, a5));
        di1 di1Var = new di1(b4, adPlayerEventsController, new C2294va());
        z70 z70Var = new z70(positionProviderHolder, a5);
        C2242t4 c2242t4 = new C2242t4(adStateDataController, z70Var, be2Var, adStateDataController.b(), adStateDataController.c());
        C2311w4 c7 = adStateDataController.c();
        C1963h4 a6 = adStateDataController.a();
        ni1 d4 = playerStateController.d();
        mh1 mh1Var = new mh1(bindingControllerHolder, playerStateController, adStateDataController, be2Var, z70Var, c2263u2, c2242t4, c7, a6, d4, playerStateController.c(), new tf2(d4, be2Var));
        m60 m60Var = new m60(bindingControllerHolder, c6, yh1Var, ji1Var, di1Var, new z42(c5, playerStateController, new C2340xa(bindingControllerHolder, c5, a5, positionProviderHolder), mh1Var, playerStateController.d(), playerStateController.a(), new c82()), mh1Var);
        C2357y4 c2357y4 = new C2357y4(a4, new C2008j2(a4));
        this.f32263d.getClass();
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(adPlayerEventsController, "adPlayerEventsController");
        C1824b9 b5 = adStateDataController.b();
        C2311w4 c8 = adStateDataController.c();
        ee2 a7 = playerStateController.a();
        r60 c9 = playerStateController.c();
        ml1 ml1Var = new ml1(new C1797a6(b5, playerStateController, playerStateController.d(), playerStateController.c()));
        c9.a(ml1Var);
        C2035k5 c2035k5 = new C2035k5(adStateDataController, new C2057l3(a7, c8, new C2008j2(a7)), new jn0());
        C1824b9 b6 = adStateDataController.b();
        C1963h4 a8 = adStateDataController.a();
        ni1 d5 = playerStateController.d();
        bi1 b7 = playerStateController.b();
        C1868d5 c1868d5 = new C1868d5(adStateDataController, playerStateController);
        int i4 = in0.f27295g;
        z50 z50Var = new z50(b5, playerStateController, ml1Var, c2035k5, new C1988i5(adStateDataController, playerStateController, adPlayerEventsController, b6, a8, d5, b7, c1868d5, in0.a.a()), adPlayerEventsController, playerStateController.d(), playerStateController.e());
        this.f32264e.getClass();
        Intrinsics.checkNotNullParameter(adStateDataController, "adStateDataController");
        Intrinsics.checkNotNullParameter(playerStateController, "playerStateController");
        Intrinsics.checkNotNullParameter(positionProviderHolder, "positionProviderHolder");
        Intrinsics.checkNotNullParameter(videoPlayerEventsController, "videoPlayerEventsController");
        C1824b9 b8 = adStateDataController.b();
        r60 c10 = playerStateController.c();
        ml1 ml1Var2 = new ml1(new if2(b8, playerStateController, positionProviderHolder, playerStateController.a(), playerStateController.d()));
        c10.a(ml1Var2);
        pw1 pw1Var = new pw1(ml1Var2, playerStateController.e(), videoPlayerEventsController);
        Context context2 = this.f32262c;
        vu1 vu1Var2 = this.f32260a;
        Context applicationContext = context2.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new lm0(adStateDataController, c2357y4, new C2350xk(context2, vu1Var2, z50Var, pw1Var, applicationContext), bindingControllerHolder, sr0Var, playerStateController, new f60(bindingControllerHolder, adStateDataController, adPlayerEventsController, c4, this.f32260a.c(), adStateDataController.b(), adStateDataController.a(), adStateDataController.c(), new C2294va(), new Handler(Looper.getMainLooper())), positionProviderHolder, m60Var, new cb2(), adStateDataController.b(), adStateDataController.c(), playerStateController.c(), playerStateController.d());
    }

    public C2248ta(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull am2 vmapRequestConfig, @NotNull Context applicationContext, @NotNull C1844c5 adPlayerCreator, @NotNull xe2 videoPlayerCreator, @NotNull o60 exoPlayerListenerCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(vmapRequestConfig, "vmapRequestConfig");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(adPlayerCreator, "adPlayerCreator");
        Intrinsics.checkNotNullParameter(videoPlayerCreator, "videoPlayerCreator");
        Intrinsics.checkNotNullParameter(exoPlayerListenerCreator, "exoPlayerListenerCreator");
        this.f32260a = sdkEnvironmentModule;
        this.f32261b = vmapRequestConfig;
        this.f32262c = applicationContext;
        this.f32263d = adPlayerCreator;
        this.f32264e = videoPlayerCreator;
        this.f32265f = exoPlayerListenerCreator;
    }
}
