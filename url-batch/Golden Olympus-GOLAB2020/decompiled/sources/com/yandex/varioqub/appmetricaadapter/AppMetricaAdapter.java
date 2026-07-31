package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.ironsource.da;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.e;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.T;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
/* loaded from: classes3.dex */
public final class AppMetricaAdapter implements VarioqubConfigAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f36137f = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f36138a;

    /* renamed from: b, reason: collision with root package name */
    private final d f36139b = e.a();

    /* renamed from: c, reason: collision with root package name */
    private String f36140c = "";

    /* renamed from: d, reason: collision with root package name */
    private Set f36141d = T.e();

    /* renamed from: e, reason: collision with root package name */
    private final String f36142e = "AppMetricaAdapter";

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppMetricaAdapter(Context context) {
        this.f36138a = context;
    }

    public final void a(String str) {
        this.f36139b.a(this.f36138a, str);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public String getAdapterName() {
        return this.f36142e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void reportConfigChanged(ConfigData configData) {
        d dVar = this.f36139b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put(da.a.f15878d, Long.valueOf(configData.getConfigLoadTimestamp()));
        dVar.b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestDeviceId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f36139b.c(this.f36138a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestUserId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f36139b.a(this.f36138a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setExperiments(String str) {
        this.f36140c = str;
        Objects.toString(this.f36141d);
        d dVar = this.f36139b;
        k kVar = new k();
        kVar.f36148a = this.f36140c;
        kVar.f36149b = CollectionsKt.toLongArray(this.f36141d);
        dVar.a(MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setTriggeredTestIds(Set set) {
        Objects.toString(set);
        Set set2 = CollectionsKt.toSet(set);
        this.f36141d = set2;
        Objects.toString(set2);
        d dVar = this.f36139b;
        k kVar = new k();
        kVar.f36148a = this.f36140c;
        kVar.f36149b = CollectionsKt.toLongArray(this.f36141d);
        dVar.a(MessageNano.toByteArray(kVar));
    }
}
