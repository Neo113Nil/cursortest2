package com.moat.analytics.mobile.you;

import com.moat.analytics.mobile.you.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes2.dex */
class x<T> implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f7558a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    private final a<T> f7559b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<T> f7560c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedList<x<T>.b> f7561d;
    private boolean e;
    private T f;

    interface a<T> {
        com.moat.analytics.mobile.you.a.b.a<T> a();
    }

    private class b {

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference[] f7564b;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedList<Object> f7565c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f7566d;

        private b(Method method, Object... objArr) {
            this.f7565c = new LinkedList<>();
            objArr = objArr == null ? x.f7558a : objArr;
            WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                if ((obj instanceof Map) || (obj instanceof Integer) || (obj instanceof Double)) {
                    this.f7565c.add(obj);
                }
                weakReferenceArr[i2] = new WeakReference(obj);
                i++;
                i2++;
            }
            this.f7564b = weakReferenceArr;
            this.f7566d = method;
        }
    }

    x(a<T> aVar, Class<T> cls) {
        com.moat.analytics.mobile.you.a.a.a.a(aVar);
        com.moat.analytics.mobile.you.a.a.a.a(cls);
        this.f7559b = aVar;
        this.f7560c = cls;
        this.f7561d = new LinkedList<>();
        w.a().a(new w.b() { // from class: com.moat.analytics.mobile.you.x.1
            @Override // com.moat.analytics.mobile.you.w.b
            public void c() {
                x.this.c();
            }

            @Override // com.moat.analytics.mobile.you.w.b
            public void d() {
            }
        });
    }

    static <T> T a(a<T> aVar, Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new x(aVar, cls));
    }

    private Object a(Method method) {
        try {
            return Boolean.TYPE.equals(method.getReturnType()) ? true : null;
        } catch (Exception e) {
            m.a(e);
            return null;
        }
    }

    private Object a(Method method, Object[] objArr) {
        Class<?> declaringClass = method.getDeclaringClass();
        w a2 = w.a();
        if (Object.class.equals(declaringClass)) {
            String name = method.getName();
            if ("getClass".equals(name)) {
                return this.f7560c;
            }
            if (!"toString".equals(name)) {
                return method.invoke(this, objArr);
            }
            Object invoke = method.invoke(this, objArr);
            return (invoke + "").replace(x.class.getName(), this.f7560c.getName());
        }
        if (this.e && this.f == null) {
            this.f7561d.clear();
            return a(method);
        }
        if (a2.f7538a == w.d.ON) {
            c();
            if (this.f != null) {
                return method.invoke(this.f, objArr);
            }
        }
        if (a2.f7538a == w.d.OFF && (!this.e || this.f != null)) {
            b(method, objArr);
        }
        return a(method);
    }

    private void b() {
        if (this.e) {
            return;
        }
        try {
            this.f = this.f7559b.a().c(null);
        } catch (Exception e) {
            p.a("OnOffTrackerProxy", this, "Could not create instance", e);
            m.a(e);
        }
        this.e = true;
    }

    private void b(Method method, Object[] objArr) {
        if (this.f7561d.size() >= 15) {
            this.f7561d.remove(5);
        }
        this.f7561d.add(new b(method, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b();
        if (this.f == null) {
            return;
        }
        Iterator<x<T>.b> it = this.f7561d.iterator();
        while (it.hasNext()) {
            x<T>.b next = it.next();
            try {
                Object[] objArr = new Object[((b) next).f7564b.length];
                WeakReference[] weakReferenceArr = ((b) next).f7564b;
                int length = weakReferenceArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    objArr[i2] = weakReferenceArr[i].get();
                    i++;
                    i2++;
                }
                ((b) next).f7566d.invoke(this.f, objArr);
            } catch (Exception e) {
                m.a(e);
            }
        }
        this.f7561d.clear();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return a(method, objArr);
        } catch (Exception e) {
            m.a(e);
            return a(method);
        }
    }
}
