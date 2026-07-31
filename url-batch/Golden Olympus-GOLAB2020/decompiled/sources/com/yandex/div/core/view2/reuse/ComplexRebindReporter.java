package com.yandex.div.core.view2.reuse;

import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.reuse.RebindTask;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ComplexRebindReporter extends ForceRebindReporter {
    default void onComplexRebindFatalNoState() {
    }

    default void onComplexRebindNoDivInState() {
    }

    default void onComplexRebindNoExistingParent() {
    }

    default void onComplexRebindNothingToBind() {
    }

    default void onComplexRebindSuccess() {
    }

    default void onComplexRebindUnsupportedElementException(@NotNull RebindTask.UnsupportedElementException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
    }
}
