package ad;

import dd.d;
import dd.e;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na.f;
import na.g;
import zc.q;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c extends oa.a {
    public static final a Companion = new a(null);
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final yc.b _identityModelStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, f fVar, yc.b bVar, com.onesignal.core.internal.config.b bVar2) {
        super(eVar, fVar);
        eVar.getClass();
        fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this._identityModelStore = bVar;
        this._configModelStore = bVar2;
    }

    @Override // oa.a
    public g getAddOperation(d dVar) {
        dVar.getClass();
        Pair<Boolean, dd.f> subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(dVar);
        return new zc.a(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((yc.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId(), dVar.getType(), ((Boolean) subscriptionEnabledAndStatus.f5552d).booleanValue(), dVar.getAddress(), (dd.f) subscriptionEnabledAndStatus.f5553e);
    }

    @Override // oa.a
    public g getRemoveOperation(d dVar) {
        dVar.getClass();
        return new zc.c(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((yc.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId());
    }

    @Override // oa.a
    public g getUpdateOperation(d dVar, String str, String str2, Object obj, Object obj2) {
        dVar.getClass();
        str.getClass();
        str2.getClass();
        Pair<Boolean, dd.f> subscriptionEnabledAndStatus = Companion.getSubscriptionEnabledAndStatus(dVar);
        return new q(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((yc.a) this._identityModelStore.getModel()).getOnesignalId(), dVar.getId(), dVar.getType(), ((Boolean) subscriptionEnabledAndStatus.f5552d).booleanValue(), dVar.getAddress(), (dd.f) subscriptionEnabledAndStatus.f5553e);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Pair<Boolean, dd.f> getSubscriptionEnabledAndStatus(d dVar) {
            dd.f status;
            boolean z10;
            dVar.getClass();
            if (dVar.getOptedIn()) {
                dd.f status2 = dVar.getStatus();
                status = dd.f.SUBSCRIBED;
                if (status2 == status && dVar.getAddress().length() > 0) {
                    z10 = true;
                    return new Pair<>(Boolean.valueOf(z10), status);
                }
            }
            status = !dVar.getOptedIn() ? dd.f.UNSUBSCRIBE : dVar.getStatus();
            z10 = false;
            return new Pair<>(Boolean.valueOf(z10), status);
        }

        private a() {
        }
    }
}
