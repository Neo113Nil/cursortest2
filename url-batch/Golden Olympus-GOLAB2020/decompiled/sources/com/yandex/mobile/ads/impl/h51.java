package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC1915f4 f26561a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f51 f26562b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final sb1 f26563c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final rw0 f26564d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final e62 f26565e;

    public h51(@NotNull InterfaceC1915f4 adInfoReportDataProviderFactory, @NotNull f51 eventControllerFactory, @NotNull sb1 nativeViewRendererFactory, @NotNull rw0 mediaViewAdapterFactory, @NotNull e62 trackingManagerFactory) {
        Intrinsics.checkNotNullParameter(adInfoReportDataProviderFactory, "adInfoReportDataProviderFactory");
        Intrinsics.checkNotNullParameter(eventControllerFactory, "eventControllerFactory");
        Intrinsics.checkNotNullParameter(nativeViewRendererFactory, "nativeViewRendererFactory");
        Intrinsics.checkNotNullParameter(mediaViewAdapterFactory, "mediaViewAdapterFactory");
        Intrinsics.checkNotNullParameter(trackingManagerFactory, "trackingManagerFactory");
        this.f26561a = adInfoReportDataProviderFactory;
        this.f26562b = eventControllerFactory;
        this.f26563c = nativeViewRendererFactory;
        this.f26564d = mediaViewAdapterFactory;
        this.f26565e = trackingManagerFactory;
    }

    @NotNull
    public final InterfaceC1915f4 a() {
        return this.f26561a;
    }

    @NotNull
    public final f51 b() {
        return this.f26562b;
    }

    @NotNull
    public final rw0 c() {
        return this.f26564d;
    }

    @NotNull
    public final sb1 d() {
        return this.f26563c;
    }

    @NotNull
    public final e62 e() {
        return this.f26565e;
    }
}
