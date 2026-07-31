package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.properties.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ViewsKt {
    @NotNull
    public static final <T> c appearanceAffecting(T t4, @Nullable Function1<? super T, ? extends T> function1) {
        return new AppearanceAffectingViewProperty(t4, function1);
    }

    public static /* synthetic */ c appearanceAffecting$default(Object obj, Function1 function1, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            function1 = null;
        }
        return appearanceAffecting(obj, function1);
    }

    @NotNull
    public static final <T> c dimensionAffecting(T t4, @Nullable Function1<? super T, ? extends T> function1) {
        return new DimensionAffectingViewProperty(t4, function1);
    }

    public static /* synthetic */ c dimensionAffecting$default(Object obj, Function1 function1, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            function1 = null;
        }
        return dimensionAffecting(obj, function1);
    }

    public static final boolean isExact(int i4) {
        return View.MeasureSpec.getMode(i4) == 1073741824;
    }

    public static final boolean isUnspecified(int i4) {
        return View.MeasureSpec.getMode(i4) == 0;
    }

    public static final int makeAtMostSpec(int i4) {
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    public static final int makeExactSpec(int i4) {
        return View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
    }

    public static final int makeUnspecifiedSpec() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
