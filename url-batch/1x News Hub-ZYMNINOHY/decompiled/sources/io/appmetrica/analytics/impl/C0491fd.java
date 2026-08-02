package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491fd implements JsonParser, Converter {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f7315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f7316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f7317c;

    public C0491fd(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f7315a = remoteConfigExtensionConfiguration;
        this.f7316b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f7317c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final byte[] a(Object obj) {
        return (byte[]) this.f7317c.fromModel(obj);
    }

    public final Object b(JSONObject jSONObject) {
        return this.f7316b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f7317c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f7316b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f7316b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f7317c.toModel((byte[]) obj);
    }

    public final Object a(JSONObject jSONObject) {
        return this.f7316b.parse(jSONObject);
    }

    public final Object a(byte[] bArr) {
        return this.f7317c.toModel(bArr);
    }

    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f7315a;
    }
}
