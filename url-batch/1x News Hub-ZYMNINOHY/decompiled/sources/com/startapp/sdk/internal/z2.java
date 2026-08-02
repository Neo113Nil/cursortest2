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

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4850a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4851b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f4852c;

    /* renamed from: d, reason: collision with root package name */
    public final Class[] f4853d;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f4854e;
    public final String[] f;

    /* renamed from: g, reason: collision with root package name */
    public transient SoftReference f4855g;

    /* renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f4856h = new ConcurrentHashMap();

    public z2(String str, String str2, String[] strArr, Class[] clsArr, Object[] objArr, String[] strArr2) {
        this.f4850a = str;
        this.f4851b = str2;
        this.f4852c = strArr;
        this.f4853d = clsArr;
        this.f4854e = objArr;
        this.f = strArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public final JSONArray a(Context context, int[] iArr, Integer num) {
        Comparator comparator;
        try {
            b3 a3 = a(context);
            Object invoke = a3.f3593b.invoke(a3.f3592a, this.f4854e);
            Iterator it = invoke == null ? y2.f4798a : invoke instanceof Collection ? ((Collection) invoke).iterator() : invoke.getClass().isArray() ? new x2(Array.getLength(invoke), invoke) : Collections.singleton(invoke).iterator();
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
                    SoftReference softReference = (SoftReference) this.f4856h.get(cls.getName());
                    Map map = softReference != null ? (Map) softReference.get() : null;
                    if (map == null) {
                        map = a(cls, this.f);
                        this.f4856h.put(cls.getName(), new SoftReference(map));
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
                                    jSONObject.put(str, a(((Method) value).invoke(next, new Object[0])));
                                } else {
                                    boolean z = value instanceof Throwable;
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
                for (int i3 : iArr) {
                    if (i3 != 0 && Math.abs(i3) <= length) {
                        Comparator xaVar = new xa(this.f[Math.abs(i3) - 1]);
                        if (i3 < 0) {
                            xaVar = Collections.reverseOrder(xaVar);
                        }
                        comparator = comparator == null ? xaVar : new c6(comparator, xaVar);
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
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(String.valueOf(5), e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(String.valueOf(5), e4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z2.class == obj.getClass()) {
            z2 z2Var = (z2) obj;
            if (si.a((Object) this.f4850a, (Object) z2Var.f4850a) && si.a((Object) this.f4851b, (Object) z2Var.f4851b) && Arrays.equals(this.f4852c, z2Var.f4852c) && Arrays.equals(this.f4854e, z2Var.f4854e) && Arrays.equals(this.f, z2Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f4850a, this.f4851b, this.f4852c, this.f4854e, this.f};
        WeakHashMap weakHashMap = si.f4438a;
        return Arrays.deepHashCode(objArr);
    }

    public static Object a(Object obj) {
        if (obj instanceof Short) {
            return Integer.valueOf(((Short) obj).intValue());
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final b3 a(Context context) {
        Object obj;
        SoftReference softReference = this.f4855g;
        b3 b3Var = softReference != null ? (b3) softReference.get() : null;
        if (b3Var != null) {
            return b3Var;
        }
        Object systemService = context.getSystemService(this.f4850a);
        if (systemService == null) {
            try {
                Object obj2 = a(Context.class, new String[]{this.f4850a}).get(this.f4850a);
                if (obj2 instanceof Method) {
                    obj = ((Method) obj2).invoke(context, new Object[0]);
                } else if (obj2 instanceof Field) {
                    obj = ((Field) obj2).get(context);
                } else {
                    boolean z = obj2 instanceof Throwable;
                }
                systemService = obj;
            } catch (Throwable unused) {
            }
        }
        if (systemService != null) {
            try {
                Method a3 = a(systemService.getClass(), this.f4851b, this.f4853d);
                if (!a3.isAccessible()) {
                    try {
                        a3.setAccessible(true);
                    } catch (SecurityException e3) {
                        throw new RuntimeException(String.valueOf(4), e3);
                    }
                }
                b3 b3Var2 = new b3(systemService, a3);
                this.f4855g = new SoftReference(b3Var2);
                return b3Var2;
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException(String.valueOf(3), e4);
            }
        }
        throw new RuntimeException(String.valueOf(1));
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        NoSuchMethodException noSuchMethodException = null;
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e3) {
                if (noSuchMethodException == null) {
                    noSuchMethodException = e3;
                }
                cls = cls.getSuperclass();
            }
        }
        throw noSuchMethodException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r5.isAccessible() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        r5.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0.put(r4, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinkedHashMap a(Class cls, String[] strArr) {
        Object e3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            String str = strArr[i3];
            NoSuchFieldException noSuchFieldException = null;
            Class cls2 = cls;
            while (true) {
                if (cls2 != null) {
                    try {
                        try {
                            Field declaredField = cls2.getDeclaredField(str);
                            try {
                                break;
                            } catch (NoSuchFieldException e4) {
                                e3 = e4;
                            }
                        } catch (NoSuchFieldException e5) {
                            if (noSuchFieldException == null) {
                                noSuchFieldException = e5;
                            }
                            cls2 = cls2.getSuperclass();
                        }
                    } catch (SecurityException e6) {
                        e3 = e6;
                    }
                } else {
                    throw noSuchFieldException;
                }
                e3 = e4;
                String str2 = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                try {
                    try {
                        Method a3 = a(cls, "get" + str2, new Class[0]);
                        if (!a3.isAccessible()) {
                            a3.setAccessible(true);
                        }
                        linkedHashMap.put(str, a3);
                    } catch (NoSuchMethodException unused) {
                        Method a4 = a(cls, "is" + str2, new Class[0]);
                        if (!a4.isAccessible()) {
                            a4.setAccessible(true);
                        }
                        linkedHashMap.put(str, a4);
                    }
                } catch (NoSuchMethodException | SecurityException unused2) {
                    linkedHashMap.put(str, e3);
                }
            }
        }
        return linkedHashMap;
        i3++;
    }
}
