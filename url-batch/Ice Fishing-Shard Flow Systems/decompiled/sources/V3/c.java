package V3;

import F2.g;
import U3.q;
import Y3.d;
import Y3.e;
import Y3.f;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends G2.a {
    public static final a Companion = new a(null);
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final T3.b _identityModelStore;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<Boolean, f> getSubscriptionEnabledAndStatus(d model) {
            f status;
            boolean z7;
            Intrinsics.checkNotNullParameter(model, "model");
            if (model.isDisabledInternally()) {
                return new Pair<>(Boolean.FALSE, f.UNSUBSCRIBE);
            }
            if (model.getOptedIn()) {
                f status2 = model.getStatus();
                status = f.SUBSCRIBED;
                if (status2 == status && model.getAddress().length() > 0) {
                    z7 = true;
                    return new Pair<>(Boolean.valueOf(z7), status);
                }
            }
            status = !model.getOptedIn() ? f.UNSUBSCRIBE : model.getStatus();
            z7 = false;
            return new Pair<>(Boolean.valueOf(z7), status);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e store, F2.f opRepo, T3.b _identityModelStore, com.onesignal.core.internal.config.c _configModelStore) {
        super(store, opRepo);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(opRepo, "opRepo");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // G2.a
    public g getAddOperation(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Pair<Boolean, f> subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new U3.a(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), ((T3.a) this._identityModelStore.getModel()).getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f6112d).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.f6113e);
    }

    @Override // G2.a
    public g getRemoveOperation(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new U3.c(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), ((T3.a) this._identityModelStore.getModel()).getExternalId(), model.getId());
    }

    @Override // G2.a
    public g getUpdateOperation(d model, String path, String property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(property, "property");
        Pair<Boolean, f> subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new q(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), ((T3.a) this._identityModelStore.getModel()).getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f6112d).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.f6113e);
    }
}
