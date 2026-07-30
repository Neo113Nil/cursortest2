package com.onesignal.notifications.internal.listeners;

import E7.l;
import X5.e;
import com.bumptech.glide.f;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import com.onesignal.core.internal.config.c;
import com.onesignal.notifications.internal.pushtoken.d;
import e5.n;
import e5.o;
import n5.InterfaceC4813a;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* loaded from: classes2.dex */
public final class DeviceRegistrationListener implements com.onesignal.core.internal.startup.b, g, o, V5.a {
    private final InterfaceC4813a _channelManager;
    private final c _configModelStore;
    private final n _notificationsManager;
    private final com.onesignal.notifications.internal.pushtoken.a _pushTokenManager;
    private final V5.b _subscriptionManager;

    public static final class a extends h implements l {
        int label;

        public a(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return DeviceRegistrationListener.this.new a(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                n nVar = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (nVar.requestPermission(true, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((a) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class b extends h implements l {
        int label;

        public b(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return DeviceRegistrationListener.this.new b(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                f.r(obj);
                com.onesignal.notifications.internal.pushtoken.a aVar = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = aVar.retrievePushToken(this);
                if (obj == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.r(obj);
            }
            d dVar = (d) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(dVar.getToken(), DeviceRegistrationListener.this._notificationsManager.mo30getPermission() ? dVar.getStatus() : V5.f.NO_PERMISSION);
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public DeviceRegistrationListener(c _configModelStore, InterfaceC4813a _channelManager, com.onesignal.notifications.internal.pushtoken.a _pushTokenManager, n _notificationsManager, V5.b _subscriptionManager) {
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_channelManager, "_channelManager");
        kotlin.jvm.internal.h.e(_pushTokenManager, "_pushTokenManager");
        kotlin.jvm.internal.h.e(_notificationsManager, "_notificationsManager");
        kotlin.jvm.internal.h.e(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._channelManager = _channelManager;
        this._pushTokenManager = _pushTokenManager;
        this._notificationsManager = _notificationsManager;
        this._subscriptionManager = _subscriptionManager;
    }

    private final boolean needsPushTokenRefresh() {
        V5.d pushSubscriptionModel = this._subscriptionManager.getPushSubscriptionModel();
        return pushSubscriptionModel.getId().length() == 0 || pushSubscriptionModel.getStatus() != V5.f.SUBSCRIBED;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        com.onesignal.common.threading.c.suspendifyOnIO(new b(null));
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
    }

    @Override // e5.o
    public void onNotificationPermissionChange(boolean z8) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // V5.a
    public void onSubscriptionAdded(e subscription) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
    }

    @Override // V5.a
    public void onSubscriptionChanged(e subscription, j args) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
        kotlin.jvm.internal.h.e(args, "args");
        if (kotlin.jvm.internal.h.a(args.getPath(), "optedIn") && kotlin.jvm.internal.h.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo30getPermission()) {
            com.onesignal.common.threading.c.suspendifyOnIO(new a(null));
        }
    }

    @Override // V5.a
    public void onSubscriptionRemoved(e subscription) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        this._notificationsManager.mo27addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
        if (this._notificationsManager.mo30getPermission() && needsPushTokenRefresh()) {
            retrievePushTokenAndUpdateSubscription();
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (tag.equals("HYDRATE")) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
