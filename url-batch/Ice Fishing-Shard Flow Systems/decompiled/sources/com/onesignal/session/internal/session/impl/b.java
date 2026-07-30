package com.onesignal.session.internal.session.impl;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import v2.f;

/* loaded from: classes.dex */
public final class b implements N3.b, com.onesignal.core.internal.startup.a, com.onesignal.core.internal.startup.b, x2.b, v2.e {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final N3.d _sessionModelStore;
    private final I2.a _time;
    private com.onesignal.core.internal.config.b config;
    private boolean hasFocused;
    private N3.c session;
    private final com.onesignal.common.events.b sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    public static final class a extends p implements Function1 {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j) {
            super(1);
            this.$activeDuration = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((N3.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(N3.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionEnded(this.$activeDuration);
        }
    }

    /* renamed from: com.onesignal.session.internal.session.impl.b$b, reason: collision with other inner class name */
    public static final class C0075b extends p implements Function1 {
        public static final C0075b INSTANCE = new C0075b();

        public C0075b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((N3.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(N3.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionStarted();
        }
    }

    public static final class c extends p implements Function1 {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((N3.a) obj);
            return Unit.f6114a;
        }

        public final void invoke(N3.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onSessionActive();
        }
    }

    public static final class d extends p implements Function0 {
        final /* synthetic */ boolean $firedOnSubscribe;
        final /* synthetic */ long $focusTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z7, long j) {
            super(0);
            this.$firedOnSubscribe = z7;
            this.$focusTimeMs = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m36invoke();
            return Unit.f6114a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m36invoke() {
            b.this.handleOnFocus(this.$firedOnSubscribe, this.$focusTimeMs);
        }
    }

    public static final class e extends p implements Function0 {
        final /* synthetic */ long $unfocusTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(0);
            this.$unfocusTimeMs = j;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m37invoke();
            return Unit.f6114a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m37invoke() {
            b.this.handleOnUnfocused(this.$unfocusTimeMs);
        }
    }

    public b(f _applicationService, com.onesignal.core.internal.config.c _configModelStore, N3.d _sessionModelStore, I2.a _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_sessionModelStore, "_sessionModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._sessionModelStore = _sessionModelStore;
        this._time = _time;
        this.sessionLifeCycleNotifier = new com.onesignal.common.events.b();
    }

    private final void endSession() {
        N3.c cVar = this.session;
        if (cVar != null && cVar.isValid()) {
            long activeDuration = cVar.getActiveDuration();
            com.onesignal.debug.internal.logging.b.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            cVar.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            cVar.setActiveDuration(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnFocus(boolean z7, long j) {
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "SessionService.onFocus() - fired from start: " + z7);
        N3.c cVar = this.session;
        if (cVar == null) {
            com.onesignal.debug.internal.logging.b.warn$default("SessionService.onFocus called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        if (cVar.isValid()) {
            cVar.setFocusTime(j);
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z7;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        cVar.setSessionId(uuid);
        cVar.setStartTime(j);
        cVar.setFocusTime(cVar.getStartTime());
        cVar.setValid(true);
        com.onesignal.debug.internal.logging.b.debug$default("SessionService: New session started at " + cVar.getStartTime(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C0075b.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnUnfocused(long j) {
        N3.c cVar = this.session;
        if (cVar == null) {
            com.onesignal.debug.internal.logging.b.warn$default("SessionService.onUnfocused called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        long focusTime = j - cVar.getFocusTime();
        cVar.setActiveDuration(cVar.getActiveDuration() + focusTime);
        com.onesignal.debug.internal.logging.b.log(K2.c.DEBUG, "SessionService.onUnfocused adding time " + focusTime + " for total: " + cVar.getActiveDuration());
    }

    @Override // x2.b
    public Object backgroundRun(V5.b bVar) {
        endSession();
        return Unit.f6114a;
    }

    @Override // com.onesignal.core.internal.startup.a
    public void bootstrap() {
        this.session = (N3.c) this._sessionModelStore.getModel();
        this.config = (com.onesignal.core.internal.config.b) this._configModelStore.getModel();
    }

    @Override // N3.b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // x2.b
    public Long getScheduleBackgroundRunIn() {
        com.onesignal.core.internal.config.b bVar;
        N3.c cVar = this.session;
        if (cVar == null || (bVar = this.config) == null || !cVar.isValid()) {
            return null;
        }
        return Long.valueOf(bVar.getSessionFocusTimeout());
    }

    @Override // N3.b
    public long getStartTime() {
        N3.c cVar = this.session;
        return cVar != null ? cVar.getStartTime() : this._time.getCurrentTimeMillis();
    }

    @Override // v2.e
    public void onFocus(boolean z7) {
        com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new d(z7, this._time.getCurrentTimeMillis()));
    }

    @Override // v2.e
    public void onUnfocused() {
        com.onesignal.common.threading.b.runOnSerialIOIfBackgroundThreading(new e(this._time.getCurrentTimeMillis()));
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // N3.b, com.onesignal.common.events.d
    public void subscribe(N3.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.sessionLifeCycleNotifier.subscribe(handler);
        if (this.shouldFireOnSubscribe) {
            handler.onSessionStarted();
        }
    }

    @Override // N3.b, com.onesignal.common.events.d
    public void unsubscribe(N3.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(handler);
    }
}
