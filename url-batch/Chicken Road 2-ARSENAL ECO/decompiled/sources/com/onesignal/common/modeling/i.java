package com.onesignal.common.modeling;

import F5.q;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k5.v;
import l5.t;
import org.json.JSONArray;
import org.json.JSONObject;
import x5.InterfaceC0732a;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public class i implements com.onesignal.common.events.d {
    private i _parentModel;
    private final String _parentProperty;
    private final com.onesignal.common.events.b changeNotifier;
    private final Map<String, Object> data;

    public static final class a extends kotlin.jvm.internal.j implements InterfaceC0743l {
        final /* synthetic */ j $changeArgs;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$changeArgs = jVar;
            this.$tag = str;
        }

        @Override // x5.InterfaceC0743l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.a) obj);
            return v.f5219a;
        }

        public final void invoke(com.onesignal.common.modeling.a it) {
            kotlin.jvm.internal.i.e(it, "it");
            it.onChanged(this.$changeArgs, this.$tag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Object getAnyProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAnyProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getAnyProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getBigDecimalProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ boolean getBooleanProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBooleanProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getBooleanProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ double getDoubleProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDoubleProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getDoubleProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ float getFloatProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloatProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getFloatProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ int getIntProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIntProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getIntProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ List getListProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getListProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getListProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ long getLongProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLongProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getLongProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ h getMapModelProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMapModelProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getMapModelProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ Object getOptAnyProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptAnyProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptBigDecimalProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ Boolean getOptBooleanProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptBooleanProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ Double getOptDoubleProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptDoubleProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ Float getOptFloatProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptFloatProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ Integer getOptIntProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptIntProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptIntProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ List getOptListProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptListProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptListProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ Long getOptLongProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptLongProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptLongProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ h getOptMapModelProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptMapModelProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ String getOptStringProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOptStringProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getOptStringProperty(str, interfaceC0732a);
    }

    public static /* synthetic */ String getStringProperty$default(i iVar, String str, InterfaceC0732a interfaceC0732a, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringProperty");
        }
        if ((i7 & 2) != 0) {
            interfaceC0732a = null;
        }
        return iVar.getStringProperty(str, interfaceC0732a);
    }

    private final void notifyChanged(String str, String str2, String str3, Object obj, Object obj2) {
        this.changeNotifier.fire(new a(new j(this, str, str2, obj, obj2), str3));
        if (this._parentModel != null) {
            String str4 = this._parentProperty + '.' + str;
            i iVar = this._parentModel;
            kotlin.jvm.internal.i.b(iVar);
            iVar.notifyChanged(str4, str2, str3, obj, obj2);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z5, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnyProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setAnyProperty(str, obj, str2, z5);
    }

    public static /* synthetic */ void setBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setBigDecimalProperty(str, bigDecimal, str2, z5);
    }

    public static /* synthetic */ void setBooleanProperty$default(i iVar, String str, boolean z5, String str2, boolean z6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBooleanProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z6 = false;
        }
        iVar.setBooleanProperty(str, z5, str2, z6);
    }

    public static /* synthetic */ void setDoubleProperty$default(i iVar, String str, double d7, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDoubleProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setDoubleProperty(str, d7, str3, z5);
    }

    public static /* synthetic */ void setEnumProperty$default(i iVar, String name, Enum value, String tag, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnumProperty");
        }
        if ((i7 & 4) != 0) {
            tag = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(tag, "tag");
        iVar.setOptAnyProperty(name, value.toString(), tag, z5);
    }

    public static /* synthetic */ void setFloatProperty$default(i iVar, String str, float f7, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFloatProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setFloatProperty(str, f7, str2, z5);
    }

    public static /* synthetic */ void setIntProperty$default(i iVar, String str, int i7, String str2, boolean z5, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIntProperty");
        }
        if ((i8 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i8 & 8) != 0) {
            z5 = false;
        }
        iVar.setIntProperty(str, i7, str2, z5);
    }

    public static /* synthetic */ void setListProperty$default(i iVar, String str, List list, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setListProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setListProperty(str, list, str2, z5);
    }

    public static /* synthetic */ void setLongProperty$default(i iVar, String str, long j4, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setLongProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setLongProperty(str, j4, str3, z5);
    }

    public static /* synthetic */ void setMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMapModelProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setMapModelProperty(str, hVar, str2, z5);
    }

    public static /* synthetic */ void setOptAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z5, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptAnyProperty(str, obj, str2, z5);
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptBigDecimalProperty(str, bigDecimal, str2, z5);
    }

    public static /* synthetic */ void setOptBooleanProperty$default(i iVar, String str, Boolean bool, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptBooleanProperty(str, bool, str2, z5);
    }

    public static /* synthetic */ void setOptDoubleProperty$default(i iVar, String str, Double d7, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptDoubleProperty(str, d7, str2, z5);
    }

    public static /* synthetic */ void setOptEnumProperty$default(i iVar, String name, Enum r22, String tag, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
        }
        if ((i7 & 4) != 0) {
            tag = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        iVar.setOptAnyProperty(name, r22 != null ? r22.toString() : null, tag, z5);
    }

    public static /* synthetic */ void setOptFloatProperty$default(i iVar, String str, Float f7, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptFloatProperty(str, f7, str2, z5);
    }

    public static /* synthetic */ void setOptIntProperty$default(i iVar, String str, Integer num, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptIntProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptIntProperty(str, num, str2, z5);
    }

    public static /* synthetic */ void setOptListProperty$default(i iVar, String str, List list, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptListProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptListProperty(str, list, str2, z5);
    }

    public static /* synthetic */ void setOptLongProperty$default(i iVar, String str, Long l7, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptLongProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptLongProperty(str, l7, str2, z5);
    }

    public static /* synthetic */ void setOptMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
        }
        if ((i7 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptMapModelProperty(str, hVar, str2, z5);
    }

    public static /* synthetic */ void setOptStringProperty$default(i iVar, String str, String str2, String str3, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOptStringProperty");
        }
        if ((i7 & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setOptStringProperty(str, str2, str3, z5);
    }

    public static /* synthetic */ void setStringProperty$default(i iVar, String str, String str2, String str3, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStringProperty");
        }
        if ((i7 & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i7 & 8) != 0) {
            z5 = false;
        }
        iVar.setStringProperty(str, str2, str3, z5);
    }

    public List<?> createListForProperty(String property, JSONArray jsonArray) {
        kotlin.jvm.internal.i.e(property, "property");
        kotlin.jvm.internal.i.e(jsonArray, "jsonArray");
        return null;
    }

    public i createModelForProperty(String property, JSONObject jsonObject) {
        kotlin.jvm.internal.i.e(property, "property");
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        return null;
    }

    public final Object getAnyProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optAnyProperty, "null cannot be cast to non-null type kotlin.Any");
        return optAnyProperty;
    }

    public final BigDecimal getBigDecimalProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optBigDecimalProperty, "null cannot be cast to non-null type java.math.BigDecimal");
        return optBigDecimalProperty;
    }

    public final boolean getBooleanProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Boolean optBooleanProperty = getOptBooleanProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optBooleanProperty, "null cannot be cast to non-null type kotlin.Boolean");
        return optBooleanProperty.booleanValue();
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final double getDoubleProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Double optDoubleProperty = getOptDoubleProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optDoubleProperty, "null cannot be cast to non-null type kotlin.Double");
        return optDoubleProperty.doubleValue();
    }

    public final /* synthetic */ <T extends Enum<T>> T getEnumProperty(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        if (getOptAnyProperty$default(this, name, null, 2, null) == null) {
            kotlin.jvm.internal.i.i();
            throw null;
        }
        kotlin.jvm.internal.i.i();
        throw null;
    }

    public final float getFloatProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Float optFloatProperty = getOptFloatProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optFloatProperty, "null cannot be cast to non-null type kotlin.Float");
        return optFloatProperty.floatValue();
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    public final String getId() {
        return getStringProperty$default(this, "id", null, 2, null);
    }

    public final int getIntProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Integer optIntProperty = getOptIntProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optIntProperty, "null cannot be cast to non-null type kotlin.Int");
        return optIntProperty.intValue();
    }

    public final <T> List<T> getListProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        List<T> optListProperty = getOptListProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optListProperty, "null cannot be cast to non-null type kotlin.collections.List<T of com.onesignal.common.modeling.Model.getListProperty>");
        return optListProperty;
    }

    public final long getLongProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Long optLongProperty = getOptLongProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optLongProperty, "null cannot be cast to non-null type kotlin.Long");
        return optLongProperty.longValue();
    }

    public final <T> h getMapModelProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        h optMapModelProperty = getOptMapModelProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optMapModelProperty, "null cannot be cast to non-null type com.onesignal.common.modeling.MapModel<T of com.onesignal.common.modeling.Model.getMapModelProperty>");
        return optMapModelProperty;
    }

    public final Object getOptAnyProperty(String name, InterfaceC0732a interfaceC0732a) {
        Object obj;
        kotlin.jvm.internal.i.e(name, "name");
        synchronized (this.data) {
            try {
                if (!this.data.containsKey(name) && interfaceC0732a != null) {
                    obj = interfaceC0732a.invoke();
                    this.data.put(name, obj);
                }
                obj = this.data.get(name);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final BigDecimal getOptBigDecimalProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC0732a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? new BigDecimal(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? new BigDecimal(((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? new BigDecimal(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? new BigDecimal(((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    public final Boolean getOptBooleanProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        return (Boolean) getOptAnyProperty(name, interfaceC0732a);
    }

    public final Double getOptDoubleProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC0732a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Double ? (Double) optAnyProperty : optAnyProperty instanceof Float ? Double.valueOf(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Integer ? Double.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Double.valueOf(((Number) optAnyProperty).longValue()) : (Double) optAnyProperty;
    }

    public final /* synthetic */ <T extends Enum<T>> T getOptEnumProperty(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        if (getOptAnyProperty$default(this, name, null, 2, null) == null) {
            return null;
        }
        kotlin.jvm.internal.i.i();
        throw null;
    }

    public final Float getOptFloatProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC0732a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Float ? (Float) optAnyProperty : optAnyProperty instanceof Double ? Float.valueOf((float) ((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof Integer ? Float.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Float.valueOf(((Number) optAnyProperty).longValue()) : (Float) optAnyProperty;
    }

    public final Integer getOptIntProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC0732a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? (Integer) optAnyProperty : optAnyProperty instanceof Long ? Integer.valueOf((int) ((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? Integer.valueOf((int) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    public final <T> List<T> getOptListProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        return (List) getOptAnyProperty(name, interfaceC0732a);
    }

    public final Long getOptLongProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        Object optAnyProperty = getOptAnyProperty(name, interfaceC0732a);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Long ? (Long) optAnyProperty : optAnyProperty instanceof Integer ? Long.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Float ? Long.valueOf((long) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Long.valueOf((long) ((Number) optAnyProperty).doubleValue()) : (Long) optAnyProperty;
    }

    public final <T> h getOptMapModelProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        return (h) getOptAnyProperty(name, interfaceC0732a);
    }

    public final String getOptStringProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        return (String) getOptAnyProperty(name, interfaceC0732a);
    }

    public final String getStringProperty(String name, InterfaceC0732a interfaceC0732a) {
        kotlin.jvm.internal.i.e(name, "name");
        String optStringProperty = getOptStringProperty(name, interfaceC0732a);
        kotlin.jvm.internal.i.c(optStringProperty, "null cannot be cast to non-null type kotlin.String");
        return optStringProperty;
    }

    public final boolean hasProperty(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return this.data.containsKey(name);
    }

    public final void initializeFromJson(JSONObject jsonObject) {
        Method method;
        kotlin.jvm.internal.i.e(jsonObject, "jsonObject");
        synchronized (this.data) {
            try {
                this.data.clear();
                Iterator<String> keys = jsonObject.keys();
                kotlin.jvm.internal.i.d(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jsonObject.get(next);
                    if (obj instanceof JSONObject) {
                        kotlin.jvm.internal.i.b(next);
                        i createModelForProperty = createModelForProperty(next, (JSONObject) obj);
                        if (createModelForProperty != null) {
                            this.data.put(next, createModelForProperty);
                        }
                    } else if (obj instanceof JSONArray) {
                        kotlin.jvm.internal.i.b(next);
                        List<?> createListForProperty = createListForProperty(next, (JSONArray) obj);
                        if (createListForProperty != null) {
                            this.data.put(next, createListForProperty);
                        }
                    } else {
                        Method[] methods = getClass().getMethods();
                        kotlin.jvm.internal.i.d(methods, "getMethods(...)");
                        int length = methods.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i7];
                            if (!kotlin.jvm.internal.i.a(method.getReturnType(), Void.class)) {
                                if (q.C(method.getName(), "get" + next)) {
                                    break;
                                }
                            }
                            i7++;
                        }
                        Class<?> returnType = method != null ? method.getReturnType() : null;
                        boolean z5 = true;
                        if (kotlin.jvm.internal.i.a(returnType, Double.TYPE) ? true : kotlin.jvm.internal.i.a(returnType, Double.class)) {
                            Map<String, Object> map = this.data;
                            kotlin.jvm.internal.i.b(next);
                            map.put(next, Double.valueOf(jsonObject.getDouble(next)));
                        } else {
                            if (kotlin.jvm.internal.i.a(returnType, Long.TYPE) ? true : kotlin.jvm.internal.i.a(returnType, Long.class)) {
                                Map<String, Object> map2 = this.data;
                                kotlin.jvm.internal.i.b(next);
                                map2.put(next, Long.valueOf(jsonObject.getLong(next)));
                            } else {
                                if (kotlin.jvm.internal.i.a(returnType, Float.TYPE) ? true : kotlin.jvm.internal.i.a(returnType, Float.class)) {
                                    Map<String, Object> map3 = this.data;
                                    kotlin.jvm.internal.i.b(next);
                                    map3.put(next, Float.valueOf((float) jsonObject.getDouble(next)));
                                } else {
                                    if (kotlin.jvm.internal.i.a(returnType, Integer.TYPE) ? true : kotlin.jvm.internal.i.a(returnType, Integer.class)) {
                                        Map<String, Object> map4 = this.data;
                                        kotlin.jvm.internal.i.b(next);
                                        map4.put(next, Integer.valueOf(jsonObject.getInt(next)));
                                    } else {
                                        if (kotlin.jvm.internal.i.a(returnType, Boolean.TYPE) ? true : kotlin.jvm.internal.i.a(returnType, Boolean.class)) {
                                            Map<String, Object> map5 = this.data;
                                            kotlin.jvm.internal.i.b(next);
                                            map5.put(next, Boolean.valueOf(jsonObject.getBoolean(next)));
                                        } else {
                                            if (!kotlin.jvm.internal.i.a(returnType, String.class)) {
                                                z5 = kotlin.jvm.internal.i.a(returnType, String.class);
                                            }
                                            if (z5) {
                                                Map<String, Object> map6 = this.data;
                                                kotlin.jvm.internal.i.b(next);
                                                map6.put(next, jsonObject.getString(next));
                                            } else {
                                                Map<String, Object> map7 = this.data;
                                                kotlin.jvm.internal.i.b(next);
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

    public final void initializeFromModel(String str, i model) {
        Map u02;
        kotlin.jvm.internal.i.e(model, "model");
        synchronized (model.data) {
            u02 = t.u0(model.data);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : u02.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof i) {
                ((i) value)._parentModel = this;
                linkedHashMap.put(str2, value);
            } else {
                linkedHashMap.put(str2, value);
            }
        }
        if (str != null) {
            linkedHashMap.put("id", str);
        }
        synchronized (this.data) {
            this.data.clear();
            this.data.putAll(linkedHashMap);
        }
    }

    public final void setAnyProperty(String name, Object value, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, value, tag, z5);
    }

    public final void setBigDecimalProperty(String name, BigDecimal value, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptBigDecimalProperty(name, value, tag, z5);
    }

    public final void setBooleanProperty(String name, boolean z5, String tag, boolean z6) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptBooleanProperty(name, Boolean.valueOf(z5), tag, z6);
    }

    public final void setDoubleProperty(String name, double d7, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptDoubleProperty(name, Double.valueOf(d7), tag, z5);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String name, T value, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, value.toString(), tag, z5);
    }

    public final void setFloatProperty(String name, float f7, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptFloatProperty(name, Float.valueOf(f7), tag, z5);
    }

    public final void setId(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        setStringProperty$default(this, "id", value, null, false, 12, null);
    }

    public final void setIntProperty(String name, int i7, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptIntProperty(name, Integer.valueOf(i7), tag, z5);
    }

    public final <T> void setListProperty(String name, List<? extends T> value, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptListProperty(name, value, tag, z5);
    }

    public final void setLongProperty(String name, long j4, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptLongProperty(name, Long.valueOf(j4), tag, z5);
    }

    public final <T> void setMapModelProperty(String name, h value, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptMapModelProperty(name, value, tag, z5);
    }

    public final void setOptAnyProperty(String name, Object obj, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        Object obj2 = this.data.get(name);
        synchronized (this.data) {
            try {
                if (!kotlin.jvm.internal.i.a(obj2, obj) || z5) {
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

    public final void setOptBigDecimalProperty(String name, BigDecimal bigDecimal, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, bigDecimal != null ? bigDecimal.toString() : null, tag, z5);
    }

    public final void setOptBooleanProperty(String name, Boolean bool, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, bool, tag, z5);
    }

    public final void setOptDoubleProperty(String name, Double d7, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, d7, tag, z5);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String name, T t6, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, t6 != null ? t6.toString() : null, tag, z5);
    }

    public final void setOptFloatProperty(String name, Float f7, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, f7, tag, z5);
    }

    public final void setOptIntProperty(String name, Integer num, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, num, tag, z5);
    }

    public final <T> void setOptListProperty(String name, List<? extends T> list, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, list, tag, z5);
    }

    public final void setOptLongProperty(String name, Long l7, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, l7, tag, z5);
    }

    public final <T> void setOptMapModelProperty(String name, h hVar, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, hVar, tag, z5);
    }

    public final void setOptStringProperty(String name, String str, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptAnyProperty(name, str, tag, z5);
    }

    public final void setStringProperty(String name, String value, String tag, boolean z5) {
        kotlin.jvm.internal.i.e(name, "name");
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(tag, "tag");
        setOptStringProperty(name, value, tag, z5);
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        synchronized (this.data) {
            try {
                for (Map.Entry<String, Object> entry : this.data.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof i) {
                        jSONObject.put(entry.getKey(), ((i) value).toJSON());
                    } else if (value instanceof List) {
                        JSONArray jSONArray = new JSONArray();
                        for (Object obj : (List) value) {
                            if (obj instanceof i) {
                                jSONArray.put(((i) obj).toJSON());
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

    public i(i iVar, String str) {
        this._parentModel = iVar;
        this._parentProperty = str;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.i.d(synchronizedMap, "synchronizedMap(...)");
        this.data = synchronizedMap;
        this.changeNotifier = new com.onesignal.common.events.b();
        i iVar2 = this._parentModel;
        if (iVar2 != null && str == null) {
            throw new Exception("If parent model is set, parent property must also be set.");
        }
        if (iVar2 == null && str != null) {
            throw new Exception("If parent property is set, parent model must also be set.");
        }
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.common.modeling.a handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.changeNotifier.subscribe(handler);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.common.modeling.a handler) {
        kotlin.jvm.internal.i.e(handler, "handler");
        this.changeNotifier.unsubscribe(handler);
    }

    public /* synthetic */ i(i iVar, String str, int i7, kotlin.jvm.internal.e eVar) {
        this((i7 & 1) != 0 ? null : iVar, (i7 & 2) != 0 ? null : str);
    }
}
