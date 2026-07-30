package S5;

import D4.g;
import R5.q;
import V5.d;
import V5.f;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import q7.C4938g;

/* loaded from: classes2.dex */
public final class c extends E4.a {
    public static final a Companion = new a(null);
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final Q5.b _identityModelStore;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final C4938g getSubscriptionEnabledAndStatus(d model) {
            f status;
            boolean z8;
            h.e(model, "model");
            if (model.isDisabledInternally()) {
                return new C4938g(Boolean.FALSE, f.UNSUBSCRIBE);
            }
            if (model.getOptedIn()) {
                f status2 = model.getStatus();
                status = f.SUBSCRIBED;
                if (status2 == status && model.getAddress().length() > 0) {
                    z8 = true;
                    return new C4938g(Boolean.valueOf(z8), status);
                }
            }
            status = !model.getOptedIn() ? f.UNSUBSCRIBE : model.getStatus();
            z8 = false;
            return new C4938g(Boolean.valueOf(z8), status);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(V5.e store, D4.f opRepo, Q5.b _identityModelStore, com.onesignal.core.internal.config.c _configModelStore) {
        super(store, opRepo);
        h.e(store, "store");
        h.e(opRepo, "opRepo");
        h.e(_identityModelStore, "_identityModelStore");
        h.e(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // E4.a
    public g getAddOperation(d model) {
        h.e(model, "model");
        C4938g subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new R5.a(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((Q5.a) this._identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this._identityModelStore.getModel()).getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f40162n).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.f40163u);
    }

    @Override // E4.a
    public g getRemoveOperation(d model) {
        h.e(model, "model");
        return new R5.c(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((Q5.a) this._identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this._identityModelStore.getModel()).getExternalId(), model.getId());
    }

    @Override // E4.a
    public g getUpdateOperation(d model, String path, String property, Object obj, Object obj2) {
        h.e(model, "model");
        h.e(path, "path");
        h.e(property, "property");
        C4938g subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new q(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((Q5.a) this._identityModelStore.getModel()).getOnesignalId(), ((Q5.a) this._identityModelStore.getModel()).getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f40162n).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.f40163u);
    }
}
