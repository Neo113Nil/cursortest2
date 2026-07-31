package com.my.tracker.plugins;

import androidx.annotation.NonNull;
import com.my.tracker.obfuscated.C1631f0;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class PluginEventTracker {

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f21652b = Executors.newSingleThreadExecutor();

    /* renamed from: a, reason: collision with root package name */
    private final C1631f0 f21653a;

    private PluginEventTracker(C1631f0 c1631f0) {
        this.f21653a = c1631f0;
    }

    @NonNull
    public static PluginEventTracker newTracker(@NonNull C1631f0 c1631f0) {
        return new PluginEventTracker(c1631f0);
    }

    public static void onBackground(@NonNull Runnable runnable) {
        f21652b.execute(runnable);
    }

    public void trackPluginEvent(int i4, @NonNull byte[] bArr, boolean z4, boolean z5, Runnable runnable) {
        this.f21653a.a(i4, bArr, z4, z5, runnable);
    }
}
