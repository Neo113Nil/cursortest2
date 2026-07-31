package com.onesignal.user.internal.migrations;

import java.util.Iterator;
import k5.InterfaceC0475e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import m1.AbstractC0521b;
import w3.e;
import w3.g;
import x5.InterfaceC0732a;

/* loaded from: classes.dex */
public final class c extends b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final e _subscriptionModelStore;
    private final InterfaceC0475e activePushSubscription$delegate;

    public static final class a extends j implements InterfaceC0732a {
        public a() {
            super(0);
        }

        @Override // x5.InterfaceC0732a
        public final w3.d invoke() {
            Object obj;
            Iterator<T> it = c.this._subscriptionModelStore.list().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((w3.d) obj).getType() == g.PUSH) {
                    break;
                }
            }
            return (w3.d) obj;
        }
    }

    public c(com.onesignal.core.internal.config.c _configModelStore, e _subscriptionModelStore) {
        i.e(_configModelStore, "_configModelStore");
        i.e(_subscriptionModelStore, "_subscriptionModelStore");
        this._configModelStore = _configModelStore;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.activePushSubscription$delegate = AbstractC0521b.x(new a());
    }

    public final w3.d getActivePushSubscription() {
        return (w3.d) this.activePushSubscription$delegate.getValue();
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public boolean isInBadState() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public void recover() {
        com.onesignal.core.internal.config.b bVar = (com.onesignal.core.internal.config.b) this._configModelStore.getModel();
        w3.d activePushSubscription = getActivePushSubscription();
        bVar.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
