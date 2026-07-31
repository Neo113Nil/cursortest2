package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f31 extends kg2<ViewPager2, List<? extends ej0>> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zi0 f25601c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f25602d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f25603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f31(@NotNull ViewPager2 viewPager, @NotNull zi0 imageProvider, @NotNull mp1 reporter, @NotNull C2360y7<?> adResponse) {
        super(viewPager);
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f25601c = imageProvider;
        this.f25602d = reporter;
        this.f25603e = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(ViewPager2 viewPager2, List<? extends ej0> list) {
        ViewPager2 viewPager = viewPager2;
        List<? extends ej0> imageValues = list;
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        return viewPager.getAdapter() instanceof c31;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void b(ViewPager2 viewPager2, List<? extends ej0> list) {
        ViewPager2 viewPager = viewPager2;
        List<? extends ej0> imageValues = list;
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        try {
            viewPager.setAdapter(new c31(this.f25601c, imageValues, this.f25603e));
        } catch (IllegalArgumentException e4) {
            mp1 mp1Var = this.f25602d;
            String message = e4.getMessage();
            if (message == null) {
                message = "IllegalArgumentException: set adapter exception";
            }
            mp1Var.reportError(message, e4);
        }
    }
}
