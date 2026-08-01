package cd;

import com.onesignal.common.d;
import ea.f;
import na.e;
import ra.b;
import zc.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements b, sc.a {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final yc.b _identityModelStore;
    private final na.f _operationRepo;
    private final sc.b _sessionService;

    public a(f fVar, sc.b bVar, na.f fVar2, com.onesignal.core.internal.config.b bVar2, yc.b bVar3) {
        fVar.getClass();
        bVar.getClass();
        fVar2.getClass();
        bVar2.getClass();
        bVar3.getClass();
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._operationRepo = fVar2;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
    }

    private final void refreshUser() {
        if (d.INSTANCE.isLocalId(((yc.a) this._identityModelStore.getModel()).getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        e.enqueue$default(this._operationRepo, new h(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((yc.a) this._identityModelStore.getModel()).getOnesignalId()), false, 2, null);
    }

    @Override // sc.a
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // ra.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // sc.a
    public void onSessionActive() {
    }

    @Override // sc.a
    public void onSessionEnded(long j) {
    }
}
