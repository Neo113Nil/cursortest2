package com.yandex.div.internal.template;

import com.yandex.div.internal.template.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class FieldKt {
    @NotNull
    public static final <T> Field<T> clone(@Nullable Field<T> field, boolean z4) {
        if (field == null || Intrinsics.areEqual(field, Field.Null.INSTANCE) || Intrinsics.areEqual(field, Field.Placeholder.INSTANCE)) {
            return Field.Companion.nullField(z4);
        }
        if (field instanceof Field.Value) {
            return new Field.Value(z4, ((Field.Value) field).value);
        }
        if (field instanceof Field.Reference) {
            return new Field.Reference(z4, ((Field.Reference) field).reference);
        }
        throw new IllegalStateException("Unknown field type");
    }
}
