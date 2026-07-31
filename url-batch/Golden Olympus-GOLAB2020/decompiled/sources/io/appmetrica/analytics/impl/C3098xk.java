package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.xk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3098xk implements ModuleRemoteConfig {

    /* renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f40201a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f40202b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f40203c;

    public C3098xk(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f40201a = sdkIdentifiers;
        this.f40202b = remoteConfigMetaInfo;
        this.f40203c = obj;
    }

    @NotNull
    public final C3098xk a(@NotNull SdkIdentifiers sdkIdentifiers, @NotNull RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C3098xk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    @NotNull
    public final RemoteConfigMetaInfo b() {
        return this.f40202b;
    }

    public final Object c() {
        return this.f40203c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3098xk)) {
            return false;
        }
        C3098xk c3098xk = (C3098xk) obj;
        return Intrinsics.areEqual(this.f40201a, c3098xk.f40201a) && Intrinsics.areEqual(this.f40202b, c3098xk.f40202b) && Intrinsics.areEqual(this.f40203c, c3098xk.f40203c);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f40203c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.f40201a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    @NotNull
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f40202b;
    }

    public final int hashCode() {
        int hashCode = (this.f40202b.hashCode() + (this.f40201a.hashCode() * 31)) * 31;
        Object obj = this.f40203c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f40201a + ", remoteConfigMetaInfo=" + this.f40202b + ", featuresConfig=" + this.f40203c + ')';
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.f40201a;
    }

    public static C3098xk a(C3098xk c3098xk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            sdkIdentifiers = c3098xk.f40201a;
        }
        if ((i4 & 2) != 0) {
            remoteConfigMetaInfo = c3098xk.f40202b;
        }
        if ((i4 & 4) != 0) {
            obj = c3098xk.f40203c;
        }
        c3098xk.getClass();
        return new C3098xk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
