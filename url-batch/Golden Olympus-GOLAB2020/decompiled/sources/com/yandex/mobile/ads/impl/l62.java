package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.k62;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l62 implements InterfaceC2101n0 {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f28441d = {C1873da.a(l62.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final k62.a f28442a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC1839c0 f28443b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f28444c;

    public l62(@NotNull Activity context, @NotNull o81 trackingListener, @NotNull InterfaceC1839c0 activityBackgroundListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        Intrinsics.checkNotNullParameter(activityBackgroundListener, "activityBackgroundListener");
        this.f28442a = trackingListener;
        this.f28443b = activityBackgroundListener;
        this.f28444c = bo1.a(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2101n0
    public final void a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context context = (Context) this.f28444c.getValue(this, f28441d[0]);
        if (context == null || !Intrinsics.areEqual(context, activity)) {
            return;
        }
        this.f28442a.b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2101n0
    public final void b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context context = (Context) this.f28444c.getValue(this, f28441d[0]);
        if (context == null || !Intrinsics.areEqual(context, activity)) {
            return;
        }
        this.f28442a.a();
    }

    public final void c(@NotNull Activity activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        this.f28443b.b(activityContext, this);
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28443b.a(context, this);
    }
}
