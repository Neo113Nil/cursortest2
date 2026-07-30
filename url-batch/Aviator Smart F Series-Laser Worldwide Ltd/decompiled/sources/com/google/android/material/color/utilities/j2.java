package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Function {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f14834h;

    public /* synthetic */ j2(MaterialDynamicColors materialDynamicColors) {
        this.f14834h = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f14834h.highestSurface((DynamicScheme) obj);
    }
}
