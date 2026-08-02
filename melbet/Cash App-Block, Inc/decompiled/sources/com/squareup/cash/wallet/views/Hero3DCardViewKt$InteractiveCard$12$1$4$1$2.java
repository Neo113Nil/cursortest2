package com.squareup.cash.wallet.views;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.graphics.CardGridNuxKt$CardGridNux$6$3$1$1;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.util.coroutines.TakeUntilKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$12$1$4$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cardRotation$delegate;
    public final /* synthetic */ CardWobbleState $cardWobble;
    public final /* synthetic */ MutableSharedFlow $dragOffsets;
    public final /* synthetic */ MutableState $exitTransitionState$delegate;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$1$2$4, reason: invalid class name */
    public final class AnonymousClass4 extends SuspendLambda implements Function2 {
        public final /* synthetic */ CardWobbleState $cardWobble;
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Offset L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass4(CardWobbleState cardWobbleState, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$cardWobble = cardWobbleState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$cardWobble, continuation, 0);
                    anonymousClass4.L$0 = (Offset) obj;
                    return anonymousClass4;
                case 1:
                    AnonymousClass4 anonymousClass42 = new AnonymousClass4(this.$cardWobble, continuation, 1);
                    anonymousClass42.L$0 = (Offset) obj;
                    return anonymousClass42;
                default:
                    AnonymousClass4 anonymousClass43 = new AnonymousClass4(this.$cardWobble, continuation, 2);
                    anonymousClass43.L$0 = (Offset) obj;
                    return anonymousClass43;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Offset offset = (Offset) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass4) create(offset, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            CardWobbleState cardWobbleState = this.$cardWobble;
            switch (i) {
                case 0:
                    Offset offset = this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (offset == null) {
                            this.L$0 = null;
                            this.label = 1;
                            if (cardWobbleState.wobbleCard(this) == coroutineSingletons) {
                                break;
                            }
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    Offset offset2 = this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (offset2 == null) {
                            this.L$0 = null;
                            this.label = 1;
                            if (cardWobbleState.wobbleCard(this) == coroutineSingletons2) {
                                break;
                            }
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    Offset offset3 = this.L$0;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (offset3 == null) {
                            this.L$0 = null;
                            this.label = 1;
                            if (cardWobbleState.wobbleCard(this) == coroutineSingletons3) {
                                break;
                            }
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$1$2$5, reason: invalid class name */
    public final class AnonymousClass5 extends SuspendLambda implements Function2 {
        public final /* synthetic */ MutableState $cardRotation$delegate;
        public final /* synthetic */ CardWobbleState $cardWobble;
        public final /* synthetic */ int $r8$classId;
        public /* synthetic */ Object L$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass5(CardWobbleState cardWobbleState, MutableState mutableState, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$cardWobble = cardWobbleState;
            this.$cardRotation$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$cardWobble, this.$cardRotation$delegate, continuation, 0);
                    anonymousClass5.L$0 = obj;
                    return anonymousClass5;
                default:
                    AnonymousClass5 anonymousClass52 = new AnonymousClass5(this.$cardWobble, this.$cardRotation$delegate, continuation, 1);
                    anonymousClass52.L$0 = obj;
                    return anonymousClass52;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            MutableState mutableState = this.$cardRotation$delegate;
            CardWobbleState cardWobbleState = this.$cardWobble;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope, null, null, new CardGridNuxKt$CardGridNux$6$3$1$1(cardWobbleState, null, 2), 3);
                    JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 19), 3);
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope, null, null, new CardGridNuxKt$CardGridNux$6$3$1$1(cardWobbleState, null, 1), 3);
                    JobKt.launch$default(coroutineScope, null, null, new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 16), 3);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$12$1$4$1$2(MutableSharedFlow mutableSharedFlow, MutableState mutableState, CardWobbleState cardWobbleState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$dragOffsets = mutableSharedFlow;
        this.$exitTransitionState$delegate = mutableState;
        this.$cardWobble = cardWobbleState;
        this.$cardRotation$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                Hero3DCardViewKt$InteractiveCard$12$1$4$1$2 hero3DCardViewKt$InteractiveCard$12$1$4$1$2 = new Hero3DCardViewKt$InteractiveCard$12$1$4$1$2(this.$dragOffsets, this.$exitTransitionState$delegate, this.$cardWobble, this.$cardRotation$delegate, continuation, 0);
                hero3DCardViewKt$InteractiveCard$12$1$4$1$2.Z$0 = ((Boolean) obj).booleanValue();
                return hero3DCardViewKt$InteractiveCard$12$1$4$1$2;
            default:
                Hero3DCardViewKt$InteractiveCard$12$1$4$1$2 hero3DCardViewKt$InteractiveCard$12$1$4$1$22 = new Hero3DCardViewKt$InteractiveCard$12$1$4$1$2(this.$dragOffsets, this.$exitTransitionState$delegate, this.$cardWobble, this.$cardRotation$delegate, continuation, 1);
                hero3DCardViewKt$InteractiveCard$12$1$4$1$22.Z$0 = ((Boolean) obj).booleanValue();
                return hero3DCardViewKt$InteractiveCard$12$1$4$1$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
        }
        return ((Hero3DCardViewKt$InteractiveCard$12$1$4$1$2) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r13, r12) == r10) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(r13, r12) == r10) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r2, r1, r12) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(r2, r12) == r10) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$cardRotation$delegate;
        int i2 = 12;
        MutableState mutableState2 = this.$exitTransitionState$delegate;
        MutableSharedFlow mutableSharedFlow = this.$dragOffsets;
        CardWobbleState cardWobbleState = this.$cardWobble;
        int i3 = 2;
        Continuation continuation = null;
        int i4 = 1;
        switch (i) {
            case 0:
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i6 = 0;
                    if (!z) {
                        AnonymousClass5 anonymousClass5 = new AnonymousClass5(cardWobbleState, mutableState, continuation, i6);
                        this.Z$0 = z;
                        this.label = 2;
                        break;
                    } else {
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(2, null, 12), TakeUntilKt.takeUntil(mutableSharedFlow, new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(i4, mutableState2)), 3)));
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(cardWobbleState, continuation, i6);
                        this.Z$0 = z;
                        this.label = 1;
                        break;
                    }
                } else if (i5 != 1 && i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                boolean z2 = this.Z$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z2) {
                        AnonymousClass5 anonymousClass52 = new AnonymousClass5(cardWobbleState, mutableState, continuation, i4);
                        this.Z$0 = z2;
                        this.label = 2;
                        break;
                    } else {
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new RealTabProvider$setup$1$5(2, null, 11), TakeUntilKt.takeUntil(mutableSharedFlow, new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(i2, mutableState2)), 22)));
                        AnonymousClass4 anonymousClass42 = new AnonymousClass4(cardWobbleState, continuation, i3);
                        this.Z$0 = z2;
                        this.label = 1;
                        break;
                    }
                } else if (i7 != 1 && i7 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
