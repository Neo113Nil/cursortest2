package io.flutter.plugins.inapppurchase;

import a.AbstractC0124a;
import android.util.Log;
import d3.j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import x.AbstractC1514c;

/* loaded from: classes.dex */
final class MessagesPigeonUtils {
    public static final MessagesPigeonUtils INSTANCE = new MessagesPigeonUtils();

    private MessagesPigeonUtils() {
    }

    public final FlutterError createConnectionError(String channelName) {
        i.e(channelName, "channelName");
        return new FlutterError("channel-error", AbstractC1514c.a("Unable to establish connection on channel: '", channelName, "'."), "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x013e, code lost:
    
        if (deepEquals(r2.getValue(), r5.getValue()) == false) goto L132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean deepEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            if (dArr.length != dArr2.length) {
                return false;
            }
            int length = dArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                if (!doubleEquals(dArr[i4], dArr2[i4])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof float[]) && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            if (fArr.length != fArr2.length) {
                return false;
            }
            int length2 = fArr.length;
            for (int i5 = 0; i5 < length2; i5++) {
                if (!floatEquals(fArr[i5], fArr2[i5])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            int length3 = objArr.length;
            for (int i6 = 0; i6 < length3; i6++) {
                if (!deepEquals(objArr[i6], objArr2[i6])) {
                    return false;
                }
            }
            return true;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() != list2.size()) {
                return false;
            }
            Iterator it = list.iterator();
            Iterator it2 = list2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (!deepEquals(it.next(), it2.next())) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return ((obj instanceof Double) && (obj2 instanceof Double)) ? doubleEquals(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()) : ((obj instanceof Float) && (obj2 instanceof Float)) ? floatEquals(((Number) obj).floatValue(), ((Number) obj2).floatValue()) : obj.equals(obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() != map2.size()) {
            return false;
        }
        loop4: for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Iterator it3 = map2.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break loop4;
                }
                Map.Entry entry2 = (Map.Entry) it3.next();
                if (deepEquals(key, entry2.getKey())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public final int deepHash(Object obj) {
        int i4 = 0;
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return Arrays.hashCode((byte[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.hashCode((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.hashCode((long[]) obj);
        }
        int i5 = 1;
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length;
            while (i4 < length) {
                i5 = (i5 * 31) + doubleHash(dArr[i4]);
                i4++;
            }
            return i5;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length;
            while (i4 < length2) {
                i5 = (i5 * 31) + floatHash(fArr[i4]);
                i4++;
            }
            return i5;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length3 = objArr.length;
            while (i4 < length3) {
                i5 = (i5 * 31) + deepHash(objArr[i4]);
                i4++;
            }
            return i5;
        }
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i5 = (i5 * 31) + deepHash(it.next());
            }
            return i5;
        }
        if (!(obj instanceof Map)) {
            return obj instanceof Double ? doubleHash(((Number) obj).doubleValue()) : obj instanceof Float ? floatHash(((Number) obj).floatValue()) : obj.hashCode();
        }
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            i4 += deepHash(entry.getValue()) ^ (deepHash(entry.getKey()) * 31);
        }
        return i4;
    }

    public final boolean doubleEquals(double d4, double d5) {
        if ((d4 == 0.0d ? 0.0d : d4) == (d5 != 0.0d ? d5 : 0.0d)) {
            return true;
        }
        return Double.isNaN(d4) && Double.isNaN(d5);
    }

    public final int doubleHash(double d4) {
        if (d4 == 0.0d) {
            d4 = 0.0d;
        }
        long doubleToLongBits = Double.doubleToLongBits(d4);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean floatEquals(float f4, float f5) {
        if ((f4 == 0.0f ? 0.0f : f4) == (f5 != 0.0f ? f5 : 0.0f)) {
            return true;
        }
        return Float.isNaN(f4) && Float.isNaN(f5);
    }

    public final int floatHash(float f4) {
        if (f4 == 0.0f) {
            f4 = 0.0f;
        }
        return Float.floatToIntBits(f4);
    }

    public final List<Object> wrapError(Throwable exception) {
        i.e(exception, "exception");
        if (exception instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) exception;
            return j.W(flutterError.getCode(), flutterError.getMessage(), flutterError.getDetails());
        }
        return j.W(exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }

    public final List<Object> wrapResult(Object obj) {
        return AbstractC0124a.H(obj);
    }
}
