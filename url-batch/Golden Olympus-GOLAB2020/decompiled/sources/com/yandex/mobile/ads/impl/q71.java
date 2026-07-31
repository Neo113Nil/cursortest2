package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q71<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final s71 f30698a;

    public /* synthetic */ q71(a91 a91Var, fe2 fe2Var) {
        this(a91Var, fe2Var, new r71(fe2Var, a91Var));
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        s71 s71Var = this.f30698a;
        if (s71Var != null) {
            s71Var.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        s71 s71Var = this.f30698a;
        if (s71Var != null) {
            s71Var.c();
        }
    }

    public q71(@NotNull a91 nativeMediaContent, @NotNull fe2 videoEventController, @NotNull r71 contentCompleteControllerFactory) {
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(contentCompleteControllerFactory, "contentCompleteControllerFactory");
        this.f30698a = contentCompleteControllerFactory.a();
    }
}
