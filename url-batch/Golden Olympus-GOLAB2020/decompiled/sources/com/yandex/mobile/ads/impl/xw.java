package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class xw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<kw> f34687a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mw f34688b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ox f34689c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final vv f34690d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final iw f34691e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final pw f34692f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ww f34693g;

    public xw(@NotNull List<kw> alertsData, @NotNull mw appData, @NotNull ox sdkIntegrationData, @NotNull vv adNetworkSettingsData, @NotNull iw adaptersData, @NotNull pw consentsData, @NotNull ww debugErrorIndicatorData) {
        Intrinsics.checkNotNullParameter(alertsData, "alertsData");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(sdkIntegrationData, "sdkIntegrationData");
        Intrinsics.checkNotNullParameter(adNetworkSettingsData, "adNetworkSettingsData");
        Intrinsics.checkNotNullParameter(adaptersData, "adaptersData");
        Intrinsics.checkNotNullParameter(consentsData, "consentsData");
        Intrinsics.checkNotNullParameter(debugErrorIndicatorData, "debugErrorIndicatorData");
        this.f34687a = alertsData;
        this.f34688b = appData;
        this.f34689c = sdkIntegrationData;
        this.f34690d = adNetworkSettingsData;
        this.f34691e = adaptersData;
        this.f34692f = consentsData;
        this.f34693g = debugErrorIndicatorData;
    }

    @NotNull
    public final vv a() {
        return this.f34690d;
    }

    @NotNull
    public final iw b() {
        return this.f34691e;
    }

    @NotNull
    public final mw c() {
        return this.f34688b;
    }

    @NotNull
    public final pw d() {
        return this.f34692f;
    }

    @NotNull
    public final ww e() {
        return this.f34693g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        return Intrinsics.areEqual(this.f34687a, xwVar.f34687a) && Intrinsics.areEqual(this.f34688b, xwVar.f34688b) && Intrinsics.areEqual(this.f34689c, xwVar.f34689c) && Intrinsics.areEqual(this.f34690d, xwVar.f34690d) && Intrinsics.areEqual(this.f34691e, xwVar.f34691e) && Intrinsics.areEqual(this.f34692f, xwVar.f34692f) && Intrinsics.areEqual(this.f34693g, xwVar.f34693g);
    }

    @NotNull
    public final ox f() {
        return this.f34689c;
    }

    public final int hashCode() {
        return this.f34693g.hashCode() + ((this.f34692f.hashCode() + ((this.f34691e.hashCode() + ((this.f34690d.hashCode() + ((this.f34689c.hashCode() + ((this.f34688b.hashCode() + (this.f34687a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelFeedData(alertsData=" + this.f34687a + ", appData=" + this.f34688b + ", sdkIntegrationData=" + this.f34689c + ", adNetworkSettingsData=" + this.f34690d + ", adaptersData=" + this.f34691e + ", consentsData=" + this.f34692f + ", debugErrorIndicatorData=" + this.f34693g + ")";
    }
}
