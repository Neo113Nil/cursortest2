package kotlinx.coroutines.flow;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.i0;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__DelayKt {
    public static final <T> e debounce(e eVar, final long j8) {
        if (j8 >= 0) {
            return j8 == 0 ? eVar : debounceInternal$FlowKt__DelayKt(eVar, new f6.l() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // f6.l
                public final Long invoke(T t7) {
                    return Long.valueOf(j8);
                }

                @Override // f6.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((FlowKt__DelayKt$debounce$2) obj);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> e m1261debounceHG0u8IE(e eVar, long j8) {
        return g.debounce(eVar, DelayKt.m1228toDelayMillisLRDsOJo(j8));
    }

    public static final <T> e debounceDuration(e eVar, final f6.l lVar) {
        return debounceInternal$FlowKt__DelayKt(eVar, new f6.l() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((FlowKt__DelayKt$debounce$3) obj);
            }

            @Override // f6.l
            public final Long invoke(T t7) {
                return Long.valueOf(DelayKt.m1228toDelayMillisLRDsOJo(((k6.a) f6.l.this.invoke(t7)).m274unboximpl()));
            }
        });
    }

    private static final <T> e debounceInternal$FlowKt__DelayKt(e eVar, f6.l lVar) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(lVar, eVar, null));
    }

    public static final ReceiveChannel fixedPeriodTicker(i0 i0Var, long j8, long j9) {
        if (j8 < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j8 + " ms").toString());
        }
        if (j9 >= 0) {
            return ProduceKt.produce$default(i0Var, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j9, j8, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j9 + " ms").toString());
    }

    public static /* synthetic */ ReceiveChannel fixedPeriodTicker$default(i0 i0Var, long j8, long j9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j9 = j8;
        }
        return g.fixedPeriodTicker(i0Var, j8, j9);
    }

    public static final <T> e sample(e eVar, long j8) {
        if (j8 > 0) {
            return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$sample$2(j8, eVar, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    /* renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> e m1262sampleHG0u8IE(e eVar, long j8) {
        return g.sample(eVar, DelayKt.m1228toDelayMillisLRDsOJo(j8));
    }

    /* renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> e m1263timeoutHG0u8IE(e eVar, long j8) {
        return m1264timeoutInternalHG0u8IE$FlowKt__DelayKt(eVar, j8);
    }

    /* renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> e m1264timeoutInternalHG0u8IE$FlowKt__DelayKt(e eVar, long j8) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j8, eVar, null));
    }

    public static final <T> e debounce(e eVar, f6.l lVar) {
        return debounceInternal$FlowKt__DelayKt(eVar, lVar);
    }
}
