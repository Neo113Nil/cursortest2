package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final sf f45166a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final cc f45167b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final p0 f45168c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final il f45169d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final y7 f45170e;

    public wf(@NotNull sf dataSource, @NotNull cc productPurchaseStatusMapper, @NotNull p0 applicationPurchaseStatusMapper, @NotNull il subscriptionPurchaseStatusMapper, @NotNull y7 logger) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(productPurchaseStatusMapper, "productPurchaseStatusMapper");
        Intrinsics.checkNotNullParameter(applicationPurchaseStatusMapper, "applicationPurchaseStatusMapper");
        Intrinsics.checkNotNullParameter(subscriptionPurchaseStatusMapper, "subscriptionPurchaseStatusMapper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f45166a = dataSource;
        this.f45167b = productPurchaseStatusMapper;
        this.f45168c = applicationPurchaseStatusMapper;
        this.f45169d = subscriptionPurchaseStatusMapper;
        this.f45170e = logger;
    }
}
