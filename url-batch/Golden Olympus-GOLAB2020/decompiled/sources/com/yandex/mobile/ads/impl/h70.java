package com.yandex.mobile.ads.impl;

import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h70 implements bq0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f26631b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private final RectF f26632c;

    public h70(int i4, @Nullable RectF rectF) {
        this.f26631b = i4;
        this.f26632c = rectF;
    }

    @Override // com.yandex.mobile.ads.impl.bq0
    @NotNull
    public final String a() {
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        Integer valueOf = Integer.valueOf(this.f26631b);
        RectF rectF = this.f26632c;
        return C2284v0.a(new Object[]{valueOf, rectF != null ? C2284v0.a(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4, "{x:%s,y:%s,width:%s,height:%s}", "format(...)") : null}, 2, "exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", "format(...)");
    }
}
