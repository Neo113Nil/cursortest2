package com.squareup.util.compose;

import androidx.camera.compose.SurfaceRequestScope;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.viewfinder.core.ImplementationMode;
import androidx.camera.viewfinder.core.ViewfinderSurfaceRequest;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.ProduceStateScope;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class MotionKt$produceAnimationsEnabled$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public ProduceStateScope L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MotionKt$produceAnimationsEnabled$1$1(ProduceStateScope produceStateScope, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = produceStateScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                MotionKt$produceAnimationsEnabled$1$1 motionKt$produceAnimationsEnabled$1$1 = new MotionKt$produceAnimationsEnabled$1$1(2, continuation, 0);
                motionKt$produceAnimationsEnabled$1$1.L$0 = obj;
                return motionKt$produceAnimationsEnabled$1$1;
            case 1:
                MotionKt$produceAnimationsEnabled$1$1 motionKt$produceAnimationsEnabled$1$12 = new MotionKt$produceAnimationsEnabled$1$1(this.L$1, continuation, 1);
                motionKt$produceAnimationsEnabled$1$12.L$0 = obj;
                return motionKt$produceAnimationsEnabled$1$12;
            case 2:
                MotionKt$produceAnimationsEnabled$1$1 motionKt$produceAnimationsEnabled$1$13 = new MotionKt$produceAnimationsEnabled$1$1(this.L$1, continuation, 2);
                motionKt$produceAnimationsEnabled$1$13.L$0 = obj;
                return motionKt$produceAnimationsEnabled$1$13;
            default:
                MotionKt$produceAnimationsEnabled$1$1 motionKt$produceAnimationsEnabled$1$14 = new MotionKt$produceAnimationsEnabled$1$1(2, continuation, 3);
                motionKt$produceAnimationsEnabled$1$14.L$0 = obj;
                return motionKt$produceAnimationsEnabled$1$14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((MotionKt$produceAnimationsEnabled$1$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            case 1:
                return ((MotionKt$produceAnimationsEnabled$1$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((MotionKt$produceAnimationsEnabled$1$1) create((CardRegistry$CardTransition$TransitionType) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                ((MotionKt$produceAnimationsEnabled$1$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r7, r14) != r6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r7, r8, r9, null, r11, r14, 4) == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(300, r14) == r6) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if (r2.implementationMode == r15) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a0, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r6, r14) != r0) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:13:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01a0 -> B:72:0x0178). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProduceStateScope produceStateScope;
        ProduceStateScope produceStateScope2;
        int i = 10;
        int i2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.$r8$classId) {
            case 0:
                ProduceStateScope produceStateScope3 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        produceStateScope = this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        produceStateScope.setValue(obj);
                        Duration.Companion companion = Duration.Companion;
                        long duration = DurationKt.toDuration(1, DurationUnit.SECONDS);
                        this.L$0 = produceStateScope3;
                        this.L$1 = null;
                        this.label = 2;
                        break;
                    } else if (i3 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                this.L$0 = produceStateScope3;
                this.L$1 = produceStateScope3;
                this.label = 1;
                obj = JobKt.coroutineScope(new RealSheetState$peek$3.AnonymousClass2(i2, objArr == true ? 1 : 0, i), this);
                if (obj != coroutineSingletons) {
                    produceStateScope = produceStateScope3;
                    produceStateScope.setValue(obj);
                    Duration.Companion companion2 = Duration.Companion;
                    long duration2 = DurationKt.toDuration(1, DurationUnit.SECONDS);
                    this.L$0 = produceStateScope3;
                    this.L$1 = null;
                    this.label = 2;
                }
                return coroutineSingletons;
            case 1:
                ProduceStateScope produceStateScope4 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Pair pair = (Pair) this.L$0;
                        SurfaceRequest surfaceRequest = (SurfaceRequest) pair.first;
                        ImplementationMode implementationMode = (ImplementationMode) pair.second;
                        SurfaceRequestScope surfaceRequestScope = (SurfaceRequestScope) produceStateScope4.getValue();
                        if (surfaceRequestScope != null) {
                            ViewfinderSurfaceRequest viewfinderSurfaceRequest = surfaceRequestScope.viewfinderSurfaceRequest;
                            if (viewfinderSurfaceRequest.width == surfaceRequest.mResolution.getWidth()) {
                                if (viewfinderSurfaceRequest.height == surfaceRequest.mResolution.getHeight()) {
                                    break;
                                }
                            }
                        }
                        produceStateScope4.setValue(new SurfaceRequestScope(new ViewfinderSurfaceRequest(surfaceRequest.mResolution.getWidth(), surfaceRequest.mResolution.getHeight(), implementationMode, "CXSurfaceRequest-".concat(String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(surfaceRequest.hashCode())}, 1))))));
                        SurfaceRequestScope surfaceRequestScope2 = (SurfaceRequestScope) produceStateScope4.getValue();
                        BufferedChannel bufferedChannel = surfaceRequestScope2 != null ? surfaceRequestScope2.requestChannel : null;
                        if (bufferedChannel == null) {
                            throw new IllegalStateException("Surface request channel should not be null");
                        }
                        this.label = 1;
                        if (bufferedChannel.send(surfaceRequest, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                } catch (ClosedSendChannelException unused) {
                }
                return Unit.INSTANCE;
            case 2:
                ProduceStateScope produceStateScope5 = this.L$1;
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = cardRegistry$CardTransition$TransitionType;
                    this.label = 1;
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Animatable Animatable = AnimatableKt.Animatable(((Number) produceStateScope5.getValue()).floatValue(), 0.01f);
                Float f = new Float(cardRegistry$CardTransition$TransitionType == CardRegistry$CardTransition$TransitionType.SOURCE ? RecyclerView.DECELERATION_RATE : 1.0f);
                SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 1000.0f, null, 4);
                CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0 cardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0 = new CardTransitionKt$moneyCardFade$1$1$2$$ExternalSyntheticLambda0(produceStateScope5, 0);
                this.L$0 = null;
                this.label = 2;
                break;
            default:
                ProduceStateScope produceStateScope6 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 != 0) {
                    if (i6 == 1) {
                        produceStateScope2 = this.L$1;
                        SafeTrace.throwOnFailure(obj);
                        produceStateScope2.setValue(obj);
                        Duration.Companion companion3 = Duration.Companion;
                        long duration3 = DurationKt.toDuration(1, DurationUnit.SECONDS);
                        this.L$0 = produceStateScope6;
                        this.L$1 = null;
                        this.label = 2;
                        break;
                    } else if (i6 != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                SafeTrace.throwOnFailure(obj);
                this.L$0 = produceStateScope6;
                this.L$1 = produceStateScope6;
                this.label = 1;
                obj = JobKt.coroutineScope(new RealSheetState$peek$3.AnonymousClass2(i2, objArr2 == true ? 1 : 0, i), this);
                if (obj != coroutineSingletons4) {
                    produceStateScope2 = produceStateScope6;
                    produceStateScope2.setValue(obj);
                    Duration.Companion companion32 = Duration.Companion;
                    long duration32 = DurationKt.toDuration(1, DurationUnit.SECONDS);
                    this.L$0 = produceStateScope6;
                    this.L$1 = null;
                    this.label = 2;
                }
                return coroutineSingletons4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MotionKt$produceAnimationsEnabled$1$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }
}
