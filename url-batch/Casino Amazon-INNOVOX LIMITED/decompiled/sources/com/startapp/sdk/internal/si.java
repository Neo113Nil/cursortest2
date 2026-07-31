package com.startapp.sdk.internal;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class si implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Long.valueOf(((r2) obj).f), Long.valueOf(((r2) obj2).f));
    }
}
