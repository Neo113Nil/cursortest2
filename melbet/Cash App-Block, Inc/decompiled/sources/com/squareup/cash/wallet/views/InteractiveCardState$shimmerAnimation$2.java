package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class InteractiveCardState$shimmerAnimation$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ InteractiveCardState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteractiveCardState$shimmerAnimation$2(InteractiveCardState interactiveCardState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = interactiveCardState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        InteractiveCardState interactiveCardState = this.this$0;
        switch (i) {
            case 0:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 0);
            case 1:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 1);
            case 2:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 2);
            case 3:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 3);
            case 4:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 4);
            case 5:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 5);
            case 6:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 6);
            case 7:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 7);
            case 8:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 8);
            case 9:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 9);
            case 10:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 10);
            case 11:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 11);
            case 12:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 12);
            default:
                return new InteractiveCardState$shimmerAnimation$2(interactiveCardState, continuation, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InteractiveCardState$shimmerAnimation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x01f6, code lost:
    
        if (r15.snapTo(r1, r14) == r0) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        InteractiveCardState interactiveCardState = this.this$0;
        boolean z2 = true;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = interactiveCardState.shimmerOffset;
                    Float f = new Float(-1.0f);
                    this.label = 1;
                    break;
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                Animatable animatable2 = interactiveCardState.shimmerOffset;
                SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 18.0f, null, 4);
                Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                Float f3 = new Float(RecyclerView.DECELERATION_RATE);
                this.label = 2;
                Object animateTo$default = Animatable.animateTo$default(animatable2, f2, spring$default, f3, null, this, 8);
                if (animateTo$default != coroutineSingletons) {
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateDimmer(true, false, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateCopyAlpha(true, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    interactiveCardState.getClass();
                    if (JobKt.coroutineScope(new InteractiveCardState$animateLock$2(z2, interactiveCardState, continuation, objArr == true ? 1 : 0), this) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateDimmer(false, false, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateCopyAlpha(false, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    interactiveCardState.getClass();
                    if (JobKt.coroutineScope(new InteractiveCardState$animateLock$2(objArr3 == true ? 1 : 0, interactiveCardState, continuation, objArr2 == true ? 1 : 0), this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateDimmer(true, false, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i9 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateCopyAlpha(true, this) == coroutineSingletons9) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    interactiveCardState.getClass();
                    if (JobKt.coroutineScope(new InteractiveCardState$animateLock$2(z2, interactiveCardState, continuation, objArr4 == true ? 1 : 0), this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateDimmer(false, false, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateCopyAlpha(false, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    interactiveCardState.getClass();
                    if (JobKt.coroutineScope(new InteractiveCardState$animateLock$2(z, interactiveCardState, continuation, objArr5 == true ? 1 : 0), this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (interactiveCardState.animateCopyAlpha(false, this) == coroutineSingletons14) {
                        break;
                    }
                } else if (i15 != 1) {
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
