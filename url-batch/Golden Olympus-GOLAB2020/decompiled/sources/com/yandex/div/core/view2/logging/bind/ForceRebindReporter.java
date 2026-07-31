package com.yandex.div.core.view2.logging.bind;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public interface ForceRebindReporter {
    default void onFirstBindingCompleted() {
    }

    default void onForceRebindFatalNoState() {
    }

    default void onForceRebindSuccess() {
    }
}
