package com.yandex.div.core.view2.logging.bind;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface SimpleRebindReporter extends ForceRebindReporter {
    default void onSimpleRebindException(@NotNull Exception e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
    }

    default void onSimpleRebindFatalNoState() {
    }

    default void onSimpleRebindNoChild() {
    }

    default void onSimpleRebindSuccess() {
    }
}
