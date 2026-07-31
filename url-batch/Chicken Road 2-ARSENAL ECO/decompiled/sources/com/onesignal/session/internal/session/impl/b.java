package com.onesignal.session.internal.session.impl;

import T1.f;
import g2.InterfaceC0391a;
import java.util.UUID;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l3.InterfaceC0493a;
import l3.InterfaceC0494b;
import o5.InterfaceC0564d;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class b implements InterfaceC0494b, com.onesignal.core.internal.startup.a, com.onesignal.core.internal.startup.b, V1.b, T1.e {
    private final f _applicationService;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final l3.d _sessionModelStore;
    private final InterfaceC0391a _time;
    private com.onesignal.core.internal.config.b config;
    private boolean hasFocused;
    private l3.c session;
    private final com.onesignal.common.events.b sessionLifeCycleNotifier;
    private boolean shouldFireOnSubscribe;

    public static final class a extends j implements InterfaceC0743l {
        final /* synthetic */ long $activeDuration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j4) {
            super(1);
            this.$activeDuration = j4;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0493a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0493a it) {
            i.e(it, "it");
            it.onSessionEnded(this.$activeDuration);
        }
    }

    /* renamed from: com.onesignal.session.internal.session.impl.b$b, reason: collision with other inner class name */
    public static final class C0075b extends j implements InterfaceC0743l {
        public static final C0075b INSTANCE = new C0075b();

        public C0075b() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0493a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0493a it) {
            i.e(it, "it");
            it.onSessionStarted();
        }
    }

    public static final class c extends j implements InterfaceC0743l {
        public static final c INSTANCE = new c();

        public c() {
            super(1);
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0493a) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0493a it) {
            i.e(it, "it");
            it.onSessionActive();
        }
    }

    public static final class d extends j implements InterfaceC0732a {
        final /* synthetic */ boolean $firedOnSubscribe;
        final /* synthetic */ long $focusTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z5, long j4) {
            super(0);
            this.$firedOnSubscribe = z5;
            this.$focusTimeMs = j4;
        }

        @Override // x5.InterfaceC0732a
        public /* bridge */ /* synthetic */ Object invoke() {
            m34invoke();
            return v.f5219a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m34invoke() {
            b.this.handleOnFocus(this.$firedOnSubscribe, this.$focusTimeMs);
        }
    }

    public static final class e extends j implements InterfaceC0732a {
        final /* synthetic */ long $unfocusTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j4) {
            super(0);
            this.$unfocusTimeMs = j4;
        }

        @Override // x5.InterfaceC0732a
        public /* bridge */ /* synthetic */ Object invoke() {
            m35invoke();
            return v.f5219a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m35invoke() {
            b.this.handleOnUnfocused(this.$unfocusTimeMs);
        }
    }

    public b(f _applicationService, com.onesignal.core.internal.config.c _configModelStore, l3.d _sessionModelStore, InterfaceC0391a _time) {
        i.e(_applicationService, "_applicationService");
        i.e(_configModelStore, "_configModelStore");
        i.e(_sessionModelStore, "_sessionModelStore");
        i.e(_time, "_time");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._sessionModelStore = _sessionModelStore;
        this._time = _time;
        this.sessionLifeCycleNotifier = new com.onesignal.common.events.b();
    }

    private final void endSession() {
        l3.c cVar = this.session;
        if (cVar != null && cVar.isValid()) {
            long activeDuration = cVar.getActiveDuration();
            com.onesignal.debug.internal.logging.b.debug$default("SessionService.backgroundRun: Session ended. activeDuration: " + activeDuration, null, 2, null);
            cVar.setValid(false);
            this.sessionLifeCycleNotifier.fire(new a(activeDuration));
            cVar.setActiveDuration(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnFocus(boolean z5, long j4) {
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "SessionService.onFocus() - fired from start: " + z5);
        l3.c cVar = this.session;
        if (cVar == null) {
            com.onesignal.debug.internal.logging.b.warn$default("SessionService.onFocus called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        if (!this.hasFocused) {
            this.hasFocused = true;
            endSession();
        }
        if (cVar.isValid()) {
            cVar.setFocusTime(j4);
            this.sessionLifeCycleNotifier.fire(c.INSTANCE);
            return;
        }
        this.shouldFireOnSubscribe = z5;
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "toString(...)");
        cVar.setSessionId(uuid);
        cVar.setStartTime(j4);
        cVar.setFocusTime(cVar.getStartTime());
        cVar.setValid(true);
        com.onesignal.debug.internal.logging.b.debug$default("SessionService: New session started at " + cVar.getStartTime(), null, 2, null);
        this.sessionLifeCycleNotifier.fire(C0075b.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnUnfocused(long j4) {
        l3.c cVar = this.session;
        if (cVar == null) {
            com.onesignal.debug.internal.logging.b.warn$default("SessionService.onUnfocused called before bootstrap; ignoring.", null, 2, null);
            return;
        }
        long focusTime = j4 - cVar.getFocusTime();
        cVar.setActiveDuration(cVar.getActiveDuration() + focusTime);
        com.onesignal.debug.internal.logging.b.log(i2.c.DEBUG, "SessionService.onUnfocused adding time " + focusTime + " for total: " + cVar.getActiveDuration());
    }

    @Override // V1.b
    public Object backgroundRun(InterfaceC0564d interfaceC0564d) {
        endSession();
        return v.f5219a;
    }

    @Override // com.onesignal.core.internal.startup.a
    public void bootstrap() {
        this.session = (l3.c) this._sessionModelStore.getModel();
        this.config = (com.onesignal.core.internal.config.b) this._configModelStore.getModel();
    }

    @Override // l3.InterfaceC0494b, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.sessionLifeCycleNotifier.getHasSubscribers();
    }

    @Override // V1.b
    public Long getScheduleBackgroundRunIn() {
        com.onesignal.core.internal.config.b bVar;
        l3.c cVar = this.session;
        if (cVar == null || (bVar = this.config) == null || !cVar.isValid()) {
            return null;
        }
        return Long.valueOf(bVar.getSessionFocusTimeout());
    }

    @Override // l3.InterfaceC0494b
    public long getStartTime() {
        l3.c cVar = this.session;
        return cVar != null ? cVar.getStartTime() : this._time.getCurrentTimeMillis();
    }

    @Override // T1.e
    public void onFocus(boolean z5) {
        com.onesignal.common.threading.b.runOnSerialIO(new d(z5, this._time.getCurrentTimeMillis()));
    }

    @Override // T1.e
    public void onUnfocused() {
        com.onesignal.common.threading.b.runOnSerialIO(new e(this._time.getCurrentTimeMillis()));
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this._applicationService.addApplicationLifecycleHandler(this);
    }

    @Override // l3.InterfaceC0494b, com.onesignal.common.events.d
    public void subscribe(InterfaceC0493a handler) {
        i.e(handler, "handler");
        this.sessionLifeCycleNotifier.subscribe(handler);
        if (this.shouldFireOnSubscribe) {
            handler.onSessionStarted();
        }
    }

    @Override // l3.InterfaceC0494b, com.onesignal.common.events.d
    public void unsubscribe(InterfaceC0493a handler) {
        i.e(handler, "handler");
        this.sessionLifeCycleNotifier.unsubscribe(handler);
    }
}
