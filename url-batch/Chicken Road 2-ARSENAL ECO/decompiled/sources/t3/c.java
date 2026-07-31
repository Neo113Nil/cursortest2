package t3;

import d2.g;
import e2.AbstractC0343a;
import k5.C0477g;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import r3.C0617a;
import s3.q;
import w3.d;
import w3.f;

/* loaded from: classes.dex */
public final class c extends AbstractC0343a {
    public static final a Companion = new a(null);
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final r3.b _identityModelStore;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final C0477g getSubscriptionEnabledAndStatus(d model) {
            f status;
            boolean z5;
            i.e(model, "model");
            if (model.isDisabledInternally()) {
                return new C0477g(Boolean.FALSE, f.UNSUBSCRIBE);
            }
            if (model.getOptedIn()) {
                f status2 = model.getStatus();
                status = f.SUBSCRIBED;
                if (status2 == status && model.getAddress().length() > 0) {
                    z5 = true;
                    return new C0477g(Boolean.valueOf(z5), status);
                }
            }
            status = !model.getOptedIn() ? f.UNSUBSCRIBE : model.getStatus();
            z5 = false;
            return new C0477g(Boolean.valueOf(z5), status);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w3.e store, d2.f opRepo, r3.b _identityModelStore, com.onesignal.core.internal.config.c _configModelStore) {
        super(store, opRepo);
        i.e(store, "store");
        i.e(opRepo, "opRepo");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_configModelStore, "_configModelStore");
        this._identityModelStore = _identityModelStore;
        this._configModelStore = _configModelStore;
    }

    @Override // e2.AbstractC0343a
    public g getAddOperation(d model) {
        i.e(model, "model");
        C0477g subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new s3.a(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), ((C0617a) this._identityModelStore.getModel()).getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f5198f).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.f5199g);
    }

    @Override // e2.AbstractC0343a
    public g getRemoveOperation(d model) {
        i.e(model, "model");
        return new s3.c(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), ((C0617a) this._identityModelStore.getModel()).getExternalId(), model.getId());
    }

    @Override // e2.AbstractC0343a
    public g getUpdateOperation(d model, String path, String property, Object obj, Object obj2) {
        i.e(model, "model");
        i.e(path, "path");
        i.e(property, "property");
        C0477g subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(model);
        return new q(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), ((C0617a) this._identityModelStore.getModel()).getExternalId(), model.getId(), model.getType(), ((Boolean) subscriptionEnabledAndStatus.f5198f).booleanValue(), model.getAddress(), (f) subscriptionEnabledAndStatus.f5199g);
    }
}
