package com.yandex.div.core;

import O1.C1165z4;
import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivDataChangeListener {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivDataChangeListener STUB = new DivDataChangeListener() { // from class: com.yandex.div.core.DivDataChangeListener$Companion$STUB$1
        @Override // com.yandex.div.core.DivDataChangeListener
        public void afterAnimatedDataChange(@NotNull Div2View divView, @NotNull C1165z4 data) {
            Intrinsics.checkNotNullParameter(divView, "divView");
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // com.yandex.div.core.DivDataChangeListener
        public void beforeAnimatedDataChange(@NotNull Div2View divView, @NotNull C1165z4 data) {
            Intrinsics.checkNotNullParameter(divView, "divView");
            Intrinsics.checkNotNullParameter(data, "data");
        }
    };

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void afterAnimatedDataChange(@NotNull Div2View div2View, @NotNull C1165z4 c1165z4);

    void beforeAnimatedDataChange(@NotNull Div2View div2View, @NotNull C1165z4 c1165z4);
}
