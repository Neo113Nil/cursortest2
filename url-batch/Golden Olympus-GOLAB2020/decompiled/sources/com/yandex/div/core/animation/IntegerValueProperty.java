package com.yandex.div.core.animation;

import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class IntegerValueProperty extends IntegerProperty<Variable.IntegerVariable> {

    @NotNull
    public static final IntegerValueProperty INSTANCE = new IntegerValueProperty();

    private IntegerValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    @NotNull
    public Integer get(@NotNull Variable.IntegerVariable target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Object value = target.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Long");
        return Integer.valueOf((int) ((Long) value).longValue());
    }

    @Override // com.yandex.div.core.animation.IntegerProperty
    public void setValue(@NotNull Variable.IntegerVariable target, int i4) {
        Intrinsics.checkNotNullParameter(target, "target");
        target.setValueDirectly(Long.valueOf(i4));
    }
}
