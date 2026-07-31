package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class wd implements be {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vd f20190a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final pd f20191b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20192c;

    public wd(@NotNull vd strategy, @Nullable pd pdVar, boolean z4) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f20190a = strategy;
        this.f20191b = pdVar;
        this.f20192c = z4;
    }

    @Override // com.ironsource.be
    public void a() {
        this.f20190a.a(this.f20192c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.be
    public void b() {
        this.f20190a.a(this.f20192c ? "show success on expired ad" : "show success before load called");
    }

    @Override // com.ironsource.be
    public void loadAd() {
        pd a4 = this.f20190a.d().a(true, this.f20190a.e());
        vd vdVar = this.f20190a;
        vdVar.a(new ae(vdVar, a4));
        a4.a(this.f20190a);
    }

    public /* synthetic */ wd(vd vdVar, pd pdVar, boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(vdVar, pdVar, (i4 & 4) != 0 ? false : z4);
    }

    @Override // com.ironsource.be
    public void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f20190a.f().b(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.f20192c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.be
    public void b(@Nullable IronSourceError ironSourceError) {
        this.f20190a.a(this.f20192c ? "show failed on expired ad" : "show failed before load called");
    }

    @Override // com.ironsource.be
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f20190a.a(this.f20192c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.be
    public void b(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20190a.a(this.f20192c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.be
    public void a(@NotNull LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f20190a.a(this.f20192c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }
}
