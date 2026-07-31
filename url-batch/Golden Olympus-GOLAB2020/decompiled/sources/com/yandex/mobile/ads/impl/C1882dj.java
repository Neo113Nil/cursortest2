package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.dj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1882dj implements InterfaceC1906ej {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24645a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24646b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1882dj(Map map) {
        this(map, cf0.a((Map<String, String>) map, bh0.f23781e0, true), cf0.a((Map<String, String>) map, bh0.f23783f0, true));
        cf0.a((Map<String, String>) map, bh0.f23779d0, true);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1906ej
    public final boolean a() {
        return this.f24646b;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1906ej
    public final boolean b() {
        return this.f24645a;
    }

    public C1882dj(@NotNull Map headers, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f24645a = z4;
        this.f24646b = z5;
    }
}
