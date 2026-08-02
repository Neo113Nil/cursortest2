package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.zk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014zk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f8710a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f8711b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8712c;

    public C1014zk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f8710a = sdkIdentifiers;
        this.f8711b = remoteConfigMetaInfo;
        this.f8712c = obj;
    }

    public final C1014zk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C1014zk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.f8711b;
    }

    public final Object c() {
        return this.f8712c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1014zk)) {
            return false;
        }
        C1014zk c1014zk = (C1014zk) obj;
        return kotlin.jvm.internal.j.a(this.f8710a, c1014zk.f8710a) && kotlin.jvm.internal.j.a(this.f8711b, c1014zk.f8711b) && kotlin.jvm.internal.j.a(this.f8712c, c1014zk.f8712c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f8712c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f8710a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f8711b;
    }

    public final int hashCode() {
        int hashCode = (this.f8711b.hashCode() + (this.f8710a.hashCode() * 31)) * 31;
        Object obj = this.f8712c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f8710a + ", remoteConfigMetaInfo=" + this.f8711b + ", featuresConfig=" + this.f8712c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f8710a;
    }

    public static C1014zk a(C1014zk c1014zk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            sdkIdentifiers = c1014zk.f8710a;
        }
        if ((i3 & 2) != 0) {
            remoteConfigMetaInfo = c1014zk.f8711b;
        }
        if ((i3 & 4) != 0) {
            obj = c1014zk.f8712c;
        }
        c1014zk.getClass();
        return new C1014zk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
