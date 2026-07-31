package com.yandex.div.core.animation;

import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class ColorIntValueProperty extends IntegerProperty<Variable.ColorVariable> {

    @NotNull
    public static final ColorIntValueProperty INSTANCE = new ColorIntValueProperty();

    private ColorIntValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    @NotNull
    public Integer get(@NotNull Variable.ColorVariable target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Object value = target.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        return Integer.valueOf(((Color) value).m218unboximpl());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(@NotNull Variable.ColorVariable target, int i4) {
        Intrinsics.checkNotNullParameter(target, "target");
        target.setValueDirectly(Color.m210boximpl(Color.m211constructorimpl(i4)));
    }
}
