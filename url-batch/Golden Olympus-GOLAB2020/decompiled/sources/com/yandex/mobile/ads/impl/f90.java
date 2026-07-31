package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewGroup f25713a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private dt f25714b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final fe2 f25715c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final y80 f25716d;

    /* renamed from: e, reason: collision with root package name */
    private C2256ti f25717e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ViewTreeObserver.OnPreDrawListener f25718f;

    public /* synthetic */ f90(C2286v2 c2286v2, ViewGroup viewGroup, dt dtVar, fe2 fe2Var) {
        this(c2286v2, viewGroup, dtVar, fe2Var, new y80(c2286v2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a() {
        return true;
    }

    public final void b() {
        C2256ti c2256ti = this.f25717e;
        if (c2256ti == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentController");
            c2256ti = null;
        }
        c2256ti.a();
    }

    public final void a(@NotNull Context context, @NotNull C2360y7 response, @NotNull pz1 nativeAdPrivate, @NotNull List preloadedDivKitDesigns) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        C2256ti a4 = this.f25716d.a(context, response, nativeAdPrivate, preloadedDivKitDesigns, this.f25713a, this.f25714b, this.f25718f, this.f25715c);
        this.f25717e = a4;
        a4.a(null, new e90());
    }

    public f90(@NotNull C2286v2 adConfiguration, @NotNull ViewGroup view, @NotNull dt adEventListener, @NotNull fe2 videoEventController, @NotNull y80 contentControllerCreator) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adEventListener, "adEventListener");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Intrinsics.checkNotNullParameter(contentControllerCreator, "contentControllerCreator");
        this.f25713a = view;
        this.f25714b = adEventListener;
        this.f25715c = videoEventController;
        this.f25716d = contentControllerCreator;
        this.f25718f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.yandex.mobile.ads.impl.I2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean a4;
                a4 = f90.a();
                return a4;
            }
        };
    }
}
