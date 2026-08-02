package com.squareup.util.coroutines;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.unit.Velocity;
import androidx.datastore.core.SimpleActor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.wallet.views.PageTagSlot;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TickerKt$tickerFlow$1 extends SuspendLambda implements Function2 {
    public long $delay;
    public long $initialDelay;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerKt$tickerFlow$1(long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$initialDelay = j;
        this.$delay = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                TickerKt$tickerFlow$1 tickerKt$tickerFlow$1 = new TickerKt$tickerFlow$1(this.$initialDelay, this.$delay, continuation);
                tickerKt$tickerFlow$1.L$0 = obj;
                return tickerKt$tickerFlow$1;
            case 1:
                TickerKt$tickerFlow$1 tickerKt$tickerFlow$12 = new TickerKt$tickerFlow$1((ScrollingLogic) this.L$0, continuation, 1);
                tickerKt$tickerFlow$12.$delay = ((Velocity) obj).packedValue;
                return tickerKt$tickerFlow$12;
            default:
                return new TickerKt$tickerFlow$1((PageTagSlot) this.L$0, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((TickerKt$tickerFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                long j = ((Velocity) obj).packedValue;
                TickerKt$tickerFlow$1 tickerKt$tickerFlow$1 = new TickerKt$tickerFlow$1((ScrollingLogic) this.L$0, (Continuation) obj2, 1);
                tickerKt$tickerFlow$1.$delay = j;
                return tickerKt$tickerFlow$1.invokeSuspend(Unit.INSTANCE);
            default:
                ((TickerKt$tickerFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0064, code lost:
    
        if (r14 != r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r14 == r7) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r14 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r13) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014e, code lost:
    
        if (r13.emit(r14, r13) == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r2, r13) == r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:8:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x015b -> B:52:0x013a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long longValue;
        long j6;
        switch (this.$r8$classId) {
            case 0:
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    long j7 = this.$initialDelay;
                    this.L$0 = flowCollector;
                    this.label = 1;
                    break;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            long j8 = this.$delay;
                            this.L$0 = flowCollector;
                            this.label = 3;
                            break;
                        } else if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (!JobKt.isActive(getContext())) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                this.L$0 = flowCollector;
                this.label = 2;
                break;
            case 1:
                ScrollingLogic scrollingLogic = (ScrollingLogic) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    j = this.$delay;
                    SimpleActor simpleActor = scrollingLogic.nestedScrollDispatcher;
                    this.$delay = j;
                    this.label = 1;
                    obj = simpleActor.m1110dispatchPreFlingQWom1Mo(j, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j5 = this.$initialDelay;
                            j4 = this.$delay;
                            SafeTrace.throwOnFailure(obj);
                            return new Velocity(Velocity.m1069minusAH228Gc(j4, Velocity.m1069minusAH228Gc(j5, ((Velocity) obj).packedValue)));
                        }
                        j3 = this.$initialDelay;
                        j2 = this.$delay;
                        SafeTrace.throwOnFailure(obj);
                        long j9 = ((Velocity) obj).packedValue;
                        SimpleActor simpleActor2 = scrollingLogic.nestedScrollDispatcher;
                        long m1069minusAH228Gc = Velocity.m1069minusAH228Gc(j3, j9);
                        this.$delay = j2;
                        this.$initialDelay = j9;
                        this.label = 3;
                        obj = simpleActor2.m1109dispatchPostFlingRZ2iAVY(m1069minusAH228Gc, j9, this);
                        if (obj != coroutineSingletons2) {
                            j4 = j2;
                            j5 = j9;
                            return new Velocity(Velocity.m1069minusAH228Gc(j4, Velocity.m1069minusAH228Gc(j5, ((Velocity) obj).packedValue)));
                        }
                        return coroutineSingletons2;
                    }
                    j = this.$delay;
                    SafeTrace.throwOnFailure(obj);
                }
                long m1069minusAH228Gc2 = Velocity.m1069minusAH228Gc(j, ((Velocity) obj).packedValue);
                this.$delay = j;
                this.$initialDelay = m1069minusAH228Gc2;
                this.label = 2;
                obj = scrollingLogic.m243doFlingAnimationQWom1Mo(m1069minusAH228Gc2, this);
                if (obj != coroutineSingletons2) {
                    j2 = j;
                    j3 = m1069minusAH228Gc2;
                    long j92 = ((Velocity) obj).packedValue;
                    SimpleActor simpleActor22 = scrollingLogic.nestedScrollDispatcher;
                    long m1069minusAH228Gc3 = Velocity.m1069minusAH228Gc(j3, j92);
                    this.$delay = j2;
                    this.$initialDelay = j92;
                    this.label = 3;
                    obj = simpleActor22.m1109dispatchPostFlingRZ2iAVY(m1069minusAH228Gc3, j92, this);
                    if (obj != coroutineSingletons2) {
                    }
                }
                return coroutineSingletons2;
            default:
                PageTagSlot pageTagSlot = (PageTagSlot) this.L$0;
                TagPoseController tagPoseController = pageTagSlot.controller;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                int i4 = 11;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda3 = new CardStudioQueries$$ExternalSyntheticLambda3(i4);
                    this.label = 1;
                    obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda3);
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i3 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    longValue = this.$delay;
                    j6 = this.$initialDelay;
                    SafeTrace.throwOnFailure(obj);
                    long longValue2 = ((Number) obj).longValue();
                    float f = (longValue2 - j6) / 1.0E9f;
                    float f2 = (longValue2 - longValue) / 1.0E9f;
                    pageTagSlot.lastFrameTime = f;
                    if (tagPoseController.isAnimating()) {
                        pageTagSlot.outputState.setValue(tagPoseController.tick(f, f2));
                    }
                    longValue = longValue2;
                    CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda32 = new CardStudioQueries$$ExternalSyntheticLambda3(i4);
                    this.$initialDelay = j6;
                    this.$delay = longValue;
                    this.label = 2;
                    obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda32);
                    break;
                }
                longValue = ((Number) obj).longValue();
                j6 = longValue;
                CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda322 = new CardStudioQueries$$ExternalSyntheticLambda3(i4);
                this.$initialDelay = j6;
                this.$delay = longValue;
                this.label = 2;
                obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda322);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TickerKt$tickerFlow$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
    }
}
