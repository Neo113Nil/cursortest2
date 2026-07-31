package com.onesignal.user.internal.migrations;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModel;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionType;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecoverConfigPushSubscription.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/onesignal/user/internal/migrations/RecoverConfigPushSubscription;", "Lcom/onesignal/user/internal/migrations/MigrationRecovery;", "_configModelStore", "Lcom/onesignal/core/internal/config/ConfigModelStore;", "_subscriptionModelStore", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "(Lcom/onesignal/core/internal/config/ConfigModelStore;Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;)V", "activePushSubscription", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModel;", "getActivePushSubscription", "()Lcom/onesignal/user/internal/subscriptions/SubscriptionModel;", "activePushSubscription$delegate", "Lkotlin/Lazy;", "isInBadState", "", "recover", "", "recoveryMessage", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoverConfigPushSubscription extends MigrationRecovery {
    private final ConfigModelStore _configModelStore;
    private final SubscriptionModelStore _subscriptionModelStore;

    /* renamed from: activePushSubscription$delegate, reason: from kotlin metadata */
    private final Lazy activePushSubscription;

    public RecoverConfigPushSubscription(ConfigModelStore _configModelStore, SubscriptionModelStore _subscriptionModelStore) {
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionModelStore, "_subscriptionModelStore");
        this._configModelStore = _configModelStore;
        this._subscriptionModelStore = _subscriptionModelStore;
        this.activePushSubscription = LazyKt.lazy(new Function0<SubscriptionModel>() { // from class: com.onesignal.user.internal.migrations.RecoverConfigPushSubscription$activePushSubscription$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SubscriptionModel invoke() {
                SubscriptionModelStore subscriptionModelStore;
                Object obj;
                subscriptionModelStore = RecoverConfigPushSubscription.this._subscriptionModelStore;
                Iterator it = subscriptionModelStore.list().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((SubscriptionModel) obj).getType() == SubscriptionType.PUSH) {
                        break;
                    }
                }
                return (SubscriptionModel) obj;
            }
        });
    }

    public final SubscriptionModel getActivePushSubscription() {
        return (SubscriptionModel) this.activePushSubscription.getValue();
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public boolean isInBadState() {
        return this._configModelStore.getModel().getPushSubscriptionId() == null && getActivePushSubscription() != null;
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public void recover() {
        ConfigModel model = this._configModelStore.getModel();
        SubscriptionModel activePushSubscription = getActivePushSubscription();
        model.setPushSubscriptionId(activePushSubscription != null ? activePushSubscription.getId() : null);
    }

    @Override // com.onesignal.user.internal.migrations.IMigrationRecovery
    public String recoveryMessage() {
        return "Recovering missing push subscription ID in the config model store.";
    }
}
