package com.yandex.div.internal.viewpool;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public interface ViewPool {
    void changeCapacity(@NotNull String str, int i4);

    @NotNull
    <T extends View> T obtain(@NotNull String str);

    <T extends View> void register(@NotNull String str, @NotNull ViewFactory<T> viewFactory, int i4);
}
