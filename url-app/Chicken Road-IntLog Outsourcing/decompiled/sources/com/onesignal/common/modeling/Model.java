package com.onesignal.common.modeling;

import B4.r;
import com.onesignal.common.events.EventProducer;
import com.onesignal.common.events.IEventNotifier;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import g4.AbstractC0476u;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public class Model implements IEventNotifier<IModelChangedHandler> {
    private Model _parentModel;
    private final String _parentProperty;
    private final EventProducer<IModelChangedHandler> changeNotifier;
    private final Map<String, Object> data;

    /* JADX WARN: Multi-variable type inference failed */
    public Model() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Object getAnyProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnyProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getAnyProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getBigDecimalProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ boolean getBooleanProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getBooleanProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ double getDoubleProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoubleProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getDoubleProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ float getFloatProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloatProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getFloatProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ int getIntProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getIntProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ List getListProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getListProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ long getLongProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLongProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getLongProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ MapModel getMapModelProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapModelProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getMapModelProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ Object getOptAnyProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptAnyProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptBigDecimalProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ Boolean getOptBooleanProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptBooleanProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ Double getOptDoubleProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptDoubleProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ Float getOptFloatProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptFloatProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ Integer getOptIntProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptIntProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptIntProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ List getOptListProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptListProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptListProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ Long getOptLongProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptLongProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptLongProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ MapModel getOptMapModelProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptMapModelProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ String getOptStringProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptStringProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getOptStringProperty(str, interfaceC1430a);
    }

    public static /* synthetic */ String getStringProperty$default(Model model, String str, InterfaceC1430a interfaceC1430a, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringProperty");
        }
        if ((i2 & 2) != 0) {
            interfaceC1430a = null;
        }
        return model.getStringProperty(str, interfaceC1430a);
    }

    private final void notifyChanged(String str, String str2, String str3, Object obj, Object obj2) {
        this.changeNotifier.fire(new Model$notifyChanged$1(new ModelChangedArgs(this, str, str2, obj, obj2), str3));
        if (this._parentModel != null) {
            String str4 = this._parentProperty + '.' + str;
            Model model = this._parentModel;
            i.b(model);
            model.notifyChanged(str4, str2, str3, obj, obj2);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(Model model, String str, Object obj, String str2, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnyProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setAnyProperty(str, obj, str2, z);
    }

    public static /* synthetic */ void setBigDecimalProperty$default(Model model, String str, BigDecimal bigDecimal, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public static /* synthetic */ void setBooleanProperty$default(Model model, String str, boolean z, String str2, boolean z5, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z5 = false;
        }
        model.setBooleanProperty(str, z, str2, z5);
    }

    public static /* synthetic */ void setDoubleProperty$default(Model model, String str, double d6, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDoubleProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setDoubleProperty(str, d6, str3, z);
    }

    public static /* synthetic */ void setEnumProperty$default(Model model, String name, Enum value, String tag, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnumProperty");
        }
        if ((i2 & 4) != 0) {
            tag = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        i.e(name, "name");
        i.e(value, "value");
        i.e(tag, "tag");
        model.setOptAnyProperty(name, value.toString(), tag, z);
    }

    public static /* synthetic */ void setFloatProperty$default(Model model, String str, float f3, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFloatProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setFloatProperty(str, f3, str2, z);
    }

    public static /* synthetic */ void setIntProperty$default(Model model, String str, int i2, String str2, boolean z, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIntProperty");
        }
        if ((i3 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        model.setIntProperty(str, i2, str2, z);
    }

    public static /* synthetic */ void setListProperty$default(Model model, String str, List list, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setListProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setListProperty(str, list, str2, z);
    }

    public static /* synthetic */ void setLongProperty$default(Model model, String str, long j2, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLongProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setLongProperty(str, j2, str3, z);
    }

    public static /* synthetic */ void setMapModelProperty$default(Model model, String str, MapModel mapModel, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapModelProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setMapModelProperty(str, mapModel, str2, z);
    }

    public static /* synthetic */ void setOptAnyProperty$default(Model model, String str, Object obj, String str2, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptAnyProperty(str, obj, str2, z);
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(Model model, String str, BigDecimal bigDecimal, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptBigDecimalProperty(str, bigDecimal, str2, z);
    }

    public static /* synthetic */ void setOptBooleanProperty$default(Model model, String str, Boolean bool, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptBooleanProperty(str, bool, str2, z);
    }

    public static /* synthetic */ void setOptDoubleProperty$default(Model model, String str, Double d6, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptDoubleProperty(str, d6, str2, z);
    }

    public static /* synthetic */ void setOptEnumProperty$default(Model model, String name, Enum r22, String tag, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
        }
        if ((i2 & 4) != 0) {
            tag = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        i.e(name, "name");
        i.e(tag, "tag");
        model.setOptAnyProperty(name, r22 != null ? r22.toString() : null, tag, z);
    }

    public static /* synthetic */ void setOptFloatProperty$default(Model model, String str, Float f3, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptFloatProperty(str, f3, str2, z);
    }

    public static /* synthetic */ void setOptIntProperty$default(Model model, String str, Integer num, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptIntProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptIntProperty(str, num, str2, z);
    }

    public static /* synthetic */ void setOptListProperty$default(Model model, String str, List list, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptListProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptListProperty(str, list, str2, z);
    }

    public static /* synthetic */ void setOptLongProperty$default(Model model, String str, Long l2, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptLongProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptLongProperty(str, l2, str2, z);
    }

    public static /* synthetic */ void setOptMapModelProperty$default(Model model, String str, MapModel mapModel, String str2, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
        }
        if ((i2 & 4) != 0) {
            str2 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptMapModelProperty(str, mapModel, str2, z);
    }

    public static /* synthetic */ void setOptStringProperty$default(Model model, String str, String str2, String str3, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptStringProperty");
        }
        if ((i2 & 4) != 0) {
            str3 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setOptStringProperty(str, str2, str3, z);
    }

    public static /* synthetic */ void setStringProperty$default(Model model, String str, String str2, String str3, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStringProperty");
        }
        if ((i2 & 4) != 0) {
            str3 = ModelChangeTags.NORMAL;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        model.setStringProperty(str, str2, str3, z);
    }

    public List<?> createListForProperty(String property, JSONArray jsonArray) {
        i.e(property, "property");
        i.e(jsonArray, "jsonArray");
        return null;
    }

    public Model createModelForProperty(String property, JSONObject jsonObject) {
        i.e(property, "property");
        i.e(jsonObject, "jsonObject");
        return null;
    }

    public final Object getAnyProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC1430a);
        i.c(optAnyProperty, "null cannot be cast to non-null type kotlin.Any");
        return optAnyProperty;
    }

    public final BigDecimal getBigDecimalProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(name, interfaceC1430a);
        i.c(optBigDecimalProperty, "null cannot be cast to non-null type java.math.BigDecimal");
        return optBigDecimalProperty;
    }

    public final boolean getBooleanProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Boolean optBooleanProperty = getOptBooleanProperty(name, interfaceC1430a);
        i.c(optBooleanProperty, "null cannot be cast to non-null type kotlin.Boolean");
        return optBooleanProperty.booleanValue();
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final double getDoubleProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Double optDoubleProperty = getOptDoubleProperty(name, interfaceC1430a);
        i.c(optDoubleProperty, "null cannot be cast to non-null type kotlin.Double");
        return optDoubleProperty.doubleValue();
    }

    public final /* synthetic */ <T extends Enum<T>> T getEnumProperty(String name) {
        i.e(name, "name");
        if (getOptAnyProperty$default(this, name, null, 2, null) == null) {
            i.i();
            throw null;
        }
        i.i();
        throw null;
    }

    public final float getFloatProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Float optFloatProperty = getOptFloatProperty(name, interfaceC1430a);
        i.c(optFloatProperty, "null cannot be cast to non-null type kotlin.Float");
        return optFloatProperty.floatValue();
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    public final String getId() {
        return getStringProperty$default(this, OutcomeConstants.OUTCOME_ID, null, 2, null);
    }

    public final int getIntProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Integer optIntProperty = getOptIntProperty(name, interfaceC1430a);
        i.c(optIntProperty, "null cannot be cast to non-null type kotlin.Int");
        return optIntProperty.intValue();
    }

    public final <T> List<T> getListProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        List<T> optListProperty = getOptListProperty(name, interfaceC1430a);
        i.c(optListProperty, "null cannot be cast to non-null type kotlin.collections.List<T of com.onesignal.common.modeling.Model.getListProperty>");
        return optListProperty;
    }

    public final long getLongProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Long optLongProperty = getOptLongProperty(name, interfaceC1430a);
        i.c(optLongProperty, "null cannot be cast to non-null type kotlin.Long");
        return optLongProperty.longValue();
    }

    public final <T> MapModel<T> getMapModelProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        MapModel<T> optMapModelProperty = getOptMapModelProperty(name, interfaceC1430a);
        i.c(optMapModelProperty, "null cannot be cast to non-null type com.onesignal.common.modeling.MapModel<T of com.onesignal.common.modeling.Model.getMapModelProperty>");
        return optMapModelProperty;
    }

    public final Object getOptAnyProperty(String name, InterfaceC1430a interfaceC1430a) {
        Object obj;
        i.e(name, "name");
        synchronized (this.data) {
            try {
                if (!this.data.containsKey(name) && interfaceC1430a != null) {
                    obj = interfaceC1430a.invoke();
                    this.data.put(name, obj);
                }
                obj = this.data.get(name);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final BigDecimal getOptBigDecimalProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC1430a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? new BigDecimal(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? new BigDecimal(((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? new BigDecimal(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? new BigDecimal(((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    public final Boolean getOptBooleanProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        return (Boolean) getOptAnyProperty(name, interfaceC1430a);
    }

    public final Double getOptDoubleProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC1430a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Double ? (Double) optAnyProperty : optAnyProperty instanceof Float ? Double.valueOf(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Integer ? Double.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Double.valueOf(((Number) optAnyProperty).longValue()) : (Double) optAnyProperty;
    }

    public final /* synthetic */ <T extends Enum<T>> T getOptEnumProperty(String name) {
        i.e(name, "name");
        if (getOptAnyProperty$default(this, name, null, 2, null) == null) {
            return null;
        }
        i.i();
        throw null;
    }

    public final Float getOptFloatProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC1430a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Float ? (Float) optAnyProperty : optAnyProperty instanceof Double ? Float.valueOf((float) ((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof Integer ? Float.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Float.valueOf(((Number) optAnyProperty).longValue()) : (Float) optAnyProperty;
    }

    public final Integer getOptIntProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC1430a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? (Integer) optAnyProperty : optAnyProperty instanceof Long ? Integer.valueOf((int) ((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? Integer.valueOf((int) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    public final <T> List<T> getOptListProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        return (List) getOptAnyProperty(name, interfaceC1430a);
    }

    public final Long getOptLongProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC1430a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Long ? (Long) optAnyProperty : optAnyProperty instanceof Integer ? Long.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Float ? Long.valueOf((long) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Long.valueOf((long) ((Number) optAnyProperty).doubleValue()) : (Long) optAnyProperty;
    }

    public final <T> MapModel<T> getOptMapModelProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        return (MapModel) getOptAnyProperty(name, interfaceC1430a);
    }

    public final String getOptStringProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        return (String) getOptAnyProperty(name, interfaceC1430a);
    }

    public final String getStringProperty(String name, InterfaceC1430a interfaceC1430a) {
        i.e(name, "name");
        String optStringProperty = getOptStringProperty(name, interfaceC1430a);
        i.c(optStringProperty, "null cannot be cast to non-null type kotlin.String");
        return optStringProperty;
    }

    public final boolean hasProperty(String name) {
        i.e(name, "name");
        return this.data.containsKey(name);
    }

    public final void initializeFromJson(JSONObject jsonObject) {
        Method method;
        i.e(jsonObject, "jsonObject");
        synchronized (this.data) {
            try {
                this.data.clear();
                Iterator<String> keys = jsonObject.keys();
                i.d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jsonObject.get(next);
                    if (obj instanceof JSONObject) {
                        i.b(next);
                        Model createModelForProperty = createModelForProperty(next, (JSONObject) obj);
                        if (createModelForProperty != null) {
                            this.data.put(next, createModelForProperty);
                        }
                    } else if (obj instanceof JSONArray) {
                        i.b(next);
                        List<?> createListForProperty = createListForProperty(next, (JSONArray) obj);
                        if (createListForProperty != null) {
                            this.data.put(next, createListForProperty);
                        }
                    } else {
                        Method[] methods = getClass().getMethods();
                        i.d(methods, "getMethods(...)");
                        int length = methods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i2];
                            if (!i.a(method.getReturnType(), Void.class)) {
                                if (r.I(method.getName(), "get" + next)) {
                                    break;
                                }
                            }
                            i2++;
                        }
                        Class<?> returnType = method != null ? method.getReturnType() : null;
                        boolean z = true;
                        if (i.a(returnType, Double.TYPE) ? true : i.a(returnType, Double.class)) {
                            Map<String, Object> map = this.data;
                            i.b(next);
                            map.put(next, Double.valueOf(jsonObject.getDouble(next)));
                        } else {
                            if (i.a(returnType, Long.TYPE) ? true : i.a(returnType, Long.class)) {
                                Map<String, Object> map2 = this.data;
                                i.b(next);
                                map2.put(next, Long.valueOf(jsonObject.getLong(next)));
                            } else {
                                if (i.a(returnType, Float.TYPE) ? true : i.a(returnType, Float.class)) {
                                    Map<String, Object> map3 = this.data;
                                    i.b(next);
                                    map3.put(next, Float.valueOf((float) jsonObject.getDouble(next)));
                                } else {
                                    if (i.a(returnType, Integer.TYPE) ? true : i.a(returnType, Integer.class)) {
                                        Map<String, Object> map4 = this.data;
                                        i.b(next);
                                        map4.put(next, Integer.valueOf(jsonObject.getInt(next)));
                                    } else {
                                        if (i.a(returnType, Boolean.TYPE) ? true : i.a(returnType, Boolean.class)) {
                                            Map<String, Object> map5 = this.data;
                                            i.b(next);
                                            map5.put(next, Boolean.valueOf(jsonObject.getBoolean(next)));
                                        } else {
                                            if (!i.a(returnType, String.class)) {
                                                z = i.a(returnType, String.class);
                                            }
                                            if (z) {
                                                Map<String, Object> map6 = this.data;
                                                i.b(next);
                                                map6.put(next, jsonObject.getString(next));
                                            } else {
                                                Map<String, Object> map7 = this.data;
                                                i.b(next);
                                                map7.put(next, jsonObject.get(next));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void initializeFromModel(String str, Model model) {
        Map d02;
        i.e(model, "model");
        synchronized (model.data) {
            d02 = AbstractC0476u.d0(model.data);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : d02.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Model) {
                ((Model) value)._parentModel = this;
                linkedHashMap.put(str2, value);
            } else {
                linkedHashMap.put(str2, value);
            }
        }
        if (str != null) {
            linkedHashMap.put(OutcomeConstants.OUTCOME_ID, str);
        }
        synchronized (this.data) {
            this.data.clear();
            this.data.putAll(linkedHashMap);
        }
    }

    public final void setAnyProperty(String name, Object value, String tag, boolean z) {
        i.e(name, "name");
        i.e(value, "value");
        i.e(tag, "tag");
        setOptAnyProperty(name, value, tag, z);
    }

    public final void setBigDecimalProperty(String name, BigDecimal value, String tag, boolean z) {
        i.e(name, "name");
        i.e(value, "value");
        i.e(tag, "tag");
        setOptBigDecimalProperty(name, value, tag, z);
    }

    public final void setBooleanProperty(String name, boolean z, String tag, boolean z5) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptBooleanProperty(name, Boolean.valueOf(z), tag, z5);
    }

    public final void setDoubleProperty(String name, double d6, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptDoubleProperty(name, Double.valueOf(d6), tag, z);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String name, T value, String tag, boolean z) {
        i.e(name, "name");
        i.e(value, "value");
        i.e(tag, "tag");
        setOptAnyProperty(name, value.toString(), tag, z);
    }

    public final void setFloatProperty(String name, float f3, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptFloatProperty(name, Float.valueOf(f3), tag, z);
    }

    public final void setId(String value) {
        i.e(value, "value");
        setStringProperty$default(this, OutcomeConstants.OUTCOME_ID, value, null, false, 12, null);
    }

    public final void setIntProperty(String name, int i2, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptIntProperty(name, Integer.valueOf(i2), tag, z);
    }

    public final <T> void setListProperty(String name, List<? extends T> value, String tag, boolean z) {
        i.e(name, "name");
        i.e(value, "value");
        i.e(tag, "tag");
        setOptListProperty(name, value, tag, z);
    }

    public final void setLongProperty(String name, long j2, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptLongProperty(name, Long.valueOf(j2), tag, z);
    }

    public final <T> void setMapModelProperty(String name, MapModel<T> value, String tag, boolean z) {
        i.e(name, "name");
        i.e(value, "value");
        i.e(tag, "tag");
        setOptMapModelProperty(name, value, tag, z);
    }

    public final void setOptAnyProperty(String name, Object obj, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        Object obj2 = this.data.get(name);
        synchronized (this.data) {
            try {
                if (!i.a(obj2, obj) || z) {
                    if (obj != null) {
                        this.data.put(name, obj);
                    } else if (this.data.containsKey(name)) {
                        this.data.remove(name);
                    }
                    notifyChanged(name, name, tag, obj2, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setOptBigDecimalProperty(String name, BigDecimal bigDecimal, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, bigDecimal != null ? bigDecimal.toString() : null, tag, z);
    }

    public final void setOptBooleanProperty(String name, Boolean bool, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, bool, tag, z);
    }

    public final void setOptDoubleProperty(String name, Double d6, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, d6, tag, z);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String name, T t5, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, t5 != null ? t5.toString() : null, tag, z);
    }

    public final void setOptFloatProperty(String name, Float f3, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, f3, tag, z);
    }

    public final void setOptIntProperty(String name, Integer num, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, num, tag, z);
    }

    public final <T> void setOptListProperty(String name, List<? extends T> list, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, list, tag, z);
    }

    public final void setOptLongProperty(String name, Long l2, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, l2, tag, z);
    }

    public final <T> void setOptMapModelProperty(String name, MapModel<T> mapModel, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, mapModel, tag, z);
    }

    public final void setOptStringProperty(String name, String str, String tag, boolean z) {
        i.e(name, "name");
        i.e(tag, "tag");
        setOptAnyProperty(name, str, tag, z);
    }

    public final void setStringProperty(String name, String value, String tag, boolean z) {
        i.e(name, "name");
        i.e(value, "value");
        i.e(tag, "tag");
        setOptStringProperty(name, value, tag, z);
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        synchronized (this.data) {
            try {
                for (Map.Entry<String, Object> entry : this.data.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Model) {
                        jSONObject.put(entry.getKey(), ((Model) value).toJSON());
                    } else if (value instanceof List) {
                        JSONArray jSONArray = new JSONArray();
                        for (Object obj : (List) value) {
                            if (obj instanceof Model) {
                                jSONArray.put(((Model) obj).toJSON());
                            } else {
                                jSONArray.put(obj);
                            }
                        }
                        jSONObject.put(entry.getKey(), jSONArray);
                    } else {
                        jSONObject.put(entry.getKey(), value);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONObject;
    }

    public Model(Model model, String str) {
        this._parentModel = model;
        this._parentProperty = str;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        i.d(synchronizedMap, "synchronizedMap(...)");
        this.data = synchronizedMap;
        this.changeNotifier = new EventProducer<>();
        Model model2 = this._parentModel;
        if (model2 != null && str == null) {
            throw new Exception("If parent model is set, parent property must also be set.");
        }
        if (model2 == null && str != null) {
            throw new Exception("If parent property is set, parent model must also be set.");
        }
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void subscribe(IModelChangedHandler handler) {
        i.e(handler, "handler");
        this.changeNotifier.subscribe(handler);
    }

    @Override // com.onesignal.common.events.IEventNotifier
    public void unsubscribe(IModelChangedHandler handler) {
        i.e(handler, "handler");
        this.changeNotifier.unsubscribe(handler);
    }

    public /* synthetic */ Model(Model model, String str, int i2, e eVar) {
        this((i2 & 1) != 0 ? null : model, (i2 & 2) != 0 ? null : str);
    }
}
