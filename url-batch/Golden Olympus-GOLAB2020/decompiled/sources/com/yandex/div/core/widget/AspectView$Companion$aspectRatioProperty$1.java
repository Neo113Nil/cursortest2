package com.yandex.div.core.widget;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class AspectView$Companion$aspectRatioProperty$1 extends s implements Function1<Float, Float> {
    public static final AspectView$Companion$aspectRatioProperty$1 INSTANCE = new AspectView$Companion$aspectRatioProperty$1();

    AspectView$Companion$aspectRatioProperty$1() {
        super(1);
    }

    @NotNull
    public final Float invoke(float f4) {
        return Float.valueOf(g.c(f4, 0.0f));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }
}
