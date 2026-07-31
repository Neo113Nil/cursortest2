package com.yandex.div.core.state;

import com.yandex.div.core.view2.Div2View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivStateChangeListener {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivStateChangeListener STUB = new DivStateChangeListener() { // from class: com.yandex.div.core.state.DivStateChangeListener$Companion$STUB$1
        @Override // com.yandex.div.core.state.DivStateChangeListener
        public void onDivAnimatedStateChanged(@NotNull Div2View divView) {
            Intrinsics.checkNotNullParameter(divView, "divView");
        }
    };

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void onDivAnimatedStateChanged(@NotNull Div2View div2View);
}
