package com.onesignal.notifications.internal.listeners;

import F2.n;
import F2.o;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import com.onesignal.core.internal.config.c;
import com.onesignal.notifications.internal.pushtoken.d;
import k5.v;
import kotlin.jvm.internal.i;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import w3.InterfaceC0719a;
import w3.InterfaceC0720b;
import w3.f;
import x5.InterfaceC0743l;
import y3.e;

/* loaded from: classes.dex */
public final class DeviceRegistrationListener implements com.onesignal.core.internal.startup.b, g, o, InterfaceC0719a {
    private final O2.a _channelManager;
    private final c _configModelStore;
    private final n _notificationsManager;
    private final com.onesignal.notifications.internal.pushtoken.a _pushTokenManager;
    private final InterfaceC0720b _subscriptionManager;

    public static final class a extends q5.g implements InterfaceC0743l {
        int label;

        public a(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return DeviceRegistrationListener.this.new a(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                n nVar = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (nVar.requestPermission(true, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((a) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public static final class b extends q5.g implements InterfaceC0743l {
        int label;

        public b(InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return DeviceRegistrationListener.this.new b(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                com.onesignal.notifications.internal.pushtoken.a aVar = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = aVar.retrievePushToken(this);
                if (obj == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            d dVar = (d) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(dVar.getToken(), DeviceRegistrationListener.this._notificationsManager.mo23getPermission() ? dVar.getStatus() : f.NO_PERMISSION);
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public DeviceRegistrationListener(c _configModelStore, O2.a _channelManager, com.onesignal.notifications.internal.pushtoken.a _pushTokenManager, n _notificationsManager, InterfaceC0720b _subscriptionManager) {
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
        w3.d pushSubscriptionModel = this._subscriptionManager.getPushSubscriptionModel();
        return pushSubscriptionModel.getId().length() == 0 || pushSubscriptionModel.getStatus() != f.SUBSCRIBED;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        com.onesignal.common.threading.b.suspendifyOnIO(new b(null));
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
    }

    @Override // F2.o
    public void onNotificationPermissionChange(boolean z5) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // w3.InterfaceC0719a
    public void onSubscriptionAdded(e subscription) {
        i.e(subscription, "subscription");
    }

    @Override // w3.InterfaceC0719a
    public void onSubscriptionChanged(e subscription, j args) {
        i.e(subscription, "subscription");
        i.e(args, "args");
        if (i.a(args.getPath(), "optedIn") && i.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo23getPermission()) {
            com.onesignal.common.threading.b.suspendifyOnIO(new a(null));
        }
    }

    @Override // w3.InterfaceC0719a
    public void onSubscriptionRemoved(e subscription) {
        i.e(subscription, "subscription");
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        this._notificationsManager.mo20addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
        if (this._notificationsManager.mo23getPermission() && needsPushTokenRefresh()) {
            retrievePushTokenAndUpdateSubscription();
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        if (tag.equals("HYDRATE")) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
