package com.onesignal.notifications.internal.permissions.impl;

import android.app.Activity;
import android.os.Build;
import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.Waiter;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase;
import com.onesignal.core.internal.application.IActivityLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings;
import com.onesignal.core.internal.permissions.IRequestPermissionService;
import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.notifications.R;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.permissions.INotificationPermissionChangedHandler;
import com.onesignal.notifications.internal.permissions.INotificationPermissionController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;

/* compiled from: NotificationPermissionController.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u000e\u0010%\u001a\u00020!H\u0082@¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020\u000eH\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0014H\u0016J\u0010\u0010-\u001a\u00020!2\u0006\u0010,\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/onesignal/notifications/internal/permissions/impl/NotificationPermissionController;", "Lcom/onesignal/core/internal/permissions/IRequestPermissionService$PermissionCallback;", "Lcom/onesignal/notifications/internal/permissions/INotificationPermissionController;", "_application", "Lcom/onesignal/core/internal/application/IApplicationService;", "_requestPermission", "Lcom/onesignal/core/internal/permissions/IRequestPermissionService;", "_applicationService", "_preferenceService", "Lcom/onesignal/core/internal/preferences/IPreferencesService;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/permissions/IRequestPermissionService;Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/preferences/IPreferencesService;Lcom/onesignal/core/internal/config/ConfigModelStore;)V", "canRequestPermission", "", "getCanRequestPermission", "()Z", ViewProps.ENABLED, "events", "Lcom/onesignal/common/events/EventProducer;", "Lcom/onesignal/notifications/internal/permissions/INotificationPermissionChangedHandler;", "hasSubscribers", "getHasSubscribers", "pollingWaitInterval", "", "pollingWaiter", "Lcom/onesignal/common/threading/Waiter;", "supportsNativePrompt", "getSupportsNativePrompt", "waiter", "Lcom/onesignal/common/threading/WaiterWithValue;", "notificationsEnabled", "onAccept", "", "onReject", "fallbackToSettings", "permissionPromptCompleted", "pollForPermission", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prompt", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerPollingLifecycleListener", "showFallbackAlertDialog", "subscribe", "handler", "unsubscribe", "Companion", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationPermissionController implements IRequestPermissionService.PermissionCallback, INotificationPermissionController {
    private static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";
    private static final String PERMISSION_TYPE = "NOTIFICATION";
    private final IApplicationService _application;
    private final IApplicationService _applicationService;
    private final ConfigModelStore _configModelStore;
    private final IPreferencesService _preferenceService;
    private final IRequestPermissionService _requestPermission;
    private boolean enabled;
    private final EventProducer<INotificationPermissionChangedHandler> events;
    private long pollingWaitInterval;
    private final Waiter pollingWaiter;
    private final boolean supportsNativePrompt;
    private final WaiterWithValue<Boolean> waiter;

    public NotificationPermissionController(IApplicationService _application, IRequestPermissionService _requestPermission, IApplicationService _applicationService, IPreferencesService _preferenceService, ConfigModelStore _configModelStore) {
        Intrinsics.checkNotNullParameter(_application, "_application");
        Intrinsics.checkNotNullParameter(_requestPermission, "_requestPermission");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_preferenceService, "_preferenceService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._application = _application;
        this._requestPermission = _requestPermission;
        this._applicationService = _applicationService;
        this._preferenceService = _preferenceService;
        this._configModelStore = _configModelStore;
        this.waiter = new WaiterWithValue<>();
        this.pollingWaiter = new Waiter();
        this.events = new EventProducer<>();
        this.enabled = notificationsEnabled();
        _requestPermission.registerAsCallback(PERMISSION_TYPE, this);
        this.pollingWaitInterval = _configModelStore.getModel().getBackgroundFetchNotificationPermissionInterval();
        registerPollingLifecycleListener();
        ThreadUtilsKt.launchOnIO(new AnonymousClass1(null));
        this.supportsNativePrompt = Build.VERSION.SDK_INT > 32 && AndroidUtils.INSTANCE.getTargetSdkVersion(_application.getAppContext()) > 32;
    }

    @Override // com.onesignal.notifications.internal.permissions.INotificationPermissionController
    public boolean getCanRequestPermission() {
        Intrinsics.checkNotNull(this._preferenceService.getBool("OneSignal", "USER_RESOLVED_PERMISSION_android.permission.POST_NOTIFICATIONS", false));
        return !r0.booleanValue();
    }

    /* compiled from: NotificationPermissionController.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$1", f = "NotificationPermissionController.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NotificationPermissionController.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (NotificationPermissionController.this.pollForPermission(this) == coroutine_suspended) {
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

    private final void registerPollingLifecycleListener() {
        this._applicationService.addApplicationLifecycleHandler(new ApplicationLifecycleHandlerBase() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$registerPollingLifecycleListener$1
            @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
            public void onFocus(boolean firedOnSubscribe) {
                super.onFocus(firedOnSubscribe);
                final NotificationPermissionController notificationPermissionController = NotificationPermissionController.this;
                ThreadUtilsKt.runOnSerialIO(new Function0<Unit>() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$registerPollingLifecycleListener$1$onFocus$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ConfigModelStore configModelStore;
                        Waiter waiter;
                        NotificationPermissionController notificationPermissionController2 = NotificationPermissionController.this;
                        configModelStore = notificationPermissionController2._configModelStore;
                        notificationPermissionController2.pollingWaitInterval = configModelStore.getModel().getForegroundFetchNotificationPermissionInterval();
                        waiter = NotificationPermissionController.this.pollingWaiter;
                        waiter.wake();
                    }
                });
            }

            @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
            public void onUnfocused() {
                super.onUnfocused();
                final NotificationPermissionController notificationPermissionController = NotificationPermissionController.this;
                ThreadUtilsKt.runOnSerialIO(new Function0<Unit>() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$registerPollingLifecycleListener$1$onUnfocused$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ConfigModelStore configModelStore;
                        NotificationPermissionController notificationPermissionController2 = NotificationPermissionController.this;
                        configModelStore = notificationPermissionController2._configModelStore;
                        notificationPermissionController2.pollingWaitInterval = configModelStore.getModel().getBackgroundFetchNotificationPermissionInterval();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pollForPermission(Continuation<? super Unit> continuation) {
        NotificationPermissionController$pollForPermission$1 notificationPermissionController$pollForPermission$1;
        Object coroutine_suspended;
        int i;
        NotificationPermissionController notificationPermissionController;
        final boolean notificationsEnabled;
        long j;
        NotificationPermissionController$pollForPermission$3 notificationPermissionController$pollForPermission$3;
        if (continuation instanceof NotificationPermissionController$pollForPermission$1) {
            notificationPermissionController$pollForPermission$1 = (NotificationPermissionController$pollForPermission$1) continuation;
            if ((notificationPermissionController$pollForPermission$1.label & Integer.MIN_VALUE) != 0) {
                notificationPermissionController$pollForPermission$1.label -= Integer.MIN_VALUE;
                Object obj = notificationPermissionController$pollForPermission$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationPermissionController$pollForPermission$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    notificationPermissionController = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    notificationPermissionController = (NotificationPermissionController) notificationPermissionController$pollForPermission$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                do {
                    notificationsEnabled = notificationPermissionController.notificationsEnabled();
                    if (notificationPermissionController.enabled != notificationsEnabled) {
                        notificationPermissionController.enabled = notificationsEnabled;
                        notificationPermissionController.events.fire(new Function1<INotificationPermissionChangedHandler, Unit>() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$pollForPermission$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(INotificationPermissionChangedHandler iNotificationPermissionChangedHandler) {
                                invoke2(iNotificationPermissionChangedHandler);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(INotificationPermissionChangedHandler it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                it.onNotificationPermissionChanged(notificationsEnabled);
                            }
                        });
                    }
                    j = notificationPermissionController.pollingWaitInterval;
                    notificationPermissionController$pollForPermission$3 = new NotificationPermissionController$pollForPermission$3(notificationPermissionController, null);
                    notificationPermissionController$pollForPermission$1.L$0 = notificationPermissionController;
                    notificationPermissionController$pollForPermission$1.label = 1;
                } while (TimeoutKt.withTimeoutOrNull(j, notificationPermissionController$pollForPermission$3, notificationPermissionController$pollForPermission$1) != coroutine_suspended);
                return coroutine_suspended;
            }
        }
        notificationPermissionController$pollForPermission$1 = new NotificationPermissionController$pollForPermission$1(this, continuation);
        Object obj2 = notificationPermissionController$pollForPermission$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationPermissionController$pollForPermission$1.label;
        if (i != 0) {
        }
        do {
            notificationsEnabled = notificationPermissionController.notificationsEnabled();
            if (notificationPermissionController.enabled != notificationsEnabled) {
            }
            j = notificationPermissionController.pollingWaitInterval;
            notificationPermissionController$pollForPermission$3 = new NotificationPermissionController$pollForPermission$3(notificationPermissionController, null);
            notificationPermissionController$pollForPermission$1.L$0 = notificationPermissionController;
            notificationPermissionController$pollForPermission$1.label = 1;
        } while (TimeoutKt.withTimeoutOrNull(j, notificationPermissionController$pollForPermission$3, notificationPermissionController$pollForPermission$1) != coroutine_suspended);
        return coroutine_suspended;
    }

    public final boolean getSupportsNativePrompt() {
        return this.supportsNativePrompt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void permissionPromptCompleted(final boolean enabled) {
        this.enabled = enabled;
        this.waiter.wake(Boolean.valueOf(enabled));
        this.events.fire(new Function1<INotificationPermissionChangedHandler, Unit>() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$permissionPromptCompleted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(INotificationPermissionChangedHandler iNotificationPermissionChangedHandler) {
                invoke2(iNotificationPermissionChangedHandler);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(INotificationPermissionChangedHandler it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onNotificationPermissionChanged(enabled);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.onesignal.notifications.internal.permissions.INotificationPermissionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object prompt(boolean z, Continuation<? super Boolean> continuation) {
        NotificationPermissionController$prompt$1 notificationPermissionController$prompt$1;
        int i;
        NotificationPermissionController notificationPermissionController;
        if (continuation instanceof NotificationPermissionController$prompt$1) {
            notificationPermissionController$prompt$1 = (NotificationPermissionController$prompt$1) continuation;
            if ((notificationPermissionController$prompt$1.label & Integer.MIN_VALUE) != 0) {
                notificationPermissionController$prompt$1.label -= Integer.MIN_VALUE;
                Object obj = notificationPermissionController$prompt$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationPermissionController$prompt$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    notificationPermissionController$prompt$1.L$0 = this;
                    notificationPermissionController$prompt$1.Z$0 = z;
                    notificationPermissionController$prompt$1.label = 1;
                    if (YieldKt.yield(notificationPermissionController$prompt$1) != coroutine_suspended) {
                        notificationPermissionController = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                z = notificationPermissionController$prompt$1.Z$0;
                notificationPermissionController = (NotificationPermissionController) notificationPermissionController$prompt$1.L$0;
                ResultKt.throwOnFailure(obj);
                if (!notificationPermissionController.notificationsEnabled()) {
                    return Boxing.boxBoolean(true);
                }
                if (notificationPermissionController.supportsNativePrompt) {
                    notificationPermissionController._requestPermission.startPrompt(z, PERMISSION_TYPE, ANDROID_PERMISSION_STRING, notificationPermissionController.getClass());
                } else if (z) {
                    notificationPermissionController.showFallbackAlertDialog();
                } else {
                    return Boxing.boxBoolean(false);
                }
                WaiterWithValue<Boolean> waiterWithValue = notificationPermissionController.waiter;
                notificationPermissionController$prompt$1.L$0 = null;
                notificationPermissionController$prompt$1.label = 2;
                Object waitForWake = waiterWithValue.waitForWake(notificationPermissionController$prompt$1);
                return waitForWake == coroutine_suspended ? coroutine_suspended : waitForWake;
            }
        }
        notificationPermissionController$prompt$1 = new NotificationPermissionController$prompt$1(this, continuation);
        Object obj2 = notificationPermissionController$prompt$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationPermissionController$prompt$1.label;
        if (i != 0) {
        }
        if (!notificationPermissionController.notificationsEnabled()) {
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(INotificationPermissionChangedHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(INotificationPermissionChangedHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onAccept() {
        permissionPromptCompleted(true);
    }

    @Override // com.onesignal.core.internal.permissions.IRequestPermissionService.PermissionCallback
    public void onReject(boolean fallbackToSettings) {
        if (fallbackToSettings ? showFallbackAlertDialog() : false) {
            return;
        }
        permissionPromptCompleted(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFallbackAlertDialog$present(final NotificationPermissionController notificationPermissionController, final Activity activity) {
        AlertDialogPrepromptForAndroidSettings alertDialogPrepromptForAndroidSettings = AlertDialogPrepromptForAndroidSettings.INSTANCE;
        String string = activity.getString(R.string.notification_permission_name_for_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = activity.getString(R.string.notification_permission_settings_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        alertDialogPrepromptForAndroidSettings.show(activity, string, string2, new AlertDialogPrepromptForAndroidSettings.Callback() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$showFallbackAlertDialog$present$1
            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onAccept() {
                IApplicationService iApplicationService;
                iApplicationService = NotificationPermissionController.this._applicationService;
                final NotificationPermissionController notificationPermissionController2 = NotificationPermissionController.this;
                iApplicationService.addApplicationLifecycleHandler(new ApplicationLifecycleHandlerBase() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$showFallbackAlertDialog$present$1$onAccept$1
                    @Override // com.onesignal.core.internal.application.ApplicationLifecycleHandlerBase, com.onesignal.core.internal.application.IApplicationLifecycleHandler
                    public void onFocus(boolean firedOnSubscribe) {
                        IApplicationService iApplicationService2;
                        IApplicationService iApplicationService3;
                        if (firedOnSubscribe) {
                            return;
                        }
                        super.onFocus(false);
                        iApplicationService2 = NotificationPermissionController.this._applicationService;
                        iApplicationService2.removeApplicationLifecycleHandler(this);
                        AndroidUtils androidUtils = AndroidUtils.INSTANCE;
                        iApplicationService3 = NotificationPermissionController.this._applicationService;
                        NotificationPermissionController.this.permissionPromptCompleted(androidUtils.hasPermission("android.permission.POST_NOTIFICATIONS", true, iApplicationService3));
                    }
                });
                NavigateToAndroidSettingsForNotifications.INSTANCE.show(activity);
            }

            @Override // com.onesignal.core.internal.permissions.AlertDialogPrepromptForAndroidSettings.Callback
            public void onDecline() {
                NotificationPermissionController.this.permissionPromptCompleted(false);
            }
        });
    }

    private final boolean showFallbackAlertDialog() {
        Activity activity = this._application.get_current();
        if (activity != null && !(activity instanceof PermissionsActivity)) {
            showFallbackAlertDialog$present(this, activity);
            return true;
        }
        this._application.addActivityLifecycleHandler(new IActivityLifecycleHandler() { // from class: com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController$showFallbackAlertDialog$1
            @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityStopped(Activity activity2) {
                Intrinsics.checkNotNullParameter(activity2, "activity");
            }

            @Override // com.onesignal.core.internal.application.IActivityLifecycleHandler
            public void onActivityAvailable(Activity activity2) {
                IApplicationService iApplicationService;
                Intrinsics.checkNotNullParameter(activity2, "activity");
                if (activity2 instanceof PermissionsActivity) {
                    return;
                }
                iApplicationService = NotificationPermissionController.this._application;
                iApplicationService.removeActivityLifecycleHandler(this);
                NotificationPermissionController.showFallbackAlertDialog$present(NotificationPermissionController.this, activity2);
            }
        });
        return true;
    }

    private final boolean notificationsEnabled() {
        return NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, this._application.getAppContext(), null, 2, null);
    }
}
