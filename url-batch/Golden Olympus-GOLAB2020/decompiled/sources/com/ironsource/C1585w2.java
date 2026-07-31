package com.ironsource;

import com.ironsource.C1454e2;
import com.ironsource.bi;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1585w2 extends C1525o1 {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C1525o1 f20145g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C1553s2 f20146h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private InterfaceC1471g5 f20147i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585w2(@NotNull C1525o1 adTools, @NotNull AbstractC1584w1 adUnitData, @NotNull C1454e2.b level) {
        super(adTools, level);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f20145g = adTools;
        C1553s2 a4 = wt.a(adUnitData, adUnitData.e().c());
        Intrinsics.checkNotNullExpressionValue(a4, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f20146h = a4;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull C1431b0 instanceData) {
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.u(), instanceData.h(), instanceData.i().b().b());
    }

    public final void c(@NotNull ir task) {
        Intrinsics.checkNotNullParameter(task, "task");
        xt.a(xt.f20339a, task, 0L, 2, null);
    }

    @NotNull
    public final String e(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        String c4 = com.ironsource.mediationsdk.d.b().c(serverData);
        Intrinsics.checkNotNullExpressionValue(c4, "getInstance().getDynamic…romServerData(serverData)");
        return c4;
    }

    @NotNull
    public final C1553s2 h() {
        return this.f20146h;
    }

    @Nullable
    public final InterfaceC1471g5 i() {
        return this.f20147i;
    }

    @Nullable
    public final String j() {
        return com.ironsource.mediationsdk.p.m().l();
    }

    @Nullable
    public final Map<String, String> k() {
        return com.ironsource.mediationsdk.p.m().s();
    }

    @Nullable
    public final IronSourceSegment l() {
        return wt.a();
    }

    @NotNull
    public final bi.a m() {
        return nm.f18364r.a().e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585w2(@NotNull C1585w2 adUnitTools, @NotNull C1454e2.b level) {
        super(adUnitTools, level);
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f20145g = adUnitTools.f20145g;
        this.f20146h = adUnitTools.f20146h;
        this.f20147i = adUnitTools.f20147i;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull NetworkSettings providerSettings, @NotNull IronSource.AD_UNIT adFormat, @NotNull UUID adId) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    @NotNull
    public final String a(long j4, @NotNull String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        String transId = IronSourceUtils.getTransId(j4, instanceName);
        Intrinsics.checkNotNullExpressionValue(transId, "getTransId(timeStamp, instanceName)");
        return transId;
    }

    public final void a(@Nullable InterfaceC1471g5 interfaceC1471g5) {
        this.f20147i = interfaceC1471g5;
    }
}
