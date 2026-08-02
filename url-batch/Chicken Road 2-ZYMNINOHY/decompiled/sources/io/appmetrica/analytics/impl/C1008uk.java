package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* renamed from: io.appmetrica.analytics.impl.uk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1008uk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f12851a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f12852b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12853c;

    public C1008uk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f12851a = sdkIdentifiers;
        this.f12852b = remoteConfigMetaInfo;
        this.f12853c = obj;
    }

    public final C1008uk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C1008uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.f12852b;
    }

    public final Object c() {
        return this.f12853c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008uk)) {
            return false;
        }
        C1008uk c1008uk = (C1008uk) obj;
        return kotlin.jvm.internal.i.a(this.f12851a, c1008uk.f12851a) && kotlin.jvm.internal.i.a(this.f12852b, c1008uk.f12852b) && kotlin.jvm.internal.i.a(this.f12853c, c1008uk.f12853c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f12853c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f12851a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f12852b;
    }

    public final int hashCode() {
        int hashCode = (this.f12852b.hashCode() + (this.f12851a.hashCode() * 31)) * 31;
        Object obj = this.f12853c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f12851a + ", remoteConfigMetaInfo=" + this.f12852b + ", featuresConfig=" + this.f12853c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f12851a;
    }

    public static C1008uk a(C1008uk c1008uk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            sdkIdentifiers = c1008uk.f12851a;
        }
        if ((i4 & 2) != 0) {
            remoteConfigMetaInfo = c1008uk.f12852b;
        }
        if ((i4 & 4) != 0) {
            obj = c1008uk.f12853c;
        }
        c1008uk.getClass();
        return new C1008uk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
