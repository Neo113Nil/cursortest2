package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mw f24346a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nx f24347b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<cz0> f24348c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final pw f24349d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ww f24350e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private final dx f24351f;

    public cx(@NotNull mw appData, @NotNull nx sdkData, @NotNull ArrayList mediationNetworksData, @NotNull pw consentsData, @NotNull ww debugErrorIndicatorData, @Nullable dx dxVar) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
        Intrinsics.checkNotNullParameter(mediationNetworksData, "mediationNetworksData");
        Intrinsics.checkNotNullParameter(consentsData, "consentsData");
        Intrinsics.checkNotNullParameter(debugErrorIndicatorData, "debugErrorIndicatorData");
        this.f24346a = appData;
        this.f24347b = sdkData;
        this.f24348c = mediationNetworksData;
        this.f24349d = consentsData;
        this.f24350e = debugErrorIndicatorData;
        this.f24351f = dxVar;
    }

    @NotNull
    public final mw a() {
        return this.f24346a;
    }

    @NotNull
    public final pw b() {
        return this.f24349d;
    }

    @NotNull
    public final ww c() {
        return this.f24350e;
    }

    @Nullable
    public final dx d() {
        return this.f24351f;
    }

    @NotNull
    public final List<cz0> e() {
        return this.f24348c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return Intrinsics.areEqual(this.f24346a, cxVar.f24346a) && Intrinsics.areEqual(this.f24347b, cxVar.f24347b) && Intrinsics.areEqual(this.f24348c, cxVar.f24348c) && Intrinsics.areEqual(this.f24349d, cxVar.f24349d) && Intrinsics.areEqual(this.f24350e, cxVar.f24350e) && Intrinsics.areEqual(this.f24351f, cxVar.f24351f);
    }

    @NotNull
    public final nx f() {
        return this.f24347b;
    }

    public final int hashCode() {
        int hashCode = (this.f24350e.hashCode() + ((this.f24349d.hashCode() + C2039k9.a(this.f24348c, (this.f24347b.hashCode() + (this.f24346a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        dx dxVar = this.f24351f;
        return hashCode + (dxVar == null ? 0 : dxVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.f24346a + ", sdkData=" + this.f24347b + ", mediationNetworksData=" + this.f24348c + ", consentsData=" + this.f24349d + ", debugErrorIndicatorData=" + this.f24350e + ", logsData=" + this.f24351f + ")";
    }
}
