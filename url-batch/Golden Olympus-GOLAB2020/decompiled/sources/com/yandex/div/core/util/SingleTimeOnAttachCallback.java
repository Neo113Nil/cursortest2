package com.yandex.div.core.util;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class SingleTimeOnAttachCallback {

    @Nullable
    private Function0<Unit> onAttachAction;

    public SingleTimeOnAttachCallback(@NotNull View view, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.onAttachAction = function0;
        if (view.isAttachedToWindow()) {
            onAttach();
        }
    }

    public final void cancel() {
        this.onAttachAction = null;
    }

    public final void onAttach() {
        Function0<Unit> function0 = this.onAttachAction;
        if (function0 != null) {
            function0.invoke();
        }
        this.onAttachAction = null;
    }
}
