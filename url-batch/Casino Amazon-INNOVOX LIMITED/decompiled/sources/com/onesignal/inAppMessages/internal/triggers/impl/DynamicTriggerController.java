package com.onesignal.inAppMessages.internal.triggers.impl;

import com.facebook.react.uimanager.ViewProps;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.core.internal.time.ITime;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.Trigger;
import com.onesignal.inAppMessages.internal.state.InAppStateService;
import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import com.onesignal.session.internal.session.ISessionService;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DynamicTriggerController.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/onesignal/inAppMessages/internal/triggers/impl/DynamicTriggerController;", "Lcom/onesignal/common/events/IEventNotifier;", "Lcom/onesignal/inAppMessages/internal/triggers/ITriggerHandler;", "_state", "Lcom/onesignal/inAppMessages/internal/state/InAppStateService;", "_session", "Lcom/onesignal/session/internal/session/ISessionService;", "_time", "Lcom/onesignal/core/internal/time/ITime;", "(Lcom/onesignal/inAppMessages/internal/state/InAppStateService;Lcom/onesignal/session/internal/session/ISessionService;Lcom/onesignal/core/internal/time/ITime;)V", "events", "Lcom/onesignal/common/events/EventProducer;", "getEvents", "()Lcom/onesignal/common/events/EventProducer;", "hasSubscribers", "", "getHasSubscribers", "()Z", "scheduledMessages", "", "", "dynamicTriggerShouldFire", "trigger", "Lcom/onesignal/inAppMessages/internal/Trigger;", "evaluateTimeIntervalWithOperator", "timeInterval", "", "currentTimeInterval", "operator", "Lcom/onesignal/inAppMessages/internal/Trigger$OSTriggerOperator;", "roughlyEqual", ViewProps.LEFT, ViewProps.RIGHT, "subscribe", "", "handler", "unsubscribe", "Companion", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicTriggerController implements IEventNotifier<ITriggerHandler> {
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final ISessionService _session;
    private final InAppStateService _state;
    private final ITime _time;
    private final EventProducer<ITriggerHandler> events;
    private final List<String> scheduledMessages;

    /* compiled from: DynamicTriggerController.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
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
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_session, "_session");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._state = _state;
        this._session = _session;
        this._time = _time;
        this.events = new EventProducer<>();
        this.scheduledMessages = new ArrayList();
    }

    public final EventProducer<ITriggerHandler> getEvents() {
        return this.events;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x00b7, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0014, B:12:0x001e, B:17:0x0063, B:19:0x0085, B:26:0x009a, B:30:0x00a4, B:33:0x0034, B:37:0x003e, B:41:0x004a, B:42:0x0061, B:43:0x0055), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dynamicTriggerShouldFire(Trigger trigger) {
        long currentTimeMillis;
        long startTime;
        long j;
        long j2;
        long doubleValue;
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (trigger.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            if (!(trigger.getValue() instanceof Number)) {
                return false;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[trigger.getKind().ordinal()];
            if (i == 1) {
                currentTimeMillis = this._time.getCurrentTimeMillis();
                startTime = this._session.getStartTime();
            } else if (i == 2) {
                if (this._state.getInAppMessageIdShowing() != null) {
                    return false;
                }
                Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                if (lastTimeInAppDismissed != null) {
                    currentTimeMillis = this._time.getCurrentTimeMillis();
                    startTime = lastTimeInAppDismissed.longValue();
                } else {
                    j = DEFAULT_LAST_IN_APP_TIME_AGO;
                    j2 = j;
                    final String triggerId = trigger.getTriggerId();
                    Number number = (Number) trigger.getValue();
                    Intrinsics.checkNotNull(number);
                    doubleValue = (long) (number.doubleValue() * 1000);
                    if (evaluateTimeIntervalWithOperator(doubleValue, j2, trigger.getOperatorType())) {
                    }
                }
            } else {
                j2 = 0;
                final String triggerId2 = trigger.getTriggerId();
                Number number2 = (Number) trigger.getValue();
                Intrinsics.checkNotNull(number2);
                doubleValue = (long) (number2.doubleValue() * 1000);
                if (evaluateTimeIntervalWithOperator(doubleValue, j2, trigger.getOperatorType())) {
                    this.events.fire(new Function1<ITriggerHandler, Unit>() { // from class: com.onesignal.inAppMessages.internal.triggers.impl.DynamicTriggerController$dynamicTriggerShouldFire$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ITriggerHandler iTriggerHandler) {
                            invoke2(iTriggerHandler);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ITriggerHandler it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            it.onTriggerCompleted(triggerId2);
                        }
                    });
                    return true;
                }
                long j3 = doubleValue - j2;
                if (j3 <= 0) {
                    return false;
                }
                if (this.scheduledMessages.contains(triggerId2)) {
                    return false;
                }
                DynamicTriggerTimer.INSTANCE.scheduleTrigger(new TimerTask() { // from class: com.onesignal.inAppMessages.internal.triggers.impl.DynamicTriggerController$dynamicTriggerShouldFire$1$2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        List list;
                        list = DynamicTriggerController.this.scheduledMessages;
                        list.remove(triggerId2);
                        EventProducer<ITriggerHandler> events = DynamicTriggerController.this.getEvents();
                        final String str = triggerId2;
                        events.fire(new Function1<ITriggerHandler, Unit>() { // from class: com.onesignal.inAppMessages.internal.triggers.impl.DynamicTriggerController$dynamicTriggerShouldFire$1$2$run$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ITriggerHandler iTriggerHandler) {
                                invoke2(iTriggerHandler);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ITriggerHandler it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                it.onTriggerConditionChanged(str);
                            }
                        });
                    }
                }, triggerId2, j3);
                this.scheduledMessages.add(triggerId2);
                return false;
            }
            j = currentTimeMillis - startTime;
            j2 = j;
            final String triggerId22 = trigger.getTriggerId();
            Number number22 = (Number) trigger.getValue();
            Intrinsics.checkNotNull(number22);
            doubleValue = (long) (number22.doubleValue() * 1000);
            if (evaluateTimeIntervalWithOperator(doubleValue, j2, trigger.getOperatorType())) {
            }
        }
    }

    private final boolean evaluateTimeIntervalWithOperator(double timeInterval, double currentTimeInterval, Trigger.OSTriggerOperator operator) {
        switch (WhenMappings.$EnumSwitchMapping$1[operator.ordinal()]) {
            case 1:
                return currentTimeInterval < timeInterval;
            case 2:
                return currentTimeInterval <= timeInterval || roughlyEqual(timeInterval, currentTimeInterval);
            case 3:
                return currentTimeInterval >= timeInterval;
            case 4:
                return currentTimeInterval >= timeInterval || roughlyEqual(timeInterval, currentTimeInterval);
            case 5:
                return roughlyEqual(timeInterval, currentTimeInterval);
            case 6:
                return !roughlyEqual(timeInterval, currentTimeInterval);
            default:
                Logging.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + operator, null, 2, null);
                return false;
        }
    }

    private final boolean roughlyEqual(double left, double right) {
        return Math.abs(left - right) < REQUIRED_ACCURACY;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ITriggerHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ITriggerHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.unsubscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }
}
