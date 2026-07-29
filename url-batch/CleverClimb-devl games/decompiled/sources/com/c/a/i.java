package com.c.a;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PropertyValuesHolder.java */
/* loaded from: classes.dex */
public class i implements Cloneable {
    private static final j i = new d();
    private static final j j = new b();
    private static Class[] k = {Float.TYPE, Float.class, Double.TYPE, Integer.TYPE, Double.class, Integer.class};
    private static Class[] l = {Integer.TYPE, Integer.class, Float.TYPE, Double.TYPE, Float.class, Double.class};
    private static Class[] m = {Double.TYPE, Double.class, Float.TYPE, Integer.TYPE, Float.class, Integer.class};
    private static final HashMap<Class, HashMap<String, Method>> n = new HashMap<>();
    private static final HashMap<Class, HashMap<String, Method>> o = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    String f3538a;

    /* renamed from: b, reason: collision with root package name */
    protected com.c.b.c f3539b;

    /* renamed from: c, reason: collision with root package name */
    Method f3540c;

    /* renamed from: d, reason: collision with root package name */
    Class f3541d;
    f e;
    final ReentrantReadWriteLock f;
    final Object[] g;
    private Method h;
    private j p;
    private Object q;

    private i(String str) {
        this.f3540c = null;
        this.h = null;
        this.e = null;
        this.f = new ReentrantReadWriteLock();
        this.g = new Object[1];
        this.f3538a = str;
    }

    public static i a(String str, float... fArr) {
        return new a(str, fArr);
    }

    public void a(float... fArr) {
        this.f3541d = Float.TYPE;
        this.e = f.a(fArr);
    }

    private Method a(Class cls, String str, Class cls2) {
        Method method;
        Class<?>[] clsArr;
        Method declaredMethod;
        String a2 = a(str, this.f3538a);
        if (cls2 == null) {
            try {
                return cls.getMethod(a2, null);
            } catch (NoSuchMethodException e) {
                try {
                    method = cls.getDeclaredMethod(a2, null);
                } catch (NoSuchMethodException unused) {
                    method = null;
                }
                try {
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused2) {
                    Log.e("PropertyValuesHolder", "Couldn't find no-arg method for property " + this.f3538a + ": " + e);
                    return method;
                }
                return method;
            }
        }
        Class<?>[] clsArr2 = new Class[1];
        if (this.f3541d.equals(Float.class)) {
            clsArr = k;
        } else if (this.f3541d.equals(Integer.class)) {
            clsArr = l;
        } else if (this.f3541d.equals(Double.class)) {
            clsArr = m;
        } else {
            clsArr = new Class[]{this.f3541d};
        }
        Method method2 = null;
        for (Class<?> cls3 : clsArr) {
            clsArr2[0] = cls3;
            try {
                Method method3 = cls.getMethod(a2, clsArr2);
                try {
                    this.f3541d = cls3;
                    return method3;
                } catch (NoSuchMethodException unused3) {
                    method2 = method3;
                    try {
                        declaredMethod = cls.getDeclaredMethod(a2, clsArr2);
                    } catch (NoSuchMethodException unused4) {
                    }
                    try {
                        declaredMethod.setAccessible(true);
                        this.f3541d = cls3;
                        return declaredMethod;
                    } catch (NoSuchMethodException unused5) {
                        method2 = declaredMethod;
                    }
                }
            } catch (NoSuchMethodException unused6) {
            }
        }
        Log.e("PropertyValuesHolder", "Couldn't find setter/getter for property " + this.f3538a + " with value type " + this.f3541d);
        return method2;
    }

    private Method a(Class cls, HashMap<Class, HashMap<String, Method>> hashMap, String str, Class cls2) {
        try {
            this.f.writeLock().lock();
            HashMap<String, Method> hashMap2 = hashMap.get(cls);
            Method method = hashMap2 != null ? hashMap2.get(this.f3538a) : null;
            if (method == null) {
                method = a(cls, str, cls2);
                if (hashMap2 == null) {
                    hashMap2 = new HashMap<>();
                    hashMap.put(cls, hashMap2);
                }
                hashMap2.put(this.f3538a, method);
            }
            return method;
        } finally {
            this.f.writeLock().unlock();
        }
    }

    void a(Class cls) {
        this.f3540c = a(cls, n, "set", this.f3541d);
    }

    private void b(Class cls) {
        this.h = a(cls, o, "get", null);
    }

    void a(Object obj) {
        if (this.f3539b != null) {
            try {
                this.f3539b.a(obj);
                Iterator<e> it = this.e.e.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (!next.a()) {
                        next.a(this.f3539b.a(obj));
                    }
                }
                return;
            } catch (ClassCastException unused) {
                Log.e("PropertyValuesHolder", "No such property (" + this.f3539b.a() + ") on target object " + obj + ". Trying reflection instead");
                this.f3539b = null;
            }
        }
        Class<?> cls = obj.getClass();
        if (this.f3540c == null) {
            a((Class) cls);
        }
        Iterator<e> it2 = this.e.e.iterator();
        while (it2.hasNext()) {
            e next2 = it2.next();
            if (!next2.a()) {
                if (this.h == null) {
                    b((Class) cls);
                }
                try {
                    next2.a(this.h.invoke(obj, new Object[0]));
                } catch (IllegalAccessException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }
    }

    @Override // 
    /* renamed from: a */
    public i clone() {
        try {
            i iVar = (i) super.clone();
            iVar.f3538a = this.f3538a;
            iVar.f3539b = this.f3539b;
            iVar.e = this.e.clone();
            iVar.p = this.p;
            return iVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    void b(Object obj) {
        if (this.f3539b != null) {
            this.f3539b.a(obj, d());
        }
        if (this.f3540c != null) {
            try {
                this.g[0] = d();
                this.f3540c.invoke(obj, this.g);
            } catch (IllegalAccessException e) {
                Log.e("PropertyValuesHolder", e.toString());
            } catch (InvocationTargetException e2) {
                Log.e("PropertyValuesHolder", e2.toString());
            }
        }
    }

    void b() {
        if (this.p == null) {
            this.p = this.f3541d == Integer.class ? i : this.f3541d == Float.class ? j : null;
        }
        if (this.p != null) {
            this.e.a(this.p);
        }
    }

    void a(float f) {
        this.q = this.e.a(f);
    }

    public void a(com.c.b.c cVar) {
        this.f3539b = cVar;
    }

    public String c() {
        return this.f3538a;
    }

    Object d() {
        return this.q;
    }

    public String toString() {
        return this.f3538a + ": " + this.e.toString();
    }

    static String a(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str + Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
    }

    /* compiled from: PropertyValuesHolder.java */
    static class a extends i {
        c h;
        float i;
        private com.c.b.a j;

        public a(String str, float... fArr) {
            super(str);
            a(fArr);
        }

        @Override // com.c.a.i
        public void a(float... fArr) {
            super.a(fArr);
            this.h = (c) this.e;
        }

        @Override // com.c.a.i
        void a(float f) {
            this.i = this.h.b(f);
        }

        @Override // com.c.a.i
        Object d() {
            return Float.valueOf(this.i);
        }

        @Override // com.c.a.i
        /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = (a) super.clone();
            aVar.h = (c) aVar.e;
            return aVar;
        }

        @Override // com.c.a.i
        void b(Object obj) {
            if (this.j != null) {
                this.j.a((com.c.b.a) obj, this.i);
                return;
            }
            if (this.f3539b != null) {
                this.f3539b.a(obj, Float.valueOf(this.i));
                return;
            }
            if (this.f3540c != null) {
                try {
                    this.g[0] = Float.valueOf(this.i);
                    this.f3540c.invoke(obj, this.g);
                } catch (IllegalAccessException e) {
                    Log.e("PropertyValuesHolder", e.toString());
                } catch (InvocationTargetException e2) {
                    Log.e("PropertyValuesHolder", e2.toString());
                }
            }
        }

        @Override // com.c.a.i
        void a(Class cls) {
            if (this.f3539b != null) {
                return;
            }
            super.a(cls);
        }
    }
}
