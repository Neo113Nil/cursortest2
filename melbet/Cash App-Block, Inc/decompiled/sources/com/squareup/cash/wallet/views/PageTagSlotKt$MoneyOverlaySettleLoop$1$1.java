package com.squareup.cash.wallet.views;

import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PageTagSlotKt$MoneyOverlaySettleLoop$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $hasWriter$delegate;
    public final /* synthetic */ PageTagSlot $slot;
    public float F$0;
    public long J$0;
    public long J$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageTagSlotKt$MoneyOverlaySettleLoop$1$1(PageTagSlot pageTagSlot, State state, Continuation continuation) {
        super(2, continuation);
        this.$slot = pageTagSlot;
        this.$hasWriter$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PageTagSlotKt$MoneyOverlaySettleLoop$1$1(this.$slot, this.$hasWriter$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageTagSlotKt$MoneyOverlaySettleLoop$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0095, code lost:
    
        if (r15 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r15 == r2) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0095 -> B:6:0x0098). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        long longValue;
        long j;
        PageTagSlot pageTagSlot = this.$slot;
        TagPoseController tagPoseController = pageTagSlot.controller;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (((Boolean) this.$hasWriter$delegate.getValue()).booleanValue()) {
                return Unit.INSTANCE;
            }
            f = pageTagSlot.lastFrameTime;
            tagPoseController.tick(f, RecyclerView.DECELERATION_RATE);
            WandPose currentPose = tagPoseController.getCurrentPose();
            WandPose wandPose = WandPose.Still;
            if (currentPose != wandPose) {
                tagPoseController.setPose(wandPose);
            }
            CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda3 = new CardStudioQueries$$ExternalSyntheticLambda3(11);
            this.F$0 = f;
            this.label = 1;
            obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda3);
        } else if (i == 1) {
            f = this.F$0;
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            longValue = this.J$1;
            j = this.J$0;
            f = this.F$0;
            SafeTrace.throwOnFailure(obj);
            long longValue2 = ((Number) obj).longValue();
            float f2 = ((longValue2 - j) / 1.0E9f) + f;
            pageTagSlot.lastFrameTime = f2;
            pageTagSlot.outputState.setValue(tagPoseController.tick(f2, (longValue2 - longValue) / 1.0E9f));
            longValue = longValue2;
            if (pageTagSlot.writerCount$delegate.getIntValue() == 0 || !tagPoseController.isAnimating()) {
                return Unit.INSTANCE;
            }
            CardStudioQueries$$ExternalSyntheticLambda3 cardStudioQueries$$ExternalSyntheticLambda32 = new CardStudioQueries$$ExternalSyntheticLambda3(11);
            this.F$0 = f;
            this.J$0 = j;
            this.J$1 = longValue;
            this.label = 2;
            obj = Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardStudioQueries$$ExternalSyntheticLambda32);
        }
        longValue = ((Number) obj).longValue();
        j = longValue;
        if (pageTagSlot.writerCount$delegate.getIntValue() == 0) {
        }
        return Unit.INSTANCE;
    }
}
