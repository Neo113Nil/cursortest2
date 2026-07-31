package com.my.tracker.plugins;

import android.app.Application;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface MyTrackerPlugin {
    void init(@NonNull MyTrackerPluginConfig myTrackerPluginConfig, @NonNull PluginEventTracker pluginEventTracker, @NonNull Application application);
}
