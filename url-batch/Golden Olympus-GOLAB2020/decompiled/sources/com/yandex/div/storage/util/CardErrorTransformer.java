package com.yandex.div.storage.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface CardErrorTransformer {

    @Metadata
    public static final class Composite implements CardErrorTransformer {

        @NotNull
        private final CardErrorTransformer[] transformers;

        public Composite(@NotNull CardErrorTransformer... transformers) {
            Intrinsics.checkNotNullParameter(transformers, "transformers");
            this.transformers = transformers;
        }
    }
}
