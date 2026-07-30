package com.drake.net.time;

import com.realsil.sdk.dfu.DfuException;
import f6.p;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.TickerChannelsKt;
import kotlinx.coroutines.channels.TickerMode;
import kotlinx.coroutines.i0;
import kotlinx.coroutines.j0;
import y5.g;
import y5.w;

@d(c = "com.drake.net.time.Interval$launch$1", f = "Interval.kt", i = {}, l = {DfuException.ERROR_BATTERY_LEVEL_LOW}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Interval$launch$1 extends SuspendLambda implements p {
    final /* synthetic */ long $delay;
    Object L$0;
    int label;
    final /* synthetic */ Interval this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Interval$launch$1(Interval interval, long j8, c cVar) {
        super(2, cVar);
        this.this$0 = interval;
        this.$delay = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c create(Object obj, c cVar) {
        return new Interval$launch$1(this.this$0, this.$delay, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x005d -> B:5:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        TimeUnit timeUnit;
        long j8;
        ReceiveChannel receiveChannel;
        ChannelIterator it;
        Interval$launch$1 interval$launch$1;
        Object hasNext;
        List list;
        long j9;
        i0 i0Var;
        List list2;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            g.throwOnFailure(obj);
            Interval interval = this.this$0;
            timeUnit = interval.unit;
            j8 = this.this$0.period;
            interval.ticker = TickerChannelsKt.ticker$default(timeUnit.toMillis(j8), this.$delay, null, TickerMode.FIXED_DELAY, 4, null);
            receiveChannel = this.this$0.ticker;
            if (receiveChannel == null) {
                s.throwUninitializedPropertyAccessException("ticker");
                receiveChannel = null;
            }
            it = receiveChannel.iterator();
            interval$launch$1 = this;
            interval$launch$1.L$0 = it;
            interval$launch$1.label = 1;
            hasNext = it.hasNext(interval$launch$1);
            if (hasNext == coroutine_suspended) {
            }
            if (!((Boolean) hasNext).booleanValue()) {
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) this.L$0;
            g.throwOnFailure(obj);
            hasNext = obj;
            interval$launch$1 = this;
            if (!((Boolean) hasNext).booleanValue()) {
                it.next();
                list = interval$launch$1.this$0.subscribeList;
                Interval interval2 = interval$launch$1.this$0;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((p) it2.next()).invoke(interval2, kotlin.coroutines.jvm.internal.a.boxLong(interval2.getCount()));
                }
                if (interval$launch$1.this$0.getEnd() != -1 && interval$launch$1.this$0.getCount() == interval$launch$1.this$0.getEnd()) {
                    i0Var = interval$launch$1.this$0.scope;
                    if (i0Var != null) {
                        j0.cancel$default(i0Var, null, 1, null);
                    }
                    interval$launch$1.this$0.state = IntervalStatus.STATE_IDLE;
                    list2 = interval$launch$1.this$0.finishList;
                    Interval interval3 = interval$launch$1.this$0;
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((p) it3.next()).invoke(interval3, kotlin.coroutines.jvm.internal.a.boxLong(interval3.getCount()));
                    }
                }
                if (interval$launch$1.this$0.getEnd() != -1) {
                    j9 = interval$launch$1.this$0.start;
                    if (j9 > interval$launch$1.this$0.getEnd()) {
                        interval$launch$1.this$0.setCount(r6.getCount() - 1);
                        interval$launch$1.this$0.countTime = System.currentTimeMillis();
                        interval$launch$1.L$0 = it;
                        interval$launch$1.label = 1;
                        hasNext = it.hasNext(interval$launch$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (!((Boolean) hasNext).booleanValue()) {
                            return w.INSTANCE;
                        }
                    }
                }
                Interval interval4 = interval$launch$1.this$0;
                interval4.setCount(interval4.getCount() + 1);
                interval$launch$1.this$0.countTime = System.currentTimeMillis();
                interval$launch$1.L$0 = it;
                interval$launch$1.label = 1;
                hasNext = it.hasNext(interval$launch$1);
                if (hasNext == coroutine_suspended) {
                }
                if (!((Boolean) hasNext).booleanValue()) {
                }
            }
        }
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, c cVar) {
        return ((Interval$launch$1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
