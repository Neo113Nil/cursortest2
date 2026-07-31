package com.ironsource;

import android.app.Activity;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1511m3;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.bi;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class cj implements cd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private sj f15768a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC1425a1 f15769b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private InterfaceC1593x4 f15770c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC1541q3 f15771d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private nn f15772e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private vu f15773f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private bi f15774g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private bi.a f15775h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, cj> f15776i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private InterstitialAdInfo f15777j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private dj f15778k;

    public cj(@NotNull sj adInstance, @NotNull InterfaceC1425a1 adNetworkShow, @NotNull InterfaceC1593x4 auctionDataReporter, @NotNull InterfaceC1541q3 analytics, @NotNull nn networkDestroyAPI, @NotNull vu threadManager, @NotNull bi sessionDepthService, @NotNull bi.a sessionDepthServiceEditor, @NotNull Map<String, cj> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f15768a = adInstance;
        this.f15769b = adNetworkShow;
        this.f15770c = auctionDataReporter;
        this.f15771d = analytics;
        this.f15772e = networkDestroyAPI;
        this.f15773f = threadManager;
        this.f15774g = sessionDepthService;
        this.f15775h = sessionDepthServiceEditor;
        this.f15776i = retainer;
        String f4 = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f4, "adInstance.instanceId");
        String e4 = this.f15768a.e();
        Intrinsics.checkNotNullExpressionValue(e4, "adInstance.id");
        this.f15777j = new InterstitialAdInfo(f4, e4);
        ad adVar = new ad();
        this.f15768a.a(adVar);
        adVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cj this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dj djVar = this$0.f15778k;
        if (djVar != null) {
            djVar.onAdInstanceDidShow();
        }
    }

    public final void a() {
        vu.a(this.f15773f, new Runnable() { // from class: com.ironsource.M
            @Override // java.lang.Runnable
            public final void run() {
                cj.a(cj.this);
            }
        }, 0L, 2, null);
    }

    @NotNull
    public final InterstitialAdInfo b() {
        return this.f15777j;
    }

    @Nullable
    public final dj c() {
        return this.f15778k;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC1490j3.a.f16785a.f(new InterfaceC1520n3[0]).a(this.f15771d);
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidClick() {
        InterfaceC1490j3.a.f16785a.a().a(this.f15771d);
        this.f15773f.a(new Runnable() { // from class: com.ironsource.N
            @Override // java.lang.Runnable
            public final void run() {
                cj.b(cj.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidDismiss() {
        this.f15776i.remove(this.f15777j.getAdId());
        InterfaceC1490j3.a.f16785a.a(new InterfaceC1520n3[0]).a(this.f15771d);
        this.f15773f.a(new Runnable() { // from class: com.ironsource.P
            @Override // java.lang.Runnable
            public final void run() {
                cj.c(cj.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidReward(@Nullable String str, int i4) {
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidShow() {
        bi biVar = this.f15774g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        InterfaceC1490j3.a.f16785a.b(new C1511m3.w(biVar.a(ad_unit))).a(this.f15771d);
        this.f15775h.b(ad_unit);
        this.f15770c.c("onAdInstanceDidShow");
        this.f15773f.a(new Runnable() { // from class: com.ironsource.L
            @Override // java.lang.Runnable
            public final void run() {
                cj.d(cj.this);
            }
        });
    }

    public /* synthetic */ cj(sj sjVar, InterfaceC1425a1 interfaceC1425a1, InterfaceC1593x4 interfaceC1593x4, InterfaceC1541q3 interfaceC1541q3, nn nnVar, vu vuVar, bi biVar, bi.a aVar, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(sjVar, interfaceC1425a1, interfaceC1593x4, interfaceC1541q3, (i4 & 16) != 0 ? new on() : nnVar, (i4 & 32) != 0 ? ig.f16710a : vuVar, (i4 & 64) != 0 ? nm.f18364r.d().k() : biVar, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nm.f18364r.a().e() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cj this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dj djVar = this$0.f15778k;
        if (djVar != null) {
            djVar.onAdInstanceDidClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(cj this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dj djVar = this$0.f15778k;
        if (djVar != null) {
            djVar.onAdInstanceDidDismiss();
        }
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f15776i.put(this.f15777j.getAdId(), this);
        if (!this.f15769b.a(this.f15768a)) {
            a(wb.f20181a.t());
        } else {
            InterfaceC1490j3.a.f16785a.d(new InterfaceC1520n3[0]).a(this.f15771d);
            this.f15769b.a(activity, this.f15768a);
        }
    }

    public final boolean d() {
        boolean a4 = this.f15769b.a(this.f15768a);
        InterfaceC1490j3.a.f16785a.a(a4).a(this.f15771d);
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cj this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC1490j3.d.f16808a.b().a(this$0.f15771d);
        this$0.f15772e.a(this$0.f15768a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(cj this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        dj djVar = this$0.f15778k;
        if (djVar != null) {
            djVar.onAdInstanceDidFailedToShow(error);
        }
    }

    public final void a(@Nullable dj djVar) {
        this.f15778k = djVar;
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f15776i.remove(this.f15777j.getAdId());
        InterfaceC1490j3.a.f16785a.a(new C1511m3.j(ironSourceError.getErrorCode()), new C1511m3.k(ironSourceError.getErrorMessage())).a(this.f15771d);
        this.f15773f.a(new Runnable() { // from class: com.ironsource.O
            @Override // java.lang.Runnable
            public final void run() {
                cj.a(cj.this, ironSourceError);
            }
        });
    }

    public final void a(@NotNull InterstitialAdInfo interstitialAdInfo) {
        Intrinsics.checkNotNullParameter(interstitialAdInfo, "<set-?>");
        this.f15777j = interstitialAdInfo;
    }

    @Override // com.ironsource.cd
    public void a(@Nullable String str) {
        a(wb.f20181a.c(new IronSourceError(0, str)));
    }
}
