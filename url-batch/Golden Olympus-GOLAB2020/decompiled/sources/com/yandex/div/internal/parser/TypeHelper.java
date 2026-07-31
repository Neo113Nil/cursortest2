package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface TypeHelper<T> {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final <T> TypeHelper<T> from(@NotNull final T t4, @NotNull final Function1<Object, Boolean> validator) {
            Intrinsics.checkNotNullParameter(t4, "default");
            Intrinsics.checkNotNullParameter(validator, "validator");
            return new TypeHelper<T>(t4, validator) { // from class: com.yandex.div.internal.parser.TypeHelper$Companion$from$1
                final /* synthetic */ Function1<Object, Boolean> $validator;

                @NotNull
                private final T typeDefault;

                {
                    this.$validator = validator;
                    this.typeDefault = t4;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                @NotNull
                public T getTypeDefault() {
                    return this.typeDefault;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                public boolean isTypeValid(@NotNull Object value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return ((Boolean) this.$validator.invoke(value)).booleanValue();
                }
            };
        }
    }

    T getTypeDefault();

    boolean isTypeValid(@NotNull Object obj);
}
