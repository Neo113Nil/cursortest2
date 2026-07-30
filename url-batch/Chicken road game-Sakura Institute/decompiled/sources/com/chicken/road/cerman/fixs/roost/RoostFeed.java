package com.chicken.road.cerman.fixs.roost;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: RoostFeed.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/chicken/road/cerman/fixs/roost/RoostFeed;", "", "<init>", "()V", "load", "Lcom/chicken/road/cerman/fixs/roost/RoostConfig;", "timeoutMs", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoostFeed {
    public static final int $stable = 0;

    public static /* synthetic */ Object load$default(RoostFeed roostFeed, long j, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 8000;
        }
        return roostFeed.load(j, continuation);
    }

    public final Object load(long j, Continuation<? super RoostConfig> continuation) {
        return TimeoutKt.withTimeoutOrNull(j, new RoostFeed$load$2(null), continuation);
    }
}
