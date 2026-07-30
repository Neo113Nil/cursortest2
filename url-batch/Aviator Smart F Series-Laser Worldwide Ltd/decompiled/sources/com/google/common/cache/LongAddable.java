package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
interface LongAddable {
    void add(long j8);

    void increment();

    long sum();
}
