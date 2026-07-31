package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final th2 f28628a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2027jl f28629b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d10 f28630c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<FrameLayout, WeakReference<C2003il>> f28631d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final WeakHashMap<FrameLayout, WeakReference<nk0>> f28632e;

    public /* synthetic */ lk0() {
        this(new th2(), new C2027jl(), new d10());
    }

    public final void a(@NotNull FrameLayout adView) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        WeakReference<C2003il> weakReference = this.f28631d.get(adView);
        C2003il c2003il = weakReference != null ? weakReference.get() : null;
        if (c2003il != null) {
            this.f28631d.remove(adView);
            adView.removeView(c2003il);
        }
        WeakReference<nk0> weakReference2 = this.f28632e.get(adView);
        nk0 nk0Var = weakReference2 != null ? weakReference2.get() : null;
        if (nk0Var != null) {
            this.f28632e.remove(adView);
            adView.removeView(nk0Var);
        }
    }

    public lk0(@NotNull th2 descriptionCreator, @NotNull C2027jl borderViewManager, @NotNull d10 dimensionConverter) {
        Intrinsics.checkNotNullParameter(descriptionCreator, "descriptionCreator");
        Intrinsics.checkNotNullParameter(borderViewManager, "borderViewManager");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f28628a = descriptionCreator;
        this.f28629b = borderViewManager;
        this.f28630c = dimensionConverter;
        this.f28631d = new WeakHashMap<>();
        this.f28632e = new WeakHashMap<>();
    }

    public final void a(@NotNull FrameLayout adView, @NotNull c92 validationResult, boolean z4) {
        nk0 nk0Var;
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(adView, "adView");
        WeakReference<C2003il> weakReference = this.f28631d.get(adView);
        C2003il borderView = weakReference != null ? weakReference.get() : null;
        if (borderView == null) {
            Context context = adView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            borderView = new C2003il(context, this.f28630c, new t40());
            this.f28631d.put(adView, new WeakReference<>(borderView));
            adView.addView(borderView);
        }
        this.f28629b.getClass();
        Intrinsics.checkNotNullParameter(borderView, "borderView");
        borderView.setColor(z4 ? -65536 : -16711936);
        if (z4) {
            WeakReference<nk0> weakReference2 = this.f28632e.get(adView);
            nk0Var = weakReference2 != null ? weakReference2.get() : null;
            if (nk0Var == null) {
                Context context2 = adView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                nk0Var = new nk0(context2, new d10());
                this.f28632e.put(adView, new WeakReference<>(nk0Var));
                adView.addView(nk0Var);
            }
            this.f28628a.getClass();
            nk0Var.setDescription(th2.a(validationResult));
            return;
        }
        WeakReference<nk0> weakReference3 = this.f28632e.get(adView);
        nk0Var = weakReference3 != null ? weakReference3.get() : null;
        if (nk0Var != null) {
            this.f28632e.remove(adView);
            adView.removeView(nk0Var);
        }
    }
}
