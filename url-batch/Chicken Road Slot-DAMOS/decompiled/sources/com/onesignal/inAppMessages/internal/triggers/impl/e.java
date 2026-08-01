package com.onesignal.inAppMessages.internal.triggers.impl;

import a2.r;
import a4.j;
import com.onesignal.common.modeling.i;
import com.onesignal.inAppMessages.internal.m;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements hb.a, com.onesignal.common.modeling.d {
    private com.onesignal.inAppMessages.internal.triggers.impl.a _dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers;

    public e(hb.d dVar, com.onesignal.inAppMessages.internal.triggers.impl.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this._dynamicTriggerController = aVar;
        this.triggers = new ConcurrentHashMap<>();
        dVar.subscribe((com.onesignal.common.modeling.d) this);
    }

    private final void addTriggers(String str, Object obj) {
        synchronized (this.triggers) {
            this.triggers.put(str, obj);
        }
    }

    private final boolean evaluateAndTriggers(List<m> list) {
        Iterator<m> it = list.iterator();
        while (it.hasNext()) {
            if (!evaluateTrigger(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final boolean evaluateTrigger(m mVar) {
        if (mVar.getKind() == m.a.UNKNOWN) {
            return false;
        }
        if (mVar.getKind() != m.a.CUSTOM) {
            return this._dynamicTriggerController.dynamicTriggerShouldFire(mVar);
        }
        m.b operatorType = mVar.getOperatorType();
        Object obj = this.triggers.get(mVar.getProperty());
        if (obj == null) {
            return operatorType == m.b.NOT_EXISTS;
        }
        if (operatorType == m.b.EXISTS) {
            return true;
        }
        if (operatorType == m.b.NOT_EXISTS) {
            return false;
        }
        if (operatorType == m.b.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(mVar.getValue());
        }
        if ((obj instanceof String) && (mVar.getValue() instanceof String)) {
            String str = (String) mVar.getValue();
            str.getClass();
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((mVar.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) mVar.getValue();
            number.getClass();
            if (triggerMatchesNumericValue(number, (Number) obj, operatorType)) {
                return true;
            }
        }
        return triggerMatchesFlex(mVar.getValue(), obj, operatorType);
    }

    private final void removeTriggersForKeys(String str) {
        synchronized (this.triggers) {
            this.triggers.remove(str);
        }
    }

    private final boolean triggerMatchesFlex(Object obj, Object obj2, m.b bVar) {
        if (obj == null) {
            return false;
        }
        if (!bVar.checksEquality()) {
            if ((obj2 instanceof String) && (obj instanceof Number)) {
                return triggerMatchesNumericValueFlex((Number) obj, (String) obj2, bVar);
            }
            return false;
        }
        String obj3 = obj.toString();
        String obj4 = obj2.toString();
        if (obj2 instanceof Number) {
            obj4 = new DecimalFormat("0.#").format(obj2);
            obj4.getClass();
        }
        return triggerMatchesStringValue(obj3, obj4, bVar);
    }

    private final boolean triggerMatchesNumericValue(Number number, Number number2, m.b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (d.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
                if (doubleValue2 == doubleValue) {
                }
                break;
            case 2:
                if (doubleValue2 == doubleValue) {
                }
                break;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
            case j.LONG_FIELD_NUMBER /* 4 */:
            case j.STRING_FIELD_NUMBER /* 5 */:
                com.onesignal.debug.internal.logging.b.error$default("Attempted to use an invalid operator with a numeric value: " + bVar, null, 2, null);
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                if (doubleValue2 < doubleValue) {
                }
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                if (doubleValue2 > doubleValue) {
                }
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                if (doubleValue2 < doubleValue || doubleValue2 == doubleValue) {
                }
                break;
            case 9:
                if (doubleValue2 > doubleValue || doubleValue2 == doubleValue) {
                }
                break;
            default:
                r.p();
                break;
        }
        return false;
    }

    private final boolean triggerMatchesNumericValueFlex(Number number, String str, m.b bVar) {
        try {
            return triggerMatchesNumericValue(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private final boolean triggerMatchesStringValue(String str, String str2, m.b bVar) {
        int i3 = d.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i3 == 1) {
            return Intrinsics.a(str, str2);
        }
        if (i3 == 2) {
            return !Intrinsics.a(str, str2);
        }
        com.onesignal.debug.internal.logging.b.error$default("Attempted to use an invalid operator for a string trigger comparison: " + bVar, null, 2, null);
        return false;
    }

    @Override // hb.a
    public boolean evaluateMessageTriggers(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        if (aVar.getTriggers().isEmpty()) {
            return true;
        }
        Iterator<List<m>> it = aVar.getTriggers().iterator();
        while (it.hasNext()) {
            if (evaluateAndTriggers(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // hb.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    @Override // hb.a
    public boolean isTriggerOnMessage(com.onesignal.inAppMessages.internal.a aVar, Collection<String> collection) {
        aVar.getClass();
        collection.getClass();
        if (aVar.getTriggers() == null) {
            return false;
        }
        for (String str : collection) {
            Iterator<List<m>> it = aVar.getTriggers().iterator();
            while (it.hasNext()) {
                for (m mVar : it.next()) {
                    if (Intrinsics.a(str, mVar.getProperty()) || Intrinsics.a(str, mVar.getTriggerId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // hb.a
    public boolean messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a aVar) {
        aVar.getClass();
        if (aVar.getTriggers() == null || aVar.getTriggers().isEmpty()) {
            return false;
        }
        Iterator<List<m>> it = aVar.getTriggers().iterator();
        while (it.hasNext()) {
            for (m mVar : it.next()) {
                if (mVar.getKind() == m.a.CUSTOM || mVar.getKind() == m.a.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(hb.c cVar, String str) {
        cVar.getClass();
        str.getClass();
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new a(cVar));
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(hb.c cVar, String str) {
        cVar.getClass();
        str.getClass();
        removeTriggersForKeys(cVar.getKey());
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        jVar.getClass();
        str.getClass();
        i model = jVar.getModel();
        model.getClass();
        hb.c cVar = (hb.c) model;
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new b(cVar));
    }

    @Override // hb.a, com.onesignal.common.events.d
    public void subscribe(hb.b bVar) {
        bVar.getClass();
        this._dynamicTriggerController.subscribe(bVar);
    }

    @Override // hb.a, com.onesignal.common.events.d
    public void unsubscribe(hb.b bVar) {
        bVar.getClass();
        this._dynamicTriggerController.unsubscribe(bVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        final /* synthetic */ hb.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hb.c cVar) {
            super(1);
            this.$model = cVar;
        }

        public final void invoke(hb.b bVar) {
            bVar.getClass();
            bVar.onTriggerChanged(this.$model.getKey());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((hb.b) obj);
            return Unit.f5554a;
        }
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class b extends p implements Function1 {
        final /* synthetic */ hb.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hb.c cVar) {
            super(1);
            this.$model = cVar;
        }

        public final void invoke(hb.b bVar) {
            bVar.getClass();
            bVar.onTriggerChanged(this.$model.getKey());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((hb.b) obj);
            return Unit.f5554a;
        }
    }
}
