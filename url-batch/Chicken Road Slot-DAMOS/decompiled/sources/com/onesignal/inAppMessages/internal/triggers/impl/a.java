package com.onesignal.inAppMessages.internal.triggers.impl;

import a4.j;
import com.onesignal.inAppMessages.internal.m;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements com.onesignal.common.events.d {
    public static final C0037a Companion = new C0037a(null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final sc.b _session;
    private final gb.a _state;
    private final sa.a _time;
    private final com.onesignal.common.events.b events;
    private final List<String> scheduledMessages;

    public a(gb.a aVar, sc.b bVar, sa.a aVar2) {
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this._state = aVar;
        this._session = bVar;
        this._time = aVar2;
        this.events = new com.onesignal.common.events.b();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double d10, double d11, m.b bVar) {
        switch (com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case 1:
                return d11 < d10;
            case 2:
                return d11 <= d10 || roughlyEqual(d10, d11);
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return d11 >= d10;
            case j.LONG_FIELD_NUMBER /* 4 */:
                return d11 >= d10 || roughlyEqual(d10, d11);
            case j.STRING_FIELD_NUMBER /* 5 */:
                return roughlyEqual(d10, d11);
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return !roughlyEqual(d10, d11);
            default:
                com.onesignal.debug.internal.logging.b.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar, null, 2, null);
                return false;
        }
    }

    private final boolean roughlyEqual(double d10, double d11) {
        return Math.abs(d10 - d11) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:8:0x0010, B:12:0x001a, B:17:0x0063, B:19:0x0085, B:26:0x0098, B:30:0x00a2, B:33:0x0030, B:37:0x003a, B:41:0x0046, B:42:0x0061, B:43:0x0055), top: B:7:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dynamicTriggerShouldFire(m mVar) {
        long currentTimeMillis;
        long startTime;
        long j;
        long j3;
        long doubleValue;
        mVar.getClass();
        if (mVar.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            try {
                if (!(mVar.getValue() instanceof Number)) {
                    return false;
                }
                int i3 = com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$0[mVar.getKind().ordinal()];
                if (i3 == 1) {
                    currentTimeMillis = this._time.getCurrentTimeMillis();
                    startTime = this._session.getStartTime();
                } else {
                    if (i3 != 2) {
                        j3 = 0;
                        String triggerId = mVar.getTriggerId();
                        Number number = (Number) mVar.getValue();
                        number.getClass();
                        doubleValue = (long) (number.doubleValue() * 1000);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j3, mVar.getOperatorType())) {
                            this.events.fire(new b(triggerId));
                            return true;
                        }
                        long j10 = doubleValue - j3;
                        if (j10 <= 0) {
                            return false;
                        }
                        if (this.scheduledMessages.contains(triggerId)) {
                            return false;
                        }
                        com.onesignal.inAppMessages.internal.triggers.impl.c.INSTANCE.scheduleTrigger(new c(triggerId), triggerId, j10);
                        this.scheduledMessages.add(triggerId);
                        return false;
                    }
                    if (this._state.getInAppMessageIdShowing() != null) {
                        return false;
                    }
                    Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                    if (lastTimeInAppDismissed == null) {
                        j = DEFAULT_LAST_IN_APP_TIME_AGO;
                        j3 = j;
                        String triggerId2 = mVar.getTriggerId();
                        Number number2 = (Number) mVar.getValue();
                        number2.getClass();
                        doubleValue = (long) (number2.doubleValue() * 1000);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j3, mVar.getOperatorType())) {
                        }
                    } else {
                        currentTimeMillis = this._time.getCurrentTimeMillis();
                        startTime = lastTimeInAppDismissed.longValue();
                    }
                }
                j = currentTimeMillis - startTime;
                j3 = j;
                String triggerId22 = mVar.getTriggerId();
                Number number22 = (Number) mVar.getValue();
                number22.getClass();
                doubleValue = (long) (number22.doubleValue() * 1000);
                if (evaluateTimeIntervalWithOperator(doubleValue, j3, mVar.getOperatorType())) {
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
    public void subscribe(hb.b bVar) {
        bVar.getClass();
        this.events.subscribe(bVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(hb.b bVar) {
        bVar.getClass();
        this.events.unsubscribe(bVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$a, reason: collision with other inner class name */
    public static final class C0037a {
        public /* synthetic */ C0037a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0037a() {
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class c extends TimerTask {
        final /* synthetic */ String $triggerId;

        public c(String str) {
            this.$triggerId = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.scheduledMessages.remove(this.$triggerId);
            a.this.getEvents().fire(new C0038a(this.$triggerId));
        }

        /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
        /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$c$a, reason: collision with other inner class name */
        public static final class C0038a extends p implements Function1 {
            final /* synthetic */ String $triggerId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0038a(String str) {
                super(1);
                this.$triggerId = str;
            }

            public final void invoke(hb.b bVar) {
                bVar.getClass();
                bVar.onTriggerConditionChanged(this.$triggerId);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((hb.b) obj);
                return Unit.f5554a;
            }
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function1 {
        final /* synthetic */ String $triggerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$triggerId = str;
        }

        public final void invoke(hb.b bVar) {
            bVar.getClass();
            bVar.onTriggerCompleted(this.$triggerId);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((hb.b) obj);
            return Unit.f5554a;
        }
    }
}
