package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2326wj implements gp0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f34085a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ts0 f34086b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ps0 f34087c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final fp0 f34088d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<ep0> f34089e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private at f34090f;

    public C2326wj(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor, @NotNull fp0 adItemLoadControllerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(adItemLoadControllerFactory, "adItemLoadControllerFactory");
        this.f34085a = context;
        this.f34086b = mainThreadUsageValidator;
        this.f34087c = mainThreadExecutor;
        this.f34088d = adItemLoadControllerFactory;
        this.f34089e = new CopyOnWriteArrayList<>();
    }

    @Override // com.yandex.mobile.ads.impl.gp0
    public final void a() {
        this.f34086b.a();
        this.f34087c.a();
        Iterator<ep0> it = this.f34089e.iterator();
        while (it.hasNext()) {
            ep0 next = it.next();
            next.a((at) null);
            next.d();
        }
        this.f34089e.clear();
    }

    @Override // com.yandex.mobile.ads.impl.gp0
    public final void a(@NotNull final C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f34086b.a();
        if (this.f34090f == null) {
            po0.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f34087c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Jk
            @Override // java.lang.Runnable
            public final void run() {
                C2326wj.a(C2326wj.this, adRequestData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2326wj this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        ep0 a4 = this$0.f34088d.a(this$0.f34085a, this$0, adRequestData, null);
        this$0.f34089e.add(a4);
        a4.a(adRequestData.a());
        a4.a(this$0.f34090f);
        a4.b(adRequestData);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1987i4
    public final void a(yc0 yc0Var) {
        ep0 loadController = (ep0) yc0Var;
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        if (this.f34090f == null) {
            po0.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        loadController.a((at) null);
        this.f34089e.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.gp0
    public final void a(@Nullable em2 em2Var) {
        this.f34086b.a();
        this.f34090f = em2Var;
        Iterator<ep0> it = this.f34089e.iterator();
        while (it.hasNext()) {
            it.next().a((at) em2Var);
        }
    }
}
