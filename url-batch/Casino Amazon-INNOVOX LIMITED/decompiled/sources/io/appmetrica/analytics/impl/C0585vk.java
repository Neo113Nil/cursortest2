package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0585vk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f1539a;
    public final RemoteConfigMetaInfo b;
    public final Object c;

    public C0585vk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f1539a = sdkIdentifiers;
        this.b = remoteConfigMetaInfo;
        this.c = obj;
    }

    public final C0585vk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C0585vk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final RemoteConfigMetaInfo b() {
        return this.b;
    }

    public final Object c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0585vk)) {
            return false;
        }
        C0585vk c0585vk = (C0585vk) obj;
        return Intrinsics.areEqual(this.f1539a, c0585vk.f1539a) && Intrinsics.areEqual(this.b, c0585vk.b) && Intrinsics.areEqual(this.c, c0585vk.c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f1539a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.f1539a.hashCode() * 31)) * 31;
        Object obj = this.c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f1539a + ", remoteConfigMetaInfo=" + this.b + ", featuresConfig=" + this.c + ')';
    }

    public final SdkIdentifiers a() {
        return this.f1539a;
    }

    public static C0585vk a(C0585vk c0585vk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            sdkIdentifiers = c0585vk.f1539a;
        }
        if ((i & 2) != 0) {
            remoteConfigMetaInfo = c0585vk.b;
        }
        if ((i & 4) != 0) {
            obj = c0585vk.c;
        }
        c0585vk.getClass();
        return new C0585vk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
