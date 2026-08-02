package com.squareup.cash.wallet.views;

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
public final class CardNuxAnimationsKt$introSpinAnimation$1$invokeSuspend$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SlerpAnimator $rotatingIn$inlined;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;

    /* renamed from: com.squareup.cash.wallet.views.CardNuxAnimationsKt$introSpinAnimation$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
            return CardNuxAnimationsKt$introSpinAnimation$1$invokeSuspend$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ CardNuxAnimationsKt$introSpinAnimation$1$invokeSuspend$$inlined$map$1$2(FlowCollector flowCollector, SlerpAnimator slerpAnimator, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.$rotatingIn$inlined = slerpAnimator;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        CardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1 cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i2;
        int i3 = this.$r8$classId;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        SlerpAnimator slerpAnimator = this.$rotatingIn$inlined;
        switch (i3) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i4 = anonymousClass1.label;
                    if ((i4 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i4 - PKIFailureInfo.systemUnavail;
                        Object obj2 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            slerpAnimator.setCurrentFraction(((Number) obj).floatValue());
                            Object animatedValue = slerpAnimator.getAnimatedValue();
                            animatedValue.getClass();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit((Quat) animatedValue, anonymousClass1) == coroutineSingletons) {
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
            default:
                if (continuation instanceof CardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1 = (CardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i5 = cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj3 = cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            slerpAnimator.setCurrentFraction(((Number) obj).floatValue());
                            Object animatedValue2 = slerpAnimator.getAnimatedValue();
                            animatedValue2.getClass();
                            cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit((Quat) animatedValue2, cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons3) {
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
                cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1 = new CardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj32 = cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cardNuxAnimationsKt$introSpinAnimation$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i2 != 0) {
                }
        }
        return Unit.INSTANCE;
    }
}
