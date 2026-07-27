package com.onesignal.session.internal.session.impl;

import com.onesignal.common.TimeUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.config.ConfigModelStore;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.core.internal.startup.IStartableService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.IOutcomeEventsController;
import com.onesignal.session.internal.session.ISessionLifecycleHandler;
import com.onesignal.session.internal.session.ISessionService;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.TrackSessionEndOperation;
import com.onesignal.user.internal.operations.TrackSessionStartOperation;
import com.onesignal.user.internal.properties.PropertiesModelStore;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class SessionListener implements IStartableService, ISessionLifecycleHandler {
    public static final Companion Companion = new Companion(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final ConfigModelStore _configModelStore;
    private final IdentityModelStore _identityModelStore;
    private final IOperationRepo _operationRepo;
    private final IOutcomeEventsController _outcomeEventsController;
    private final PropertiesModelStore _propertiesModelStore;
    private final ISessionService _sessionService;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public SessionListener(IOperationRepo _operationRepo, ISessionService _sessionService, ConfigModelStore _configModelStore, IdentityModelStore _identityModelStore, PropertiesModelStore _propertiesModelStore, IOutcomeEventsController _outcomeEventsController) {
        i.e(_operationRepo, "_operationRepo");
        i.e(_sessionService, "_sessionService");
        i.e(_configModelStore, "_configModelStore");
        i.e(_identityModelStore, "_identityModelStore");
        i.e(_propertiesModelStore, "_propertiesModelStore");
        i.e(_outcomeEventsController, "_outcomeEventsController");
        this._operationRepo = _operationRepo;
        this._sessionService = _sessionService;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._outcomeEventsController = _outcomeEventsController;
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionActive() {
        this._propertiesModelStore.getModel().setTimezone(TimeUtils.INSTANCE.getTimeZoneId());
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionEnded(long j2) {
        long j6 = j2 / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        if (j6 < 1 || j6 > SECONDS_IN_A_DAY) {
            Logging.info$default("SessionListener.onSessionEnded sending duration of " + j6 + " seconds", null, 2, null);
        }
        IOperationRepo.DefaultImpls.enqueue$default(this._operationRepo, new TrackSessionEndOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this._identityModelStore.getModel().getExternalId(), j6), false, 2, null);
        ThreadUtilsKt.suspendifyOnIO(new SessionListener$onSessionEnded$1(this, j6, null));
    }

    @Override // com.onesignal.session.internal.session.ISessionLifecycleHandler
    public void onSessionStarted() {
        this._propertiesModelStore.getModel().setTimezone(TimeUtils.INSTANCE.getTimeZoneId());
        this._operationRepo.enqueue(new TrackSessionStartOperation(this._configModelStore.getModel().getAppId(), this._identityModelStore.getModel().getOnesignalId(), this._identityModelStore.getModel().getExternalId()), true);
    }

    @Override // com.onesignal.core.internal.startup.IStartableService
    public void start() {
        this._sessionService.subscribe(this);
    }
}
