package com.onesignal.user.internal.migrations;

import dd.e;
import hd.g;
import hd.h;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends b {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final e _subscriptionModelStore;
    private final g activePushSubscription$delegate;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final dd.d invoke() {
            Object obj;
            Iterator<T> it = c.this._subscriptionModelStore.list().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((dd.d) obj).getType() == dd.g.PUSH) {
                    break;
                }
            }
            return (dd.d) obj;
        }
    }

    public c(com.onesignal.core.internal.config.b bVar, e eVar) {
        bVar.getClass();
        eVar.getClass();
        this._configModelStore = bVar;
        this._subscriptionModelStore = eVar;
        this.activePushSubscription$delegate = h.b(new a());
    }

    public final dd.d getActivePushSubscription() {
        return (dd.d) this.activePushSubscription$delegate.getValue();
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public boolean isInBadState() {
        return ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public void recover() {
        com.onesignal.core.internal.config.a aVar = (com.onesignal.core.internal.config.a) this._configModelStore.getModel();
        dd.d activePushSubscription = getActivePushSubscription();
        aVar.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.onesignal.user.internal.migrations.b, com.onesignal.user.internal.migrations.a
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
