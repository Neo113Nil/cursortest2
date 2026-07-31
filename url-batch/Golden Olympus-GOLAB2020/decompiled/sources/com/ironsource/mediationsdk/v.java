package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.pj;
import com.ironsource.zb;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class v implements AdapterNetworkData {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17940a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final JSONObject f17941b;

    public v(@NotNull String networkName, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(networkName, "networkName");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f17940a = networkName;
        this.f17941b = new JSONObject(data.toString());
    }

    @NotNull
    public final String a() {
        return this.f17940a;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject allData() {
        return this.f17941b;
    }

    public final void b() {
        Iterator<String> keys = this.f17941b.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "networkData.keys()");
        String joinToString$default = CollectionsKt.joinToString$default(kotlin.sequences.k.D(kotlin.sequences.k.c(keys)), StringUtils.COMMA, null, null, 0, null, null, 62, null);
        pj.i().a(new zb(57, IronSourceUtils.getMediationAdditionalData(false).put(IronSourceConstants.EVENTS_EXT1, this.f17940a + " - " + joinToString$default)));
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @Nullable
    public <T> T dataByKeyIgnoreCase(@NotNull String desiredKey, @NotNull Class<T> valueType) {
        Object obj;
        Intrinsics.checkNotNullParameter(desiredKey, "desiredKey");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        Iterator<String> keys = allData().keys();
        Intrinsics.checkNotNullExpressionValue(keys, "allData()\n          .keys()");
        Iterator it = kotlin.sequences.k.c(keys).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (StringsKt.w((String) obj, desiredKey, true)) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null) {
            Object opt = allData().opt(str);
            if (!valueType.isInstance(opt)) {
                opt = null;
            }
            if (opt != null) {
                return valueType.cast(opt);
            }
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.AdapterNetworkData
    @NotNull
    public JSONObject networkDataByAdUnit(@NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        JSONObject optJSONObject = this.f17941b.optJSONObject(adUnit.toString());
        return optJSONObject == null ? new JSONObject() : optJSONObject;
    }

    @NotNull
    public String toString() {
        return "NetworkData(networkName=" + this.f17940a + ", networkData=" + this.f17941b + ')';
    }

    private final void a(Collection<? extends AbstractAdapter> collection) {
        List filterNotNull = CollectionsKt.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterNotNull) {
            if (c.a(this.f17940a, (AbstractAdapter) obj)) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj2 = arrayList.get(i4);
            i4++;
            ((AbstractAdapter) obj2).setNetworkData(this);
        }
    }

    private final void b(Collection<? extends AdapterBaseWrapper> collection) {
        List filterNotNull = CollectionsKt.filterNotNull(collection);
        ArrayList arrayList = new ArrayList();
        for (Object obj : filterNotNull) {
            if (c.a(this.f17940a, (AdapterBaseWrapper) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj2 = arrayList.get(i5);
            i5++;
            arrayList2.add(((AdapterBaseWrapper) obj2).getAdapterBaseInterface());
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj3 = arrayList2.get(i6);
            i6++;
            if (obj3 instanceof AdapterNetworkDataInterface) {
                arrayList3.add(obj3);
            }
        }
        int size3 = arrayList3.size();
        while (i4 < size3) {
            Object obj4 = arrayList3.get(i4);
            i4++;
            ((AdapterNetworkDataInterface) obj4).setNetworkData(this);
        }
    }

    public final void a(@NotNull Collection<? extends AbstractAdapter> adapters, @NotNull Collection<? extends AdapterBaseWrapper> networkAdapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        try {
            a(adapters);
            b(networkAdapters);
        } catch (Exception e4) {
            IronLog.INTERNAL.error("error while setting network data: " + e4.getMessage());
        }
    }
}
