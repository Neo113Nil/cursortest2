package kotlinx.coroutines.channels;

import j6.v;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.t0;
import y5.w;

/* loaded from: classes5.dex */
public abstract class TickerChannelsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007d -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fixedDelayTicker(long j8, long j9, l lVar, kotlin.coroutines.c cVar) {
        TickerChannelsKt$fixedDelayTicker$1 tickerChannelsKt$fixedDelayTicker$1;
        Object coroutine_suspended;
        int i8;
        l lVar2;
        w wVar;
        if (cVar instanceof TickerChannelsKt$fixedDelayTicker$1) {
            tickerChannelsKt$fixedDelayTicker$1 = (TickerChannelsKt$fixedDelayTicker$1) cVar;
            int i9 = tickerChannelsKt$fixedDelayTicker$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedDelayTicker$1.label = i9 - Integer.MIN_VALUE;
                Object obj = tickerChannelsKt$fixedDelayTicker$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = tickerChannelsKt$fixedDelayTicker$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    tickerChannelsKt$fixedDelayTicker$1.L$0 = lVar;
                    tickerChannelsKt$fixedDelayTicker$1.J$0 = j8;
                    tickerChannelsKt$fixedDelayTicker$1.label = 1;
                    if (DelayKt.delay(j9, tickerChannelsKt$fixedDelayTicker$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i8 == 1) {
                    j8 = tickerChannelsKt$fixedDelayTicker$1.J$0;
                    lVar = (l) tickerChannelsKt$fixedDelayTicker$1.L$0;
                    y5.g.throwOnFailure(obj);
                } else if (i8 == 2) {
                    j8 = tickerChannelsKt$fixedDelayTicker$1.J$0;
                    lVar2 = (l) tickerChannelsKt$fixedDelayTicker$1.L$0;
                    y5.g.throwOnFailure(obj);
                    tickerChannelsKt$fixedDelayTicker$1.L$0 = lVar2;
                    tickerChannelsKt$fixedDelayTicker$1.J$0 = j8;
                    tickerChannelsKt$fixedDelayTicker$1.label = 3;
                    if (DelayKt.delay(j8, tickerChannelsKt$fixedDelayTicker$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lVar = lVar2;
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j8 = tickerChannelsKt$fixedDelayTicker$1.J$0;
                    lVar2 = (l) tickerChannelsKt$fixedDelayTicker$1.L$0;
                    y5.g.throwOnFailure(obj);
                    lVar = lVar2;
                }
                wVar = w.INSTANCE;
                tickerChannelsKt$fixedDelayTicker$1.L$0 = lVar;
                tickerChannelsKt$fixedDelayTicker$1.J$0 = j8;
                tickerChannelsKt$fixedDelayTicker$1.label = 2;
                if (lVar.send(wVar, tickerChannelsKt$fixedDelayTicker$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lVar2 = lVar;
                tickerChannelsKt$fixedDelayTicker$1.L$0 = lVar2;
                tickerChannelsKt$fixedDelayTicker$1.J$0 = j8;
                tickerChannelsKt$fixedDelayTicker$1.label = 3;
                if (DelayKt.delay(j8, tickerChannelsKt$fixedDelayTicker$1) == coroutine_suspended) {
                }
                lVar = lVar2;
                wVar = w.INSTANCE;
                tickerChannelsKt$fixedDelayTicker$1.L$0 = lVar;
                tickerChannelsKt$fixedDelayTicker$1.J$0 = j8;
                tickerChannelsKt$fixedDelayTicker$1.label = 2;
                if (lVar.send(wVar, tickerChannelsKt$fixedDelayTicker$1) == coroutine_suspended) {
                }
            }
        }
        tickerChannelsKt$fixedDelayTicker$1 = new TickerChannelsKt$fixedDelayTicker$1(cVar);
        Object obj2 = tickerChannelsKt$fixedDelayTicker$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = tickerChannelsKt$fixedDelayTicker$1.label;
        if (i8 != 0) {
        }
        wVar = w.INSTANCE;
        tickerChannelsKt$fixedDelayTicker$1.L$0 = lVar;
        tickerChannelsKt$fixedDelayTicker$1.J$0 = j8;
        tickerChannelsKt$fixedDelayTicker$1.label = 2;
        if (lVar.send(wVar, tickerChannelsKt$fixedDelayTicker$1) == coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f3 -> B:13:0x0052). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x010c -> B:13:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object fixedPeriodTicker(long j8, long j9, l lVar, kotlin.coroutines.c cVar) {
        TickerChannelsKt$fixedPeriodTicker$1 tickerChannelsKt$fixedPeriodTicker$1;
        Object coroutine_suspended;
        int i8;
        l lVar2;
        long j10;
        long j11;
        long delayToNanos;
        long j12;
        long j13;
        l lVar3;
        long coerceAtLeast;
        long delayNanosToMillis;
        w wVar;
        if (cVar instanceof TickerChannelsKt$fixedPeriodTicker$1) {
            tickerChannelsKt$fixedPeriodTicker$1 = (TickerChannelsKt$fixedPeriodTicker$1) cVar;
            int i9 = tickerChannelsKt$fixedPeriodTicker$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                tickerChannelsKt$fixedPeriodTicker$1.label = i9 - Integer.MIN_VALUE;
                Object obj = tickerChannelsKt$fixedPeriodTicker$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = tickerChannelsKt$fixedPeriodTicker$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    kotlinx.coroutines.b timeSource = kotlinx.coroutines.c.getTimeSource();
                    long nanoTime = (timeSource != null ? timeSource.nanoTime() : System.nanoTime()) + c1.delayToNanos(j9);
                    lVar2 = lVar;
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar2;
                    j10 = j8;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j10;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = nanoTime;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 1;
                    if (DelayKt.delay(j9, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j11 = nanoTime;
                } else if (i8 == 1) {
                    j11 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
                    long j14 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
                    l lVar4 = (l) tickerChannelsKt$fixedPeriodTicker$1.L$0;
                    y5.g.throwOnFailure(obj);
                    lVar2 = lVar4;
                    j10 = j14;
                } else if (i8 != 2) {
                    if (i8 == 3) {
                        j13 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
                        j12 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
                        lVar3 = (l) tickerChannelsKt$fixedPeriodTicker$1.L$0;
                        y5.g.throwOnFailure(obj);
                    } else {
                        if (i8 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j13 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
                        j12 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
                        lVar3 = (l) tickerChannelsKt$fixedPeriodTicker$1.L$0;
                        y5.g.throwOnFailure(obj);
                    }
                    long j15 = j13;
                    j11 = j12;
                    delayToNanos = j15;
                    lVar2 = lVar3;
                    long j16 = j11 + delayToNanos;
                    wVar = w.INSTANCE;
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar2;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j16;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = delayToNanos;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 2;
                    if (lVar2.send(wVar, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lVar3 = lVar2;
                    j13 = delayToNanos;
                    j12 = j16;
                    kotlinx.coroutines.b timeSource2 = kotlinx.coroutines.c.getTimeSource();
                    long nanoTime2 = timeSource2 == null ? timeSource2.nanoTime() : System.nanoTime();
                    coerceAtLeast = v.coerceAtLeast(j12 - nanoTime2, 0L);
                    if (coerceAtLeast == 0 || j13 == 0) {
                        delayNanosToMillis = c1.delayNanosToMillis(coerceAtLeast);
                        tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar3;
                        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j12;
                        tickerChannelsKt$fixedPeriodTicker$1.J$1 = j13;
                        tickerChannelsKt$fixedPeriodTicker$1.label = 4;
                        if (DelayKt.delay(delayNanosToMillis, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        long j17 = j13 - ((nanoTime2 - j12) % j13);
                        j12 = nanoTime2 + j17;
                        long delayNanosToMillis2 = c1.delayNanosToMillis(j17);
                        tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar3;
                        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j12;
                        tickerChannelsKt$fixedPeriodTicker$1.J$1 = j13;
                        tickerChannelsKt$fixedPeriodTicker$1.label = 3;
                        if (DelayKt.delay(delayNanosToMillis2, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    long j152 = j13;
                    j11 = j12;
                    delayToNanos = j152;
                    lVar2 = lVar3;
                    long j162 = j11 + delayToNanos;
                    wVar = w.INSTANCE;
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar2;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j162;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = delayToNanos;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 2;
                    if (lVar2.send(wVar, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
                    }
                } else {
                    j13 = tickerChannelsKt$fixedPeriodTicker$1.J$1;
                    j12 = tickerChannelsKt$fixedPeriodTicker$1.J$0;
                    lVar3 = (l) tickerChannelsKt$fixedPeriodTicker$1.L$0;
                    y5.g.throwOnFailure(obj);
                    kotlinx.coroutines.b timeSource22 = kotlinx.coroutines.c.getTimeSource();
                    if (timeSource22 == null) {
                    }
                    coerceAtLeast = v.coerceAtLeast(j12 - nanoTime2, 0L);
                    if (coerceAtLeast == 0) {
                    }
                    delayNanosToMillis = c1.delayNanosToMillis(coerceAtLeast);
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar3;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j12;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = j13;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 4;
                    if (DelayKt.delay(delayNanosToMillis, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
                    }
                    long j1522 = j13;
                    j11 = j12;
                    delayToNanos = j1522;
                    lVar2 = lVar3;
                    long j1622 = j11 + delayToNanos;
                    wVar = w.INSTANCE;
                    tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar2;
                    tickerChannelsKt$fixedPeriodTicker$1.J$0 = j1622;
                    tickerChannelsKt$fixedPeriodTicker$1.J$1 = delayToNanos;
                    tickerChannelsKt$fixedPeriodTicker$1.label = 2;
                    if (lVar2.send(wVar, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
                    }
                }
                delayToNanos = c1.delayToNanos(j10);
                long j16222 = j11 + delayToNanos;
                wVar = w.INSTANCE;
                tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar2;
                tickerChannelsKt$fixedPeriodTicker$1.J$0 = j16222;
                tickerChannelsKt$fixedPeriodTicker$1.J$1 = delayToNanos;
                tickerChannelsKt$fixedPeriodTicker$1.label = 2;
                if (lVar2.send(wVar, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
                }
            }
        }
        tickerChannelsKt$fixedPeriodTicker$1 = new TickerChannelsKt$fixedPeriodTicker$1(cVar);
        Object obj2 = tickerChannelsKt$fixedPeriodTicker$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = tickerChannelsKt$fixedPeriodTicker$1.label;
        if (i8 != 0) {
        }
        delayToNanos = c1.delayToNanos(j10);
        long j162222 = j11 + delayToNanos;
        wVar = w.INSTANCE;
        tickerChannelsKt$fixedPeriodTicker$1.L$0 = lVar2;
        tickerChannelsKt$fixedPeriodTicker$1.J$0 = j162222;
        tickerChannelsKt$fixedPeriodTicker$1.J$1 = delayToNanos;
        tickerChannelsKt$fixedPeriodTicker$1.label = 2;
        if (lVar2.send(wVar, tickerChannelsKt$fixedPeriodTicker$1) == coroutine_suspended) {
        }
    }

    public static final ReceiveChannel ticker(long j8, long j9, CoroutineContext coroutineContext, TickerMode tickerMode) {
        if (j8 < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j8 + " ms").toString());
        }
        if (j9 >= 0) {
            return ProduceKt.produce(e1.INSTANCE, t0.getUnconfined().plus(coroutineContext), 0, new TickerChannelsKt$ticker$3(tickerMode, j8, j9, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j9 + " ms").toString());
    }

    public static /* synthetic */ ReceiveChannel ticker$default(long j8, long j9, CoroutineContext coroutineContext, TickerMode tickerMode, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j9 = j8;
        }
        if ((i8 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i8 & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return ticker(j8, j9, coroutineContext, tickerMode);
    }
}
