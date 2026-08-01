package com.onesignal.common.modeling;

import a2.r;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;
import org.json.JSONArray;
import org.json.JSONObject;
import wd.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class i implements com.onesignal.common.events.d {
    private i _parentModel;
    private final String _parentProperty;
    private final com.onesignal.common.events.b changeNotifier;
    private final Map<String, Object> data;

    public i(i iVar, String str) {
        this._parentModel = iVar;
        this._parentProperty = str;
        Map<String, Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        synchronizedMap.getClass();
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getAnyProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getAnyProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getAnyProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BigDecimal getBigDecimalProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getBigDecimalProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getBigDecimalProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean getBooleanProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getBooleanProperty");
            return false;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getBooleanProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ double getDoubleProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getDoubleProperty");
            return 0.0d;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getDoubleProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ float getFloatProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getFloatProperty");
            return 0.0f;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getFloatProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int getIntProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getIntProperty");
            return 0;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getIntProperty(str, function0);
    }

    public static /* synthetic */ List getListProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getListProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getListProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ long getLongProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getLongProperty");
            return 0L;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getLongProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h getMapModelProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getMapModelProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getMapModelProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOptAnyProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptAnyProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptAnyProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BigDecimal getOptBigDecimalProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptBigDecimalProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptBigDecimalProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Boolean getOptBooleanProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptBooleanProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptBooleanProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Double getOptDoubleProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptDoubleProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptDoubleProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Float getOptFloatProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptFloatProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptFloatProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Integer getOptIntProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptIntProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptIntProperty(str, function0);
    }

    public static /* synthetic */ List getOptListProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptListProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptListProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Long getOptLongProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptLongProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptLongProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h getOptMapModelProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptMapModelProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptMapModelProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getOptStringProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getOptStringProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getOptStringProperty(str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String getStringProperty$default(i iVar, String str, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: getStringProperty");
            return null;
        }
        if ((i3 & 2) != 0) {
            function0 = null;
        }
        return iVar.getStringProperty(str, function0);
    }

    private final void notifyChanged(String str, String str2, String str3, Object obj, Object obj2) {
        this.changeNotifier.fire(new a(new j(this, str, str2, obj, obj2), str3));
        if (this._parentModel != null) {
            String str4 = this._parentProperty + '.' + str;
            i iVar = this._parentModel;
            iVar.getClass();
            iVar.notifyChanged(str4, str2, str3, obj, obj2);
        }
    }

    public static /* synthetic */ void setAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z10, int i3, Object obj2) {
        if (obj2 != null) {
            r.r("Super calls with default arguments not supported in this target, function: setAnyProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setAnyProperty(str, obj, str2, z10);
    }

    public static /* synthetic */ void setBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setBigDecimalProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setBigDecimalProperty(str, bigDecimal, str2, z10);
    }

    public static /* synthetic */ void setBooleanProperty$default(i iVar, String str, boolean z10, String str2, boolean z11, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setBooleanProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z11 = false;
        }
        iVar.setBooleanProperty(str, z10, str2, z11);
    }

    public static /* synthetic */ void setDoubleProperty$default(i iVar, String str, double d10, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setDoubleProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setDoubleProperty(str, d10, str3, z10);
    }

    public static /* synthetic */ void setEnumProperty$default(i iVar, String str, Enum r22, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setEnumProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        str.getClass();
        r22.getClass();
        str2.getClass();
        iVar.setOptAnyProperty(str, r22.toString(), str2, z10);
    }

    public static /* synthetic */ void setFloatProperty$default(i iVar, String str, float f3, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setFloatProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setFloatProperty(str, f3, str2, z10);
    }

    public static /* synthetic */ void setIntProperty$default(i iVar, String str, int i3, String str2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setIntProperty");
            return;
        }
        if ((i10 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        iVar.setIntProperty(str, i3, str2, z10);
    }

    public static /* synthetic */ void setListProperty$default(i iVar, String str, List list, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setListProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setListProperty(str, list, str2, z10);
    }

    public static /* synthetic */ void setLongProperty$default(i iVar, String str, long j, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setLongProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setLongProperty(str, j, str3, z10);
    }

    public static /* synthetic */ void setMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setMapModelProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setMapModelProperty(str, hVar, str2, z10);
    }

    public static /* synthetic */ void setOptAnyProperty$default(i iVar, String str, Object obj, String str2, boolean z10, int i3, Object obj2) {
        if (obj2 != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptAnyProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptAnyProperty(str, obj, str2, z10);
    }

    public static /* synthetic */ void setOptBigDecimalProperty$default(i iVar, String str, BigDecimal bigDecimal, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptBigDecimalProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptBigDecimalProperty(str, bigDecimal, str2, z10);
    }

    public static /* synthetic */ void setOptBooleanProperty$default(i iVar, String str, Boolean bool, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptBooleanProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptBooleanProperty(str, bool, str2, z10);
    }

    public static /* synthetic */ void setOptDoubleProperty$default(i iVar, String str, Double d10, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptDoubleProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptDoubleProperty(str, d10, str2, z10);
    }

    public static /* synthetic */ void setOptEnumProperty$default(i iVar, String str, Enum r22, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptEnumProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        str.getClass();
        str2.getClass();
        iVar.setOptAnyProperty(str, r22 != null ? r22.toString() : null, str2, z10);
    }

    public static /* synthetic */ void setOptFloatProperty$default(i iVar, String str, Float f3, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptFloatProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptFloatProperty(str, f3, str2, z10);
    }

    public static /* synthetic */ void setOptIntProperty$default(i iVar, String str, Integer num, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptIntProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptIntProperty(str, num, str2, z10);
    }

    public static /* synthetic */ void setOptListProperty$default(i iVar, String str, List list, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptListProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptListProperty(str, list, str2, z10);
    }

    public static /* synthetic */ void setOptLongProperty$default(i iVar, String str, Long l10, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptLongProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptLongProperty(str, l10, str2, z10);
    }

    public static /* synthetic */ void setOptMapModelProperty$default(i iVar, String str, h hVar, String str2, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptMapModelProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str2 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptMapModelProperty(str, hVar, str2, z10);
    }

    public static /* synthetic */ void setOptStringProperty$default(i iVar, String str, String str2, String str3, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setOptStringProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setOptStringProperty(str, str2, str3, z10);
    }

    public static /* synthetic */ void setStringProperty$default(i iVar, String str, String str2, String str3, boolean z10, int i3, Object obj) {
        if (obj != null) {
            r.r("Super calls with default arguments not supported in this target, function: setStringProperty");
            return;
        }
        if ((i3 & 4) != 0) {
            str3 = "NORMAL";
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        iVar.setStringProperty(str, str2, str3, z10);
    }

    public List<?> createListForProperty(String str, JSONArray jSONArray) {
        str.getClass();
        jSONArray.getClass();
        return null;
    }

    public i createModelForProperty(String str, JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        return null;
    }

    public final Object getAnyProperty(String str, Function0<? extends Object> function0) {
        str.getClass();
        Object optAnyProperty = getOptAnyProperty(str, function0);
        optAnyProperty.getClass();
        return optAnyProperty;
    }

    public final BigDecimal getBigDecimalProperty(String str, Function0<? extends BigDecimal> function0) {
        str.getClass();
        BigDecimal optBigDecimalProperty = getOptBigDecimalProperty(str, function0);
        optBigDecimalProperty.getClass();
        return optBigDecimalProperty;
    }

    public final boolean getBooleanProperty(String str, Function0<Boolean> function0) {
        str.getClass();
        Boolean optBooleanProperty = getOptBooleanProperty(str, function0);
        optBooleanProperty.getClass();
        return optBooleanProperty.booleanValue();
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final double getDoubleProperty(String str, Function0<Double> function0) {
        str.getClass();
        Double optDoubleProperty = getOptDoubleProperty(str, function0);
        optDoubleProperty.getClass();
        return optDoubleProperty.doubleValue();
    }

    public final /* synthetic */ <T extends Enum<T>> T getEnumProperty(String str) {
        str.getClass();
        if (getOptAnyProperty$default(this, str, null, 2, null) == null) {
            Intrinsics.d();
            throw null;
        }
        Intrinsics.d();
        throw null;
    }

    public final float getFloatProperty(String str, Function0<Float> function0) {
        str.getClass();
        Float optFloatProperty = getOptFloatProperty(str, function0);
        optFloatProperty.getClass();
        return optFloatProperty.floatValue();
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.changeNotifier.getHasSubscribers();
    }

    public final String getId() {
        return getStringProperty$default(this, "id", null, 2, null);
    }

    public final int getIntProperty(String str, Function0<Integer> function0) {
        str.getClass();
        Integer optIntProperty = getOptIntProperty(str, function0);
        optIntProperty.getClass();
        return optIntProperty.intValue();
    }

    public final <T> List<T> getListProperty(String str, Function0<? extends List<? extends T>> function0) {
        str.getClass();
        List<T> optListProperty = getOptListProperty(str, function0);
        optListProperty.getClass();
        return optListProperty;
    }

    public final long getLongProperty(String str, Function0<Long> function0) {
        str.getClass();
        Long optLongProperty = getOptLongProperty(str, function0);
        optLongProperty.getClass();
        return optLongProperty.longValue();
    }

    public final <T> h getMapModelProperty(String str, Function0<? extends h> function0) {
        str.getClass();
        h optMapModelProperty = getOptMapModelProperty(str, function0);
        optMapModelProperty.getClass();
        return optMapModelProperty;
    }

    public final Object getOptAnyProperty(String str, Function0<? extends Object> function0) {
        Object obj;
        str.getClass();
        synchronized (this.data) {
            try {
                if (!this.data.containsKey(str) && function0 != null) {
                    obj = function0.invoke();
                    this.data.put(str, obj);
                }
                obj = this.data.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final BigDecimal getOptBigDecimalProperty(String str, Function0<? extends BigDecimal> function0) {
        str.getClass();
        Object optAnyProperty = getOptAnyProperty(str, function0);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? new BigDecimal(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? new BigDecimal(((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? new BigDecimal(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? new BigDecimal(((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof String ? new BigDecimal((String) optAnyProperty) : (BigDecimal) optAnyProperty;
    }

    public final Boolean getOptBooleanProperty(String str, Function0<Boolean> function0) {
        str.getClass();
        return (Boolean) getOptAnyProperty(str, function0);
    }

    public final Double getOptDoubleProperty(String str, Function0<Double> function0) {
        str.getClass();
        Object optAnyProperty = getOptAnyProperty(str, function0);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Double ? (Double) optAnyProperty : optAnyProperty instanceof Float ? Double.valueOf(((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Integer ? Double.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Double.valueOf(((Number) optAnyProperty).longValue()) : (Double) optAnyProperty;
    }

    public final /* synthetic */ <T extends Enum<T>> T getOptEnumProperty(String str) {
        str.getClass();
        if (getOptAnyProperty$default(this, str, null, 2, null) == null) {
            return null;
        }
        Intrinsics.d();
        throw null;
    }

    public final Float getOptFloatProperty(String str, Function0<Float> function0) {
        str.getClass();
        Object optAnyProperty = getOptAnyProperty(str, function0);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Float ? (Float) optAnyProperty : optAnyProperty instanceof Double ? Float.valueOf((float) ((Number) optAnyProperty).doubleValue()) : optAnyProperty instanceof Integer ? Float.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Long ? Float.valueOf(((Number) optAnyProperty).longValue()) : (Float) optAnyProperty;
    }

    public final Integer getOptIntProperty(String str, Function0<Integer> function0) {
        str.getClass();
        Object optAnyProperty = getOptAnyProperty(str, function0);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Integer ? (Integer) optAnyProperty : optAnyProperty instanceof Long ? Integer.valueOf((int) ((Number) optAnyProperty).longValue()) : optAnyProperty instanceof Float ? Integer.valueOf((int) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Integer.valueOf((int) ((Number) optAnyProperty).doubleValue()) : (Integer) optAnyProperty;
    }

    public final <T> List<T> getOptListProperty(String str, Function0<? extends List<? extends T>> function0) {
        str.getClass();
        return (List) getOptAnyProperty(str, function0);
    }

    public final Long getOptLongProperty(String str, Function0<Long> function0) {
        str.getClass();
        Object optAnyProperty = getOptAnyProperty(str, function0);
        if (optAnyProperty == null) {
            return null;
        }
        return optAnyProperty instanceof Long ? (Long) optAnyProperty : optAnyProperty instanceof Integer ? Long.valueOf(((Number) optAnyProperty).intValue()) : optAnyProperty instanceof Float ? Long.valueOf((long) ((Number) optAnyProperty).floatValue()) : optAnyProperty instanceof Double ? Long.valueOf((long) ((Number) optAnyProperty).doubleValue()) : (Long) optAnyProperty;
    }

    public final <T> h getOptMapModelProperty(String str, Function0<? extends h> function0) {
        str.getClass();
        return (h) getOptAnyProperty(str, function0);
    }

    public final String getOptStringProperty(String str, Function0<String> function0) {
        str.getClass();
        return (String) getOptAnyProperty(str, function0);
    }

    public final String getStringProperty(String str, Function0<String> function0) {
        str.getClass();
        String optStringProperty = getOptStringProperty(str, function0);
        optStringProperty.getClass();
        return optStringProperty;
    }

    public final boolean hasProperty(String str) {
        str.getClass();
        return this.data.containsKey(str);
    }

    public final void initializeFromJson(JSONObject jSONObject) {
        boolean z10;
        Method method;
        jSONObject.getClass();
        synchronized (this.data) {
            try {
                this.data.clear();
                Iterator<String> keys = jSONObject.keys();
                keys.getClass();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONObject) {
                        next.getClass();
                        i createModelForProperty = createModelForProperty(next, (JSONObject) obj);
                        if (createModelForProperty != null) {
                            this.data.put(next, createModelForProperty);
                        }
                    } else if (obj instanceof JSONArray) {
                        next.getClass();
                        List<?> createListForProperty = createListForProperty(next, (JSONArray) obj);
                        if (createListForProperty != null) {
                            this.data.put(next, createListForProperty);
                        }
                    } else {
                        Method[] methods = getClass().getMethods();
                        methods.getClass();
                        int length = methods.length;
                        int i3 = 0;
                        while (true) {
                            z10 = true;
                            if (i3 >= length) {
                                method = null;
                                break;
                            }
                            method = methods[i3];
                            if (!Intrinsics.a(method.getReturnType(), Void.class)) {
                                if (o.f(method.getName(), "get" + next, true)) {
                                    break;
                                }
                            }
                            i3++;
                        }
                        Class<?> returnType = method != null ? method.getReturnType() : null;
                        if (Intrinsics.a(returnType, Double.TYPE) ? true : Intrinsics.a(returnType, Double.class)) {
                            Map<String, Object> map = this.data;
                            next.getClass();
                            map.put(next, Double.valueOf(jSONObject.getDouble(next)));
                        } else {
                            if (Intrinsics.a(returnType, Long.TYPE) ? true : Intrinsics.a(returnType, Long.class)) {
                                Map<String, Object> map2 = this.data;
                                next.getClass();
                                map2.put(next, Long.valueOf(jSONObject.getLong(next)));
                            } else {
                                if (Intrinsics.a(returnType, Float.TYPE) ? true : Intrinsics.a(returnType, Float.class)) {
                                    Map<String, Object> map3 = this.data;
                                    next.getClass();
                                    map3.put(next, Float.valueOf((float) jSONObject.getDouble(next)));
                                } else {
                                    if (Intrinsics.a(returnType, Integer.TYPE) ? true : Intrinsics.a(returnType, Integer.class)) {
                                        Map<String, Object> map4 = this.data;
                                        next.getClass();
                                        map4.put(next, Integer.valueOf(jSONObject.getInt(next)));
                                    } else {
                                        if (Intrinsics.a(returnType, Boolean.TYPE) ? true : Intrinsics.a(returnType, Boolean.class)) {
                                            Map<String, Object> map5 = this.data;
                                            next.getClass();
                                            map5.put(next, Boolean.valueOf(jSONObject.getBoolean(next)));
                                        } else {
                                            if (!Intrinsics.a(returnType, String.class)) {
                                                z10 = Intrinsics.a(returnType, String.class);
                                            }
                                            Map<String, Object> map6 = this.data;
                                            if (z10) {
                                                next.getClass();
                                                map6.put(next, jSONObject.getString(next));
                                            } else {
                                                next.getClass();
                                                map6.put(next, jSONObject.get(next));
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

    public final void initializeFromModel(String str, i iVar) {
        iVar.getClass();
        Map<? extends String, ? extends Object> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        for (Map.Entry<String, Object> entry : iVar.data.entrySet()) {
            if (entry.getValue() instanceof i) {
                Object value = entry.getValue();
                value.getClass();
                i iVar2 = (i) value;
                iVar2._parentModel = this;
                synchronizedMap.getClass();
                synchronizedMap.put(entry.getKey(), iVar2);
            } else {
                synchronizedMap.getClass();
                synchronizedMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (str != null) {
            synchronizedMap.getClass();
            synchronizedMap.put("id", str);
        }
        synchronized (this.data) {
            this.data.clear();
            Map<String, Object> map = this.data;
            synchronizedMap.getClass();
            map.putAll(synchronizedMap);
        }
    }

    public final void setAnyProperty(String str, Object obj, String str2, boolean z10) {
        str.getClass();
        obj.getClass();
        str2.getClass();
        setOptAnyProperty(str, obj, str2, z10);
    }

    public final void setBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z10) {
        str.getClass();
        bigDecimal.getClass();
        str2.getClass();
        setOptBigDecimalProperty(str, bigDecimal, str2, z10);
    }

    public final void setBooleanProperty(String str, boolean z10, String str2, boolean z11) {
        str.getClass();
        str2.getClass();
        setOptBooleanProperty(str, Boolean.valueOf(z10), str2, z11);
    }

    public final void setDoubleProperty(String str, double d10, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptDoubleProperty(str, Double.valueOf(d10), str2, z10);
    }

    public final /* synthetic */ <T extends Enum<T>> void setEnumProperty(String str, T t6, String str2, boolean z10) {
        str.getClass();
        t6.getClass();
        str2.getClass();
        setOptAnyProperty(str, t6.toString(), str2, z10);
    }

    public final void setFloatProperty(String str, float f3, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptFloatProperty(str, Float.valueOf(f3), str2, z10);
    }

    public final void setId(String str) {
        str.getClass();
        setStringProperty$default(this, "id", str, null, false, 12, null);
    }

    public final void setIntProperty(String str, int i3, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptIntProperty(str, Integer.valueOf(i3), str2, z10);
    }

    public final <T> void setListProperty(String str, List<? extends T> list, String str2, boolean z10) {
        str.getClass();
        list.getClass();
        str2.getClass();
        setOptListProperty(str, list, str2, z10);
    }

    public final void setLongProperty(String str, long j, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptLongProperty(str, Long.valueOf(j), str2, z10);
    }

    public final <T> void setMapModelProperty(String str, h hVar, String str2, boolean z10) {
        str.getClass();
        hVar.getClass();
        str2.getClass();
        setOptMapModelProperty(str, hVar, str2, z10);
    }

    public final void setOptAnyProperty(String str, Object obj, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        Object obj2 = this.data.get(str);
        synchronized (this.data) {
            try {
                if (!Intrinsics.a(obj2, obj) || z10) {
                    Map<String, Object> map = this.data;
                    if (obj != null) {
                        map.put(str, obj);
                    } else if (map.containsKey(str)) {
                        this.data.remove(str);
                    }
                    notifyChanged(str, str, str2, obj2, obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void setOptBigDecimalProperty(String str, BigDecimal bigDecimal, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, bigDecimal != null ? bigDecimal.toString() : null, str2, z10);
    }

    public final void setOptBooleanProperty(String str, Boolean bool, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, bool, str2, z10);
    }

    public final void setOptDoubleProperty(String str, Double d10, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, d10, str2, z10);
    }

    public final /* synthetic */ <T extends Enum<T>> void setOptEnumProperty(String str, T t6, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, t6 != null ? t6.toString() : null, str2, z10);
    }

    public final void setOptFloatProperty(String str, Float f3, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, f3, str2, z10);
    }

    public final void setOptIntProperty(String str, Integer num, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, num, str2, z10);
    }

    public final <T> void setOptListProperty(String str, List<? extends T> list, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, list, str2, z10);
    }

    public final void setOptLongProperty(String str, Long l10, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, l10, str2, z10);
    }

    public final <T> void setOptMapModelProperty(String str, h hVar, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        setOptAnyProperty(str, hVar, str2, z10);
    }

    public final void setOptStringProperty(String str, String str2, String str3, boolean z10) {
        str.getClass();
        str3.getClass();
        setOptAnyProperty(str, str2, str3, z10);
    }

    public final void setStringProperty(String str, String str2, String str3, boolean z10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        setOptStringProperty(str, str2, str3, z10);
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(com.onesignal.common.modeling.a aVar) {
        aVar.getClass();
        this.changeNotifier.subscribe(aVar);
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

    @Override // com.onesignal.common.events.d
    public void unsubscribe(com.onesignal.common.modeling.a aVar) {
        aVar.getClass();
        this.changeNotifier.unsubscribe(aVar);
    }

    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a extends p implements Function1 {
        final /* synthetic */ j $changeArgs;
        final /* synthetic */ String $tag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(1);
            this.$changeArgs = jVar;
            this.$tag = str;
        }

        public final void invoke(com.onesignal.common.modeling.a aVar) {
            aVar.getClass();
            aVar.onChanged(this.$changeArgs, this.$tag);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.onesignal.common.modeling.a) obj);
            return Unit.f5554a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ i(i iVar, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : iVar, (i3 & 2) != 0 ? null : str);
    }
}
