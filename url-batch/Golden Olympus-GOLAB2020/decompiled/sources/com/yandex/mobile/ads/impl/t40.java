package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.au0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t40 implements au0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final au0.a f32150a = new au0.a();

    @Override // com.yandex.mobile.ads.impl.au0
    @NotNull
    public final au0.a a(int i4, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        au0.a aVar = this.f32150a;
        aVar.f23449a = makeMeasureSpec;
        aVar.f23450b = makeMeasureSpec;
        return aVar;
    }
}
