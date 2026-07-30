package io.noties.markwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public interface q {
    <T> void clear(@NonNull o oVar);

    void clearAll();

    @Nullable
    <T> T get(@NonNull o oVar);

    @NonNull
    <T> T get(@NonNull o oVar, @NonNull T t7);

    <T> void set(@NonNull o oVar, @Nullable T t7);
}
