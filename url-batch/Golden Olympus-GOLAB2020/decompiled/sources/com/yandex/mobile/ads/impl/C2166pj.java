package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2166pj implements Cif {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f30457a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ts0 f30458b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ps0 f30459c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2045kf f30460d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<C1974hf> f30461e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private js f30462f;

    public C2166pj(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor, @NotNull C2045kf adLoadControllerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        Intrinsics.checkNotNullParameter(adLoadControllerFactory, "adLoadControllerFactory");
        this.f30457a = context;
        this.f30458b = mainThreadUsageValidator;
        this.f30459c = mainThreadExecutor;
        this.f30460d = adLoadControllerFactory;
        this.f30461e = new CopyOnWriteArrayList<>();
        mainThreadUsageValidator.a();
    }

    @Override // com.yandex.mobile.ads.impl.Cif
    public final void a() {
        this.f30458b.a();
        this.f30459c.a();
        Iterator<C1974hf> it = this.f30461e.iterator();
        while (it.hasNext()) {
            C1974hf next = it.next();
            next.a((js) null);
            next.d();
        }
        this.f30461e.clear();
    }

    @Override // com.yandex.mobile.ads.impl.Cif
    public final void a(@NotNull final C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f30458b.a();
        this.f30459c.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Xb
            @Override // java.lang.Runnable
            public final void run() {
                C2166pj.a(C2166pj.this, adRequestData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2166pj this$0, C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adRequestData, "$adRequestData");
        C1974hf a4 = this$0.f30460d.a(this$0.f30457a, this$0, adRequestData, null);
        this$0.f30461e.add(a4);
        a4.a(adRequestData.a());
        a4.a(this$0.f30462f);
        a4.b(adRequestData);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1987i4
    public final void a(yc0 yc0Var) {
        C1974hf loadController = (C1974hf) yc0Var;
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        this.f30458b.a();
        loadController.a((js) null);
        this.f30461e.remove(loadController);
    }

    @Override // com.yandex.mobile.ads.impl.Cif
    public final void a(@Nullable hl2 hl2Var) {
        this.f30458b.a();
        this.f30462f = hl2Var;
        Iterator<C1974hf> it = this.f30461e.iterator();
        while (it.hasNext()) {
            it.next().a((js) hl2Var);
        }
    }
}
