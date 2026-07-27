package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.e;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import g4.AbstractC0465j;
import g4.C0473r;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class AppMetricaAdapter implements VarioqubConfigAdapter {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f5357a;

    /* renamed from: b, reason: collision with root package name */
    private final d f5358b = e.a();

    /* renamed from: c, reason: collision with root package name */
    private String f5359c = "";

    /* renamed from: d, reason: collision with root package name */
    private Set f5360d = C0473r.f5752a;

    /* renamed from: e, reason: collision with root package name */
    private final String f5361e = "AppMetricaAdapter";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public AppMetricaAdapter(Context context) {
        this.f5357a = context;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public String getAdapterName() {
        return this.f5361e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void reportConfigChanged(ConfigData configData) {
        d dVar = this.f5358b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        dVar.a(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestDeviceId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f5358b.a(this.f5357a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestUserId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f5358b.b(this.f5357a, adapterIdentifiersCallback);
    }

    public final void setCustomReporter(String str) {
        this.f5358b.a(this.f5357a, str);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setExperiments(String str) {
        this.f5359c = str;
        Objects.toString(this.f5360d);
        d dVar = this.f5358b;
        k kVar = new k();
        kVar.f5367a = this.f5359c;
        kVar.f5368b = AbstractC0465j.T0(this.f5360d);
        dVar.a(MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setTriggeredTestIds(Set<Long> set) {
        Objects.toString(set);
        Set X02 = AbstractC0465j.X0(set);
        this.f5360d = X02;
        Objects.toString(X02);
        d dVar = this.f5358b;
        k kVar = new k();
        kVar.f5367a = this.f5359c;
        kVar.f5368b = AbstractC0465j.T0(this.f5360d);
        dVar.a(MessageNano.toByteArray(kVar));
    }
}
