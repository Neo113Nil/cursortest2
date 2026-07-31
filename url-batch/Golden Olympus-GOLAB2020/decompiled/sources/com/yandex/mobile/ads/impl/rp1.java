package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rp1 extends sp1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kw0 f31323a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f31324b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ byte[] f31325c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f31326d;

    rp1(kw0 kw0Var, byte[] bArr, int i4, int i5) {
        this.f31323a = kw0Var;
        this.f31324b = i4;
        this.f31325c = bArr;
        this.f31326d = i5;
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final long a() {
        return this.f31324b;
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    @Nullable
    public final kw0 b() {
        return this.f31323a;
    }

    @Override // com.yandex.mobile.ads.impl.sp1
    public final void a(@NotNull okio.f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.f31325c, this.f31326d, this.f31324b);
    }
}
