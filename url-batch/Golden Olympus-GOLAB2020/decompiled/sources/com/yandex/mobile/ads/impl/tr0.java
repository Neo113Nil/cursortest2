package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tr0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final di2 f32559a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final nl0 f32560b;

    private static final class a implements us {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final b f32561a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<ViewGroup> f32562b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final WeakReference<List<mb2>> f32563c;

        public a(@NotNull ViewGroup viewGroup, @NotNull List<mb2> friendlyOverlays, @NotNull b instreamAdLoadListener) {
            Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
            Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
            Intrinsics.checkNotNullParameter(instreamAdLoadListener, "instreamAdLoadListener");
            this.f32561a = instreamAdLoadListener;
            this.f32562b = new WeakReference<>(viewGroup);
            this.f32563c = new WeakReference<>(friendlyOverlays);
        }

        @Override // com.yandex.mobile.ads.impl.us
        public final void a(@NotNull qs instreamAd) {
            Intrinsics.checkNotNullParameter(instreamAd, "instreamAd");
            ViewGroup viewGroup = this.f32562b.get();
            List<mb2> list = this.f32563c.get();
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            if (viewGroup != null) {
                this.f32561a.a(viewGroup, list, instreamAd);
            } else {
                this.f32561a.a("Ad was received but there's no view group to display it");
            }
        }

        @Override // com.yandex.mobile.ads.impl.us
        public final void onInstreamAdFailedToLoad(@NotNull String reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f32561a.a(reason);
        }
    }

    public interface b {
        void a(@NotNull ViewGroup viewGroup, @NotNull List<mb2> list, @NotNull qs qsVar);

        void a(@NotNull String str);
    }

    public tr0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull di2 vmapRequestConfig, @NotNull nl0 instreamAdLoadingController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(vmapRequestConfig, "vmapRequestConfig");
        Intrinsics.checkNotNullParameter(instreamAdLoadingController, "instreamAdLoadingController");
        this.f32559a = vmapRequestConfig;
        this.f32560b = instreamAdLoadingController;
    }

    public final void a() {
        this.f32560b.a((us) null);
    }

    public final void a(@NotNull ViewGroup adViewGroup, @NotNull List<mb2> friendlyOverlays, @NotNull b loadListener) {
        Intrinsics.checkNotNullParameter(adViewGroup, "adViewGroup");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        a aVar = new a(adViewGroup, friendlyOverlays, loadListener);
        nl0 nl0Var = this.f32560b;
        nl0Var.a(aVar);
        nl0Var.a(this.f32559a);
    }
}
