package com.onesignal.notifications.internal.lifecycle.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.JSONUtils;
import com.onesignal.common.NetworkUtils;
import com.onesignal.common.events.CallbackProducer;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.exceptions.BackendException;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.AppEntryAction;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.device.IDeviceService;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationReceivedEvent;
import com.onesignal.notifications.INotificationServiceExtension;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.notifications.internal.INotificationActivityOpener;
import com.onesignal.notifications.internal.NotificationClickEvent;
import com.onesignal.notifications.internal.analytics.IAnalyticsTracker;
import com.onesignal.notifications.internal.backend.INotificationBackendService;
import com.onesignal.notifications.internal.common.GenerateNotificationOpenIntentFromPushPayload;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.notifications.internal.common.NotificationFormatHelper;
import com.onesignal.notifications.internal.common.NotificationGenerationJob;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.common.OSNotificationOpenAppSettings;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleCallback;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.receivereceipt.IReceiveReceiptWorkManager;
import com.onesignal.session.internal.influence.IInfluenceManager;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationLifecycleService.kt */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001RBM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0018H\u0016J\u0010\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020\u001dH\u0016J\u001e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0096@¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00020,2\u0006\u00103\u001a\u000200H\u0096@¢\u0006\u0002\u00104J.\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\"2\u0006\u00109\u001a\u00020:H\u0082@¢\u0006\u0002\u0010;J\u0010\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u00020AH\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010\"2\u0006\u0010/\u001a\u00020%H\u0002J\u001e\u0010C\u001a\u00020'2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020%H\u0096@¢\u0006\u0002\u0010DJ\u0016\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u00020GH\u0096@¢\u0006\u0002\u0010HJ\u001e\u0010I\u001a\u00020'2\u0006\u0010-\u001a\u00020.2\u0006\u0010J\u001a\u00020%H\u0096@¢\u0006\u0002\u0010DJ\u0010\u0010K\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0018H\u0016J\u0010\u0010L\u001a\u00020'2\u0006\u0010*\u001a\u00020\u001dH\u0016J\u0012\u0010M\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010N\u001a\u00020'2\u0006\u0010O\u001a\u00020PJ\u0010\u0010Q\u001a\u00020,2\u0006\u0010O\u001a\u00020.H\u0002R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/onesignal/notifications/internal/lifecycle/impl/NotificationLifecycleService;", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleService;", "Lcom/onesignal/notifications/internal/INotificationActivityOpener;", "_applicationService", "Lcom/onesignal/core/internal/application/IApplicationService;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_influenceManager", "Lcom/onesignal/session/internal/influence/IInfluenceManager;", "_subscriptionManager", "Lcom/onesignal/user/internal/subscriptions/ISubscriptionManager;", "_deviceService", "Lcom/onesignal/core/internal/device/IDeviceService;", "_backend", "Lcom/onesignal/notifications/internal/backend/INotificationBackendService;", "_receiveReceiptWorkManager", "Lcom/onesignal/notifications/internal/receivereceipt/IReceiveReceiptWorkManager;", "_analyticsTracker", "Lcom/onesignal/notifications/internal/analytics/IAnalyticsTracker;", "(Lcom/onesignal/core/internal/application/IApplicationService;Lcom/onesignal/core/internal/time/ITime;Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/session/internal/influence/IInfluenceManager;Lcom/onesignal/user/internal/subscriptions/ISubscriptionManager;Lcom/onesignal/core/internal/device/IDeviceService;Lcom/onesignal/notifications/internal/backend/INotificationBackendService;Lcom/onesignal/notifications/internal/receivereceipt/IReceiveReceiptWorkManager;Lcom/onesignal/notifications/internal/analytics/IAnalyticsTracker;)V", "extOpenedCallback", "Lcom/onesignal/common/events/EventProducer;", "Lcom/onesignal/notifications/INotificationClickListener;", "extRemoteReceivedCallback", "Lcom/onesignal/common/events/CallbackProducer;", "Lcom/onesignal/notifications/INotificationServiceExtension;", "extWillShowInForegroundCallback", "Lcom/onesignal/notifications/INotificationLifecycleListener;", "intLifecycleCallback", "Lcom/onesignal/notifications/internal/lifecycle/INotificationLifecycleCallback;", "postedOpenedNotifIds", "", "", "unprocessedOpenedNotifs", "Lkotlin/collections/ArrayDeque;", "Lorg/json/JSONArray;", "addExternalClickListener", "", "callback", "addExternalForegroundLifecycleListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "canOpenNotification", "", "activity", "Landroid/app/Activity;", "data", "Lorg/json/JSONObject;", "(Landroid/app/Activity;Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canReceiveNotification", "jsonPayload", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmNotificationOpened", "appId", "notificationId", "subscriptionId", "deviceType", "Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/onesignal/core/internal/device/IDeviceService$DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "externalNotificationWillShowInForeground", "willDisplayEvent", "Lcom/onesignal/notifications/INotificationWillDisplayEvent;", "externalRemoteNotificationReceived", "notificationReceivedEvent", "Lcom/onesignal/notifications/INotificationReceivedEvent;", "getLatestNotificationId", "notificationOpened", "(Landroid/app/Activity;Lorg/json/JSONArray;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notificationReceived", "notificationJob", "Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;", "(Lcom/onesignal/notifications/internal/common/NotificationGenerationJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openDestinationActivity", "pushPayloads", "removeExternalClickListener", "removeExternalForegroundLifecycleListener", "setInternalNotificationLifecycleCallback", "setupNotificationServiceExtension", "context", "Landroid/content/Context;", "shouldInitDirectSessionFromNotificationOpen", "Companion", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationLifecycleService implements INotificationLifecycleService, INotificationActivityOpener {
    private static final long MILLIS_PER_SECOND = 1000;
    private static final int RETRY_BACKOFF_MS = 15000;
    private final IAnalyticsTracker _analyticsTracker;
    private final IApplicationService _applicationService;
    private final INotificationBackendService _backend;
    private final ConfigModelStore _configModelStore;
    private final IDeviceService _deviceService;
    private final IInfluenceManager _influenceManager;
    private final IReceiveReceiptWorkManager _receiveReceiptWorkManager;
    private final ISubscriptionManager _subscriptionManager;
    private final ITime _time;
    private final EventProducer<INotificationClickListener> extOpenedCallback;
    private final CallbackProducer<INotificationServiceExtension> extRemoteReceivedCallback;
    private final EventProducer<INotificationLifecycleListener> extWillShowInForegroundCallback;
    private final CallbackProducer<INotificationLifecycleCallback> intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final ArrayDeque<JSONArray> unprocessedOpenedNotifs;

    public NotificationLifecycleService(IApplicationService _applicationService, ITime _time, ConfigModelStore _configModelStore, IInfluenceManager _influenceManager, ISubscriptionManager _subscriptionManager, IDeviceService _deviceService, INotificationBackendService _backend, IReceiveReceiptWorkManager _receiveReceiptWorkManager, IAnalyticsTracker _analyticsTracker) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        Intrinsics.checkNotNullParameter(_receiveReceiptWorkManager, "_receiveReceiptWorkManager");
        Intrinsics.checkNotNullParameter(_analyticsTracker, "_analyticsTracker");
        this._applicationService = _applicationService;
        this._time = _time;
        this._configModelStore = _configModelStore;
        this._influenceManager = _influenceManager;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._backend = _backend;
        this._receiveReceiptWorkManager = _receiveReceiptWorkManager;
        this._analyticsTracker = _analyticsTracker;
        this.intLifecycleCallback = new CallbackProducer<>();
        this.extRemoteReceivedCallback = new CallbackProducer<>();
        this.extWillShowInForegroundCallback = new EventProducer<>();
        this.extOpenedCallback = new EventProducer<>();
        this.unprocessedOpenedNotifs = new ArrayDeque<>();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(_applicationService.getAppContext());
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void setInternalNotificationLifecycleCallback(INotificationLifecycleCallback callback) {
        this.intLifecycleCallback.set(callback);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void addExternalForegroundLifecycleListener(INotificationLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extWillShowInForegroundCallback.subscribe(listener);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void removeExternalForegroundLifecycleListener(INotificationLifecycleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(listener);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void addExternalClickListener(INotificationClickListener callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.extOpenedCallback.subscribe(callback);
        if (this.extOpenedCallback.getHasSubscribers() && CollectionsKt.any(this.unprocessedOpenedNotifs)) {
            Iterator it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                final NotificationClickEvent generateNotificationOpenedResult$com_onesignal_notifications = NotificationHelper.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time);
                this.extOpenedCallback.fireOnMain(new Function1<INotificationClickListener, Unit>() { // from class: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$addExternalClickListener$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(INotificationClickListener iNotificationClickListener) {
                        invoke2(iNotificationClickListener);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(INotificationClickListener it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        it2.onClick(NotificationClickEvent.this);
                    }
                });
            }
            this.unprocessedOpenedNotifs.clear();
        }
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void removeExternalClickListener(INotificationClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.extOpenedCallback.unsubscribe(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, Continuation<? super Boolean> continuation) {
        NotificationLifecycleService$canReceiveNotification$1 notificationLifecycleService$canReceiveNotification$1;
        int i;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof NotificationLifecycleService$canReceiveNotification$1) {
            notificationLifecycleService$canReceiveNotification$1 = (NotificationLifecycleService$canReceiveNotification$1) continuation;
            if ((notificationLifecycleService$canReceiveNotification$1.label & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$canReceiveNotification$1.label -= Integer.MIN_VALUE;
                Object obj = notificationLifecycleService$canReceiveNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationLifecycleService$canReceiveNotification$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    booleanRef2.element = true;
                    CallbackProducer<INotificationLifecycleCallback> callbackProducer = this.intLifecycleCallback;
                    NotificationLifecycleService$canReceiveNotification$2 notificationLifecycleService$canReceiveNotification$2 = new NotificationLifecycleService$canReceiveNotification$2(booleanRef2, jSONObject, null);
                    notificationLifecycleService$canReceiveNotification$1.L$0 = booleanRef2;
                    notificationLifecycleService$canReceiveNotification$1.label = 1;
                    if (callbackProducer.suspendingFire(notificationLifecycleService$canReceiveNotification$2, notificationLifecycleService$canReceiveNotification$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) notificationLifecycleService$canReceiveNotification$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        notificationLifecycleService$canReceiveNotification$1 = new NotificationLifecycleService$canReceiveNotification$1(this, continuation);
        Object obj2 = notificationLifecycleService$canReceiveNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationLifecycleService$canReceiveNotification$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public Object notificationReceived(NotificationGenerationJob notificationGenerationJob, Continuation<? super Unit> continuation) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(notificationGenerationJob.getApiNotificationId());
        this._influenceManager.onNotificationReceived(notificationGenerationJob.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(notificationGenerationJob.getJsonPayload().toString());
            jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, notificationGenerationJob.getAndroidId());
            NotificationClickEvent generateNotificationOpenedResult$com_onesignal_notifications = NotificationHelper.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(JSONUtils.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            IAnalyticsTracker iAnalyticsTracker = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            Intrinsics.checkNotNull(notificationId);
            iAnalyticsTracker.trackReceivedEvent(notificationId, NotificationHelper.INSTANCE.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, Continuation<? super Boolean> continuation) {
        NotificationLifecycleService$canOpenNotification$1 notificationLifecycleService$canOpenNotification$1;
        int i;
        Ref.BooleanRef booleanRef;
        if (continuation instanceof NotificationLifecycleService$canOpenNotification$1) {
            notificationLifecycleService$canOpenNotification$1 = (NotificationLifecycleService$canOpenNotification$1) continuation;
            if ((notificationLifecycleService$canOpenNotification$1.label & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$canOpenNotification$1.label -= Integer.MIN_VALUE;
                Object obj = notificationLifecycleService$canOpenNotification$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationLifecycleService$canOpenNotification$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    booleanRef2.element = true;
                    CallbackProducer<INotificationLifecycleCallback> callbackProducer = this.intLifecycleCallback;
                    NotificationLifecycleService$canOpenNotification$2 notificationLifecycleService$canOpenNotification$2 = new NotificationLifecycleService$canOpenNotification$2(booleanRef2, activity, jSONObject, null);
                    notificationLifecycleService$canOpenNotification$1.L$0 = booleanRef2;
                    notificationLifecycleService$canOpenNotification$1.label = 1;
                    if (callbackProducer.suspendingFire(notificationLifecycleService$canOpenNotification$2, notificationLifecycleService$canOpenNotification$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) notificationLifecycleService$canOpenNotification$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(booleanRef.element);
            }
        }
        notificationLifecycleService$canOpenNotification$1 = new NotificationLifecycleService$canOpenNotification$1(this, continuation);
        Object obj2 = notificationLifecycleService$canOpenNotification$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationLifecycleService$canOpenNotification$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(booleanRef.element);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, Continuation<? super Unit> continuation) {
        NotificationLifecycleService$notificationOpened$1 notificationLifecycleService$notificationOpened$1;
        int i;
        NotificationLifecycleService notificationLifecycleService;
        JSONArray jSONArray2;
        if (continuation instanceof NotificationLifecycleService$notificationOpened$1) {
            notificationLifecycleService$notificationOpened$1 = (NotificationLifecycleService$notificationOpened$1) continuation;
            if ((notificationLifecycleService$notificationOpened$1.label & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$notificationOpened$1.label -= Integer.MIN_VALUE;
                NotificationLifecycleService$notificationOpened$1 notificationLifecycleService$notificationOpened$12 = notificationLifecycleService$notificationOpened$1;
                Object obj = notificationLifecycleService$notificationOpened$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationLifecycleService$notificationOpened$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String appId = this._configModelStore.getModel().getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    String str = appId;
                    String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                    IDeviceService.DeviceType deviceType = this._deviceService.getDeviceType();
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String oSNotificationIdFromJson = NotificationFormatHelper.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i2));
                        if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                            this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                            ThreadUtilsKt.suspendifyWithErrorHandling$default(true, new NotificationLifecycleService$notificationOpened$2(this, str, oSNotificationIdFromJson, id, deviceType, null), new Function1<Exception, Unit>() { // from class: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$notificationOpened$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                                    invoke2(exc);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Exception ex) {
                                    Intrinsics.checkNotNullParameter(ex, "ex");
                                    if (ex instanceof BackendException) {
                                        BackendException backendException = (BackendException) ex;
                                        Logging.info$default("Notification opened confirmation failed with statusCode: " + backendException.getStatusCode() + " response: " + backendException.getResponse(), null, 2, null);
                                    } else {
                                        Logging.info("Unexpected error in notification opened confirmation", ex);
                                    }
                                }
                            }, null, 8, null);
                        }
                    }
                    NotificationClickEvent generateNotificationOpenedResult$com_onesignal_notifications = NotificationHelper.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
                    IAnalyticsTracker iAnalyticsTracker = this._analyticsTracker;
                    String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
                    Intrinsics.checkNotNull(notificationId);
                    iAnalyticsTracker.trackOpenedEvent(notificationId, NotificationHelper.INSTANCE.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
                    String latestNotificationId = getLatestNotificationId(jSONArray);
                    if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                        this._applicationService.setEntryState(AppEntryAction.NOTIFICATION_CLICK);
                        if (latestNotificationId != null) {
                            this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                        }
                    }
                    notificationLifecycleService$notificationOpened$12.L$0 = this;
                    notificationLifecycleService$notificationOpened$12.L$1 = jSONArray;
                    notificationLifecycleService$notificationOpened$12.label = 1;
                    if (openDestinationActivity(activity, jSONArray, notificationLifecycleService$notificationOpened$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    notificationLifecycleService = this;
                    jSONArray2 = jSONArray;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray2 = (JSONArray) notificationLifecycleService$notificationOpened$12.L$1;
                    notificationLifecycleService = (NotificationLifecycleService) notificationLifecycleService$notificationOpened$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!notificationLifecycleService.extOpenedCallback.getHasSubscribers()) {
                    final NotificationClickEvent generateNotificationOpenedResult$com_onesignal_notifications2 = NotificationHelper.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray2, notificationLifecycleService._time);
                    notificationLifecycleService.extOpenedCallback.fireOnMain(new Function1<INotificationClickListener, Unit>() { // from class: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$notificationOpened$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(INotificationClickListener iNotificationClickListener) {
                            invoke2(iNotificationClickListener);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(INotificationClickListener it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            it.onClick(NotificationClickEvent.this);
                        }
                    });
                } else {
                    notificationLifecycleService.unprocessedOpenedNotifs.add(jSONArray2);
                }
                return Unit.INSTANCE;
            }
        }
        notificationLifecycleService$notificationOpened$1 = new NotificationLifecycleService$notificationOpened$1(this, continuation);
        NotificationLifecycleService$notificationOpened$1 notificationLifecycleService$notificationOpened$122 = notificationLifecycleService$notificationOpened$1;
        Object obj2 = notificationLifecycleService$notificationOpened$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationLifecycleService$notificationOpened$122.label;
        if (i != 0) {
        }
        if (!notificationLifecycleService.extOpenedCallback.getHasSubscribers()) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void externalRemoteNotificationReceived(final INotificationReceivedEvent notificationReceivedEvent) {
        Intrinsics.checkNotNullParameter(notificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new Function1<INotificationServiceExtension, Unit>() { // from class: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$externalRemoteNotificationReceived$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(INotificationServiceExtension iNotificationServiceExtension) {
                invoke2(iNotificationServiceExtension);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(INotificationServiceExtension it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onNotificationReceived(INotificationReceivedEvent.this);
            }
        });
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void externalNotificationWillShowInForeground(final INotificationWillDisplayEvent willDisplayEvent) {
        Intrinsics.checkNotNullParameter(willDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new Function1<INotificationLifecycleListener, Unit>() { // from class: com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService$externalNotificationWillShowInForeground$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(INotificationLifecycleListener iNotificationLifecycleListener) {
                invoke2(iNotificationLifecycleListener);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(INotificationLifecycleListener it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onWillDisplay(INotificationWillDisplayEvent.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0138, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r1) == r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0138 -> B:11:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmNotificationOpened(String str, String str2, String str3, IDeviceService.DeviceType deviceType, Continuation<? super Unit> continuation) {
        NotificationLifecycleService$confirmNotificationOpened$1 notificationLifecycleService$confirmNotificationOpened$1;
        NotificationLifecycleService notificationLifecycleService;
        int i;
        String str4;
        String str5;
        String str6;
        IDeviceService.DeviceType deviceType2;
        int i2;
        NotificationLifecycleService$confirmNotificationOpened$1 notificationLifecycleService$confirmNotificationOpened$12;
        NotificationLifecycleService notificationLifecycleService2;
        int i3;
        NotificationLifecycleService notificationLifecycleService3;
        String str7;
        String str8;
        String str9;
        IDeviceService.DeviceType deviceType3;
        int i4;
        BackendException e;
        INotificationBackendService iNotificationBackendService;
        if (continuation instanceof NotificationLifecycleService$confirmNotificationOpened$1) {
            notificationLifecycleService$confirmNotificationOpened$1 = (NotificationLifecycleService$confirmNotificationOpened$1) continuation;
            if ((notificationLifecycleService$confirmNotificationOpened$1.label & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$confirmNotificationOpened$1.label -= Integer.MIN_VALUE;
                notificationLifecycleService = this;
                Object obj = notificationLifecycleService$confirmNotificationOpened$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationLifecycleService$confirmNotificationOpened$1.label;
                int i5 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int maxNetworkRequestAttemptCount = NetworkUtils.INSTANCE.getMaxNetworkRequestAttemptCount();
                    if (1 <= maxNetworkRequestAttemptCount) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        deviceType2 = deviceType;
                        i2 = maxNetworkRequestAttemptCount;
                        notificationLifecycleService$confirmNotificationOpened$12 = notificationLifecycleService$confirmNotificationOpened$1;
                        notificationLifecycleService2 = notificationLifecycleService;
                        i3 = 1;
                        iNotificationBackendService = notificationLifecycleService2._backend;
                        notificationLifecycleService$confirmNotificationOpened$12.L$0 = notificationLifecycleService2;
                        notificationLifecycleService$confirmNotificationOpened$12.L$1 = str4;
                        notificationLifecycleService$confirmNotificationOpened$12.L$2 = str5;
                        notificationLifecycleService$confirmNotificationOpened$12.L$3 = str6;
                        notificationLifecycleService$confirmNotificationOpened$12.L$4 = deviceType2;
                        notificationLifecycleService$confirmNotificationOpened$12.I$0 = i3;
                        notificationLifecycleService$confirmNotificationOpened$12.I$1 = i2;
                        notificationLifecycleService$confirmNotificationOpened$12.label = i5;
                        if (iNotificationBackendService.updateNotificationAsOpened(str4, str5, str6, deviceType2, notificationLifecycleService$confirmNotificationOpened$12) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    i2 = notificationLifecycleService$confirmNotificationOpened$1.I$1;
                    i4 = notificationLifecycleService$confirmNotificationOpened$1.I$0;
                    deviceType3 = (IDeviceService.DeviceType) notificationLifecycleService$confirmNotificationOpened$1.L$4;
                    str9 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$3;
                    str8 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$2;
                    str7 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$1;
                    notificationLifecycleService3 = (NotificationLifecycleService) notificationLifecycleService$confirmNotificationOpened$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (BackendException e2) {
                        e = e2;
                        if (NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()) == NetworkUtils.ResponseStatusType.RETRYABLE) {
                        }
                        throw e;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = notificationLifecycleService$confirmNotificationOpened$1.I$1;
                i4 = notificationLifecycleService$confirmNotificationOpened$1.I$0;
                deviceType3 = (IDeviceService.DeviceType) notificationLifecycleService$confirmNotificationOpened$1.L$4;
                str9 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$3;
                str8 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$2;
                str7 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$1;
                notificationLifecycleService3 = (NotificationLifecycleService) notificationLifecycleService$confirmNotificationOpened$1.L$0;
                ResultKt.throwOnFailure(obj);
                char c = 2;
                String str10 = str7;
                deviceType2 = deviceType3;
                str4 = str10;
                String str11 = str8;
                str6 = str9;
                str5 = str11;
                notificationLifecycleService2 = notificationLifecycleService3;
                notificationLifecycleService$confirmNotificationOpened$12 = notificationLifecycleService$confirmNotificationOpened$1;
                if (i4 != i2) {
                    i3 = i4 + 1;
                    i5 = 1;
                    try {
                    } catch (BackendException e3) {
                        e = e3;
                        IDeviceService.DeviceType deviceType4 = deviceType2;
                        str7 = str4;
                        deviceType3 = deviceType4;
                        String str12 = str6;
                        str8 = str5;
                        str9 = str12;
                        i4 = i3;
                        notificationLifecycleService$confirmNotificationOpened$1 = notificationLifecycleService$confirmNotificationOpened$12;
                        notificationLifecycleService3 = notificationLifecycleService2;
                        if (NetworkUtils.INSTANCE.getResponseStatusType(e.getStatusCode()) == NetworkUtils.ResponseStatusType.RETRYABLE || i4 >= NetworkUtils.INSTANCE.getMaxNetworkRequestAttemptCount()) {
                            throw e;
                        }
                        long max = Math.max(e.getRetryAfterSeconds() != null ? r13.intValue() * 1000 : 0L, i4 * RETRY_BACKOFF_MS);
                        c = 2;
                        Logging.info$default("Notification opened confirmation attempt " + i4 + " failed (statusCode: " + e.getStatusCode() + "), retrying in " + max + "ms", null, 2, null);
                        notificationLifecycleService$confirmNotificationOpened$1.L$0 = notificationLifecycleService3;
                        notificationLifecycleService$confirmNotificationOpened$1.L$1 = str7;
                        notificationLifecycleService$confirmNotificationOpened$1.L$2 = str8;
                        notificationLifecycleService$confirmNotificationOpened$1.L$3 = str9;
                        notificationLifecycleService$confirmNotificationOpened$1.L$4 = deviceType3;
                        notificationLifecycleService$confirmNotificationOpened$1.I$0 = i4;
                        notificationLifecycleService$confirmNotificationOpened$1.I$1 = i2;
                        notificationLifecycleService$confirmNotificationOpened$1.label = 2;
                    }
                    iNotificationBackendService = notificationLifecycleService2._backend;
                    notificationLifecycleService$confirmNotificationOpened$12.L$0 = notificationLifecycleService2;
                    notificationLifecycleService$confirmNotificationOpened$12.L$1 = str4;
                    notificationLifecycleService$confirmNotificationOpened$12.L$2 = str5;
                    notificationLifecycleService$confirmNotificationOpened$12.L$3 = str6;
                    notificationLifecycleService$confirmNotificationOpened$12.L$4 = deviceType2;
                    notificationLifecycleService$confirmNotificationOpened$12.I$0 = i3;
                    notificationLifecycleService$confirmNotificationOpened$12.I$1 = i2;
                    notificationLifecycleService$confirmNotificationOpened$12.label = i5;
                    if (iNotificationBackendService.updateNotificationAsOpened(str4, str5, str6, deviceType2, notificationLifecycleService$confirmNotificationOpened$12) != coroutine_suspended) {
                        IDeviceService.DeviceType deviceType5 = deviceType2;
                        str7 = str4;
                        deviceType3 = deviceType5;
                        String str13 = str6;
                        str8 = str5;
                        str9 = str13;
                        i4 = i3;
                        notificationLifecycleService$confirmNotificationOpened$1 = notificationLifecycleService$confirmNotificationOpened$12;
                        notificationLifecycleService3 = notificationLifecycleService2;
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        notificationLifecycleService = this;
        notificationLifecycleService$confirmNotificationOpened$1 = new NotificationLifecycleService$confirmNotificationOpened$1(notificationLifecycleService, continuation);
        Object obj2 = notificationLifecycleService$confirmNotificationOpened$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationLifecycleService$confirmNotificationOpened$1.label;
        int i52 = 1;
        if (i != 0) {
        }
    }

    public final void setupNotificationServiceExtension(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, NotificationConstants.EXTENSION_SERVICE_META_DATA_TAG_NAME);
        if (manifestMeta == null) {
            Logging.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        Logging.verbose$default("Found class: " + manifestMeta + ", attempting to call constructor", null, 2, null);
        try {
            Object newInstance = Class.forName(manifestMeta).newInstance();
            if (!(newInstance instanceof INotificationServiceExtension) || this.extRemoteReceivedCallback.getHasCallback()) {
                return;
            }
            this.extRemoteReceivedCallback.set(newInstance);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity context) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return OSNotificationOpenAppSettings.INSTANCE.getShouldOpenActivity(context);
        } catch (JSONException e) {
            e.printStackTrace();
            return true;
        }
    }

    private final String getLatestNotificationId(JSONArray data) {
        JSONObject jSONObject;
        if (data.length() > 0) {
            Object obj = data.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return NotificationFormatHelper.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|(1:23))(1:24))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        com.onesignal.debug.internal.logging.Logging.warn("No activity found to handle notification open intent.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        com.onesignal.debug.internal.logging.Logging.error("Could not parse JSON to open notification activity.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        com.onesignal.debug.internal.logging.Logging.error("Could not open notification activity.", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.onesignal.notifications.internal.INotificationActivityOpener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, Continuation<? super Unit> continuation) {
        NotificationLifecycleService$openDestinationActivity$1 notificationLifecycleService$openDestinationActivity$1;
        int i;
        if (continuation instanceof NotificationLifecycleService$openDestinationActivity$1) {
            notificationLifecycleService$openDestinationActivity$1 = (NotificationLifecycleService$openDestinationActivity$1) continuation;
            if ((notificationLifecycleService$openDestinationActivity$1.label & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$openDestinationActivity$1.label -= Integer.MIN_VALUE;
                Object obj = notificationLifecycleService$openDestinationActivity$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = notificationLifecycleService$openDestinationActivity$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    Intrinsics.checkNotNull(jSONObject);
                    Intent intentVisible = GenerateNotificationOpenIntentFromPushPayload.INSTANCE.create(activity, jSONObject).getIntentVisible();
                    if (intentVisible != null) {
                        Logging.debug$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        NotificationLifecycleService$openDestinationActivity$2 notificationLifecycleService$openDestinationActivity$2 = new NotificationLifecycleService$openDestinationActivity$2(activity, intentVisible, null);
                        notificationLifecycleService$openDestinationActivity$1.label = 1;
                        if (BuildersKt.withContext(main, notificationLifecycleService$openDestinationActivity$2, notificationLifecycleService$openDestinationActivity$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        Logging.debug$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
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
        notificationLifecycleService$openDestinationActivity$1 = new NotificationLifecycleService$openDestinationActivity$1(this, continuation);
        Object obj2 = notificationLifecycleService$openDestinationActivity$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = notificationLifecycleService$openDestinationActivity$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
