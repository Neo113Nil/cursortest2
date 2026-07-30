package com.onesignal.session.internal.session.impl;

import F2.e;
import F2.f;
import U3.n;
import U3.o;
import X5.j;
import com.onesignal.common.l;
import com.onesignal.core.internal.config.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements com.onesignal.core.internal.startup.b, N3.a {
    public static final C0074a Companion = new C0074a(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final c _configModelStore;
    private final T3.b _identityModelStore;
    private final f _operationRepo;
    private final L3.b _outcomeEventsController;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final N3.b _sessionService;

    /* renamed from: com.onesignal.session.internal.session.impl.a$a, reason: collision with other inner class name */
    public static final class C0074a {
        public /* synthetic */ C0074a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0074a() {
        }
    }

    public static final class b extends j implements Function1 {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, V5.b bVar) {
            super(1, bVar);
            this.$durationInSeconds = j;
        }

        @Override // X5.a
        public final V5.b create(V5.b bVar) {
            return a.this.new b(this.$durationInSeconds, bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(V5.b bVar) {
            return ((b) create(bVar)).invokeSuspend(Unit.f6114a);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            W5.a aVar = W5.a.f2787d;
            int i2 = this.label;
            if (i2 == 0) {
                V6.b.P(obj);
                L3.b bVar = a.this._outcomeEventsController;
                long j = this.$durationInSeconds;
                this.label = 1;
                if (bVar.sendSessionEndOutcomeEvent(j, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                V6.b.P(obj);
            }
            return Unit.f6114a;
        }
    }

    public a(f _operationRepo, N3.b _sessionService, c _configModelStore, T3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, L3.b _outcomeEventsController) {
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_sessionService, "_sessionService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_propertiesModelStore, "_propertiesModelStore");
        Intrinsics.checkNotNullParameter(_outcomeEventsController, "_outcomeEventsController");
        this._operationRepo = _operationRepo;
        this._sessionService = _sessionService;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._propertiesModelStore = _propertiesModelStore;
        this._outcomeEventsController = _outcomeEventsController;
    }

    @Override // N3.a
    public void onSessionActive() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(l.INSTANCE.getTimeZoneId());
    }

    @Override // N3.a
    public void onSessionEnded(long j) {
        long j7 = j / 1000;
        if (j7 < 1 || j7 > SECONDS_IN_A_DAY) {
            com.onesignal.debug.internal.logging.b.info$default("SessionListener.onSessionEnded sending duration of " + j7 + " seconds", null, 2, null);
        }
        e.enqueue$default(this._operationRepo, new n(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), ((T3.a) this._identityModelStore.getModel()).getExternalId(), j7), false, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new b(j7, null));
    }

    @Override // N3.a
    public void onSessionStarted() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(l.INSTANCE.getTimeZoneId());
        this._operationRepo.enqueue(new o(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((T3.a) this._identityModelStore.getModel()).getOnesignalId(), ((T3.a) this._identityModelStore.getModel()).getExternalId()), true);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._sessionService.subscribe(this);
    }
}
