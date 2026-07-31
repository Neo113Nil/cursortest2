package org.koin.core.time;

import kotlin.Metadata;
import kotlin.time.Duration;

/* compiled from: DurationExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"inMs", "", "Lkotlin/time/Duration;", "getInMs-LRDsOJo", "(J)D", "koin-core"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DurationExtKt {
    /* renamed from: getInMs-LRDsOJo, reason: not valid java name */
    public static final double m11443getInMsLRDsOJo(long j) {
        return Duration.m10944getInWholeMicrosecondsimpl(j) / 1000.0d;
    }
}
