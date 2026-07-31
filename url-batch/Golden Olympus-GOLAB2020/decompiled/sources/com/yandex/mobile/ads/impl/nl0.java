package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.y22;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class nl0 implements pl0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f29669a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f29670b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ts0 f29671c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ps0 f29672d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<ol0> f29673e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private us f29674f;

    public /* synthetic */ nl0(Context context, vu1 vu1Var) {
        this(context, vu1Var, new ts0(context), new ps0());
    }

    public final void a(@NotNull final di2 requestConfig) {
        Intrinsics.checkNotNullParameter(requestConfig, "requestConfig");
        this.f29671c.a();
        this.f29672d.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ra
            @Override // java.lang.Runnable
            public final void run() {
                nl0.a(nl0.this, requestConfig);
            }
        });
    }

    public nl0(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ts0 mainThreadUsageValidator, @NotNull ps0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f29669a = context;
        this.f29670b = sdkEnvironmentModule;
        this.f29671c = mainThreadUsageValidator;
        this.f29672d = mainThreadExecutor;
        this.f29673e = new CopyOnWriteArrayList<>();
        mainThreadUsageValidator.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(nl0 this$0, di2 requestConfig) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestConfig, "$requestConfig");
        Context context = this$0.f29669a;
        vu1 vu1Var = this$0.f29670b;
        int i4 = y22.f34782d;
        ol0 ol0Var = new ol0(context, vu1Var, this$0, y22.a.a());
        this$0.f29673e.add(ol0Var);
        ol0Var.a(this$0.f29674f);
        ol0Var.a(requestConfig);
    }

    @Override // com.yandex.mobile.ads.impl.pl0
    public final void a(@NotNull ol0 nativeAdLoadingItem) {
        Intrinsics.checkNotNullParameter(nativeAdLoadingItem, "nativeAdLoadingItem");
        this.f29671c.a();
        this.f29673e.remove(nativeAdLoadingItem);
    }

    public final void a(@Nullable us usVar) {
        this.f29671c.a();
        this.f29674f = usVar;
        Iterator<T> it = this.f29673e.iterator();
        while (it.hasNext()) {
            ((ol0) it.next()).a(usVar);
        }
    }
}
