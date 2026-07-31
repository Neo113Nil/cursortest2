package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ko1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class no1 implements ko1.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2379z3 f29713a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final wo1 f29714b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final qo1 f29715c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mo1 f29716d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ko1 f29717e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29718f;

    public no1(@NotNull Context context, @NotNull C1894e7 renderingValidator, @NotNull C2360y7 adResponse, @NotNull C2286v2 adConfiguration, @NotNull EnumC1848c9 adStructureType, @NotNull C2379z3 adIdStorageManager, @NotNull wo1 renderingImpressionTrackingListener, @Nullable qo1 qo1Var, @NotNull mo1 renderTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderingValidator, "renderingValidator");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        Intrinsics.checkNotNullParameter(adIdStorageManager, "adIdStorageManager");
        Intrinsics.checkNotNullParameter(renderingImpressionTrackingListener, "renderingImpressionTrackingListener");
        Intrinsics.checkNotNullParameter(renderTracker, "renderTracker");
        this.f29713a = adIdStorageManager;
        this.f29714b = renderingImpressionTrackingListener;
        this.f29715c = qo1Var;
        this.f29716d = renderTracker;
        this.f29717e = new ko1(renderingValidator, this);
    }

    @Override // com.yandex.mobile.ads.impl.ko1.b
    public final void a() {
        qo1 qo1Var = this.f29715c;
        if (qo1Var != null) {
            qo1Var.a();
        }
        this.f29716d.a();
        this.f29713a.b();
        this.f29714b.f();
    }

    public final void b() {
        if (this.f29718f) {
            return;
        }
        this.f29718f = true;
        this.f29717e.a();
    }

    public final void c() {
        this.f29718f = false;
        this.f29717e.b();
    }

    public final void a(@NotNull h91 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f29716d.a(reportParameterManager);
    }

    public /* synthetic */ no1(Context context, C1894e7 c1894e7, C2360y7 c2360y7, C2286v2 c2286v2, EnumC1848c9 enumC1848c9, C2379z3 c2379z3, wo1 wo1Var, qo1 qo1Var, List list) {
        this(context, c1894e7, c2360y7, c2286v2, enumC1848c9, c2379z3, wo1Var, qo1Var, new mo1(context, c2360y7, c2286v2, enumC1848c9, list));
    }
}
