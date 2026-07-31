package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.c;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DimensionAffectingViewProperty<T> implements c {

    @Nullable
    private final Function1<T, T> modifier;
    private T propertyValue;

    /* JADX WARN: Multi-variable type inference failed */
    public DimensionAffectingViewProperty(T t4, @Nullable Function1<? super T, ? extends T> function1) {
        this.propertyValue = t4;
        this.modifier = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.c
    public /* bridge */ /* synthetic */ void setValue(Object obj, h hVar, Object obj2) {
        setValue((View) obj, hVar, (h) obj2);
    }

    @Override // kotlin.properties.c
    public T getValue(@NotNull View thisRef, @NotNull h property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.propertyValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setValue(@NotNull View thisRef, @NotNull h property, T t4) {
        Object invoke;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Function1<T, T> function1 = this.modifier;
        if (function1 != null && (invoke = function1.invoke(t4)) != 0) {
            t4 = invoke;
        }
        if (Intrinsics.areEqual(this.propertyValue, t4)) {
            return;
        }
        this.propertyValue = t4;
        thisRef.requestLayout();
    }
}
