package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface OnFailureListener {
    void onFailure(@NotNull Throwable th);
}
