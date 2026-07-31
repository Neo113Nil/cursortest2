package com.yandex.div.serialization;

import com.yandex.div.data.EntityTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface TemplateDeserializer<D, T extends EntityTemplate<?>> extends Deserializer<D, T> {
    @NotNull
    T deserialize(@NotNull ParsingContext parsingContext, @Nullable T t4, D d4);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.serialization.Deserializer
    /* bridge */ /* synthetic */ default Object deserialize(ParsingContext parsingContext, Object obj) {
        return deserialize(parsingContext, (ParsingContext) obj);
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    default T deserialize(@NotNull ParsingContext context, D d4) {
        Intrinsics.checkNotNullParameter(context, "context");
        return deserialize(context, null, d4);
    }
}
