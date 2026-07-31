package com.yandex.div.core;

import O1.C1039s4;
import android.view.View;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface DivCustomContainerViewAdapter {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivCustomContainerViewAdapter STUB = new DivCustomContainerViewAdapter() { // from class: com.yandex.div.core.DivCustomContainerViewAdapter$Companion$STUB$1
        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void bindView(@NotNull View view, @NotNull C1039s4 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(divView, "divView");
            Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
            Intrinsics.checkNotNullParameter(path, "path");
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        @NotNull
        public View createView(@NotNull C1039s4 div, @NotNull Div2View divView, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath path) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(divView, "divView");
            Intrinsics.checkNotNullParameter(expressionResolver, "expressionResolver");
            Intrinsics.checkNotNullParameter(path, "path");
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public boolean isCustomTypeSupported(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return false;
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        @NotNull
        public DivPreloader.PreloadReference preload(@NotNull C1039s4 div, @NotNull DivPreloader.Callback callBack) {
            Intrinsics.checkNotNullParameter(div, "div");
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            return DivPreloader.PreloadReference.Companion.getEMPTY();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void release(@NotNull View view, @NotNull C1039s4 div) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(div, "div");
        }
    };

    @Metadata
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void bindView(@NotNull View view, @NotNull C1039s4 c1039s4, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath);

    @NotNull
    View createView(@NotNull C1039s4 c1039s4, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath);

    boolean isCustomTypeSupported(@NotNull String str);

    @NotNull
    default DivPreloader.PreloadReference preload(@NotNull C1039s4 div, @NotNull DivPreloader.Callback callBack) {
        Intrinsics.checkNotNullParameter(div, "div");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        return DivPreloader.PreloadReference.Companion.getEMPTY();
    }

    void release(@NotNull View view, @NotNull C1039s4 c1039s4);
}
