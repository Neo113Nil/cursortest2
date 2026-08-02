package com.squareup.cash.wallet.views;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahe;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter$models$2$1$1;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.ui.widget.keypad.KeypadViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda19;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activeHeroDetails$delegate;
    public final /* synthetic */ MutableState $cardDetails$delegate;
    public final /* synthetic */ State $cardEnabled$delegate;
    public final /* synthetic */ MutableSharedFlow $dragOffsets;
    public final /* synthetic */ CoroutineScope $dragScope;
    public final /* synthetic */ MutableSharedFlow $lockedDragInterrupt;
    public final /* synthetic */ CardScene $scene;
    public /* synthetic */ Object L$0;
    public boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1(CardScene cardScene, CoroutineScope coroutineScope, State state, MutableSharedFlow mutableSharedFlow, MutableState mutableState, MutableState mutableState2, MutableSharedFlow mutableSharedFlow2, Continuation continuation) {
        super(2, continuation);
        this.$scene = cardScene;
        this.$dragScope = coroutineScope;
        this.$cardEnabled$delegate = state;
        this.$dragOffsets = mutableSharedFlow;
        this.$activeHeroDetails$delegate = mutableState;
        this.$cardDetails$delegate = mutableState2;
        this.$lockedDragInterrupt = mutableSharedFlow2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1 coreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1(this.$scene, this.$dragScope, this.$cardEnabled$delegate, this.$dragOffsets, this.$activeHeroDetails$delegate, this.$cardDetails$delegate, this.$lockedDragInterrupt, continuation);
        coreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1.L$0 = obj;
        return coreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreInteractiveCardKt$InteractiveCardEffect$16$5$1$1$1$1$1) create((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0041, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object awaitFirstDown$default;
        Object m208awaitTouchSlopOrCancellationjO51t88;
        boolean z;
        PointerInputChange pointerInputChange;
        Object m210dragjO51t88;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CardScene cardScene = this.$scene;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.L$0 = pointerEventHandlerCoroutine;
            this.label = 1;
            awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine, this, 2);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    m210dragjO51t88 = obj;
                    if (((Boolean) m210dragjO51t88).booleanValue() && CoreInteractiveCardKt.InteractiveCardEffect$lambda$20(this.$cardEnabled$delegate)) {
                        JobKt.launch$default(this.$dragScope, null, CoroutineStart.UNDISPATCHED, new ReferralCodePresenter$models$2$1$1(this.$dragOffsets, null, 7), 1);
                    }
                    return Unit.INSTANCE;
                }
                boolean z2 = this.Z$0;
                SafeTrace.throwOnFailure(obj);
                z = z2;
                m208awaitTouchSlopOrCancellationjO51t88 = obj;
                pointerInputChange = (PointerInputChange) m208awaitTouchSlopOrCancellationjO51t88;
                if (pointerInputChange != null) {
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = pointerInputChange.position;
                    long j = pointerInputChange.id;
                    KeypadViewKt$$ExternalSyntheticLambda0 keypadViewKt$$ExternalSyntheticLambda0 = new KeypadViewKt$$ExternalSyntheticLambda0(ref$LongRef, this.$dragScope, cardScene, pointerEventHandlerCoroutine, this.$cardEnabled$delegate, this.$dragOffsets, this.$activeHeroDetails$delegate, this.$cardDetails$delegate, this.$lockedDragInterrupt);
                    this.L$0 = null;
                    this.Z$0 = z;
                    this.label = 3;
                    m210dragjO51t88 = DragGestureDetectorKt.m210dragjO51t88(pointerEventHandlerCoroutine, j, keypadViewKt$$ExternalSyntheticLambda0, this);
                }
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
            awaitFirstDown$default = obj;
        }
        PointerInputChange pointerInputChange2 = (PointerInputChange) awaitFirstDown$default;
        float intBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange2.position >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange2.position & BodyPartID.bodyIdMax));
        long j2 = SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        float f = (int) (j2 >> 32);
        float f2 = (int) (j2 & BodyPartID.bodyIdMax);
        Entity cardEntity$views = cardScene.getCardEntity$views();
        boolean z3 = false;
        if (cardEntity$views != null && zzahe.touchToTextureUV(cardScene.camera, intBitsToFloat, intBitsToFloat2, f, f2, cardEntity$views) != null) {
            z3 = true;
        }
        if (z3) {
            long j3 = pointerInputChange2.id;
            PayHomeViewKt$$ExternalSyntheticLambda19 payHomeViewKt$$ExternalSyntheticLambda19 = new PayHomeViewKt$$ExternalSyntheticLambda19(6);
            this.L$0 = pointerEventHandlerCoroutine;
            this.Z$0 = z3;
            this.label = 2;
            m208awaitTouchSlopOrCancellationjO51t88 = DragGestureDetectorKt.m208awaitTouchSlopOrCancellationjO51t88(pointerEventHandlerCoroutine, j3, payHomeViewKt$$ExternalSyntheticLambda19, this);
            if (m208awaitTouchSlopOrCancellationjO51t88 != coroutineSingletons) {
                z = z3;
                pointerInputChange = (PointerInputChange) m208awaitTouchSlopOrCancellationjO51t88;
                if (pointerInputChange != null) {
                }
            }
            return coroutineSingletons;
        }
        return Unit.INSTANCE;
    }
}
