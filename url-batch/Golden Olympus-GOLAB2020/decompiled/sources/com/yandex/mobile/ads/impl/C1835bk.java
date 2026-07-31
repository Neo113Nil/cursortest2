package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1835bk implements yr1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f23840a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ts0 f23841b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ps0 f23842c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xr1 f23843d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<wr1> f23844e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private ut f23845f;

    public C1835bk(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor, @NotNull xr1 adItemLoadControllerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(adItemLoadControllerFactory, "adItemLoadControllerFactory");
        this.f23840a = context;
        this.f23841b = mainThreadUsageValidator;
        this.f23842c = mainThreadExecutor;
        this.f23843d = adItemLoadControllerFactory;
        this.f23844e = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.yr1
    public final void a() {
        this.f23841b.a();
        this.f23842c.a();
        Iterator<wr1> it = this.f23844e.iterator();
        while (it.hasNext()) {
            wr1 next = it.next();
            next.a((ut) null);
            next.d();
        }
        this.f23844e.clear();
    }

    @Override // com.yandex.mobile.ads.impl.yr1
    public final void a(@NotNull final C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f23841b.a();
        if (this.f23845f == null) {
            po0.c("RewardedAdLoader. RewardedAdLoadListener is on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f23842c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.A0
            @Override // java.lang.Runnable
            public final void run() {
                C1835bk.a(C1835bk.this, adRequestData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C1835bk this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        wr1 a4 = this$0.f23843d.a(this$0.f23840a, this$0, adRequestData, null);
        this$0.f23844e.add(a4);
        a4.a(adRequestData.a());
        a4.a(this$0.f23845f);
        a4.b(adRequestData);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1987i4
    public final void a(yc0 yc0Var) {
        wr1 loadController = (wr1) yc0Var;
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        if (this.f23845f == null) {
            po0.c("RewardedAdLoader. RewardedAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((ut) null);
        this.f23844e.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.yr1
    public final void a(@Nullable tm2 tm2Var) {
        this.f23841b.a();
        this.f23845f = tm2Var;
        Iterator<wr1> it = this.f23844e.iterator();
        while (it.hasNext()) {
            it.next().a((ut) tm2Var);
        }
    }
}
