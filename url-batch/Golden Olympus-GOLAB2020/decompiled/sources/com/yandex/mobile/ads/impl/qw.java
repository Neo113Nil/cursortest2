package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class qw {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mw f30907a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nx f30908b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final vv f30909c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final iw f30910d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final pw f30911e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ww f30912f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<wv> f30913g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<kw> f30914h;

    public qw(@NotNull mw appData, @NotNull nx sdkData, @NotNull vv networkSettingsData, @NotNull iw adaptersData, @NotNull pw consentsData, @NotNull ww debugErrorIndicatorData, @NotNull List<wv> adUnits, @NotNull List<kw> alerts) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
        Intrinsics.checkNotNullParameter(networkSettingsData, "networkSettingsData");
        Intrinsics.checkNotNullParameter(adaptersData, "adaptersData");
        Intrinsics.checkNotNullParameter(consentsData, "consentsData");
        Intrinsics.checkNotNullParameter(debugErrorIndicatorData, "debugErrorIndicatorData");
        Intrinsics.checkNotNullParameter(adUnits, "adUnits");
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        this.f30907a = appData;
        this.f30908b = sdkData;
        this.f30909c = networkSettingsData;
        this.f30910d = adaptersData;
        this.f30911e = consentsData;
        this.f30912f = debugErrorIndicatorData;
        this.f30913g = adUnits;
        this.f30914h = alerts;
    }

    @NotNull
    public final List<wv> a() {
        return this.f30913g;
    }

    @NotNull
    public final iw b() {
        return this.f30910d;
    }

    @NotNull
    public final List<kw> c() {
        return this.f30914h;
    }

    @NotNull
    public final mw d() {
        return this.f30907a;
    }

    @NotNull
    public final pw e() {
        return this.f30911e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw)) {
            return false;
        }
        qw qwVar = (qw) obj;
        return Intrinsics.areEqual(this.f30907a, qwVar.f30907a) && Intrinsics.areEqual(this.f30908b, qwVar.f30908b) && Intrinsics.areEqual(this.f30909c, qwVar.f30909c) && Intrinsics.areEqual(this.f30910d, qwVar.f30910d) && Intrinsics.areEqual(this.f30911e, qwVar.f30911e) && Intrinsics.areEqual(this.f30912f, qwVar.f30912f) && Intrinsics.areEqual(this.f30913g, qwVar.f30913g) && Intrinsics.areEqual(this.f30914h, qwVar.f30914h);
    }

    @NotNull
    public final ww f() {
        return this.f30912f;
    }

    @NotNull
    public final vv g() {
        return this.f30909c;
    }

    @NotNull
    public final nx h() {
        return this.f30908b;
    }

    public final int hashCode() {
        return this.f30914h.hashCode() + C2039k9.a(this.f30913g, (this.f30912f.hashCode() + ((this.f30911e.hashCode() + ((this.f30910d.hashCode() + ((this.f30909c.hashCode() + ((this.f30908b.hashCode() + (this.f30907a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelData(appData=" + this.f30907a + ", sdkData=" + this.f30908b + ", networkSettingsData=" + this.f30909c + ", adaptersData=" + this.f30910d + ", consentsData=" + this.f30911e + ", debugErrorIndicatorData=" + this.f30912f + ", adUnits=" + this.f30913g + ", alerts=" + this.f30914h + ")";
    }
}
