package com.onesignal.notifications.internal.listeners;

import cf.c;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import com.onesignal.notifications.internal.pushtoken.d;
import dd.f;
import fd.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nd.i;
import qb.n;
import qb.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.¨\u0006/"}, d2 = {"Lcom/onesignal/notifications/internal/listeners/DeviceRegistrationListener;", "Lra/b;", "Lcom/onesignal/common/modeling/g;", "Lcom/onesignal/core/internal/config/a;", "Lqb/o;", "Ldd/a;", "Lcom/onesignal/core/internal/config/b;", "_configModelStore", "Lzb/a;", "_channelManager", "Lcom/onesignal/notifications/internal/pushtoken/a;", "_pushTokenManager", "Lqb/n;", "_notificationsManager", "Ldd/b;", "_subscriptionManager", "<init>", "(Lcom/onesignal/core/internal/config/b;Lzb/a;Lcom/onesignal/notifications/internal/pushtoken/a;Lqb/n;Ldd/b;)V", "", "retrievePushTokenAndUpdateSubscription", "()V", "start", "model", "", "tag", "onModelReplaced", "(Lcom/onesignal/core/internal/config/a;Ljava/lang/String;)V", "Lcom/onesignal/common/modeling/j;", "args", "onModelUpdated", "(Lcom/onesignal/common/modeling/j;Ljava/lang/String;)V", "", "permission", "onNotificationPermissionChange", "(Z)V", "Lfd/e;", "subscription", "onSubscriptionRemoved", "(Lfd/e;)V", "onSubscriptionAdded", "onSubscriptionChanged", "(Lfd/e;Lcom/onesignal/common/modeling/j;)V", "Lcom/onesignal/core/internal/config/b;", "Lzb/a;", "Lcom/onesignal/notifications/internal/pushtoken/a;", "Lqb/n;", "Ldd/b;", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeviceRegistrationListener implements ra.b, g, o, dd.a {
    private final zb.a _channelManager;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final n _notificationsManager;
    private final com.onesignal.notifications.internal.pushtoken.a _pushTokenManager;
    private final dd.b _subscriptionManager;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends i implements Function1 {
        int label;

        public a(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return DeviceRegistrationListener.this.new a(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                n nVar = DeviceRegistrationListener.this._notificationsManager;
                this.label = 1;
                if (nVar.requestPermission(true, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function1 {
        int label;

        public b(ld.a aVar) {
            super(1, aVar);
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return DeviceRegistrationListener.this.new b(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                com.onesignal.notifications.internal.pushtoken.a aVar2 = DeviceRegistrationListener.this._pushTokenManager;
                this.label = 1;
                obj = aVar2.retrievePushToken(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c.M(obj);
            }
            d dVar = (d) obj;
            DeviceRegistrationListener.this._subscriptionManager.addOrUpdatePushSubscriptionToken(dVar.getToken(), DeviceRegistrationListener.this._notificationsManager.mo18getPermission() ? dVar.getStatus() : f.NO_PERMISSION);
            return Unit.f5554a;
        }
    }

    public DeviceRegistrationListener(com.onesignal.core.internal.config.b bVar, zb.a aVar, com.onesignal.notifications.internal.pushtoken.a aVar2, n nVar, dd.b bVar2) {
        bVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        nVar.getClass();
        bVar2.getClass();
        this._configModelStore = bVar;
        this._channelManager = aVar;
        this._pushTokenManager = aVar2;
        this._notificationsManager = nVar;
        this._subscriptionManager = bVar2;
    }

    private final void retrievePushTokenAndUpdateSubscription() {
        this._subscriptionManager.getSubscriptions().getPush();
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(null), 1, null);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a model, String tag) {
        model.getClass();
        tag.getClass();
        if (Intrinsics.a(tag, "HYDRATE")) {
            this._channelManager.processChannelList(model.getNotificationChannels());
            retrievePushTokenAndUpdateSubscription();
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        args.getClass();
        tag.getClass();
    }

    @Override // qb.o
    public void onNotificationPermissionChange(boolean permission) {
        retrievePushTokenAndUpdateSubscription();
    }

    @Override // dd.a
    public void onSubscriptionAdded(e subscription) {
        subscription.getClass();
    }

    @Override // dd.a
    public void onSubscriptionChanged(e subscription, j args) {
        subscription.getClass();
        args.getClass();
        if (Intrinsics.a(args.getPath(), "optedIn") && Intrinsics.a(args.getNewValue(), Boolean.TRUE) && !this._notificationsManager.mo18getPermission()) {
            com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(null), 1, null);
        }
    }

    @Override // dd.a
    public void onSubscriptionRemoved(e subscription) {
        subscription.getClass();
    }

    @Override // ra.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        this._notificationsManager.mo15addPermissionObserver(this);
        this._subscriptionManager.subscribe(this);
    }
}
