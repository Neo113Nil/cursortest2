package io.appmetrica.analytics.networkokhttp.impl;

import G3.s;
import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClient;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;

/* loaded from: classes.dex */
public final class e extends NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    public final s f13284a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(NetworkClientSettings networkClientSettings) {
        this(networkClientSettings, null, 2, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.networkapi.NetworkClient
    public final Call newCall(Request request) {
        return new c(this.f13284a, request, getSettings());
    }

    public final String toString() {
        return "OkHttpNetworkClient(settings=" + getSettings() + ')';
    }

    public /* synthetic */ e(NetworkClientSettings networkClientSettings, s sVar, int i4, kotlin.jvm.internal.e eVar) {
        this(networkClientSettings, (i4 & 2) != 0 ? d.a(networkClientSettings) : sVar);
    }

    public e(NetworkClientSettings networkClientSettings, s sVar) {
        super(networkClientSettings);
        this.f13284a = sVar;
    }
}
