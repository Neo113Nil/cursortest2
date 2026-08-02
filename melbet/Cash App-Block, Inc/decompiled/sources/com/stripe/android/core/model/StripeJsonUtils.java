package com.stripe.android.core.model;

import android.os.Build;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.trace.opentelemetry.internal.MiscUtilsKt$executeIfJavaFunctionPackageExists$1;
import io.opentelemetry.api.trace.DefaultTracerProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class StripeJsonUtils {
    public static Object executeIfJavaFunctionPackageExists$default(InternalLogger internalLogger, DefaultTracerProvider defaultTracerProvider, Function0 function0) {
        BuildSdkVersionProvider.Companion.getClass();
        if (BuildSdkVersionProvider.Companion.DEFAULT.isAtLeastN) {
            return function0.invoke();
        }
        try {
            return function0.invoke();
        } catch (Throwable th) {
            if (internalLogger != null) {
                DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, MiscUtilsKt$executeIfJavaFunctionPackageExists$1.INSTANCE, th, false, 48);
            }
            return defaultTracerProvider;
        }
    }

    public static ArrayList jsonArrayToList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        IntRange until = RangesKt___RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            arrayList.add(jSONArray.get(it.nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof JSONArray) {
                next = jsonArrayToList((JSONArray) next);
            } else if (next instanceof JSONObject) {
                next = jsonObjectToMap((JSONObject) next);
            } else if (Intrinsics.areEqual(next, "null")) {
                next = null;
            }
            if (next != null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static Map jsonObjectToMap(JSONObject jSONObject) {
        Map map;
        if (jSONObject == null) {
            return null;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        IntRange until = RangesKt___RangesKt.until(0, names.length());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
        IntProgressionIterator it = until.iterator();
        while (it.hasNext) {
            arrayList.add(names.getString(it.nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            Object opt = jSONObject.opt(str);
            if (opt == null || opt.equals("null")) {
                map = null;
            } else {
                if (opt instanceof JSONObject) {
                    opt = jsonObjectToMap((JSONObject) opt);
                } else if (opt instanceof JSONArray) {
                    opt = jsonArrayToList((JSONArray) opt);
                }
                map = MapsKt__MapsJVMKt.mapOf(new Pair(str, opt));
            }
            if (map != null) {
                arrayList2.add(map);
            }
        }
        Map map2 = EmptyMap.INSTANCE;
        map2.getClass();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            map2 = MapsKt__MapsKt.plus(map2, (Map) it3.next());
        }
        return map2;
    }

    public static JSONArray listToJsonArray(List list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                obj = mapToJsonObject((Map) obj);
            } else if (obj instanceof List) {
                obj = listToJsonArray((List) obj);
            } else if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                obj = String.valueOf(obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public static JSONObject mapToJsonObject(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj != null) {
                try {
                    if (obj instanceof Map) {
                        jSONObject.put(str, mapToJsonObject((Map) obj));
                    } else if (obj instanceof List) {
                        jSONObject.put(str, listToJsonArray((List) obj));
                    } else {
                        if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                            jSONObject.put(str, obj.toString());
                        }
                        jSONObject.put(str, obj);
                    }
                } catch (ClassCastException | JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public static final DensityImpl nonLinearScalingDensity(Composer composer, int i) {
        float f = (i & 1) != 0 ? Float.MAX_VALUE : 1.5f;
        Density density = (Density) ((GapComposer) composer).consume(CompositionLocalsKt.LocalDensity);
        return new DensityImpl(density.getDensity(), Math.min(Build.VERSION.SDK_INT <= 33 ? density.getFontScale() > 1.0f ? (density.getFontScale() - ((float) Math.sqrt(density.getFontScale()))) + 1.0f : density.getFontScale() : density.getFontScale(), f));
    }

    public static String nullIfNullOrEmpty(String str) {
        if (str == null || "null".equals(str) || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final String optCurrency(JSONObject jSONObject) {
        String nullIfNullOrEmpty = nullIfNullOrEmpty(jSONObject.optString("currency"));
        if (nullIfNullOrEmpty == null || nullIfNullOrEmpty.length() != 3) {
            return null;
        }
        return nullIfNullOrEmpty;
    }

    public static final String optString(String str, JSONObject jSONObject) {
        return nullIfNullOrEmpty(jSONObject != null ? jSONObject.optString(str) : null);
    }
}
