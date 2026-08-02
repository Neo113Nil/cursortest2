package io.flutter.plugins.sharedpreferences;

import a.AbstractC0124a;
import android.util.Log;
import d3.j;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import t3.C1442b;
import t3.C1443c;

/* loaded from: classes.dex */
final class MessagesAsyncPigeonUtils {
    public static final MessagesAsyncPigeonUtils INSTANCE = new MessagesAsyncPigeonUtils();

    private MessagesAsyncPigeonUtils() {
    }

    public final boolean deepEquals(Object obj, Object obj2) {
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
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                Iterable c1443c = new C1443c(0, objArr.length - 1, 1);
                if (!(c1443c instanceof Collection) || !((Collection) c1443c).isEmpty()) {
                    Iterator it = c1443c.iterator();
                    while (((C1442b) it).f15429c) {
                        int nextInt = ((C1442b) it).nextInt();
                        if (!INSTANCE.deepEquals(objArr[nextInt], objArr2[nextInt])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Iterable V4 = j.V((Collection) obj);
                if (!(V4 instanceof Collection) || !((Collection) V4).isEmpty()) {
                    Iterator it2 = V4.iterator();
                    while (((C1442b) it2).f15429c) {
                        int nextInt2 = ((C1442b) it2).nextInt();
                        if (!INSTANCE.deepEquals(list.get(nextInt2), list2.get(nextInt2))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return i.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (map2.containsKey(entry.getKey()) && INSTANCE.deepEquals(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final List<Object> wrapError(Throwable exception) {
        i.e(exception, "exception");
        if (exception instanceof SharedPreferencesError) {
            SharedPreferencesError sharedPreferencesError = (SharedPreferencesError) exception;
            return j.W(sharedPreferencesError.getCode(), sharedPreferencesError.getMessage(), sharedPreferencesError.getDetails());
        }
        return j.W(exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }

    public final List<Object> wrapResult(Object obj) {
        return AbstractC0124a.H(obj);
    }
}
