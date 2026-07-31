package com.onesignal.session.internal.session.impl;

import com.onesignal.common.l;
import com.onesignal.core.internal.config.c;
import d2.f;
import k5.v;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import l3.InterfaceC0493a;
import l3.InterfaceC0494b;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.g;
import r3.C0617a;
import s3.n;
import s3.o;
import u0.AbstractC0676f;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class a implements com.onesignal.core.internal.startup.b, InterfaceC0493a {
    public static final C0074a Companion = new C0074a(null);
    public static final long SECONDS_IN_A_DAY = 86400;
    private final c _configModelStore;
    private final r3.b _identityModelStore;
    private final f _operationRepo;
    private final j3.b _outcomeEventsController;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final InterfaceC0494b _sessionService;

    /* renamed from: com.onesignal.session.internal.session.impl.a$a, reason: collision with other inner class name */
    public static final class C0074a {
        public /* synthetic */ C0074a(e eVar) {
            this();
        }

        private C0074a() {
        }
    }

    public static final class b extends g implements InterfaceC0743l {
        final /* synthetic */ long $durationInSeconds;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j4, InterfaceC0564d interfaceC0564d) {
            super(1, interfaceC0564d);
            this.$durationInSeconds = j4;
        }

        @Override // q5.AbstractC0605a
        public final InterfaceC0564d create(InterfaceC0564d interfaceC0564d) {
            return a.this.new b(this.$durationInSeconds, interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            EnumC0580a enumC0580a = EnumC0580a.f5697f;
            int i7 = this.label;
            if (i7 == 0) {
                AbstractC0676f.w(obj);
                j3.b bVar = a.this._outcomeEventsController;
                long j4 = this.$durationInSeconds;
                this.label = 1;
                if (bVar.sendSessionEndOutcomeEvent(j4, this) == enumC0580a) {
                    return enumC0580a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
            }
            return v.f5219a;
        }

        @Override // x5.InterfaceC0743l
        public final Object invoke(InterfaceC0564d interfaceC0564d) {
            return ((b) create(interfaceC0564d)).invokeSuspend(v.f5219a);
        }
    }

    public a(f _operationRepo, InterfaceC0494b _sessionService, c _configModelStore, r3.b _identityModelStore, com.onesignal.user.internal.properties.b _propertiesModelStore, j3.b _outcomeEventsController) {
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

    @Override // l3.InterfaceC0493a
    public void onSessionActive() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(l.INSTANCE.getTimeZoneId());
    }

    @Override // l3.InterfaceC0493a
    public void onSessionEnded(long j4) {
        long j7 = j4 / 1000;
        if (j7 < 1 || j7 > SECONDS_IN_A_DAY) {
            com.onesignal.debug.internal.logging.b.info$default("SessionListener.onSessionEnded sending duration of " + j7 + " seconds", null, 2, null);
        }
        d2.e.enqueue$default(this._operationRepo, new n(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), ((C0617a) this._identityModelStore.getModel()).getExternalId(), j7), false, 2, null);
        com.onesignal.common.threading.b.suspendifyOnIO(new b(j7, null));
    }

    @Override // l3.InterfaceC0493a
    public void onSessionStarted() {
        ((com.onesignal.user.internal.properties.a) this._propertiesModelStore.getModel()).setTimezone(l.INSTANCE.getTimeZoneId());
        this._operationRepo.enqueue(new o(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((C0617a) this._identityModelStore.getModel()).getOnesignalId(), ((C0617a) this._identityModelStore.getModel()).getExternalId()), true);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._sessionService.subscribe(this);
    }
}
