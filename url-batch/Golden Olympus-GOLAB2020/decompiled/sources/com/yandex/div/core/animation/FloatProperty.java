package com.yandex.div.core.animation;

import android.util.Property;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class FloatProperty<T> extends Property<T, Float> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatProperty(@NotNull String name) {
        super(Float.TYPE, name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Float f4) {
        set((FloatProperty<T>) obj, f4.floatValue());
    }

    public abstract void setValue(T t4, float f4);

    public void set(T t4, float f4) {
        setValue(t4, f4);
    }
}
