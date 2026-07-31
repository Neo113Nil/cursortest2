package io.appmetrica.analytics.coreapi.internal.lifecycle;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ActivityLifecycleListener {
    void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent);
}
