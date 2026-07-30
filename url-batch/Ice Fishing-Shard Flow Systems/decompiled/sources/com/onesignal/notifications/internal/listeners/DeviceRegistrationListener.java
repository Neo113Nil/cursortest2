package com.onesignal.notifications.internal.listeners;

import X5.j;
import Y3.f;
import a4.InterfaceC0181e;
import com.onesignal.common.modeling.g;
import com.onesignal.core.internal.config.c;
import com.onesignal.notifications.internal.pushtoken.d;
import h3.n;
import h3.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q3.InterfaceC0834a;

@Metadata
/* loaded from: classes.dex */
public final class DeviceRegistrationListener implements com.onesignal.core.internal.startup.b, g, o, Y3.a {
    private final InterfaceC0834a _channelManager;
    private final c _configModelStore;
    private final n _notificationsManager;
    private final com.onesignal.notifications.internal.pushtoken.a _pushTokenManager;
    private final Y3.b _subscriptionManager;

    public static final class a extends j implements Function1 {
        int label;

        public a(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return DeviceRegistrationListener.this.new a(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((a) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                n nVar = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (nVar.requestPermission(true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public static final class b extends j implements Function1 {
        int label;

        public b(V5.b bVar) {
            super(1, bVar);
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return DeviceRegistrationListener.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                com.onesignal.notifications.internal.pushtoken.a aVar2 = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = aVar2.retrievePushToken(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            d dVar = (d) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(dVar.getToken(), DeviceRegistrationListener.this._notificationsManager.mo25getPermission() ? dVar.getStatus() : f.NO_PERMISSION);
            return Unit.f6114a;
        }
    }

    public DeviceRegistrationListener(c _configModelStore, InterfaceC0834a _channelManager, com.onesignal.notifications.internal.pushtoken.a _pushTokenManager, n _notificationsManager, Y3.b _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_channelManager, "_channelManager");
        Intrinsics.checkNotNullParameter(_pushTokenManager, "_pushTokenManager");
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._configModelStore = _configModelStore;
        this._channelManager = _channelManager;
        this._pushTokenManager = _pushTokenManager;
        this._notificationsManager = _notificationsManager;
        this._subscriptionManager = _subscriptionManager;
    }

    private final boolean needsPushTokenRefresh() {
        Y3.d pushSubscriptionModel = this._subscriptionManager.getPushSubscriptionModel();
        return pushSubscriptionModel.getId().length() == 0 || pushSubscriptionModel.getStatus() != f.SUBSCRIBED;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        com.onesignal.common.threading.b.suspendifyOnIO(new b(null));
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
    }

    @Override // h3.o
    public void onNotificationPermissionChange(boolean z7) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // Y3.a
    public void onSubscriptionAdded(InterfaceC0181e subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // Y3.a
    public void onSubscriptionChanged(InterfaceC0181e subscription, com.onesignal.common.modeling.j args) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        Intrinsics.checkNotNullParameter(args, "args");
        if (Intrinsics.a(args.getPath(), "optedIn") && Intrinsics.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo25getPermission()) {
            com.onesignal.common.threading.b.suspendifyOnIO(new a(null));
        }
    }

    @Override // Y3.a
    public void onSubscriptionRemoved(InterfaceC0181e subscription) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        this._notificationsManager.mo22addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
        if (this._notificationsManager.mo25getPermission() && needsPushTokenRefresh()) {
            retrievePushTokenAndUpdateSubscription();
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (Intrinsics.a(tag, "HYDRATE")) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }
}
