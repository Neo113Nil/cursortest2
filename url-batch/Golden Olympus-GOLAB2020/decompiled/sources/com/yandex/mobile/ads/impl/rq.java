package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.au0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class rq implements au0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final au0.a f31327a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final au0[] f31328b;

    public rq(@NotNull au0... measureSpecProviders) {
        Intrinsics.checkNotNullParameter(measureSpecProviders, "measureSpecProviders");
        this.f31327a = new au0.a();
        this.f31328b = measureSpecProviders;
    }

    @Override // com.yandex.mobile.ads.impl.au0
    @NotNull
    public final au0.a a(int i4, int i5) {
        au0[] au0VarArr = this.f31328b;
        int length = au0VarArr.length;
        int i6 = 0;
        while (i6 < length) {
            au0.a a4 = au0VarArr[i6].a(i4, i5);
            int i7 = a4.f23449a;
            i6++;
            i5 = a4.f23450b;
            i4 = i7;
        }
        au0.a aVar = this.f31327a;
        aVar.f23449a = i4;
        aVar.f23450b = i5;
        return aVar;
    }
}
