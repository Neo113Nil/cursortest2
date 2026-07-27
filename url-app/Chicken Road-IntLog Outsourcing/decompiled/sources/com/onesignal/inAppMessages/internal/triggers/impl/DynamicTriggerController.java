package com.onesignal.inAppMessages.internal.triggers.impl;

import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.Trigger;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import com.onesignal.session.internal.session.ISessionService;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class DynamicTriggerController implements IEventNotifier<ITriggerHandler> {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final ISessionService _session;
    private final InAppStateService _state;
    private final ITime _time;
    private final EventProducer<ITriggerHandler> events;
    private final List<String> scheduledMessages;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Trigger.OSTriggerKind.values().length];
            try {
                iArr[Trigger.OSTriggerKind.SESSION_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Trigger.OSTriggerKind.TIME_SINCE_LAST_IN_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Trigger.OSTriggerOperator.values().length];
            try {
                iArr2[Trigger.OSTriggerOperator.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Trigger.OSTriggerOperator.LESS_THAN_OR_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Trigger.OSTriggerOperator.GREATER_THAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Trigger.OSTriggerOperator.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Trigger.OSTriggerOperator.EQUAL_TO.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Trigger.OSTriggerOperator.NOT_EQUAL_TO.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DynamicTriggerController(InAppStateService _state, ISessionService _session, ITime _time) {
        i.e(_state, "_state");
        i.e(_session, "_session");
        i.e(_time, "_time");
        this._state = _state;
        this._session = _session;
        this._time = _time;
        this.events = new EventProducer<>();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double d6, double d7, Trigger.OSTriggerOperator oSTriggerOperator) {
        switch (WhenMappings.$EnumSwitchMapping$1[oSTriggerOperator.ordinal()]) {
            case 1:
                if (d7 < d6) {
                    return true;
                }
                break;
            case 2:
                if (d7 <= d6 || roughlyEqual(d6, d7)) {
                    return true;
                }
                break;
            case 3:
                if (d7 >= d6) {
                    return true;
                }
                break;
            case 4:
                if (d7 >= d6 || roughlyEqual(d6, d7)) {
                    return true;
                }
                break;
            case 5:
                return roughlyEqual(d6, d7);
            case 6:
                if (!roughlyEqual(d6, d7)) {
                    return true;
                }
                break;
            default:
                Logging.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + oSTriggerOperator, null, 2, null);
                break;
        }
        return false;
    }

    private final boolean roughlyEqual(double d6, double d7) {
        return Math.abs(d6 - d7) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:8:0x0014, B:12:0x001e, B:17:0x0066, B:19:0x008c, B:26:0x00a2, B:30:0x00ac, B:33:0x0033, B:37:0x003d, B:41:0x0049, B:42:0x0064, B:43:0x0058), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dynamicTriggerShouldFire(Trigger trigger) {
        long currentTimeMillis;
        long startTime;
        long j2;
        long j6;
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
                int i2 = WhenMappings.$EnumSwitchMapping$0[trigger.getKind().ordinal()];
                if (i2 == 1) {
                    currentTimeMillis = this._time.getCurrentTimeMillis();
                    startTime = this._session.getStartTime();
                } else {
                    if (i2 != 2) {
                        j6 = 0;
                        final String triggerId = trigger.getTriggerId();
                        Number number = (Number) trigger.getValue();
                        i.b(number);
                        doubleValue = (long) (number.doubleValue() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j6, trigger.getOperatorType())) {
                            this.events.fire(new DynamicTriggerController$dynamicTriggerShouldFire$1$1(triggerId));
                            return true;
                        }
                        long j7 = doubleValue - j6;
                        if (j7 <= 0) {
                            return false;
                        }
                        if (this.scheduledMessages.contains(triggerId)) {
                            return false;
                        }
                        DynamicTriggerTimer.INSTANCE.scheduleTrigger(new TimerTask() { // from class: com.onesignal.inAppMessages.internal.triggers.impl.DynamicTriggerController$dynamicTriggerShouldFire$1$2
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                List list;
                                list = DynamicTriggerController.this.scheduledMessages;
                                list.remove(triggerId);
                                DynamicTriggerController.this.getEvents().fire(new DynamicTriggerController$dynamicTriggerShouldFire$1$2$run$1(triggerId));
                            }
                        }, triggerId, j7);
                        this.scheduledMessages.add(triggerId);
                        return false;
                    }
                    if (this._state.getInAppMessageIdShowing() != null) {
                        return false;
                    }
                    Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                    if (lastTimeInAppDismissed == null) {
                        j2 = DEFAULT_LAST_IN_APP_TIME_AGO;
                        j6 = j2;
                        final String triggerId2 = trigger.getTriggerId();
                        Number number2 = (Number) trigger.getValue();
                        i.b(number2);
                        doubleValue = (long) (number2.doubleValue() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j6, trigger.getOperatorType())) {
                        }
                    } else {
                        currentTimeMillis = this._time.getCurrentTimeMillis();
                        startTime = lastTimeInAppDismissed.longValue();
                    }
                }
                j2 = currentTimeMillis - startTime;
                j6 = j2;
                final String triggerId22 = trigger.getTriggerId();
                Number number22 = (Number) trigger.getValue();
                i.b(number22);
                doubleValue = (long) (number22.doubleValue() * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                if (evaluateTimeIntervalWithOperator(doubleValue, j6, trigger.getOperatorType())) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final EventProducer<ITriggerHandler> getEvents() {
        return this.events;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ITriggerHandler handler) {
        i.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ITriggerHandler handler) {
        i.e(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
