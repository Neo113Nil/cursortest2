package ru.rustore.sdk.core.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ActivityResult {
    public static final int ACTIVITY_NOT_FOUND = 2;

    @NotNull
    public static final ActivityResult INSTANCE = new ActivityResult();

    private ActivityResult() {
    }
}
