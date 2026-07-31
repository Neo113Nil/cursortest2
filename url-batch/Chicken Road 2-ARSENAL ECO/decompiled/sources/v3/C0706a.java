package v3;

import T1.f;
import com.onesignal.common.d;
import com.onesignal.core.internal.config.c;
import com.onesignal.core.internal.startup.b;
import d2.e;
import kotlin.jvm.internal.i;
import l3.InterfaceC0493a;
import l3.InterfaceC0494b;
import r3.C0617a;
import s3.h;

/* renamed from: v3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706a implements b, InterfaceC0493a {
    private final f _applicationService;
    private final c _configModelStore;
    private final r3.b _identityModelStore;
    private final d2.f _operationRepo;
    private final InterfaceC0494b _sessionService;

    public C0706a(f _applicationService, InterfaceC0494b _sessionService, d2.f _operationRepo, c _configModelStore, r3.b _identityModelStore) {
        i.e(_applicationService, "_applicationService");
        i.e(_sessionService, "_sessionService");
        i.e(_operationRepo, "_operationRepo");
        i.e(_configModelStore, "_configModelStore");
        i.e(_identityModelStore, "_identityModelStore");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._operationRepo = _operationRepo;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
    }

    private final void refreshUser() {
        if (d.INSTANCE.isLocalId(((C0617a) this._identityModelStore.getModel()).getOnesignalId()) || !this._applicationService.isInForeground()) {
            return;
        }
        e.enqueue$default(this._operationRepo, new h(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), ((C0617a) this._identityModelStore.getModel()).getExternalId()), false, 2, null);
    }

    @Override // l3.InterfaceC0493a
    public void onSessionStarted() {
        refreshUser();
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    @Override // l3.InterfaceC0493a
    public void onSessionActive() {
    }

    @Override // l3.InterfaceC0493a
    public void onSessionEnded(long j4) {
    }
}
