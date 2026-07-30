package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.AFg1kSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFg1iSDK {
    public static final Object getMediationNetwork = new Object() { // from class: com.appsflyer.internal.AFg1iSDK.3
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double getMonetizationNetwork = Double.valueOf(-0.0d);
    private final LinkedHashMap<String, Object> getCurrencyIso4217Code;

    private AFg1iSDK(Object obj) {
        try {
            Map map = AFa1kSDK.i;
            Object obj2 = map.get(1992192254);
            if (obj2 == null) {
                obj2 = ((Class) AFa1kSDK.getMediationNetwork((char) (6866 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.getTrimmedLength("") + 37, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 360)).getDeclaredMethod("getRevenue", null);
                map.put(1992192254, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (invoke instanceof AFg1iSDK) {
                this.getCurrencyIso4217Code = ((AFg1iSDK) invoke).getCurrencyIso4217Code;
                return;
            }
            Object[] objArr = {invoke, "AFJsonObject"};
            Object obj3 = map.get(-606687041);
            if (obj3 == null) {
                obj3 = ((Class) AFa1kSDK.getMediationNetwork((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, 286 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getDeclaredMethod("getRevenue", Object.class, String.class);
                map.put(-606687041, obj3);
            }
            throw ((Throwable) ((Method) obj3).invoke(null, objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static String getCurrencyIso4217Code(Number number) {
        if (number == null) {
            throw new AFg1jSDK("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(doubleValue)};
            Map map = AFa1kSDK.i;
            Object obj = map.get(352463604);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getMediationNetwork((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 37 - View.MeasureSpec.getSize(0), 286 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).getDeclaredMethod("getCurrencyIso4217Code", Double.TYPE);
                map.put(352463604, obj);
            }
            ((Double) ((Method) obj).invoke(null, objArr)).getClass();
            if (number.equals(getMonetizationNetwork)) {
                return "-0";
            }
            long longValue = number.longValue();
            return doubleValue == ((double) longValue) ? Long.toString(longValue) : number.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMonetizationNetwork(Object obj) {
        if (obj == null) {
            return getMediationNetwork;
        }
        if (((Class) AFa1kSDK.getMediationNetwork((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 2133), 36 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 323 - Color.alpha(0))).isInstance(obj)) {
            return obj;
        }
        if (obj instanceof AFg1iSDK) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Map map = AFa1kSDK.i;
                Object obj2 = map.get(1249008318);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1kSDK.getMediationNetwork((char) (Color.green(0) + 2133), 37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 323 - (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredConstructor(String.class);
                    map.put(1249008318, obj2);
                }
                obj = ((Constructor) obj2).newInstance(objArr);
                return obj;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (obj instanceof JSONObject) {
            return new AFg1iSDK(obj.toString());
        }
        if (obj.equals(getMediationNetwork)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Map map2 = AFa1kSDK.i;
                Object obj3 = map2.get(-2094813449);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1kSDK.getMediationNetwork((char) (2134 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 37 - View.getDefaultSize(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 323)).getDeclaredConstructor(Collection.class);
                    map2.put(-2094813449, obj3);
                }
                return ((Constructor) obj3).newInstance(objArr2);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (obj.getClass().isArray()) {
            try {
                Object[] objArr3 = {obj};
                Map map3 = AFa1kSDK.i;
                Object obj4 = map3.get(-455505300);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1kSDK.getMediationNetwork((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 2133), 37 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getEdgeSlop() >> 16) + 323)).getDeclaredConstructor(Object.class);
                    map3.put(-455505300, obj4);
                }
                return ((Constructor) obj4).newInstance(objArr3);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
        if (obj instanceof Map) {
            return new AFg1iSDK((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
        return null;
    }

    public final void getMediationNetwork(AFg1kSDK aFg1kSDK) {
        aFg1kSDK.getCurrencyIso4217Code(AFg1kSDK.AFa1ySDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getCurrencyIso4217Code.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new AFg1jSDK("Names must be non-null");
            }
            aFg1kSDK.getMediationNetwork();
            aFg1kSDK.getRevenue(key);
            aFg1kSDK.AFAdRevenueData(entry.getValue());
        }
        aFg1kSDK.getCurrencyIso4217Code(AFg1kSDK.AFa1ySDK.EMPTY_OBJECT, AFg1kSDK.AFa1ySDK.NONEMPTY_OBJECT, "}");
    }

    public final AFg1iSDK getRevenue(String str, Object obj) {
        if (obj == null) {
            this.getCurrencyIso4217Code.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFa1kSDK.i;
                Object obj2 = map.get(352463604);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1kSDK.getMediationNetwork((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 285)).getMethod("getCurrencyIso4217Code", Double.TYPE);
                    map.put(352463604, obj2);
                }
                ((Double) ((Method) obj2).invoke(null, objArr)).getClass();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getCurrencyIso4217Code;
        if (str == null) {
            throw new AFg1jSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public final String toString() {
        try {
            AFg1kSDK aFg1kSDK = new AFg1kSDK();
            getMediationNetwork(aFg1kSDK);
            return aFg1kSDK.toString();
        } catch (AFg1jSDK unused) {
            return null;
        }
    }

    public AFg1iSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.getCurrencyIso4217Code.put(str, getMonetizationNetwork(entry.getValue()));
            } else {
                l.b("key == null");
                throw null;
            }
        }
    }

    public AFg1iSDK() {
        this.getCurrencyIso4217Code = new LinkedHashMap<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFg1iSDK(String str) {
        this(((Constructor) r2).newInstance(r6));
        try {
            Object[] objArr = {str};
            Map map = AFa1kSDK.i;
            Object obj = map.get(-1460506496);
            if (obj == null) {
                obj = ((Class) AFa1kSDK.getMediationNetwork((char) (6866 - (ViewConfiguration.getTapTimeout() >> 16)), 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 360)).getDeclaredConstructor(String.class);
                map.put(-1460506496, obj);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
