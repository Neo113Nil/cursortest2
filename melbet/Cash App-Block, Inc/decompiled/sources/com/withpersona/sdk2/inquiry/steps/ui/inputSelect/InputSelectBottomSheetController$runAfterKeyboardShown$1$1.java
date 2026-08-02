package com.withpersona.sdk2.inquiry.steps.ui.inputSelect;

import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Response;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.steps.ui.UiStepBottomSheet$$ExternalSyntheticLambda4;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class InputSelectBottomSheetController$runAfterKeyboardShown$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ UiStepBottomSheet$$ExternalSyntheticLambda4 $callback;
    public final /* synthetic */ SupervisorJobImpl $job;
    public final /* synthetic */ int $r8$classId = 1;
    public int label;
    public final /* synthetic */ Response this$0;

    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.inputSelect.InputSelectBottomSheetController$runAfterKeyboardShown$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ UiStepBottomSheet$$ExternalSyntheticLambda4 $callback;
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$callback = uiStepBottomSheet$$ExternalSyntheticLambda4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4 = this.$callback;
            switch (i) {
                case 0:
                    return new AnonymousClass2(uiStepBottomSheet$$ExternalSyntheticLambda4, continuation, 0);
                case 1:
                    return new AnonymousClass2(uiStepBottomSheet$$ExternalSyntheticLambda4, continuation, 1);
                default:
                    return new AnonymousClass2(uiStepBottomSheet$$ExternalSyntheticLambda4, continuation, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4 = this.$callback;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    uiStepBottomSheet$$ExternalSyntheticLambda4.invoke();
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    uiStepBottomSheet$$ExternalSyntheticLambda4.invoke();
                    break;
                default:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    uiStepBottomSheet$$ExternalSyntheticLambda4.invoke();
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSelectBottomSheetController$runAfterKeyboardShown$1$1(Response response, SupervisorJobImpl supervisorJobImpl, UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4, Continuation continuation) {
        super(2, continuation);
        this.this$0 = response;
        this.$job = supervisorJobImpl;
        this.$callback = uiStepBottomSheet$$ExternalSyntheticLambda4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4 = this.$callback;
        SupervisorJobImpl supervisorJobImpl = this.$job;
        Response response = this.this$0;
        switch (i) {
            case 0:
                return new InputSelectBottomSheetController$runAfterKeyboardShown$1$1(supervisorJobImpl, response, uiStepBottomSheet$$ExternalSyntheticLambda4, continuation);
            default:
                return new InputSelectBottomSheetController$runAfterKeyboardShown$1$1(response, supervisorJobImpl, uiStepBottomSheet$$ExternalSyntheticLambda4, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((InputSelectBottomSheetController$runAfterKeyboardShown$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r11, r3, r10) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r11, r3, r10) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r11.getResult() == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        SupervisorJobImpl supervisorJobImpl = this.$job;
        UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4 = this.$callback;
        Response response = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                    cancellableContinuationImpl.initCancellability();
                    Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                    FrameLayout frameLayout = response.getBinding().rootView;
                    frameLayout.getClass();
                    InsetsUtilsKt.onInsetsChanged(frameLayout, new OverridingUtil.AnonymousClass7(14, ref$BooleanRef, cancellableContinuationImpl));
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        supervisorJobImpl.cancel(null);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(uiStepBottomSheet$$ExternalSyntheticLambda4, continuation, 0);
                this.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0 || i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    while (true) {
                        FrameLayout frameLayout2 = response.getBinding().rootView;
                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                        WindowInsetsCompat rootWindowInsets = ViewCompat.Api23Impl.getRootWindowInsets(frameLayout2);
                        if (rootWindowInsets != null && rootWindowInsets.mImpl.isVisible(8)) {
                            DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                            HandlerContext handlerContext2 = MainDispatcherLoader.dispatcher;
                            AnonymousClass2 anonymousClass22 = new AnonymousClass2(uiStepBottomSheet$$ExternalSyntheticLambda4, continuation, i2);
                            this.label = 2;
                            break;
                        } else {
                            this.label = 1;
                            if (JobKt.delay(100L, this) == coroutineSingletons2) {
                            }
                        }
                    }
                    return coroutineSingletons2;
                }
                if (i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                supervisorJobImpl.cancel(null);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSelectBottomSheetController$runAfterKeyboardShown$1$1(SupervisorJobImpl supervisorJobImpl, Response response, UiStepBottomSheet$$ExternalSyntheticLambda4 uiStepBottomSheet$$ExternalSyntheticLambda4, Continuation continuation) {
        super(2, continuation);
        this.$job = supervisorJobImpl;
        this.this$0 = response;
        this.$callback = uiStepBottomSheet$$ExternalSyntheticLambda4;
    }
}
