package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1438c0 implements InterfaceC1447d2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1585w2 f15661a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1431b0 f15662b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final BaseAdAdapter<?, ?> f15663c;

    public C1438c0(@NotNull C1585w2 adTools, @NotNull C1431b0 instanceData, @Nullable BaseAdAdapter<?, ?> baseAdAdapter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        this.f15661a = adTools;
        this.f15662b = instanceData;
        this.f15663c = baseAdAdapter;
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, java.lang.Object] */
    @Override // com.ironsource.InterfaceC1447d2
    @NotNull
    public Map<String, Object> a(@NotNull EnumC1433b2 event) {
        String str;
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f15663c;
            String str2 = "";
            if (baseAdAdapter != null) {
                ?? networkAdapter = baseAdAdapter.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter);
                str = networkAdapter.getAdapterVersion();
            } else {
                str = "";
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, str);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f15663c;
            if (baseAdAdapter2 != null) {
                ?? networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter2);
                str2 = networkAdapter2.getNetworkSDKVersion();
            }
            Intrinsics.checkNotNull(str2);
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str2);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(C1525o1.a(this.f15661a, "could not get adapter version for event data " + this.f15662b.w(), (String) null, 2, (Object) null));
        }
        String i4 = this.f15662b.j().i();
        Intrinsics.checkNotNullExpressionValue(i4, "instanceData.adapterConfig.subProviderId");
        hashMap.put("spId", i4);
        String a4 = this.f15662b.j().a();
        Intrinsics.checkNotNullExpressionValue(a4, "instanceData.adapterConfig.adSourceNameForEvents");
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, a4);
        hashMap.put("instanceType", Integer.valueOf(this.f15662b.s()));
        String serverData = this.f15662b.n().k();
        C1585w2 c1585w2 = this.f15661a;
        Intrinsics.checkNotNullExpressionValue(serverData, "serverData");
        String e5 = c1585w2.e(serverData);
        if (!TextUtils.isEmpty(e5)) {
            hashMap.put("dynamicDemandSource", e5);
        }
        hashMap.put("sessionDepth", Integer.valueOf(this.f15662b.v()));
        if (!TextUtils.isEmpty(this.f15662b.u().getCustomNetwork())) {
            String customNetwork = this.f15662b.u().getCustomNetwork();
            Intrinsics.checkNotNullExpressionValue(customNetwork, "instanceData.providerSettings.customNetwork");
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return hashMap;
    }
}
