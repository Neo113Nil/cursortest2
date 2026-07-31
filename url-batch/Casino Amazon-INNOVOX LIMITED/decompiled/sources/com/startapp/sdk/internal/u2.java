package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f447a;
    public final String b;
    public final String[] c;
    public final Class[] d;
    public final Object[] e;
    public final String[] f;
    public transient SoftReference g;
    public final transient ConcurrentHashMap h = new ConcurrentHashMap();

    public u2(String str, String str2, String[] strArr, Class[] clsArr, Object[] objArr, String[] strArr2) {
        this.f447a = str;
        this.b = str2;
        this.c = strArr;
        this.d = clsArr;
        this.e = objArr;
        this.f = strArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public final JSONArray a(Context context, int[] iArr, Integer num) {
        Comparator comparator;
        try {
            w2 a2 = a(context);
            Object invoke = a2.b.invoke(a2.f477a, this.e);
            Iterator it = invoke == null ? t2.f431a : invoke instanceof Collection ? ((Collection) invoke).iterator() : invoke.getClass().isArray() ? new s2(Array.getLength(invoke), invoke) : Collections.singleton(invoke).iterator();
            ?? arrayList = new ArrayList();
            while (true) {
                comparator = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    JSONObject jSONObject = new JSONObject();
                    Class<?> cls = next.getClass();
                    SoftReference softReference = (SoftReference) this.h.get(cls.getName());
                    Map map = softReference != null ? (Map) softReference.get() : null;
                    if (map == null) {
                        map = a(cls, this.f);
                        this.h.put(cls.getName(), new SoftReference(map));
                    }
                    if (map.isEmpty()) {
                        try {
                            jSONObject.put("", next.toString());
                        } catch (Throwable unused) {
                        }
                    } else {
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            try {
                                if (value instanceof Field) {
                                    jSONObject.put(str, a(((Field) value).get(next)));
                                } else if (value instanceof Method) {
                                    jSONObject.put(str, a(((Method) value).invoke(next, null)));
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    arrayList.add(jSONObject);
                }
            }
            if (iArr != null && iArr.length > 0) {
                int length = this.f.length;
                for (int i : iArr) {
                    if (i != 0 && Math.abs(i) <= length) {
                        Comparator eaVar = new ea(this.f[Math.abs(i) - 1]);
                        if (i < 0) {
                            eaVar = Collections.reverseOrder(eaVar);
                        }
                        comparator = comparator == null ? eaVar : new t5(comparator, eaVar);
                    }
                }
                if (comparator != null) {
                    Collections.sort(arrayList, comparator);
                }
            }
            if (num != null && num.intValue() > 0) {
                arrayList = arrayList.subList(0, Math.min(num.intValue(), arrayList.size()));
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jSONArray.put((JSONObject) it2.next());
            }
            return jSONArray;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(String.valueOf(5), e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(String.valueOf(5), e2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u2.class == obj.getClass()) {
            u2 u2Var = (u2) obj;
            String str = this.f447a;
            String str2 = u2Var.f447a;
            WeakHashMap weakHashMap = zh.f528a;
            if (str.equals(str2) && this.b.equals(u2Var.b) && Arrays.equals(this.c, u2Var.c) && Arrays.equals(this.e, u2Var.e) && Arrays.equals(this.f, u2Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f447a, this.b, this.c, this.e, this.f};
        WeakHashMap weakHashMap = zh.f528a;
        return Arrays.deepHashCode(objArr);
    }

    public static Object a(Object obj) {
        if (obj instanceof Short) {
            return Integer.valueOf(((Short) obj).intValue());
        }
        if (!(obj instanceof Integer) && !(obj instanceof Long)) {
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if (!(obj instanceof Double) && !(obj instanceof Boolean) && !(obj instanceof String)) {
                if (obj != null) {
                    return obj.toString();
                }
                return null;
            }
        }
        return obj;
    }

    public final w2 a(Context context) {
        Object obj;
        SoftReference softReference = this.g;
        w2 w2Var = softReference != null ? (w2) softReference.get() : null;
        if (w2Var != null) {
            return w2Var;
        }
        Object systemService = context.getSystemService(this.f447a);
        if (systemService == null) {
            try {
                Object obj2 = a(Context.class, new String[]{this.f447a}).get(this.f447a);
                if (obj2 instanceof Method) {
                    obj = ((Method) obj2).invoke(context, null);
                } else if (obj2 instanceof Field) {
                    obj = ((Field) obj2).get(context);
                }
                systemService = obj;
            } catch (Throwable unused) {
            }
        }
        if (systemService != null) {
            try {
                Method a2 = a(systemService.getClass(), this.b, this.d);
                if (!a2.isAccessible()) {
                    try {
                        a2.setAccessible(true);
                    } catch (SecurityException e) {
                        throw new RuntimeException(String.valueOf(4), e);
                    }
                }
                w2 w2Var2 = new w2(systemService, a2);
                this.g = new SoftReference(w2Var2);
                return w2Var2;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(String.valueOf(3), e2);
            }
        }
        throw new RuntimeException(String.valueOf(1));
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        NoSuchMethodException noSuchMethodException = null;
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                if (noSuchMethodException == null) {
                    noSuchMethodException = e;
                }
                cls = cls.getSuperclass();
            }
        }
        throw noSuchMethodException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r5.isAccessible() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        r5.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r0.put(r4, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinkedHashMap a(Class cls, String[] strArr) {
        Object e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            NoSuchFieldException noSuchFieldException = null;
            Class cls2 = cls;
            while (true) {
                if (cls2 != null) {
                    try {
                        try {
                            Field declaredField = cls2.getDeclaredField(str);
                            try {
                                break;
                            } catch (NoSuchFieldException e2) {
                                e = e2;
                            }
                        } catch (SecurityException e3) {
                            e = e3;
                        }
                    } catch (NoSuchFieldException e4) {
                        if (noSuchFieldException == null) {
                            noSuchFieldException = e4;
                        }
                        cls2 = cls2.getSuperclass();
                    }
                } else {
                    throw noSuchFieldException;
                }
                e = e2;
                String str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                try {
                    try {
                        Method a2 = a(cls, "get" + str2, new Class[0]);
                        if (!a2.isAccessible()) {
                            a2.setAccessible(true);
                        }
                        linkedHashMap.put(str, a2);
                    } catch (NoSuchMethodException unused) {
                        Method a3 = a(cls, "is" + str2, new Class[0]);
                        if (!a3.isAccessible()) {
                            a3.setAccessible(true);
                        }
                        linkedHashMap.put(str, a3);
                    }
                } catch (NoSuchMethodException | SecurityException unused2) {
                    linkedHashMap.put(str, e);
                }
            }
        }
        return linkedHashMap;
        i++;
    }
}
