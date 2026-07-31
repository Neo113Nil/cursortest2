package io.appmetrica.analytics.coreapi.internal.data;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface StateSerializer<T> {
    @NonNull
    T defaultValue();

    @NonNull
    byte[] toByteArray(@NonNull T t4);

    @NonNull
    T toState(@NonNull byte[] bArr);
}
