package com.onesignal.session.internal.session.impl;

import E7.l;
import java.util.UUID;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import q7.v;
import t4.f;
import v4.InterfaceC5127b;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public final class b implements K5.b, com.onesignal.core.internal.startup.a, com.onesignal.core.internal.startup.b, InterfaceC5127b, t4.e {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final K5.d _sessionModelStore;
    private final G4.a _time;
    private com.onesignal.core.internal.config.b config;
    private boolean hasFocused;
    private K5.c session;
    private final com.onesignal.common.events.b sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    public static final class a extends i implements l {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j9) {
            super(1);
            this.$activeDuration = j9;
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((K5.a) obj);
            return v.f40183a;
        }

        public final void invoke(K5.a it) {
            h.e(it, "it");
            it.onSessionEnded(this.$activeDuration);
        }
    }

    /* renamed from: com.onesignal.session.internal.session.impl.b$b, reason: collision with other inner class name */
    public static final class C0244b extends i implements l {
        public static final C0244b INSTANCE = new C0244b();

        public C0244b() {
            super(1);
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((K5.a) obj);
            return v.f40183a;
        }

        public final void invoke(K5.a it) {
            h.e(it, "it");
            it.onSessionStarted();
        }
    }

    public static final class c extends i implements l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((K5.a) obj);
            return v.f40183a;
        }

        public final void invoke(K5.a it) {
            h.e(it, "it");
            it.onSessionActive();
        }
    }

    public static final class d extends i implements E7.a {
        final /* synthetic */ boolean $firedOnSubscribe;
        final /* synthetic */ long $focusTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z8, long j9) {
            super(0);
            this.$firedOnSubscribe = z8;
            this.$focusTimeMs = j9;
        }

        @Override // E7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m41invoke();
            return v.f40183a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m41invoke() {
            b.this.handleOnFocus(this.$firedOnSubscribe, this.$focusTimeMs);
        }
    }

    public static final class e extends i implements E7.a {
        final /* synthetic */ long $unfocusTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j9) {
            super(0);
            this.$unfocusTimeMs = j9;
        }

        @Override // E7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m42invoke();
            return v.f40183a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m42invoke() {
            b.this.handleOnUnfocused(this.$unfocusTimeMs);
        }
    }

    public b(f _applicationService, com.onesignal.core.internal.config.c _configModelStore, K5.d _sessionModelStore, G4.a _time) {
        h.e(_applicationService, "_applicationService");
        h.e(_configModelStore, "_configModelStore");
        h.e(_sessionModelStore, "_sessionModelStore");
        h.e(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._sessionModelStore = _sessionModelStore;
        this._time = _time;
        this.sessionLifeCycleNotifier = new com.onesignal.common.events.b();
    }

    private final void endSession() {
        K5.c cVar = this.session;
        if (cVar != null && cVar.isValid()) {
            long activeDuration = cVar.getActiveDuration();
            com.onesignal.debug.internal.logging.b.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            cVar.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            cVar.setActiveDuration(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnFocus(boolean z8, long j9) {
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "SessionService.onFocus() - fired from start: " + z8);
        K5.c cVar = this.session;
        if (cVar == null) {
            com.onesignal.debug.internal.logging.b.warn$default("SessionService.onFocus called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        if (cVar.isValid()) {
            cVar.setFocusTime(j9);
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z8;
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "toString(...)");
        cVar.setSessionId(uuid);
        cVar.setStartTime(j9);
        cVar.setFocusTime(cVar.getStartTime());
        cVar.setValid(true);
        com.onesignal.debug.internal.logging.b.debug$default("SessionService: New session started at " + cVar.getStartTime(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C0244b.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnUnfocused(long j9) {
        K5.c cVar = this.session;
        if (cVar == null) {
            com.onesignal.debug.internal.logging.b.warn$default("SessionService.onUnfocused called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        long focusTime = j9 - cVar.getFocusTime();
        cVar.setActiveDuration(cVar.getActiveDuration() + focusTime);
        com.onesignal.debug.internal.logging.b.log(I4.c.DEBUG, "SessionService.onUnfocused adding time " + focusTime + " for total: " + cVar.getActiveDuration());
    }

    @Override // v4.InterfaceC5127b
    public Object backgroundRun(InterfaceC5133d interfaceC5133d) {
        endSession();
        return v.f40183a;
    }

    @Override // com.onesignal.core.internal.startup.a
    public void bootstrap() {
        this.session = (K5.c) this._sessionModelStore.getModel();
        this.config = (com.onesignal.core.internal.config.b) this._configModelStore.getModel();
    }

    @Override // K5.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // v4.InterfaceC5127b
    public Long getScheduleBackgroundRunIn() {
        com.onesignal.core.internal.config.b bVar;
        K5.c cVar = this.session;
        if (cVar == null || (bVar = this.config) == null || !cVar.isValid()) {
            return null;
        }
        return Long.valueOf(bVar.getSessionFocusTimeout());
    }

    @Override // K5.b
    public long getStartTime() {
        K5.c cVar = this.session;
        return cVar != null ? cVar.getStartTime() : this._time.getCurrentTimeMillis();
    }

    @Override // t4.e
    public void onFocus(boolean z8) {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new d(z8, this._time.getCurrentTimeMillis()));
    }

    @Override // t4.e
    public void onUnfocused() {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new e(this._time.getCurrentTimeMillis()));
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // K5.b, com.onesignal.common.events.d
    public void subscribe(K5.a handler) {
        h.e(handler, "handler");
        this.sessionLifeCycleNotifier.subscribe(handler);
        if (this.shouldFireOnSubscribe) {
            handler.onSessionStarted();
        }
    }

    @Override // K5.b, com.onesignal.common.events.d
    public void unsubscribe(K5.a handler) {
        h.e(handler, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(handler);
    }
}
