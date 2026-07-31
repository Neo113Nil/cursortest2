package com.yandex.div.internal.viewpool;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ViewFactory<T extends View> {
    @NotNull
    T createView();
}
