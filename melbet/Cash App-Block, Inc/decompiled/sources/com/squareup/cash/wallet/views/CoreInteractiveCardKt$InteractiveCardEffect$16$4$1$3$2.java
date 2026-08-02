package com.squareup.cash.wallet.views;

import androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonCancellable;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Ref$BooleanRef $cardInitialized;
    public final /* synthetic */ Ref$BooleanRef $isFirstUpdate;
    public final /* synthetic */ Ref$ObjectRef $lastCustomization;
    public final /* synthetic */ Ref$BooleanRef $lastExpectsCustomization;
    public final /* synthetic */ Ref$ObjectRef $lastViewModel;
    public final /* synthetic */ CardScene $scene;
    public float F$0;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public CardModelView.ViewModel L$1;
    public EquatableBitmap L$3;
    public boolean Z$0;
    public boolean Z$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2(Ref$BooleanRef ref$BooleanRef, CardScene cardScene, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$BooleanRef ref$BooleanRef2, Ref$BooleanRef ref$BooleanRef3, Continuation continuation) {
        super(2, continuation);
        this.$cardInitialized = ref$BooleanRef;
        this.$scene = cardScene;
        this.$lastViewModel = ref$ObjectRef;
        this.$lastCustomization = ref$ObjectRef2;
        this.$lastExpectsCustomization = ref$BooleanRef2;
        this.$isFirstUpdate = ref$BooleanRef3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2 coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2 = new CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2(this.$cardInitialized, this.$scene, this.$lastViewModel, this.$lastCustomization, this.$lastExpectsCustomization, this.$isFirstUpdate, continuation);
        coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2.L$0 = obj;
        return coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$2) create((CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0109, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(50, r22) == r2) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ed  */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.squareup.cash.card.onboarding.CardModelView$ViewModel, com.squareup.cash.card.onboarding.EquatableBitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardModelView.ViewModel viewModel;
        float f;
        boolean z;
        boolean z2;
        int i;
        int i2;
        ?? r5;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        Object obj2;
        boolean z3;
        EquatableBitmap equatableBitmap;
        float f2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        Ref$BooleanRef ref$BooleanRef2;
        CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate = (CoreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        Ref$BooleanRef ref$BooleanRef3 = this.$lastExpectsCustomization;
        Ref$ObjectRef ref$ObjectRef2 = this.$lastCustomization;
        Ref$ObjectRef ref$ObjectRef3 = this.$lastViewModel;
        Ref$BooleanRef ref$BooleanRef4 = this.$cardInitialized;
        CardScene cardScene = this.$scene;
        if (i5 == 0) {
            SafeTrace.throwOnFailure(obj);
            viewModel = coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.viewModel;
            Quat quat = coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.rotation;
            f = coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.zTranslation;
            EquatableBitmap equatableBitmap2 = coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.customization;
            z = coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.expectsCustomization;
            z2 = coreInteractiveCardKt$InteractiveCardEffect$16$4$1$3$SceneUpdate.decodeFinished;
            if (viewModel == null) {
                return Unit.INSTANCE;
            }
            i = (!z || z2) ? 0 : 1;
            boolean z6 = ref$BooleanRef4.element;
            if (i != 0) {
                if (z6) {
                    cardScene.updateTransform(quat, new Vector4(RecyclerView.DECELERATION_RATE, f));
                }
                return Unit.INSTANCE;
            }
            i2 = (z6 && cardScene.loadedCardId == viewModel.id && viewModel.equals(ref$ObjectRef3.element) && Intrinsics.areEqual(equatableBitmap2, ref$ObjectRef2.element) && z == ref$BooleanRef3.element) ? 0 : 1;
            if (i2 == 0) {
                r5 = 0;
                cardScene.updateTransform(quat, new Vector4(RecyclerView.DECELERATION_RATE, f));
                ref$BooleanRef2 = this.$isFirstUpdate;
                if (ref$BooleanRef2.element) {
                    ref$BooleanRef2.element = false;
                    this.L$0 = r5;
                    this.L$1 = r5;
                    this.L$3 = r5;
                    this.F$0 = f;
                    this.Z$0 = z;
                    this.Z$1 = z2;
                    this.I$0 = i;
                    this.I$1 = i2;
                    this.label = 2;
                }
                cardScene.markDirty();
                return Unit.INSTANCE;
            }
            NonCancellable nonCancellable = NonCancellable.INSTANCE;
            int i6 = i;
            ref$BooleanRef = ref$BooleanRef3;
            ref$ObjectRef = ref$ObjectRef2;
            obj2 = null;
            DefaultFlingBehavior$performFling$2 defaultFlingBehavior$performFling$2 = new DefaultFlingBehavior$performFling$2(cardScene, viewModel, quat, f, equatableBitmap2, null, 5);
            this.L$0 = null;
            this.L$1 = viewModel;
            this.L$3 = equatableBitmap2;
            this.F$0 = f;
            this.Z$0 = z;
            this.Z$1 = z2;
            this.I$0 = i6;
            this.I$1 = i2;
            z3 = true;
            this.label = 1;
            if (JobKt.withContext(nonCancellable, defaultFlingBehavior$performFling$2, this) != coroutineSingletons) {
                equatableBitmap = equatableBitmap2;
                f2 = f;
                z4 = z;
                i3 = i6;
                z5 = z2;
                i4 = i2;
            }
            return coroutineSingletons;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            cardScene.markDirty();
            return Unit.INSTANCE;
        }
        i4 = this.I$1;
        i3 = this.I$0;
        boolean z7 = this.Z$1;
        z4 = this.Z$0;
        f2 = this.F$0;
        equatableBitmap = this.L$3;
        viewModel = this.L$1;
        SafeTrace.throwOnFailure(obj);
        ref$BooleanRef = ref$BooleanRef3;
        ref$ObjectRef = ref$ObjectRef2;
        z5 = z7;
        obj2 = null;
        z3 = true;
        ref$BooleanRef4.element = z3;
        ref$ObjectRef3.element = viewModel;
        ref$ObjectRef.element = equatableBitmap;
        ref$BooleanRef.element = z4;
        i2 = i4;
        i = i3;
        z2 = z5;
        z = z4;
        f = f2;
        r5 = obj2;
        ref$BooleanRef2 = this.$isFirstUpdate;
        if (ref$BooleanRef2.element) {
        }
        cardScene.markDirty();
        return Unit.INSTANCE;
    }
}
