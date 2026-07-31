package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.m;
import g2.InterfaceC0391a;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import k5.v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import l3.InterfaceC0494b;
import v2.C0705a;
import w2.InterfaceC0718b;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class a implements com.onesignal.common.events.d {
    public static final C0044a Companion = new C0044a(null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final InterfaceC0494b _session;
    private final C0705a _state;
    private final InterfaceC0391a _time;
    private final com.onesignal.common.events.b events;
    private final List<String> scheduledMessages;

    /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$a, reason: collision with other inner class name */
    public static final class C0044a {
        public /* synthetic */ C0044a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0044a() {
        }
    }

    public static final class b extends j implements InterfaceC0743l {
        final /* synthetic */ String $triggerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$triggerId = str;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC0718b) obj);
            return v.f5219a;
        }

        public final void invoke(InterfaceC0718b it) {
            i.e(it, "it");
            it.onTriggerCompleted(this.$triggerId);
        }
    }

    public static final class c extends TimerTask {
        final /* synthetic */ String $triggerId;

        /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$c$a, reason: collision with other inner class name */
        public static final class C0045a extends j implements InterfaceC0743l {
            final /* synthetic */ String $triggerId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0045a(String str) {
                super(1);
                this.$triggerId = str;
            }

            @Override // x5.InterfaceC0743l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC0718b) obj);
                return v.f5219a;
            }

            public final void invoke(InterfaceC0718b it) {
                i.e(it, "it");
                it.onTriggerConditionChanged(this.$triggerId);
            }
        }

        public c(String str) {
            this.$triggerId = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.scheduledMessages.remove(this.$triggerId);
            a.this.getEvents().fire(new C0045a(this.$triggerId));
        }
    }

    public a(C0705a _state, InterfaceC0494b _session, InterfaceC0391a _time) {
        i.e(_state, "_state");
        i.e(_session, "_session");
        i.e(_time, "_time");
        this._state = _state;
        this._session = _session;
        this._time = _time;
        this.events = new com.onesignal.common.events.b();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double d7, double d8, m.b bVar) {
        switch (com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return d8 < d7;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return d8 <= d7 || roughlyEqual(d7, d8);
            case 3:
                return d8 >= d7;
            case 4:
                return d8 >= d7 || roughlyEqual(d7, d8);
            case 5:
                return roughlyEqual(d7, d8);
            case 6:
                return !roughlyEqual(d7, d8);
            default:
                com.onesignal.debug.internal.logging.b.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar, null, 2, null);
                return false;
        }
    }

    private final boolean roughlyEqual(double d7, double d8) {
        return Math.abs(d7 - d8) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:8:0x0014, B:12:0x001e, B:17:0x0067, B:19:0x0089, B:26:0x009c, B:30:0x00a6, B:33:0x0034, B:37:0x003e, B:41:0x004a, B:42:0x0065, B:43:0x0059), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dynamicTriggerShouldFire(m trigger) {
        long currentTimeMillis;
        long startTime;
        long j4;
        long j7;
        long doubleValue;
        i.e(trigger, "trigger");
        if (trigger.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            try {
                if (!(trigger.getValue() instanceof Number)) {
                    return false;
                }
                int i7 = com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$0[trigger.getKind().ordinal()];
                if (i7 == 1) {
                    currentTimeMillis = this._time.getCurrentTimeMillis();
                    startTime = this._session.getStartTime();
                } else {
                    if (i7 != 2) {
                        j7 = 0;
                        String triggerId = trigger.getTriggerId();
                        Number number = (Number) trigger.getValue();
                        i.b(number);
                        doubleValue = (long) (number.doubleValue() * 1000);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j7, trigger.getOperatorType())) {
                            this.events.fire(new b(triggerId));
                            return true;
                        }
                        long j8 = doubleValue - j7;
                        if (j8 <= 0) {
                            return false;
                        }
                        if (this.scheduledMessages.contains(triggerId)) {
                            return false;
                        }
                        com.onesignal.inAppMessages.internal.triggers.impl.c.INSTANCE.scheduleTrigger(new c(triggerId), triggerId, j8);
                        this.scheduledMessages.add(triggerId);
                        return false;
                    }
                    if (this._state.getInAppMessageIdShowing() != null) {
                        return false;
                    }
                    Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                    if (lastTimeInAppDismissed == null) {
                        j4 = DEFAULT_LAST_IN_APP_TIME_AGO;
                        j7 = j4;
                        String triggerId2 = trigger.getTriggerId();
                        Number number2 = (Number) trigger.getValue();
                        i.b(number2);
                        doubleValue = (long) (number2.doubleValue() * 1000);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j7, trigger.getOperatorType())) {
                        }
                    } else {
                        currentTimeMillis = this._time.getCurrentTimeMillis();
                        startTime = lastTimeInAppDismissed.longValue();
                    }
                }
                j4 = currentTimeMillis - startTime;
                j7 = j4;
                String triggerId22 = trigger.getTriggerId();
                Number number22 = (Number) trigger.getValue();
                i.b(number22);
                doubleValue = (long) (number22.doubleValue() * 1000);
                if (evaluateTimeIntervalWithOperator(doubleValue, j7, trigger.getOperatorType())) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.onesignal.common.events.b getEvents() {
        return this.events;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(InterfaceC0718b handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(InterfaceC0718b handler) {
        i.e(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
