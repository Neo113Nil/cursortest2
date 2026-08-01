package com.onesignal.session.internal.session.impl;

import ea.e;
import ea.f;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import sc.d;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements sc.b, ra.a, ra.b, ga.b, e {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final d _sessionModelStore;
    private final sa.a _time;
    private com.onesignal.core.internal.config.a config;
    private boolean hasFocused;
    private sc.c session;
    private final com.onesignal.common.events.b sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    public b(f fVar, com.onesignal.core.internal.config.b bVar, d dVar, sa.a aVar) {
        fVar.getClass();
        bVar.getClass();
        dVar.getClass();
        aVar.getClass();
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._sessionModelStore = dVar;
        this._time = aVar;
        this.sessionLifeCycleNotifier = new com.onesignal.common.events.b();
    }

    private final void endSession() {
        sc.c cVar = this.session;
        cVar.getClass();
        if (cVar.isValid()) {
            sc.c cVar2 = this.session;
            cVar2.getClass();
            long activeDuration = cVar2.getActiveDuration();
            com.onesignal.debug.internal.logging.b.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            sc.c cVar3 = this.session;
            cVar3.getClass();
            cVar3.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            sc.c cVar4 = this.session;
            cVar4.getClass();
            cVar4.setActiveDuration(0L);
        }
    }

    @Override // ga.b
    public Object backgroundRun(ld.a aVar) {
        endSession();
        return Unit.f5554a;
    }

    @Override // ra.a
    public void bootstrap() {
        this.session = (sc.c) this._sessionModelStore.getModel();
        this.config = (com.onesignal.core.internal.config.a) this._configModelStore.getModel();
    }

    @Override // sc.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // ga.b
    public Long getScheduleBackgroundRunIn() {
        sc.c cVar = this.session;
        cVar.getClass();
        if (!cVar.isValid()) {
            return null;
        }
        com.onesignal.core.internal.config.a aVar = this.config;
        aVar.getClass();
        return Long.valueOf(aVar.getSessionFocusTimeout());
    }

    @Override // sc.b
    public long getStartTime() {
        sc.c cVar = this.session;
        cVar.getClass();
        return cVar.getStartTime();
    }

    @Override // ea.e
    public void onFocus(boolean z10) {
        com.onesignal.debug.internal.logging.b.log(ua.c.DEBUG, "SessionService.onFocus() - fired from start: " + z10);
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        sc.c cVar = this.session;
        cVar.getClass();
        if (cVar.isValid()) {
            sc.c cVar2 = this.session;
            cVar2.getClass();
            cVar2.setFocusTime(this._time.getCurrentTimeMillis());
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z10;
        sc.c cVar3 = this.session;
        cVar3.getClass();
        String uuid = UUID.randomUUID().toString();
        uuid.getClass();
        cVar3.setSessionId(uuid);
        sc.c cVar4 = this.session;
        cVar4.getClass();
        cVar4.setStartTime(this._time.getCurrentTimeMillis());
        sc.c cVar5 = this.session;
        cVar5.getClass();
        sc.c cVar6 = this.session;
        cVar6.getClass();
        cVar5.setFocusTime(cVar6.getStartTime());
        sc.c cVar7 = this.session;
        cVar7.getClass();
        cVar7.setValid(true);
        StringBuilder sb2 = new StringBuilder("SessionService: New session started at ");
        sc.c cVar8 = this.session;
        cVar8.getClass();
        sb2.append(cVar8.getStartTime());
        com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C0065b.INSTANCE);
    }

    @Override // ea.e
    public void onUnfocused() {
        long currentTimeMillis = this._time.getCurrentTimeMillis();
        sc.c cVar = this.session;
        cVar.getClass();
        long focusTime = currentTimeMillis - cVar.getFocusTime();
        sc.c cVar2 = this.session;
        cVar2.getClass();
        cVar2.setActiveDuration(cVar2.getActiveDuration() + focusTime);
        ua.c cVar3 = ua.c.DEBUG;
        StringBuilder sb2 = new StringBuilder("SessionService.onUnfocused adding time ");
        sb2.append(focusTime);
        sb2.append(" for total: ");
        sc.c cVar4 = this.session;
        cVar4.getClass();
        sb2.append(cVar4.getActiveDuration());
        com.onesignal.debug.internal.logging.b.log(cVar3, sb2.toString());
    }

    @Override // ra.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // sc.b, com.onesignal.common.events.d
    public void subscribe(sc.a aVar) {
        aVar.getClass();
        this.sessionLifeCycleNotifier.subscribe(aVar);
        if (this.shouldFireOnSubscribe) {
            aVar.onSessionStarted();
        }
    }

    @Override // sc.b, com.onesignal.common.events.d
    public void unsubscribe(sc.a aVar) {
        aVar.getClass();
        this.sessionLifeCycleNotifier.unsubscribe(aVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.session.internal.session.impl.b$b, reason: collision with other inner class name */
    public static final class C0065b extends p implements Function1 {
        public static final C0065b INSTANCE = new C0065b();

        public C0065b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((sc.a) obj);
            return Unit.f5554a;
        }

        public final void invoke(sc.a aVar) {
            aVar.getClass();
            aVar.onSessionStarted();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends p implements Function1 {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((sc.a) obj);
            return Unit.f5554a;
        }

        public final void invoke(sc.a aVar) {
            aVar.getClass();
            aVar.onSessionActive();
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(1);
            this.$activeDuration = j;
        }

        public final void invoke(sc.a aVar) {
            aVar.getClass();
            aVar.onSessionEnded(this.$activeDuration);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((sc.a) obj);
            return Unit.f5554a;
        }
    }
}
