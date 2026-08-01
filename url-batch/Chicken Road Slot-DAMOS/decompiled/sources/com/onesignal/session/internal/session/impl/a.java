package com.onesignal.session.internal.session.impl;

import cf.c;
import com.onesignal.common.l;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na.e;
import na.f;
import nd.i;
import zc.n;
import zc.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements ra.b, sc.a {
    public static final C0064a Companion = new C0064a(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final yc.b _identityModelStore;
    private final f _operationRepo;
    private final qc.b _outcomeEventsController;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final sc.b _sessionService;

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, ld.a aVar) {
            super(1, aVar);
            this.$durationInSeconds = j;
        }

        @Override // nd.a
        public final ld.a create(ld.a aVar) {
            return a.this.new b(this.$durationInSeconds, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(ld.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.f5554a);
        }

        @Override // nd.a
        public final Object invokeSuspend(Object obj) {
            md.a aVar = md.a.f6622d;
            int i3 = this.label;
            if (i3 == 0) {
                c.M(obj);
                qc.b bVar = a.this._outcomeEventsController;
                long j = this.$durationInSeconds;
                this.label = 1;
                if (bVar.sendSessionEndOutcomeEvent(j, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c.M(obj);
            }
            return Unit.f5554a;
        }
    }

    public a(f fVar, sc.b bVar, com.onesignal.core.internal.config.b bVar2, yc.b bVar3, com.onesignal.user.internal.properties.b bVar4, qc.b bVar5) {
        fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        bVar4.getClass();
        bVar5.getClass();
        this._operationRepo = fVar;
        this._sessionService = bVar;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
        this._propertiesModelStore = bVar4;
        this._outcomeEventsController = bVar5;
    }

    @Override // sc.a
    public void onSessionActive() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(l.INSTANCE.getTimeZoneId());
    }

    @Override // sc.a
    public void onSessionEnded(long j) {
        long j3 = j / 1000;
        if (j3 < 1 || j3 > SECONDS_IN_A_DAY) {
            com.onesignal.debug.internal.logging.b.error$default("SessionListener.onSessionEnded sending duration of " + j3 + " seconds", null, 2, null);
        }
        e.enqueue$default(this._operationRepo, new n(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((yc.a) this._identityModelStore.getModel()).getOnesignalId(), j3), false, 2, null);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new b(j3, null), 1, null);
    }

    @Override // sc.a
    public void onSessionStarted() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(l.INSTANCE.getTimeZoneId());
        this._operationRepo.enqueue(new o(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((yc.a) this._identityModelStore.getModel()).getOnesignalId()), true);
    }

    @Override // ra.b
    public void start() {
        this._sessionService.subscribe(this);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.session.internal.session.impl.a$a, reason: collision with other inner class name */
    public static final class C0064a {
        public /* synthetic */ C0064a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0064a() {
        }
    }
}
