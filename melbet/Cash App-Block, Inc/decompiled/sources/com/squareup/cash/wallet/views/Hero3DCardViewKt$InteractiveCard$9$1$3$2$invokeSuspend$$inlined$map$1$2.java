package com.squareup.cash.wallet.views;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.graphics.backend.math.Quat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ Quat $backwardResting$inlined;
    public final /* synthetic */ MutableState $cardRotation$delegate$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$1$2(FlowCollector flowCollector, Quat quat, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$backwardResting$inlined = quat;
        this.$cardRotation$delegate$inlined = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1 coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1;
        int i2;
        CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1 coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1;
        int i3;
        Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1 hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1;
        int i4;
        int i5 = this.$r8$classId;
        Quat quat = this.$backwardResting$inlined;
        MutableState mutableState = this.$cardRotation$delegate$inlined;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        switch (i5) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i6 = anonymousClass1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            ((Boolean) obj).getClass();
                            float[] fArr = Hero3DCardViewKt.X_AXIS;
                            SlerpAnimator slerpAnimator = new SlerpAnimator((Quat) mutableState.getValue(), quat);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(slerpAnimator, anonymousClass1) == coroutineSingletons) {
                                break;
                            }
                        } else if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj2);
                        }
                        break;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj22 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1) {
                    coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i7 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        Object obj3 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            ((Boolean) obj).getClass();
                            Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            SlerpAnimator slerpAnimator2 = new SlerpAnimator((Quat) mutableState.getValue(), quat);
                            coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(slerpAnimator2, coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons3) {
                                break;
                            }
                        } else if (i2 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj3);
                        }
                        break;
                    }
                }
                coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj32 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1) {
                    coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1 = (CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i8 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1.label;
                    if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                        coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1.label = i8 - PKIFailureInfo.systemUnavail;
                        Object obj4 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj4);
                            ((Boolean) obj).getClass();
                            Quat quat3 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            SlerpAnimator slerpAnimator3 = new SlerpAnimator((Quat) mutableState.getValue(), quat);
                            coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(slerpAnimator3, coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj4);
                        }
                        break;
                    }
                }
                coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1 = new CoreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                Object obj42 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = coreInteractiveCardKt$InteractiveCardEffect$8$1$3$invokeSuspend$$inlined$map$2$2$1.label;
                if (i3 != 0) {
                }
            default:
                if (continuation instanceof Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1) {
                    hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1 = (Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1) continuation;
                    int i9 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1.label;
                    if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                        hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                        Object obj5 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            ((Boolean) obj).getClass();
                            float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                            SlerpAnimator slerpAnimator4 = new SlerpAnimator((Quat) mutableState.getValue(), quat);
                            hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1.label = 1;
                            if (flowCollector.emit(slerpAnimator4, hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1) == coroutineSingletons5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                        }
                        break;
                    }
                }
                hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1 = new Hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1(this, continuation);
                Object obj52 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = hero3DCardViewKt$InteractiveCard$9$1$3$2$invokeSuspend$$inlined$map$2$2$1.label;
                if (i4 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
