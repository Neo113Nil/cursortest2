package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.pd;
import com.ironsource.td;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ce implements td, pd.a, InterfaceC1596y1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1525o1 f15755a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final td.a f15756b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qd f15757c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final sd f15758d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ud f15759e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private pd f15760f;

    public ce(@NotNull C1525o1 adTools, @NotNull td.a config, @NotNull qd fullscreenAdUnitFactory, @NotNull sd fullscreenAdUnitListener, @NotNull ud listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15755a = adTools;
        this.f15756b = config;
        this.f15757c = fullscreenAdUnitFactory;
        this.f15758d = fullscreenAdUnitListener;
        this.f15759e = listener;
    }

    @Override // com.ironsource.pd.a
    public void a() {
        this.f15760f = null;
        this.f15759e.a();
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b() {
        this.f15759e.b();
    }

    @NotNull
    public final C1525o1 c() {
        return this.f15755a;
    }

    @NotNull
    public final td.a d() {
        return this.f15756b;
    }

    @Override // com.ironsource.td
    public void loadAd() {
        pd a4 = this.f15757c.a(true, this.f15758d);
        a4.a(this);
        this.f15760f = a4;
    }

    @Override // com.ironsource.td
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        pd pdVar = this.f15760f;
        if (pdVar != null) {
            pdVar.a(activity, this);
        }
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b(@Nullable IronSourceError ironSourceError) {
        this.f15759e.b(ironSourceError);
    }

    @Override // com.ironsource.pd.a
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f15759e.a(ironSourceError);
    }

    @Override // com.ironsource.pd.a
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f15759e.a(adInfo);
    }

    @Override // com.ironsource.pd.a
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f15759e.onAdInfoChanged(adInfo);
    }
}
