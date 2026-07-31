package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public class pt extends iw {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yo f18730d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final dw f18731e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final AbstractC1466g0 f18732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt(@NotNull C1585w2 adTools, @NotNull yo outcomeReporter, @NotNull dw waterfallInstances, @NotNull AbstractC1466g0 adInstanceLoadStrategy) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
        this.f18730d = outcomeReporter;
        this.f18731e = waterfallInstances;
        this.f18732f = adInstanceLoadStrategy;
    }

    @Override // com.ironsource.iw
    public void a() {
        AbstractC1424a0 a4 = this.f18732f.c().a();
        if (a4 != null) {
            this.f18730d.a(this.f18731e.b(), a4);
        }
    }

    @Override // com.ironsource.iw
    public void b(@NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // com.ironsource.iw
    public void c(@NotNull AbstractC1424a0 instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        this.f18730d.a(this.f18731e.b(), instanceToShow);
    }

    @Override // com.ironsource.iw
    public void a(@NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (!this.f18732f.a(instance) && (!this.f18732f.a() || (instance = this.f18732f.c().a()) == null)) {
            return;
        }
        this.f18730d.a(this.f18731e.b(), instance);
    }
}
