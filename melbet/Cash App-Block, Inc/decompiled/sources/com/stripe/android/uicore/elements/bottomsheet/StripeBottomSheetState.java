package com.stripe.android.uicore.elements.bottomsheet;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class StripeBottomSheetState {
    public DismissalType dismissalType;
    public final StripeBottomSheetKeyboardHandler keyboardHandler;
    public final ModalBottomSheetState modalBottomSheetState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DismissalType {
        public static final /* synthetic */ DismissalType[] $VALUES;
        public static final DismissalType Programmatically;
        public static final DismissalType SwipedDownByUser;

        static {
            DismissalType dismissalType = new DismissalType("Programmatically", 0);
            Programmatically = dismissalType;
            DismissalType dismissalType2 = new DismissalType("SwipedDownByUser", 1);
            SwipedDownByUser = dismissalType2;
            $VALUES = new DismissalType[]{dismissalType, dismissalType2};
        }

        public static DismissalType valueOf(String str) {
            return (DismissalType) Enum.valueOf(DismissalType.class, str);
        }

        public static DismissalType[] values() {
            return (DismissalType[]) $VALUES.clone();
        }
    }

    public StripeBottomSheetState(ModalBottomSheetState modalBottomSheetState, StripeBottomSheetKeyboardHandler stripeBottomSheetKeyboardHandler) {
        modalBottomSheetState.getClass();
        stripeBottomSheetKeyboardHandler.getClass();
        this.modalBottomSheetState = modalBottomSheetState;
        this.keyboardHandler = stripeBottomSheetKeyboardHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum awaitDismissal(ContinuationImpl continuationImpl) {
        StripeBottomSheetState$awaitDismissal$1 stripeBottomSheetState$awaitDismissal$1;
        int i;
        if (continuationImpl instanceof StripeBottomSheetState$awaitDismissal$1) {
            stripeBottomSheetState$awaitDismissal$1 = (StripeBottomSheetState$awaitDismissal$1) continuationImpl;
            int i2 = stripeBottomSheetState$awaitDismissal$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeBottomSheetState$awaitDismissal$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeBottomSheetState$awaitDismissal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeBottomSheetState$awaitDismissal$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new StripeBottomSheetState$$ExternalSyntheticLambda0(this, 0));
                    StripeBottomSheetState$show$4 stripeBottomSheetState$show$4 = new StripeBottomSheetState$show$4(2, null, 1);
                    stripeBottomSheetState$awaitDismissal$1.label = 1;
                    if (FlowKt.first(snapshotFlow, stripeBottomSheetState$show$4, stripeBottomSheetState$awaitDismissal$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                DismissalType dismissalType = this.dismissalType;
                return dismissalType != null ? DismissalType.SwipedDownByUser : dismissalType;
            }
        }
        stripeBottomSheetState$awaitDismissal$1 = new StripeBottomSheetState$awaitDismissal$1(this, continuationImpl);
        Object obj2 = stripeBottomSheetState$awaitDismissal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeBottomSheetState$awaitDismissal$1.label;
        if (i != 0) {
        }
        DismissalType dismissalType2 = this.dismissalType;
        if (dismissalType2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt.access$repeatUntilSucceededOrLimit(10, r7, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r7 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hide(ContinuationImpl continuationImpl) {
        StripeBottomSheetState$hide$1 stripeBottomSheetState$hide$1;
        int i;
        Object obj;
        if (continuationImpl instanceof StripeBottomSheetState$hide$1) {
            stripeBottomSheetState$hide$1 = (StripeBottomSheetState$hide$1) continuationImpl;
            int i2 = stripeBottomSheetState$hide$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeBottomSheetState$hide$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = stripeBottomSheetState$hide$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeBottomSheetState$hide$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    this.dismissalType = DismissalType.Programmatically;
                    stripeBottomSheetState$hide$1.label = 1;
                    StripeBottomSheetKeyboardHandler stripeBottomSheetKeyboardHandler = this.keyboardHandler;
                    if (((Boolean) stripeBottomSheetKeyboardHandler.isKeyboardVisible.getValue()).booleanValue()) {
                        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = stripeBottomSheetKeyboardHandler.keyboardController;
                        if (delegatingSoftwareKeyboardController != null) {
                            delegatingSoftwareKeyboardController.hide();
                        }
                        obj = FlowKt.first(Updater.snapshotFlow(new HCaptcha$$ExternalSyntheticLambda0(stripeBottomSheetKeyboardHandler, 23)), new SessionWorkerKt$runSession$5(2, null, 29), stripeBottomSheetState$hide$1);
                        if (obj != obj3) {
                            obj = Unit.INSTANCE;
                        }
                        if (obj != obj3) {
                            obj = Unit.INSTANCE;
                        }
                    } else {
                        obj = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                if (this.modalBottomSheetState.isVisible()) {
                    return Unit.INSTANCE;
                }
                StripeBottomSheetState$hide$2 stripeBottomSheetState$hide$2 = new StripeBottomSheetState$hide$2(this, continuation, 0);
                stripeBottomSheetState$hide$1.label = 2;
            }
        }
        stripeBottomSheetState$hide$1 = new StripeBottomSheetState$hide$1(this, continuationImpl);
        Object obj22 = stripeBottomSheetState$hide$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeBottomSheetState$hide$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (this.modalBottomSheetState.isVisible()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r6, r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt.access$repeatUntilSucceededOrLimit(10, r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object show(ContinuationImpl continuationImpl) {
        StripeBottomSheetState$show$1 stripeBottomSheetState$show$1;
        int i;
        if (continuationImpl instanceof StripeBottomSheetState$show$1) {
            stripeBottomSheetState$show$1 = (StripeBottomSheetState$show$1) continuationImpl;
            int i2 = stripeBottomSheetState$show$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeBottomSheetState$show$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeBottomSheetState$show$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeBottomSheetState$show$1.label;
                Continuation continuation = null;
                int i3 = 1;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StripeBottomSheetState$hide$2 stripeBottomSheetState$hide$2 = new StripeBottomSheetState$hide$2(this, continuation, i3);
                    stripeBottomSheetState$show$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                SafeFlow snapshotFlow = Updater.snapshotFlow(new StripeBottomSheetState$$ExternalSyntheticLambda0(this, 1));
                StripeBottomSheetState$show$4 stripeBottomSheetState$show$4 = new StripeBottomSheetState$show$4(2, null, 0);
                stripeBottomSheetState$show$1.label = 2;
            }
        }
        stripeBottomSheetState$show$1 = new StripeBottomSheetState$show$1(this, continuationImpl);
        Object obj2 = stripeBottomSheetState$show$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeBottomSheetState$show$1.label;
        Continuation continuation2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        SafeFlow snapshotFlow2 = Updater.snapshotFlow(new StripeBottomSheetState$$ExternalSyntheticLambda0(this, 1));
        StripeBottomSheetState$show$4 stripeBottomSheetState$show$42 = new StripeBottomSheetState$show$4(2, null, 0);
        stripeBottomSheetState$show$1.label = 2;
    }
}
