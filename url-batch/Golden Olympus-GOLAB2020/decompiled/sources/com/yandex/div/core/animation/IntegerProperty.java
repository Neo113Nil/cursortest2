package com.yandex.div.core.animation;

import android.util.Property;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public abstract class IntegerProperty<T> extends Property<T, Integer> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerProperty(@NotNull String name) {
        super(Integer.TYPE, name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
        set((IntegerProperty<T>) obj, num.intValue());
    }

    public abstract void setValue(T t4, int i4);

    public void set(T t4, int i4) {
        setValue(t4, i4);
    }
}
