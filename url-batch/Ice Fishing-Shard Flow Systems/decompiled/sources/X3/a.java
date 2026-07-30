package X3;

import F2.e;
import U3.h;
import com.onesignal.common.d;
import com.onesignal.core.internal.config.c;
import com.onesignal.core.internal.startup.b;
import kotlin.jvm.internal.Intrinsics;
import v2.f;

/* loaded from: classes.dex */
public final class a implements b, N3.a {
    private final f _applicationService;
    private final c _configModelStore;
    private final T3.b _identityModelStore;
    private final F2.f _operationRepo;
    private final N3.b _sessionService;

    public a(f _applicationService, N3.b _sessionService, F2.f _operationRepo, c _configModelStore, T3.b _identityModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._operationRepo = _operationRepo;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    private final void refreshUser() {
        if (d.INSTANCE.isLocalId(((T3.a) this._identityModelStore.getModel()).getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        e.enqueue$default(this._operationRepo, new h(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), ((T3.a) this._identityModelStore.getModel()).getExternalId()), false, 2, null);
    }

    @Override // N3.a
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // N3.a
    public void onSessionActive() {
    }

    @Override // N3.a
    public void onSessionEnded(long j) {
    }
}
