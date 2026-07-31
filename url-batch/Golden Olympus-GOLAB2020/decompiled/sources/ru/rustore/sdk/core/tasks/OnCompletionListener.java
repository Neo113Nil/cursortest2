package ru.rustore.sdk.core.tasks;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface OnCompletionListener {
    void onComplete(@Nullable Throwable th);
}
