package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class s02 implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final n62 f31516a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n41 f31517b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<n02> f31518c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e51 f31519d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final f91 f31520e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final dj1 f31521f;

    public s02(@NotNull n62 trackingUrlHandler, @NotNull n41 clickReporterCreator, @NotNull List<n02> items, @NotNull e51 nativeAdEventController, @NotNull f91 nativeOpenUrlHandlerCreator, @NotNull dj1 popupLifecycleController) {
        Intrinsics.checkNotNullParameter(trackingUrlHandler, "trackingUrlHandler");
        Intrinsics.checkNotNullParameter(clickReporterCreator, "clickReporterCreator");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        Intrinsics.checkNotNullParameter(popupLifecycleController, "popupLifecycleController");
        this.f31516a = trackingUrlHandler;
        this.f31517b = clickReporterCreator;
        this.f31518c = items;
        this.f31519d = nativeAdEventController;
        this.f31520e = nativeOpenUrlHandlerCreator;
        this.f31521f = popupLifecycleController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(@Nullable AdapterView<?> adapterView, @Nullable View view, int i4, long j4) {
        if (i4 < this.f31518c.size()) {
            n02 n02Var = this.f31518c.get(i4);
            this.f31521f.a();
            dr0 a4 = n02Var.a();
            e91 a5 = this.f31520e.a(this.f31517b.a(n02Var.b(), "social_action"));
            this.f31519d.a(a4);
            this.f31516a.a(a4.d());
            String e4 = a4.e();
            if (e4 == null || e4.length() == 0) {
                return;
            }
            a5.a(e4);
        }
    }
}
