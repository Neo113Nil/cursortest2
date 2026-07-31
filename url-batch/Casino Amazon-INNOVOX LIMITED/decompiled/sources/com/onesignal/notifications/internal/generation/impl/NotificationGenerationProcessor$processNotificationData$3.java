package com.onesignal.notifications.internal.generation.impl;

import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.notifications.internal.Notification;
import com.onesignal.notifications.internal.NotificationWillDisplayEvent;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NotificationGenerationProcessor.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3", f = "NotificationGenerationProcessor.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationGenerationProcessor$processNotificationData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Notification $notification;
    final /* synthetic */ NotificationWillDisplayEvent $notificationWillDisplayEvent;
    final /* synthetic */ Ref.BooleanRef $wantsToDisplay;
    int label;
    final /* synthetic */ NotificationGenerationProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationGenerationProcessor$processNotificationData$3(NotificationGenerationProcessor notificationGenerationProcessor, NotificationWillDisplayEvent notificationWillDisplayEvent, Ref.BooleanRef booleanRef, Notification notification, Continuation<? super NotificationGenerationProcessor$processNotificationData$3> continuation) {
        super(2, continuation);
        this.this$0 = notificationGenerationProcessor;
        this.$notificationWillDisplayEvent = notificationWillDisplayEvent;
        this.$wantsToDisplay = booleanRef;
        this.$notification = notification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotificationGenerationProcessor$processNotificationData$3(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotificationGenerationProcessor$processNotificationData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: NotificationGenerationProcessor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3$1", f = "NotificationGenerationProcessor.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor$processNotificationData$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Notification $notification;
        final /* synthetic */ NotificationWillDisplayEvent $notificationWillDisplayEvent;
        final /* synthetic */ Ref.BooleanRef $wantsToDisplay;
        Object L$0;
        int label;
        final /* synthetic */ NotificationGenerationProcessor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationGenerationProcessor notificationGenerationProcessor, NotificationWillDisplayEvent notificationWillDisplayEvent, Ref.BooleanRef booleanRef, Notification notification, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = notificationGenerationProcessor;
            this.$notificationWillDisplayEvent = notificationWillDisplayEvent;
            this.$wantsToDisplay = booleanRef;
            this.$notification = notification;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            INotificationLifecycleService iNotificationLifecycleService;
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                iNotificationLifecycleService = this.this$0._lifecycleService;
                iNotificationLifecycleService.externalNotificationWillShowInForeground(this.$notificationWillDisplayEvent);
                if (this.$notificationWillDisplayEvent.getDiscard()) {
                    this.$wantsToDisplay.element = false;
                } else if (this.$notificationWillDisplayEvent.getIsPreventDefault()) {
                    this.$wantsToDisplay.element = false;
                    Ref.BooleanRef booleanRef2 = this.$wantsToDisplay;
                    this.L$0 = booleanRef2;
                    this.label = 1;
                    Object waitForWake = this.$notification.getDisplayWaiter().waitForWake(this);
                    if (waitForWake == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                    obj = waitForWake;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            booleanRef.element = ((Boolean) obj).booleanValue();
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (ThreadUtilsKt.launchOnIO(new AnonymousClass1(this.this$0, this.$notificationWillDisplayEvent, this.$wantsToDisplay, this.$notification, null)).join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
