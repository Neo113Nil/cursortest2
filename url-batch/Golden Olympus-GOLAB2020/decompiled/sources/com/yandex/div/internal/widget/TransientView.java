package com.yandex.div.internal.widget;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface TransientView {
    boolean isTransient();

    void transitionFinished(@NotNull View view);

    void transitionStarted(@NotNull View view);
}
