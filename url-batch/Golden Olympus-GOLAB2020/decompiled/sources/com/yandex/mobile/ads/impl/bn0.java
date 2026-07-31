package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bn0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ri0 f23874a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2105n4 f23875b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2140og f23876c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final jj0 f23877d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final iu f23878e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final lj0 f23879f;

    public interface a {
        void h(@NotNull ob2<on0> ob2Var);
    }

    public bn0(@NotNull ri0 imageLoadManager, @NotNull C2105n4 adLoadingPhasesManager) {
        Intrinsics.checkNotNullParameter(imageLoadManager, "imageLoadManager");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f23874a = imageLoadManager;
        this.f23875b = adLoadingPhasesManager;
        this.f23876c = new C2140og();
        this.f23877d = new jj0();
        this.f23878e = new iu();
        this.f23879f = new lj0();
    }

    public final void a(@NotNull ob2 videoAdInfo, @NotNull zi0 imageProvider, @NotNull mn0 loadListener) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        iu iuVar = this.f23878e;
        hu b4 = videoAdInfo.b();
        iuVar.getClass();
        List<? extends C2276uf<?>> a4 = iu.a(b4);
        Set<ej0> a5 = this.f23879f.a(a4, null);
        C2105n4 c2105n4 = this.f23875b;
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28858o;
        C2001ij.a(c2105n4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        this.f23874a.a(a5, new cn0(this, a4, imageProvider, loadListener, videoAdInfo));
    }
}
