package com.onesignal.notifications.internal.listeners;

import com.onesignal.common.modeling.ISingletonModelStoreChangeHandler;
import com.onesignal.common.modeling.ModelChangeTags;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.IPermissionObserver;
import com.onesignal.notifications.internal.channels.INotificationChannelManager;
import com.onesignal.notifications.internal.pushtoken.IPushTokenManager;
import com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler;
import com.onesignal.user.internal.subscriptions.ISubscriptionManager;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import com.onesignal.user.subscriptions.ISubscription;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class DeviceRegistrationListener implements IStartableService, ISingletonModelStoreChangeHandler<ConfigModel>, IPermissionObserver, ISubscriptionChangedHandler {
    private final INotificationChannelManager _channelManager;
    private final ConfigModelStore _configModelStore;
    private final INotificationsManager _notificationsManager;
    private final IPushTokenManager _pushTokenManager;
    private final ISubscriptionManager _subscriptionManager;

    public DeviceRegistrationListener(ConfigModelStore _configModelStore, INotificationChannelManager _channelManager, IPushTokenManager _pushTokenManager, INotificationsManager _notificationsManager, ISubscriptionManager _subscriptionManager) {
        i.e(_configModelStore, "_configModelStore");
        i.e(_channelManager, "_channelManager");
        i.e(_pushTokenManager, "_pushTokenManager");
        i.e(_notificationsManager, "_notificationsManager");
        i.e(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._channelManager = _channelManager;
        this._pushTokenManager = _pushTokenManager;
        this._notificationsManager = _notificationsManager;
        this._subscriptionManager = _subscriptionManager;
    }

    private final boolean needsPushTokenRefresh() {
        SubscriptionModel pushSubscriptionModel = this._subscriptionManager.getPushSubscriptionModel();
        return pushSubscriptionModel.getId().length() == 0 || pushSubscriptionModel.getStatus() != SubscriptionStatus.SUBSCRIBED;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        ThreadUtilsKt.suspendifyOnIO(new DeviceRegistrationListener$retrievePushTokenAndUpdateSubscription$1(this, null));
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
    }

    @Override // com.onesignal.notifications.IPermissionObserver
    public void onNotificationPermissionChange(boolean z) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionAdded(ISubscription subscription) {
        i.e(subscription, "subscription");
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionChanged(ISubscription subscription, ModelChangedArgs args) {
        i.e(subscription, "subscription");
        i.e(args, "args");
        if (i.a(args.getPath(), "optedIn") && i.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo24getPermission()) {
            ThreadUtilsKt.suspendifyOnIO(new DeviceRegistrationListener$onSubscriptionChanged$1(this, null));
        }
    }

    @Override // com.onesignal.user.internal.subscriptions.ISubscriptionChangedHandler
    public void onSubscriptionRemoved(ISubscription subscription) {
        i.e(subscription, "subscription");
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._configModelStore.subscribe((ISingletonModelStoreChangeHandler) this);
        this._notificationsManager.mo21addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
        if (this._notificationsManager.mo24getPermission() && needsPushTokenRefresh()) {
            retrievePushTokenAndUpdateSubscription();
        }
    }

    @Override // com.onesignal.common.modeling.ISingletonModelStoreChangeHandler
    public void onModelReplaced(ConfigModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals(ModelChangeTags.HYDRATE)) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
