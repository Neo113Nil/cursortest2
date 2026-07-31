package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.pd;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class vd implements td, pd.a, InterfaceC1596y1 {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f20026f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f20027g = "Fullscreen Progressive Strategy";

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1525o1 f20028a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qd f20029b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sd f20030c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ud f20031d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private be f20032e;

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public vd(@NotNull C1525o1 adTools, @NotNull qd factory, @NotNull sd fullscreenAdUnitListener, @NotNull ud listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f20028a = adTools;
        this.f20029b = factory;
        this.f20030c = fullscreenAdUnitListener;
        this.f20031d = listener;
        this.f20032e = new wd(this, null, false, 4, null);
    }

    @Override // com.ironsource.pd.a
    public void a() {
        this.f20032e.a();
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b() {
        this.f20032e.b();
    }

    @NotNull
    public final C1525o1 c() {
        return this.f20028a;
    }

    @NotNull
    public final qd d() {
        return this.f20029b;
    }

    @NotNull
    public final sd e() {
        return this.f20030c;
    }

    @NotNull
    public final ud f() {
        return this.f20031d;
    }

    @Override // com.ironsource.td
    public void loadAd() {
        this.f20032e.loadAd();
    }

    @Override // com.ironsource.td
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f20032e.a(activity);
    }

    @Override // com.ironsource.InterfaceC1596y1
    public void b(@Nullable IronSourceError ironSourceError) {
        this.f20032e.b(ironSourceError);
    }

    public final void a(@NotNull be state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f20032e = state;
    }

    @Override // com.ironsource.pd.a
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20032e.b(adInfo);
    }

    @Override // com.ironsource.pd.a
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f20032e.a(ironSourceError);
    }

    @Override // com.ironsource.pd.a
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20032e.a(adInfo);
    }

    public final void a(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f20028a.e().h().f("Fullscreen Progressive Strategy - " + message);
    }
}
