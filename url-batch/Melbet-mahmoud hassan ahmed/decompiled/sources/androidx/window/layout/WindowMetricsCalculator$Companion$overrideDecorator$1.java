package androidx.window.layout;

import f6.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
/* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends h implements l<WindowMetricsCalculator, WindowMetricsCalculator> {
    WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // f6.l
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator windowMetricsCalculator) {
        i.d(windowMetricsCalculator, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(windowMetricsCalculator);
    }
}
