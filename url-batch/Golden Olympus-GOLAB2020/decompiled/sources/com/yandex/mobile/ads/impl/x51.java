package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x51 implements a61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f34441a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f34442b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final gs f34443c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<z51> f34444d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ts0 f34445e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private gt f34446f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    private nt f34447g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private wt f34448h;

    public /* synthetic */ x51(Context context, um2 um2Var, gs gsVar) {
        this(context, um2Var, gsVar, new CopyOnWriteArrayList(), new ts0(context), null, null, null);
    }

    public final void a() {
        Iterator<z51> it = this.f34444d.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f34444d.clear();
    }

    public final void b(@NotNull C1918f7 adRequestData, @NotNull k61 requestPolicy) {
        p91 nativeResponseType = p91.f30364e;
        s91 sourceType = s91.f31631c;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(nativeResponseType, "nativeResponseType");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        z51 z51Var = new z51(this.f34441a, this.f34442b, new j61(adRequestData, nativeResponseType, requestPolicy, 1), this, this.f34443c, 464);
        this.f34444d.add(z51Var);
        z51Var.a(this.f34448h);
        z51Var.c();
    }

    public x51(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull gs adType, @NotNull List nativeAdLoadingItems, @NotNull ts0 mainThreadUsageValidator, @Nullable gt gtVar, @Nullable nt ntVar, @Nullable wt wtVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(nativeAdLoadingItems, "nativeAdLoadingItems");
        Intrinsics.checkNotNullParameter(mainThreadUsageValidator, "mainThreadUsageValidator");
        this.f34441a = context;
        this.f34442b = sdkEnvironmentModule;
        this.f34443c = adType;
        this.f34444d = nativeAdLoadingItems;
        this.f34445e = mainThreadUsageValidator;
        this.f34446f = gtVar;
        this.f34447g = ntVar;
        this.f34448h = wtVar;
        mainThreadUsageValidator.a();
    }

    public final void a(@NotNull C1918f7 adRequestData, @NotNull k61 requestPolicy) {
        p91 nativeResponseType = p91.f30362c;
        s91 sourceType = s91.f31631c;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(nativeResponseType, "nativeResponseType");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        z51 z51Var = new z51(this.f34441a, this.f34442b, new j61(adRequestData, nativeResponseType, requestPolicy, 1), this, this.f34443c, 464);
        this.f34444d.add(z51Var);
        z51Var.a(this.f34446f);
        z51Var.c();
    }

    public final void a(@NotNull C1918f7 adRequestData, @NotNull k61 requestPolicy, int i4) {
        p91 nativeResponseType = p91.f30363d;
        s91 sourceType = s91.f31631c;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(nativeResponseType, "nativeResponseType");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        z51 z51Var = new z51(this.f34441a, this.f34442b, new j61(adRequestData, nativeResponseType, requestPolicy, i4), this, null, 496);
        this.f34444d.add(z51Var);
        z51Var.a(this.f34447g);
        z51Var.c();
    }

    @Override // com.yandex.mobile.ads.impl.a61
    public final void a(@NotNull z51 nativeAdLoadingItem) {
        Intrinsics.checkNotNullParameter(nativeAdLoadingItem, "nativeAdLoadingItem");
        this.f34445e.a();
        this.f34444d.remove(nativeAdLoadingItem);
    }

    public final void a(@Nullable gt gtVar) {
        this.f34445e.a();
        this.f34446f = gtVar;
        Iterator<z51> it = this.f34444d.iterator();
        while (it.hasNext()) {
            it.next().a(gtVar);
        }
    }

    public final void a(@Nullable om2 om2Var) {
        this.f34445e.a();
        this.f34447g = om2Var;
        Iterator<z51> it = this.f34444d.iterator();
        while (it.hasNext()) {
            it.next().a(om2Var);
        }
    }

    public final void a(@Nullable xm2 xm2Var) {
        this.f34445e.a();
        this.f34448h = xm2Var;
        Iterator<z51> it = this.f34444d.iterator();
        while (it.hasNext()) {
            it.next().a(xm2Var);
        }
    }
}
