package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class mn {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<String, JSONObject> f18059a;

    /* JADX WARN: Multi-variable type inference failed */
    public mn() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ mn a(mn mnVar, ConcurrentHashMap concurrentHashMap, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            concurrentHashMap = mnVar.f18059a;
        }
        return mnVar.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn) && Intrinsics.areEqual(this.f18059a, ((mn) obj).f18059a);
    }

    public int hashCode() {
        return this.f18059a.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.f18059a + ')';
    }

    public mn(@NotNull ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        this.f18059a = networkDataMap;
    }

    @NotNull
    public final mn a(@NotNull ConcurrentHashMap<String, JSONObject> networkDataMap) {
        Intrinsics.checkNotNullParameter(networkDataMap, "networkDataMap");
        return new mn(networkDataMap);
    }

    public /* synthetic */ mn(ConcurrentHashMap concurrentHashMap, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.f18059a;
    }

    public final void a(@NotNull AbstractAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Set<Map.Entry<String, JSONObject>> entrySet = this.f18059a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "networkDataMap.entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapter)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            Map.Entry entry = (Map.Entry) obj2;
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            adapter.setNetworkData(new com.ironsource.mediationsdk.v((String) key, (JSONObject) value));
        }
    }

    public final void a(@Nullable AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> entrySet = this.f18059a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "networkDataMap.entries");
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            Map.Entry entry = (Map.Entry) obj2;
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            Intrinsics.checkNotNull(adapterBaseInterface, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface");
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "it.value");
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.v((String) key, (JSONObject) value));
        }
    }

    public final void a(@NotNull com.ironsource.mediationsdk.v networkData) {
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        if (!this.f18059a.containsKey(networkData.a())) {
            this.f18059a.put(networkData.a(), networkData.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.f18059a;
            String a4 = networkData.a();
            JSONObject jSONObject = this.f18059a.get(networkData.a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject deepMergeJSONObjects = IronSourceUtils.deepMergeJSONObjects(jSONObject, networkData.allData());
            Intrinsics.checkNotNullExpressionValue(deepMergeJSONObjects, "deepMergeJSONObjects(\n  …), networkData.allData())");
            concurrentHashMap.put(a4, deepMergeJSONObjects);
        } catch (Exception e4) {
            IronLog.INTERNAL.error("error while merging network data: " + e4.getMessage());
        }
    }
}
