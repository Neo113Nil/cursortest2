package io.appmetrica.analytics;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface ICrashTransformer {
    Throwable process(@NonNull Throwable th);
}
