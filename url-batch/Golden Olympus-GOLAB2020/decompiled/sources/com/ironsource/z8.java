package com.ironsource;

import W1.AbstractC1233c;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class z8 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private Boolean f20510a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final of f20511b = nm.f18364r.d().f();

    @Nullable
    public final Boolean a() {
        return this.f20510a;
    }

    @NotNull
    public final of b() {
        return this.f20511b;
    }

    private final Boolean a(NetworkSettings networkSettings) {
        return (networkSettings == null || networkSettings.isCustomNetwork()) ? this.f20510a : networkSettings.getApplicationSettings().has(a9.f15027a) ? Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(a9.f15027a)) : this.f20510a;
    }

    public final void a(int i4) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_EXT1, i4 + ';' + this.f20511b.K(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(AbstractC1233c.b(e4));
        }
        br.i().a(new zb(42, mediationAdditionalData));
    }

    public final void a(int i4, @NotNull ConcurrentHashMap<String, NetworkSettings> providerSettings) {
        JSONObject applicationSettings;
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        String K3 = this.f20511b.K(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + K3);
        ironLog.general("CMP ID: " + i4);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> values = providerSettings.values();
        Intrinsics.checkNotNullExpressionValue(values, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !Intrinsics.areEqual(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(a9.f15027a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        while (i5 < size2) {
            Object obj3 = arrayList2.get(i5);
            i5++;
            NetworkSettings networkSettings2 = (NetworkSettings) obj3;
            IronLog ironLog2 = IronLog.API;
            StringBuilder sb = new StringBuilder();
            sb.append(networkSettings2.getProviderDefaultInstance());
            sb.append(": ");
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            sb.append(applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(a9.f15027a)) : null);
            ironLog2.general(sb.toString());
        }
    }

    public final void a(@NotNull AbstractAdapter adapter, @Nullable NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean a4 = a(networkSettings);
            if (a4 != null) {
                adapter.setNewConsent(a4.booleanValue());
            }
        } catch (Throwable th) {
            o9.d().a(th);
            String str = "error while setting consent of " + adapter.getProviderName() + ": " + th.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    public final void a(@NotNull AdapterBaseInterface adapter, @Nullable NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean a4 = a(networkSettings);
            if (a4 == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(a4.booleanValue());
        } catch (Throwable th) {
            o9.d().a(th);
            StringBuilder sb = new StringBuilder();
            sb.append("error while setting consent of ");
            sb.append(networkSettings != null ? networkSettings.getProviderName() : null);
            sb.append(": ");
            sb.append(th.getLocalizedMessage());
            String sb2 = sb.toString();
            a(sb2);
            IronLog.INTERNAL.error(sb2);
        }
    }

    private final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            pj.i().a(new zb(IronSourceConstants.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public final void a(@NotNull ConcurrentHashMap<String, AbstractAdapter> adapters, @NotNull ConcurrentHashMap<String, AdapterBaseWrapper> networkAdapters) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        for (AbstractAdapter adapter : adapters.values()) {
            Intrinsics.checkNotNullExpressionValue(adapter, "adapter");
            a(adapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                unit = Unit.f41027a;
            } else {
                unit = null;
            }
            if (unit == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(boolean z4) {
        this.f20510a = Boolean.valueOf(z4);
    }
}
