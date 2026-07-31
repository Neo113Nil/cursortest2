package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface ArgumentsMerger<I, O> {
    boolean compareWithOtherArguments(@NonNull I i4);

    @NonNull
    O mergeFrom(@NonNull I i4);
}
