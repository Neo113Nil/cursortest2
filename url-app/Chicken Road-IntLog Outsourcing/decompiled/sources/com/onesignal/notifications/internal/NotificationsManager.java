package com.onesignal.notifications.internal;

import D4.AbstractC0024y;
import I4.o;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationLifecycleHandler;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.IPermissionObserver;
import com.onesignal.notifications.internal.common.NotificationHelper;
import com.onesignal.notifications.internal.data.INotificationRepository;
import com.onesignal.notifications.internal.lifecycle.INotificationLifecycleService;
import com.onesignal.notifications.internal.permissions.INotificationPermissionChangedHandler;
import com.onesignal.notifications.internal.permissions.INotificationPermissionController;
import com.onesignal.notifications.internal.restoration.INotificationRestoreWorkManager;
import com.onesignal.notifications.internal.summary.INotificationSummaryManager;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class NotificationsManager implements INotificationsManager, INotificationPermissionChangedHandler, IApplicationLifecycleHandler {
    private final IApplicationService _applicationService;
    private final INotificationRepository _notificationDataController;
    private final INotificationLifecycleService _notificationLifecycleService;
    private final INotificationPermissionController _notificationPermissionController;
    private final INotificationRestoreWorkManager _notificationRestoreWorkManager;
    private final INotificationSummaryManager _summaryManager;
    private boolean permission;
    private final EventProducer<IPermissionObserver> permissionChangedNotifier;

    @e(c = "com.onesignal.notifications.internal.NotificationsManager$1", f = "NotificationsManager.kt", l = {58}, m = "invokeSuspend")
    /* renamed from: com.onesignal.notifications.internal.NotificationsManager$1, reason: invalid class name */
    public static final class AnonymousClass1 extends h implements InterfaceC1441l {
        int label;

        public AnonymousClass1(InterfaceC1218d interfaceC1218d) {
            super(1, interfaceC1218d);
        }

        @Override // m4.AbstractC1293a
        public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
            return NotificationsManager.this.new AnonymousClass1(interfaceC1218d);
        }

        @Override // m4.AbstractC1293a
        public final Object invokeSuspend(Object obj) {
            EnumC1260a enumC1260a = EnumC1260a.f11058a;
            int i2 = this.label;
            if (i2 == 0) {
                g.y(obj);
                INotificationRepository iNotificationRepository = NotificationsManager.this._notificationDataController;
                this.label = 1;
                if (iNotificationRepository.deleteExpiredNotifications(this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
            return v.f5689a;
        }

        @Override // t4.InterfaceC1441l
        public final Object invoke(InterfaceC1218d interfaceC1218d) {
            return ((AnonymousClass1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
        }
    }

    public NotificationsManager(IApplicationService _applicationService, INotificationPermissionController _notificationPermissionController, INotificationRestoreWorkManager _notificationRestoreWorkManager, INotificationLifecycleService _notificationLifecycleService, INotificationRepository _notificationDataController, INotificationSummaryManager _summaryManager) {
        i.e(_applicationService, "_applicationService");
        i.e(_notificationPermissionController, "_notificationPermissionController");
        i.e(_notificationRestoreWorkManager, "_notificationRestoreWorkManager");
        i.e(_notificationLifecycleService, "_notificationLifecycleService");
        i.e(_notificationDataController, "_notificationDataController");
        i.e(_summaryManager, "_summaryManager");
        this._applicationService = _applicationService;
        this._notificationPermissionController = _notificationPermissionController;
        this._notificationRestoreWorkManager = _notificationRestoreWorkManager;
        this._notificationLifecycleService = _notificationLifecycleService;
        this._notificationDataController = _notificationDataController;
        this._summaryManager = _summaryManager;
        this.permission = NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, _applicationService.getAppContext(), null, 2, null);
        this.permissionChangedNotifier = new EventProducer<>();
        _applicationService.addApplicationLifecycleHandler(this);
        _notificationPermissionController.subscribe(this);
        ThreadUtilsKt.suspendifyOnIO(new AnonymousClass1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshNotificationState() {
        this._notificationRestoreWorkManager.beginEnqueueingWork(this._applicationService.getAppContext(), false);
        setPermissionStatusAndFire(NotificationHelper.areNotificationsEnabled$default(NotificationHelper.INSTANCE, this._applicationService.getAppContext(), null, 2, null));
    }

    private final void setPermissionStatusAndFire(boolean z) {
        boolean mo24getPermission = mo24getPermission();
        setPermission(z);
        if (mo24getPermission != z) {
            this.permissionChangedNotifier.fireOnMain(new NotificationsManager$setPermissionStatusAndFire$1(z));
        }
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addClickListener */
    public void mo19addClickListener(INotificationClickListener listener) {
        i.e(listener, "listener");
        Logging.debug$default("NotificationsManager.addClickListener(handler: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalClickListener(listener);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addForegroundLifecycleListener */
    public void mo20addForegroundLifecycleListener(INotificationLifecycleListener listener) {
        i.e(listener, "listener");
        Logging.debug$default("NotificationsManager.addForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.addExternalForegroundLifecycleListener(listener);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addPermissionObserver */
    public void mo21addPermissionObserver(IPermissionObserver observer) {
        i.e(observer, "observer");
        Logging.debug$default("NotificationsManager.addPermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.subscribe(observer);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: clearAllNotifications */
    public void mo22clearAllNotifications() {
        Logging.debug$default("NotificationsManager.clearAllNotifications()", null, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new NotificationsManager$clearAllNotifications$1(this, null));
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: getCanRequestPermission */
    public boolean mo23getCanRequestPermission() {
        return this._notificationPermissionController.getCanRequestPermission();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: getPermission */
    public boolean mo24getPermission() {
        return this.permission;
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onFocus(boolean z) {
        ThreadUtilsKt.runOnSerialIOIfBackgroundThreading(new NotificationsManager$onFocus$1(this));
    }

    @Override // com.onesignal.notifications.internal.permissions.INotificationPermissionChangedHandler
    public void onNotificationPermissionChanged(boolean z) {
        setPermissionStatusAndFire(z);
    }

    @Override // com.onesignal.core.internal.application.IApplicationLifecycleHandler
    public void onUnfocused() {
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeClickListener */
    public void mo25removeClickListener(INotificationClickListener listener) {
        i.e(listener, "listener");
        Logging.debug$default("NotificationsManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalClickListener(listener);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeForegroundLifecycleListener */
    public void mo26removeForegroundLifecycleListener(INotificationLifecycleListener listener) {
        i.e(listener, "listener");
        Logging.debug$default("NotificationsManager.removeForegroundLifecycleListener(listener: " + listener + ')', null, 2, null);
        this._notificationLifecycleService.removeExternalForegroundLifecycleListener(listener);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeGroupedNotifications */
    public void mo27removeGroupedNotifications(String group) {
        i.e(group, "group");
        Logging.debug$default("NotificationsManager.removeGroupedNotifications(group: " + group + ')', null, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new NotificationsManager$removeGroupedNotifications$1(this, group, null));
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeNotification */
    public void mo28removeNotification(int i2) {
        Logging.debug$default("NotificationsManager.removeNotification(id: " + i2 + ')', null, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new NotificationsManager$removeNotification$1(this, i2, null));
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removePermissionObserver */
    public void mo29removePermissionObserver(IPermissionObserver observer) {
        i.e(observer, "observer");
        Logging.debug$default("NotificationsManager.removePermissionObserver(observer: " + observer + ')', null, 2, null);
        this.permissionChangedNotifier.unsubscribe(observer);
    }

    @Override // com.onesignal.notifications.INotificationsManager
    public Object requestPermission(boolean z, InterfaceC1218d interfaceC1218d) {
        Logging.debug$default("NotificationsManager.requestPermission()", null, 2, null);
        return AbstractC0024y.w(o.f1316a, new NotificationsManager$requestPermission$2(this, z, null), interfaceC1218d);
    }

    public void setPermission(boolean z) {
        this.permission = z;
    }
}
