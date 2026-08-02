package com.withpersona.sdk2.inquiry.ui;

import com.squareup.cash.cdf.personalprofile.PersonalProfileEditOpen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class UiStepFileSelectWorker$run$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UiStepFileSelectWorker$run$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new UiStepFileSelectWorker$run$1$1((UiStepFileSelectWorker) obj2, continuation, 0);
            default:
                return new UiStepFileSelectWorker$run$1$1((TapToPayPresenter) obj2, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((UiStepFileSelectWorker$run$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((UiStepFileSelectWorker) obj2).launchPicker.invoke();
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((Analytics) ((TapToPayPresenter) obj2).keyProvider).track(new PersonalProfileEditOpen(PersonalProfileEditOpen.PersonalProfileEditScreen.EDIT), null);
                break;
        }
        return Unit.INSTANCE;
    }
}
