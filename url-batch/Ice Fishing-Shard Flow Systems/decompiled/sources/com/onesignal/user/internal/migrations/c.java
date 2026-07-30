package com.onesignal.user.internal.migrations;

import R5.InterfaceC0168h;
import R5.i;
import Y3.e;
import Y3.g;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class c extends b {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final e _subscriptionModelStore;
    private final InterfaceC0168h activePushSubscription$delegate;

    public static final class a extends p implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Y3.d invoke() {
            Object obj;
            Iterator<T> it = c.this._subscriptionModelStore.list().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Y3.d) obj).getType() == g.PUSH) {
                    break;
                }
            }
            return (Y3.d) obj;
        }
    }

    public c(com.onesignal.core.internal.config.c _configModelStore, e _subscriptionModelStore) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        this._configModelStore = _configModelStore;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.activePushSubscription$delegate = i.b(new a());
    }

    public final Y3.d getActivePushSubscription() {
        return (Y3.d) this.activePushSubscription$delegate.getValue();
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public boolean isInBadState() {
        return ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public void recover() {
        com.onesignal.core.internal.config.b bVar = (com.onesignal.core.internal.config.b) this._configModelStore.getModel();
        Y3.d activePushSubscription = getActivePushSubscription();
        bVar.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
