package com.yandex.div.core.animation;

import android.util.Log;
import com.yandex.div.data.Variable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class NumberValueProperty extends FloatProperty<Variable.DoubleVariable> {

    @NotNull
    public static final NumberValueProperty INSTANCE = new NumberValueProperty();

    private NumberValueProperty() {
        super("value");
    }

    @Override // android.util.Property
    @NotNull
    public Float get(@NotNull Variable.DoubleVariable target) {
        Intrinsics.checkNotNullParameter(target, "target");
        Object value = target.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Double");
        return Float.valueOf((float) ((Double) value).doubleValue());
    }

    @Override // com.yandex.div.core.animation.FloatProperty
    public void setValue(@NotNull Variable.DoubleVariable target, float f4) {
        Intrinsics.checkNotNullParameter(target, "target");
        Log.i("NumberValueProperty", "set variable value: " + f4);
        target.setValueDirectly(Double.valueOf((double) f4));
    }
}
