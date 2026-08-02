package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public interface ArgumentsMerger<I, O> {
    boolean compareWithOtherArguments(I i4);

    O mergeFrom(I i4);
}
