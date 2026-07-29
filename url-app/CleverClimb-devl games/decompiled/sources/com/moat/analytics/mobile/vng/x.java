package com.moat.analytics.mobile.vng;

import com.moat.analytics.mobile.vng.w;
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
    private static final Object[] f7425a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    private final a<T> f7426b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<T> f7427c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedList<x<T>.b> f7428d;
    private boolean e;
    private T f;

    interface a<T> {
        com.moat.analytics.mobile.vng.a.b.a<T> a();
    }

    private class b {

        /* renamed from: b, reason: collision with root package name */
        private final WeakReference[] f7431b;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedList<Object> f7432c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f7433d;

        private b(Method method, Object... objArr) {
            this.f7432c = new LinkedList<>();
            objArr = objArr == null ? x.f7425a : objArr;
            WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                if ((obj instanceof Map) || (obj instanceof Integer) || (obj instanceof Double)) {
                    this.f7432c.add(obj);
                }
                weakReferenceArr[i2] = new WeakReference(obj);
                i++;
                i2++;
            }
            this.f7431b = weakReferenceArr;
            this.f7433d = method;
        }
    }

    x(a<T> aVar, Class<T> cls) {
        com.moat.analytics.mobile.vng.a.a.a.a(aVar);
        com.moat.analytics.mobile.vng.a.a.a.a(cls);
        this.f7426b = aVar;
        this.f7427c = cls;
        this.f7428d = new LinkedList<>();
        w.a().a(new w.b() { // from class: com.moat.analytics.mobile.vng.x.1
            @Override // com.moat.analytics.mobile.vng.w.b
            public void b() {
                x.this.c();
            }

            @Override // com.moat.analytics.mobile.vng.w.b
            public void c() {
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
                return this.f7427c;
            }
            if (!"toString".equals(name)) {
                return method.invoke(this, objArr);
            }
            Object invoke = method.invoke(this, objArr);
            return (invoke + "").replace(x.class.getName(), this.f7427c.getName());
        }
        if (this.e && this.f == null) {
            this.f7428d.clear();
            return a(method);
        }
        if (a2.f7405a == w.d.ON) {
            c();
            if (this.f != null) {
                return method.invoke(this.f, objArr);
            }
        }
        if (a2.f7405a == w.d.OFF && (!this.e || this.f != null)) {
            b(method, objArr);
        }
        return a(method);
    }

    private void b() {
        if (this.e) {
            return;
        }
        try {
            this.f = this.f7426b.a().c(null);
        } catch (Exception e) {
            p.a("OnOffTrackerProxy", this, "Could not create instance", e);
            m.a(e);
        }
        this.e = true;
    }

    private void b(Method method, Object[] objArr) {
        if (this.f7428d.size() >= 15) {
            this.f7428d.remove(5);
        }
        this.f7428d.add(new b(method, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b();
        if (this.f == null) {
            return;
        }
        Iterator<x<T>.b> it = this.f7428d.iterator();
        while (it.hasNext()) {
            x<T>.b next = it.next();
            try {
                Object[] objArr = new Object[((b) next).f7431b.length];
                WeakReference[] weakReferenceArr = ((b) next).f7431b;
                int length = weakReferenceArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    objArr[i2] = weakReferenceArr[i].get();
                    i++;
                    i2++;
                }
                ((b) next).f7433d.invoke(this.f, objArr);
            } catch (Exception e) {
                m.a(e);
            }
        }
        this.f7428d.clear();
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
