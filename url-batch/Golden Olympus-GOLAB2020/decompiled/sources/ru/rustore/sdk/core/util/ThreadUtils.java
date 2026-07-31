package ru.rustore.sdk.core.util;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ThreadUtils {

    @NotNull
    public static final ThreadUtils INSTANCE = new ThreadUtils();

    private ThreadUtils() {
    }

    public final void checkNonMainThread() {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new IllegalStateException("Expected to be called not on main thread");
        }
    }
}
