package com.ironsource;

import android.app.Activity;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.C1511m3;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.bi;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class nq implements cd {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private sj f18404a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private InterfaceC1425a1 f18405b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private InterfaceC1593x4 f18406c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private InterfaceC1541q3 f18407d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private nn f18408e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private vu f18409f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private bi f18410g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private bi.a f18411h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final Map<String, nq> f18412i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private RewardedAdInfo f18413j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    private oq f18414k;

    public nq(@NotNull sj adInstance, @NotNull InterfaceC1425a1 adNetworkShow, @NotNull InterfaceC1593x4 auctionDataReporter, @NotNull InterfaceC1541q3 analytics, @NotNull nn networkDestroyAPI, @NotNull vu threadManager, @NotNull bi sessionDepthService, @NotNull bi.a sessionDepthServiceEditor, @NotNull Map<String, nq> retainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adNetworkShow, "adNetworkShow");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(networkDestroyAPI, "networkDestroyAPI");
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(sessionDepthService, "sessionDepthService");
        Intrinsics.checkNotNullParameter(sessionDepthServiceEditor, "sessionDepthServiceEditor");
        Intrinsics.checkNotNullParameter(retainer, "retainer");
        this.f18404a = adInstance;
        this.f18405b = adNetworkShow;
        this.f18406c = auctionDataReporter;
        this.f18407d = analytics;
        this.f18408e = networkDestroyAPI;
        this.f18409f = threadManager;
        this.f18410g = sessionDepthService;
        this.f18411h = sessionDepthServiceEditor;
        this.f18412i = retainer;
        String f4 = adInstance.f();
        Intrinsics.checkNotNullExpressionValue(f4, "adInstance.instanceId");
        String e4 = this.f18404a.e();
        Intrinsics.checkNotNullExpressionValue(e4, "adInstance.id");
        this.f18413j = new RewardedAdInfo(f4, e4);
        ad adVar = new ad();
        this.f18404a.a(adVar);
        adVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(nq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oq oqVar = this$0.f18414k;
        if (oqVar != null) {
            oqVar.onUserEarnedReward();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(nq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oq oqVar = this$0.f18414k;
        if (oqVar != null) {
            oqVar.onRewardedAdShown();
        }
    }

    public final void a() {
        vu.a(this.f18409f, new Runnable() { // from class: com.ironsource.H2
            @Override // java.lang.Runnable
            public final void run() {
                nq.a(nq.this);
            }
        }, 0L, 2, null);
    }

    @NotNull
    public final RewardedAdInfo b() {
        return this.f18413j;
    }

    @Nullable
    public final oq c() {
        return this.f18414k;
    }

    protected final void finalize() {
        a();
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidBecomeVisible() {
        InterfaceC1490j3.a.f16785a.f(new InterfaceC1520n3[0]).a(this.f18407d);
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidClick() {
        InterfaceC1490j3.a.f16785a.a().a(this.f18407d);
        this.f18409f.a(new Runnable() { // from class: com.ironsource.E2
            @Override // java.lang.Runnable
            public final void run() {
                nq.b(nq.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidDismiss() {
        this.f18412i.remove(this.f18413j.getAdId());
        InterfaceC1490j3.a.f16785a.a(new InterfaceC1520n3[0]).a(this.f18407d);
        this.f18409f.a(new Runnable() { // from class: com.ironsource.C2
            @Override // java.lang.Runnable
            public final void run() {
                nq.c(nq.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidReward(@Nullable String str, int i4) {
        C1511m3.u uVar = new C1511m3.u("Virtual Item");
        C1511m3.t tVar = new C1511m3.t(1);
        C1511m3.q qVar = new C1511m3.q("DefaultRewardedVideo");
        String transId = IronSourceUtils.getTransId(System.currentTimeMillis(), this.f18404a.g());
        Intrinsics.checkNotNullExpressionValue(transId, "getTransId(System.curren…illis(), adInstance.name)");
        InterfaceC1490j3.a.f16785a.c(uVar, tVar, qVar, new C1511m3.y(transId)).a(this.f18407d);
        this.f18409f.a(new Runnable() { // from class: com.ironsource.G2
            @Override // java.lang.Runnable
            public final void run() {
                nq.d(nq.this);
            }
        });
    }

    @Override // com.ironsource.cd
    public void onAdInstanceDidShow() {
        bi biVar = this.f18410g;
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        InterfaceC1490j3.a.f16785a.b(new C1511m3.w(biVar.a(ad_unit))).a(this.f18407d);
        this.f18411h.b(ad_unit);
        this.f18406c.c("onAdInstanceDidShow");
        this.f18409f.a(new Runnable() { // from class: com.ironsource.D2
            @Override // java.lang.Runnable
            public final void run() {
                nq.e(nq.this);
            }
        });
    }

    public /* synthetic */ nq(sj sjVar, InterfaceC1425a1 interfaceC1425a1, InterfaceC1593x4 interfaceC1593x4, InterfaceC1541q3 interfaceC1541q3, nn nnVar, vu vuVar, bi biVar, bi.a aVar, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(sjVar, interfaceC1425a1, interfaceC1593x4, interfaceC1541q3, (i4 & 16) != 0 ? new on() : nnVar, (i4 & 32) != 0 ? ig.f16710a : vuVar, (i4 & 64) != 0 ? nm.f18364r.d().k() : biVar, (i4 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? nm.f18364r.a().e() : aVar, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(nq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oq oqVar = this$0.f18414k;
        if (oqVar != null) {
            oqVar.onRewardedAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(nq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oq oqVar = this$0.f18414k;
        if (oqVar != null) {
            oqVar.onRewardedAdDismissed();
        }
    }

    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f18412i.put(this.f18413j.getAdId(), this);
        if (!this.f18405b.a(this.f18404a)) {
            a(wb.f20181a.t());
        } else {
            InterfaceC1490j3.a.f16785a.d(new InterfaceC1520n3[0]).a(this.f18407d);
            this.f18405b.a(activity, this.f18404a);
        }
    }

    public final boolean d() {
        boolean a4 = this.f18405b.a(this.f18404a);
        InterfaceC1490j3.a.f16785a.a(a4).a(this.f18407d);
        return a4;
    }

    private final void a(final IronSourceError ironSourceError) {
        this.f18412i.remove(this.f18413j.getAdId());
        InterfaceC1490j3.a.f16785a.a(new C1511m3.j(ironSourceError.getErrorCode()), new C1511m3.k(ironSourceError.getErrorMessage())).a(this.f18407d);
        this.f18409f.a(new Runnable() { // from class: com.ironsource.F2
            @Override // java.lang.Runnable
            public final void run() {
                nq.a(nq.this, ironSourceError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nq this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC1490j3.d.f16808a.b().a(this$0.f18407d);
        this$0.f18408e.a(this$0.f18404a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nq this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        oq oqVar = this$0.f18414k;
        if (oqVar != null) {
            oqVar.onRewardedAdFailedToShow(error);
        }
    }

    public final void a(@Nullable oq oqVar) {
        this.f18414k = oqVar;
    }

    public final void a(@NotNull RewardedAdInfo rewardedAdInfo) {
        Intrinsics.checkNotNullParameter(rewardedAdInfo, "<set-?>");
        this.f18413j = rewardedAdInfo;
    }

    @Override // com.ironsource.cd
    public void a(@Nullable String str) {
        a(wb.f20181a.c(new IronSourceError(0, str)));
    }
}
