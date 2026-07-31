package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class la extends iw {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final yo f17008d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final dw f17009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(@NotNull C1585w2 adTools, @NotNull yo outcomeReporter, @NotNull dw waterfallInstances) {
        super(adTools, outcomeReporter);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        this.f17008d = outcomeReporter;
        this.f17009e = waterfallInstances;
    }

    @Override // com.ironsource.iw
    public void a() {
    }

    @Override // com.ironsource.iw
    public void b(@NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f17008d.a(this.f17009e.b(), instance);
    }

    @Override // com.ironsource.iw
    public void c(@NotNull AbstractC1424a0 instanceToShow) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
    }

    @Override // com.ironsource.iw
    public void a(@NotNull AbstractC1424a0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }
}
