package com.onesignal.notifications.internal.lifecycle.impl;

import D4.AbstractC0024y;
import I4.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import b2.AbstractC0279e;
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
import e5.g;
import f4.v;
import g4.C0463h;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import l4.EnumC1260a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class NotificationLifecycleService implements INotificationLifecycleService, INotificationActivityOpener {
    public static final Companion Companion = new Companion(null);
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
    private final C0463h unprocessedOpenedNotifs;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public NotificationLifecycleService(IApplicationService _applicationService, ITime _time, ConfigModelStore _configModelStore, IInfluenceManager _influenceManager, ISubscriptionManager _subscriptionManager, IDeviceService _deviceService, INotificationBackendService _backend, IReceiveReceiptWorkManager _receiveReceiptWorkManager, IAnalyticsTracker _analyticsTracker) {
        i.e(_applicationService, "_applicationService");
        i.e(_time, "_time");
        i.e(_configModelStore, "_configModelStore");
        i.e(_influenceManager, "_influenceManager");
        i.e(_subscriptionManager, "_subscriptionManager");
        i.e(_deviceService, "_deviceService");
        i.e(_backend, "_backend");
        i.e(_receiveReceiptWorkManager, "_receiveReceiptWorkManager");
        i.e(_analyticsTracker, "_analyticsTracker");
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
        this.unprocessedOpenedNotifs = new C0463h();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(_applicationService.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x013c -> B:11:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmNotificationOpened(String str, String str2, String str3, IDeviceService.DeviceType deviceType, InterfaceC1218d interfaceC1218d) {
        NotificationLifecycleService$confirmNotificationOpened$1 notificationLifecycleService$confirmNotificationOpened$1;
        NotificationLifecycleService notificationLifecycleService;
        int i2;
        String str4;
        String str5;
        IDeviceService.DeviceType deviceType2;
        int i3;
        NotificationLifecycleService$confirmNotificationOpened$1 notificationLifecycleService$confirmNotificationOpened$12;
        NotificationLifecycleService notificationLifecycleService2;
        int i6;
        String str6;
        NotificationLifecycleService notificationLifecycleService3;
        String str7;
        String str8;
        String str9;
        IDeviceService.DeviceType deviceType3;
        int i7;
        int i8;
        BackendException e3;
        NetworkUtils networkUtils;
        int i9;
        NotificationLifecycleService notificationLifecycleService4;
        NotificationLifecycleService$confirmNotificationOpened$1 notificationLifecycleService$confirmNotificationOpened$13;
        int i10;
        if (interfaceC1218d instanceof NotificationLifecycleService$confirmNotificationOpened$1) {
            notificationLifecycleService$confirmNotificationOpened$1 = (NotificationLifecycleService$confirmNotificationOpened$1) interfaceC1218d;
            int i11 = notificationLifecycleService$confirmNotificationOpened$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$confirmNotificationOpened$1.label = i11 - Integer.MIN_VALUE;
                notificationLifecycleService = this;
                Object obj = notificationLifecycleService$confirmNotificationOpened$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationLifecycleService$confirmNotificationOpened$1.label;
                v vVar = v.f5689a;
                int i12 = 1;
                if (i2 != 0) {
                    g.y(obj);
                    int maxNetworkRequestAttemptCount = NetworkUtils.INSTANCE.getMaxNetworkRequestAttemptCount();
                    if (1 <= maxNetworkRequestAttemptCount) {
                        str4 = str2;
                        str5 = str3;
                        deviceType2 = deviceType;
                        i3 = maxNetworkRequestAttemptCount;
                        notificationLifecycleService$confirmNotificationOpened$12 = notificationLifecycleService$confirmNotificationOpened$1;
                        notificationLifecycleService2 = notificationLifecycleService;
                        i6 = 1;
                        str6 = str;
                        INotificationBackendService iNotificationBackendService = notificationLifecycleService2._backend;
                        notificationLifecycleService$confirmNotificationOpened$12.L$0 = notificationLifecycleService2;
                        notificationLifecycleService$confirmNotificationOpened$12.L$1 = str6;
                        notificationLifecycleService$confirmNotificationOpened$12.L$2 = str4;
                        notificationLifecycleService$confirmNotificationOpened$12.L$3 = str5;
                        notificationLifecycleService$confirmNotificationOpened$12.L$4 = deviceType2;
                        notificationLifecycleService$confirmNotificationOpened$12.I$0 = i6;
                        notificationLifecycleService$confirmNotificationOpened$12.I$1 = i3;
                        notificationLifecycleService$confirmNotificationOpened$12.label = i12;
                        i9 = i6;
                        notificationLifecycleService4 = notificationLifecycleService2;
                        notificationLifecycleService$confirmNotificationOpened$13 = notificationLifecycleService$confirmNotificationOpened$12;
                        i10 = i3;
                        if (iNotificationBackendService.updateNotificationAsOpened(str6, str4, str5, deviceType2, notificationLifecycleService$confirmNotificationOpened$13) != enumC1260a) {
                        }
                    }
                    return vVar;
                }
                if (i2 == 1) {
                    i8 = notificationLifecycleService$confirmNotificationOpened$1.I$1;
                    i7 = notificationLifecycleService$confirmNotificationOpened$1.I$0;
                    deviceType3 = (IDeviceService.DeviceType) notificationLifecycleService$confirmNotificationOpened$1.L$4;
                    str9 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$3;
                    str8 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$2;
                    str7 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$1;
                    notificationLifecycleService3 = (NotificationLifecycleService) notificationLifecycleService$confirmNotificationOpened$1.L$0;
                    try {
                        g.y(obj);
                    } catch (BackendException e6) {
                        e3 = e6;
                        networkUtils = NetworkUtils.INSTANCE;
                        if (networkUtils.getResponseStatusType(e3.getStatusCode()) == NetworkUtils.ResponseStatusType.RETRYABLE) {
                        }
                        throw e3;
                    }
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8 = notificationLifecycleService$confirmNotificationOpened$1.I$1;
                i7 = notificationLifecycleService$confirmNotificationOpened$1.I$0;
                deviceType3 = (IDeviceService.DeviceType) notificationLifecycleService$confirmNotificationOpened$1.L$4;
                str9 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$3;
                str8 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$2;
                str7 = (String) notificationLifecycleService$confirmNotificationOpened$1.L$1;
                notificationLifecycleService3 = (NotificationLifecycleService) notificationLifecycleService$confirmNotificationOpened$1.L$0;
                g.y(obj);
                char c2 = 2;
                str5 = str9;
                String str10 = str7;
                notificationLifecycleService$confirmNotificationOpened$12 = notificationLifecycleService$confirmNotificationOpened$1;
                str6 = str10;
                NotificationLifecycleService notificationLifecycleService5 = notificationLifecycleService3;
                i3 = i8;
                str4 = str8;
                notificationLifecycleService2 = notificationLifecycleService5;
                if (i7 != i3) {
                    i6 = i7 + 1;
                    i12 = 1;
                    deviceType2 = deviceType3;
                    try {
                    } catch (BackendException e7) {
                        e3 = e7;
                        i9 = i6;
                        notificationLifecycleService4 = notificationLifecycleService2;
                        notificationLifecycleService$confirmNotificationOpened$13 = notificationLifecycleService$confirmNotificationOpened$12;
                        i10 = i3;
                    }
                    INotificationBackendService iNotificationBackendService2 = notificationLifecycleService2._backend;
                    notificationLifecycleService$confirmNotificationOpened$12.L$0 = notificationLifecycleService2;
                    notificationLifecycleService$confirmNotificationOpened$12.L$1 = str6;
                    notificationLifecycleService$confirmNotificationOpened$12.L$2 = str4;
                    notificationLifecycleService$confirmNotificationOpened$12.L$3 = str5;
                    notificationLifecycleService$confirmNotificationOpened$12.L$4 = deviceType2;
                    notificationLifecycleService$confirmNotificationOpened$12.I$0 = i6;
                    notificationLifecycleService$confirmNotificationOpened$12.I$1 = i3;
                    notificationLifecycleService$confirmNotificationOpened$12.label = i12;
                    i9 = i6;
                    notificationLifecycleService4 = notificationLifecycleService2;
                    notificationLifecycleService$confirmNotificationOpened$13 = notificationLifecycleService$confirmNotificationOpened$12;
                    i10 = i3;
                    try {
                    } catch (BackendException e8) {
                        e3 = e8;
                        str7 = str6;
                        str8 = str4;
                        str9 = str5;
                        deviceType3 = deviceType2;
                        i7 = i9;
                        notificationLifecycleService3 = notificationLifecycleService4;
                        notificationLifecycleService$confirmNotificationOpened$1 = notificationLifecycleService$confirmNotificationOpened$13;
                        i8 = i10;
                        networkUtils = NetworkUtils.INSTANCE;
                        if (networkUtils.getResponseStatusType(e3.getStatusCode()) == NetworkUtils.ResponseStatusType.RETRYABLE || i7 >= networkUtils.getMaxNetworkRequestAttemptCount()) {
                            throw e3;
                        }
                        long max = Math.max(e3.getRetryAfterSeconds() != null ? r7.intValue() * MILLIS_PER_SECOND : 0L, i7 * RETRY_BACKOFF_MS);
                        StringBuilder i13 = AbstractC0279e.i(i7, "Notification opened confirmation attempt ", " failed (statusCode: ");
                        i13.append(e3.getStatusCode());
                        i13.append("), retrying in ");
                        i13.append(max);
                        i13.append("ms");
                        c2 = 2;
                        Logging.info$default(i13.toString(), null, 2, null);
                        notificationLifecycleService$confirmNotificationOpened$1.L$0 = notificationLifecycleService3;
                        notificationLifecycleService$confirmNotificationOpened$1.L$1 = str7;
                        notificationLifecycleService$confirmNotificationOpened$1.L$2 = str8;
                        notificationLifecycleService$confirmNotificationOpened$1.L$3 = str9;
                        notificationLifecycleService$confirmNotificationOpened$1.L$4 = deviceType3;
                        notificationLifecycleService$confirmNotificationOpened$1.I$0 = i7;
                        notificationLifecycleService$confirmNotificationOpened$1.I$1 = i8;
                        notificationLifecycleService$confirmNotificationOpened$1.label = 2;
                        if (AbstractC0024y.d(max, notificationLifecycleService$confirmNotificationOpened$1) == enumC1260a) {
                            return enumC1260a;
                        }
                        str5 = str9;
                        String str102 = str7;
                        notificationLifecycleService$confirmNotificationOpened$12 = notificationLifecycleService$confirmNotificationOpened$1;
                        str6 = str102;
                        NotificationLifecycleService notificationLifecycleService52 = notificationLifecycleService3;
                        i3 = i8;
                        str4 = str8;
                        notificationLifecycleService2 = notificationLifecycleService52;
                        if (i7 != i3) {
                        }
                        return vVar;
                    }
                    return iNotificationBackendService2.updateNotificationAsOpened(str6, str4, str5, deviceType2, notificationLifecycleService$confirmNotificationOpened$13) != enumC1260a ? enumC1260a : vVar;
                }
                return vVar;
            }
        }
        notificationLifecycleService = this;
        notificationLifecycleService$confirmNotificationOpened$1 = new NotificationLifecycleService$confirmNotificationOpened$1(notificationLifecycleService, interfaceC1218d);
        Object obj2 = notificationLifecycleService$confirmNotificationOpened$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationLifecycleService$confirmNotificationOpened$1.label;
        v vVar2 = v.f5689a;
        int i122 = 1;
        if (i2 != 0) {
        }
    }

    private final String getLatestNotificationId(JSONArray jSONArray) {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            i.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return NotificationFormatHelper.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return OSNotificationOpenAppSettings.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e3) {
            e3.printStackTrace();
            return true;
        }
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void addExternalClickListener(INotificationClickListener callback) {
        i.e(callback, "callback");
        this.extOpenedCallback.subscribe(callback);
        if (this.extOpenedCallback.getHasSubscribers()) {
            C0463h c0463h = this.unprocessedOpenedNotifs;
            i.e(c0463h, "<this>");
            if (c0463h.isEmpty()) {
                return;
            }
            Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new NotificationLifecycleService$addExternalClickListener$1(NotificationHelper.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
            this.unprocessedOpenedNotifs.clear();
        }
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void addExternalForegroundLifecycleListener(INotificationLifecycleListener listener) {
        i.e(listener, "listener");
        this.extWillShowInForegroundCallback.subscribe(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC1218d interfaceC1218d) {
        NotificationLifecycleService$canOpenNotification$1 notificationLifecycleService$canOpenNotification$1;
        int i2;
        q qVar;
        if (interfaceC1218d instanceof NotificationLifecycleService$canOpenNotification$1) {
            notificationLifecycleService$canOpenNotification$1 = (NotificationLifecycleService$canOpenNotification$1) interfaceC1218d;
            int i3 = notificationLifecycleService$canOpenNotification$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$canOpenNotification$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationLifecycleService$canOpenNotification$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationLifecycleService$canOpenNotification$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    q qVar2 = new q();
                    qVar2.f10739a = true;
                    CallbackProducer<INotificationLifecycleCallback> callbackProducer = this.intLifecycleCallback;
                    NotificationLifecycleService$canOpenNotification$2 notificationLifecycleService$canOpenNotification$2 = new NotificationLifecycleService$canOpenNotification$2(qVar2, activity, jSONObject, null);
                    notificationLifecycleService$canOpenNotification$1.L$0 = qVar2;
                    notificationLifecycleService$canOpenNotification$1.label = 1;
                    if (callbackProducer.suspendingFire(notificationLifecycleService$canOpenNotification$2, notificationLifecycleService$canOpenNotification$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar = qVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) notificationLifecycleService$canOpenNotification$1.L$0;
                    g.y(obj);
                }
                return Boolean.valueOf(qVar.f10739a);
            }
        }
        notificationLifecycleService$canOpenNotification$1 = new NotificationLifecycleService$canOpenNotification$1(this, interfaceC1218d);
        Object obj2 = notificationLifecycleService$canOpenNotification$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationLifecycleService$canOpenNotification$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(qVar.f10739a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, InterfaceC1218d interfaceC1218d) {
        NotificationLifecycleService$canReceiveNotification$1 notificationLifecycleService$canReceiveNotification$1;
        int i2;
        q qVar;
        if (interfaceC1218d instanceof NotificationLifecycleService$canReceiveNotification$1) {
            notificationLifecycleService$canReceiveNotification$1 = (NotificationLifecycleService$canReceiveNotification$1) interfaceC1218d;
            int i3 = notificationLifecycleService$canReceiveNotification$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$canReceiveNotification$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationLifecycleService$canReceiveNotification$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationLifecycleService$canReceiveNotification$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    q qVar2 = new q();
                    qVar2.f10739a = true;
                    CallbackProducer<INotificationLifecycleCallback> callbackProducer = this.intLifecycleCallback;
                    NotificationLifecycleService$canReceiveNotification$2 notificationLifecycleService$canReceiveNotification$2 = new NotificationLifecycleService$canReceiveNotification$2(qVar2, jSONObject, null);
                    notificationLifecycleService$canReceiveNotification$1.L$0 = qVar2;
                    notificationLifecycleService$canReceiveNotification$1.label = 1;
                    if (callbackProducer.suspendingFire(notificationLifecycleService$canReceiveNotification$2, notificationLifecycleService$canReceiveNotification$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    qVar = qVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = (q) notificationLifecycleService$canReceiveNotification$1.L$0;
                    g.y(obj);
                }
                return Boolean.valueOf(qVar.f10739a);
            }
        }
        notificationLifecycleService$canReceiveNotification$1 = new NotificationLifecycleService$canReceiveNotification$1(this, interfaceC1218d);
        Object obj2 = notificationLifecycleService$canReceiveNotification$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationLifecycleService$canReceiveNotification$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(qVar.f10739a);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void externalNotificationWillShowInForeground(INotificationWillDisplayEvent willDisplayEvent) {
        i.e(willDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new NotificationLifecycleService$externalNotificationWillShowInForeground$1(willDisplayEvent));
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void externalRemoteNotificationReceived(INotificationReceivedEvent notificationReceivedEvent) {
        i.e(notificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new NotificationLifecycleService$externalRemoteNotificationReceived$1(notificationReceivedEvent));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC1218d interfaceC1218d) {
        NotificationLifecycleService$notificationOpened$1 notificationLifecycleService$notificationOpened$1;
        int i2;
        NotificationLifecycleService notificationLifecycleService;
        JSONArray jSONArray2;
        int i3;
        if (interfaceC1218d instanceof NotificationLifecycleService$notificationOpened$1) {
            notificationLifecycleService$notificationOpened$1 = (NotificationLifecycleService$notificationOpened$1) interfaceC1218d;
            int i6 = notificationLifecycleService$notificationOpened$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$notificationOpened$1.label = i6 - Integer.MIN_VALUE;
                NotificationLifecycleService$notificationOpened$1 notificationLifecycleService$notificationOpened$12 = notificationLifecycleService$notificationOpened$1;
                Object obj = notificationLifecycleService$notificationOpened$12.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationLifecycleService$notificationOpened$12.label;
                if (i2 != 0) {
                    g.y(obj);
                    String appId = this._configModelStore.getModel().getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    String str = appId;
                    String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                    IDeviceService.DeviceType deviceType = this._deviceService.getDeviceType();
                    int length = jSONArray.length();
                    int i7 = 0;
                    while (i7 < length) {
                        String oSNotificationIdFromJson = NotificationFormatHelper.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i7));
                        if (oSNotificationIdFromJson == null || this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                            i3 = i7;
                        } else {
                            this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                            i3 = i7;
                            ThreadUtilsKt.suspendifyWithErrorHandling$default(true, new NotificationLifecycleService$notificationOpened$2(this, str, oSNotificationIdFromJson, id, deviceType, null), NotificationLifecycleService$notificationOpened$3.INSTANCE, null, 8, null);
                        }
                        i7 = i3 + 1;
                    }
                    NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
                    NotificationClickEvent generateNotificationOpenedResult$com_onesignal_notifications = notificationHelper.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
                    IAnalyticsTracker iAnalyticsTracker = this._analyticsTracker;
                    String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
                    i.b(notificationId);
                    iAnalyticsTracker.trackOpenedEvent(notificationId, notificationHelper.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
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
                    if (openDestinationActivity(activity, jSONArray, notificationLifecycleService$notificationOpened$12) == enumC1260a) {
                        return enumC1260a;
                    }
                    notificationLifecycleService = this;
                    jSONArray2 = jSONArray;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray2 = (JSONArray) notificationLifecycleService$notificationOpened$12.L$1;
                    notificationLifecycleService = (NotificationLifecycleService) notificationLifecycleService$notificationOpened$12.L$0;
                    g.y(obj);
                }
                if (notificationLifecycleService.extOpenedCallback.getHasSubscribers()) {
                    notificationLifecycleService.unprocessedOpenedNotifs.addLast(jSONArray2);
                } else {
                    notificationLifecycleService.extOpenedCallback.fireOnMain(new NotificationLifecycleService$notificationOpened$4(NotificationHelper.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray2, notificationLifecycleService._time)));
                }
                return v.f5689a;
            }
        }
        notificationLifecycleService$notificationOpened$1 = new NotificationLifecycleService$notificationOpened$1(this, interfaceC1218d);
        NotificationLifecycleService$notificationOpened$1 notificationLifecycleService$notificationOpened$122 = notificationLifecycleService$notificationOpened$1;
        Object obj2 = notificationLifecycleService$notificationOpened$122.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationLifecycleService$notificationOpened$122.label;
        if (i2 != 0) {
        }
        if (notificationLifecycleService.extOpenedCallback.getHasSubscribers()) {
        }
        return v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public Object notificationReceived(NotificationGenerationJob notificationGenerationJob, InterfaceC1218d interfaceC1218d) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(notificationGenerationJob.getApiNotificationId());
        this._influenceManager.onNotificationReceived(notificationGenerationJob.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(notificationGenerationJob.getJsonPayload().toString());
            jSONObject.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, notificationGenerationJob.getAndroidId());
            NotificationHelper notificationHelper = NotificationHelper.INSTANCE;
            NotificationClickEvent generateNotificationOpenedResult$com_onesignal_notifications = notificationHelper.generateNotificationOpenedResult$com_onesignal_notifications(JSONUtils.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            IAnalyticsTracker iAnalyticsTracker = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            i.b(notificationId);
            iAnalyticsTracker.trackReceivedEvent(notificationId, notificationHelper.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return v.f5689a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|(1:23))(1:24))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        com.onesignal.debug.internal.logging.Logging.warn("No activity found to handle notification open intent.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        com.onesignal.debug.internal.logging.Logging.error("Could not parse JSON to open notification activity.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        com.onesignal.debug.internal.logging.Logging.error("Could not open notification activity.", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.onesignal.notifications.internal.INotificationActivityOpener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, InterfaceC1218d interfaceC1218d) {
        NotificationLifecycleService$openDestinationActivity$1 notificationLifecycleService$openDestinationActivity$1;
        int i2;
        if (interfaceC1218d instanceof NotificationLifecycleService$openDestinationActivity$1) {
            notificationLifecycleService$openDestinationActivity$1 = (NotificationLifecycleService$openDestinationActivity$1) interfaceC1218d;
            int i3 = notificationLifecycleService$openDestinationActivity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                notificationLifecycleService$openDestinationActivity$1.label = i3 - Integer.MIN_VALUE;
                Object obj = notificationLifecycleService$openDestinationActivity$1.result;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = notificationLifecycleService$openDestinationActivity$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    GenerateNotificationOpenIntentFromPushPayload generateNotificationOpenIntentFromPushPayload = GenerateNotificationOpenIntentFromPushPayload.INSTANCE;
                    i.b(jSONObject);
                    Intent intentVisible = generateNotificationOpenIntentFromPushPayload.create(activity, jSONObject).getIntentVisible();
                    if (intentVisible != null) {
                        Logging.debug$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                        E4.e eVar = o.f1316a;
                        NotificationLifecycleService$openDestinationActivity$2 notificationLifecycleService$openDestinationActivity$2 = new NotificationLifecycleService$openDestinationActivity$2(activity, intentVisible, null);
                        notificationLifecycleService$openDestinationActivity$1.label = 1;
                        if (AbstractC0024y.w(eVar, notificationLifecycleService$openDestinationActivity$2, notificationLifecycleService$openDestinationActivity$1) == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        Logging.debug$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    g.y(obj);
                }
                return v.f5689a;
            }
        }
        notificationLifecycleService$openDestinationActivity$1 = new NotificationLifecycleService$openDestinationActivity$1(this, interfaceC1218d);
        Object obj2 = notificationLifecycleService$openDestinationActivity$1.result;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = notificationLifecycleService$openDestinationActivity$1.label;
        if (i2 != 0) {
        }
        return v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void removeExternalClickListener(INotificationClickListener listener) {
        i.e(listener, "listener");
        this.extOpenedCallback.unsubscribe(listener);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void removeExternalForegroundLifecycleListener(INotificationLifecycleListener listener) {
        i.e(listener, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(listener);
    }

    @Override // com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService
    public void setInternalNotificationLifecycleCallback(INotificationLifecycleCallback iNotificationLifecycleCallback) {
        this.intLifecycleCallback.set(iNotificationLifecycleCallback);
    }

    public final void setupNotificationServiceExtension(Context context) {
        i.e(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, NotificationConstants.EXTENSION_SERVICE_META_DATA_TAG_NAME);
        if (manifestMeta == null) {
            Logging.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        Logging.verbose$default(AbstractC0279e.f("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Object newInstance = Class.forName(manifestMeta).newInstance();
            if (!(newInstance instanceof INotificationServiceExtension) || this.extRemoteReceivedCallback.getHasCallback()) {
                return;
            }
            this.extRemoteReceivedCallback.set(newInstance);
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
        } catch (InstantiationException e7) {
            e7.printStackTrace();
        }
    }
}
