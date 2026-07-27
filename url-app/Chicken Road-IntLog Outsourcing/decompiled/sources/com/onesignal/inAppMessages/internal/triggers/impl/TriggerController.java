package com.onesignal.inAppMessages.internal.triggers.impl;

import C1.b;
import com.onesignal.common.modeling.IModelStoreChangeHandler;
import com.onesignal.common.modeling.Model;
import com.onesignal.common.modeling.ModelChangedArgs;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessage;
import com.onesignal.inAppMessages.internal.Trigger;
import com.onesignal.inAppMessages.internal.triggers.ITriggerController;
import com.onesignal.inAppMessages.internal.triggers.ITriggerHandler;
import com.onesignal.inAppMessages.internal.triggers.TriggerModel;
import com.onesignal.inAppMessages.internal.triggers.TriggerModelStore;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class TriggerController implements ITriggerController, IModelStoreChangeHandler<TriggerModel> {
    private DynamicTriggerController _dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Trigger.OSTriggerOperator.values().length];
            try {
                iArr[Trigger.OSTriggerOperator.EQUAL_TO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Trigger.OSTriggerOperator.NOT_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Trigger.OSTriggerOperator.EXISTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Trigger.OSTriggerOperator.CONTAINS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Trigger.OSTriggerOperator.NOT_EXISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Trigger.OSTriggerOperator.LESS_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Trigger.OSTriggerOperator.GREATER_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Trigger.OSTriggerOperator.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Trigger.OSTriggerOperator.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TriggerController(TriggerModelStore triggerModelStore, DynamicTriggerController _dynamicTriggerController) {
        i.e(triggerModelStore, "triggerModelStore");
        i.e(_dynamicTriggerController, "_dynamicTriggerController");
        this._dynamicTriggerController = _dynamicTriggerController;
        this.triggers = new ConcurrentHashMap<>();
        triggerModelStore.subscribe((IModelStoreChangeHandler) this);
    }

    private final void addTriggers(String str, Object obj) {
        synchronized (this.triggers) {
            this.triggers.put(str, obj);
        }
    }

    private final boolean evaluateAndTriggers(List<Trigger> list) {
        Iterator<Trigger> it = list.iterator();
        while (it.hasNext()) {
            if (!evaluateTrigger(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final boolean evaluateTrigger(Trigger trigger) {
        if (trigger.getKind() == Trigger.OSTriggerKind.UNKNOWN) {
            return false;
        }
        if (trigger.getKind() != Trigger.OSTriggerKind.CUSTOM) {
            return this._dynamicTriggerController.dynamicTriggerShouldFire(trigger);
        }
        Trigger.OSTriggerOperator operatorType = trigger.getOperatorType();
        Object obj = this.triggers.get(trigger.getProperty());
        if (obj == null) {
            return operatorType == Trigger.OSTriggerOperator.NOT_EXISTS;
        }
        if (operatorType == Trigger.OSTriggerOperator.EXISTS) {
            return true;
        }
        if (operatorType == Trigger.OSTriggerOperator.NOT_EXISTS) {
            return false;
        }
        if (operatorType == Trigger.OSTriggerOperator.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(trigger.getValue());
        }
        if ((obj instanceof String) && (trigger.getValue() instanceof String)) {
            String str = (String) trigger.getValue();
            i.b(str);
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((trigger.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) trigger.getValue();
            i.b(number);
            if (triggerMatchesNumericValue(number, (Number) obj, operatorType)) {
                return true;
            }
        }
        return triggerMatchesFlex(trigger.getValue(), obj, operatorType);
    }

    private final void removeTriggersForKeys(String str) {
        synchronized (this.triggers) {
            this.triggers.remove(str);
        }
    }

    private final boolean triggerMatchesFlex(Object obj, Object obj2, Trigger.OSTriggerOperator oSTriggerOperator) {
        if (obj == null) {
            return false;
        }
        if (!oSTriggerOperator.checksEquality()) {
            if ((obj2 instanceof String) && (obj instanceof Number)) {
                return triggerMatchesNumericValueFlex((Number) obj, (String) obj2, oSTriggerOperator);
            }
            return false;
        }
        String obj3 = obj.toString();
        String obj4 = obj2.toString();
        if (obj2 instanceof Number) {
            obj4 = new DecimalFormat("0.#").format(obj2);
            i.d(obj4, "format(...)");
        }
        return triggerMatchesStringValue(obj3, obj4, oSTriggerOperator);
    }

    private final boolean triggerMatchesNumericValue(Number number, Number number2, Trigger.OSTriggerOperator oSTriggerOperator) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (WhenMappings.$EnumSwitchMapping$0[oSTriggerOperator.ordinal()]) {
            case 1:
                if (doubleValue2 == doubleValue) {
                    return true;
                }
                break;
            case 2:
                if (doubleValue2 != doubleValue) {
                    return true;
                }
                break;
            case 3:
            case 4:
            case 5:
                Logging.error$default("Attempted to use an invalid operator with a numeric value: " + oSTriggerOperator, null, 2, null);
                break;
            case 6:
                if (doubleValue2 < doubleValue) {
                    return true;
                }
                break;
            case 7:
                if (doubleValue2 > doubleValue) {
                    return true;
                }
                break;
            case 8:
                if (doubleValue2 < doubleValue || doubleValue2 == doubleValue) {
                    return true;
                }
                break;
            case 9:
                if (doubleValue2 > doubleValue || doubleValue2 == doubleValue) {
                    return true;
                }
                break;
            default:
                throw new b();
        }
        return false;
    }

    private final boolean triggerMatchesNumericValueFlex(Number number, String str, Trigger.OSTriggerOperator oSTriggerOperator) {
        try {
            return triggerMatchesNumericValue(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), oSTriggerOperator);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private final boolean triggerMatchesStringValue(String str, String str2, Trigger.OSTriggerOperator oSTriggerOperator) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[oSTriggerOperator.ordinal()];
        if (i2 == 1) {
            return i.a(str, str2);
        }
        if (i2 != 2) {
            Logging.error$default("Attempted to use an invalid operator for a string trigger comparison: " + oSTriggerOperator, null, 2, null);
        } else if (!i.a(str, str2)) {
            return true;
        }
        return false;
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerController
    public boolean evaluateMessageTriggers(InAppMessage message) {
        i.e(message, "message");
        if (message.getTriggers().isEmpty()) {
            return true;
        }
        Iterator<List<Trigger>> it = message.getTriggers().iterator();
        while (it.hasNext()) {
            if (evaluateAndTriggers(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerController
    public boolean isTriggerOnMessage(InAppMessage message, Collection<String> triggersKeys) {
        i.e(message, "message");
        i.e(triggersKeys, "triggersKeys");
        if (message.getTriggers() == null) {
            return false;
        }
        for (String str : triggersKeys) {
            Iterator<List<Trigger>> it = message.getTriggers().iterator();
            while (it.hasNext()) {
                for (Trigger trigger : it.next()) {
                    if (i.a(str, trigger.getProperty()) || i.a(str, trigger.getTriggerId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.onesignal.inAppMessages.internal.triggers.ITriggerController
    public boolean messageHasOnlyDynamicTriggers(InAppMessage message) {
        i.e(message, "message");
        if (message.getTriggers() == null || message.getTriggers().isEmpty()) {
            return false;
        }
        Iterator<List<Trigger>> it = message.getTriggers().iterator();
        while (it.hasNext()) {
            for (Trigger trigger : it.next()) {
                if (trigger.getKind() == Trigger.OSTriggerKind.CUSTOM || trigger.getKind() == Trigger.OSTriggerKind.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelUpdated(ModelChangedArgs args, String tag) {
        i.e(args, "args");
        i.e(tag, "tag");
        Model model = args.getModel();
        i.c(model, "null cannot be cast to non-null type com.onesignal.inAppMessages.internal.triggers.TriggerModel");
        TriggerModel triggerModel = (TriggerModel) model;
        addTriggers(triggerModel.getKey(), triggerModel.getValue());
        this._dynamicTriggerController.getEvents().fire(new TriggerController$onModelUpdated$1(triggerModel));
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelAdded(TriggerModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        addTriggers(model.getKey(), model.getValue());
        this._dynamicTriggerController.getEvents().fire(new TriggerController$onModelAdded$1(model));
    }

    @Override // com.onesignal.common.modeling.IModelStoreChangeHandler
    public void onModelRemoved(TriggerModel model, String tag) {
        i.e(model, "model");
        i.e(tag, "tag");
        removeTriggersForKeys(model.getKey());
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(ITriggerHandler handler) {
        i.e(handler, "handler");
        this._dynamicTriggerController.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(ITriggerHandler handler) {
        i.e(handler, "handler");
        this._dynamicTriggerController.unsubscribe(handler);
    }
}
