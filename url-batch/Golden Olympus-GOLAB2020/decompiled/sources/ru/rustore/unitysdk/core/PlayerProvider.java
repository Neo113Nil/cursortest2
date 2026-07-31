package ru.rustore.unitysdk.core;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class PlayerProvider {

    @NotNull
    public static final PlayerProvider INSTANCE = new PlayerProvider();

    @Nullable
    private static volatile IActivityProvider externalActivityProvider;

    private PlayerProvider() {
    }

    @NotNull
    public final Activity getCurrentActivity() {
        Activity currentActivity;
        IActivityProvider iActivityProvider = externalActivityProvider;
        if (iActivityProvider == null || (currentActivity = iActivityProvider.getCurrentActivity()) == null) {
            throw new IllegalStateException("PlayerProvider: activity provider is not set");
        }
        return currentActivity;
    }

    public final void setExternalProvider(@NotNull IActivityProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        externalActivityProvider = provider;
    }
}
