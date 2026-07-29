package com.moat.analytics.mobile.iro;

import com.moat.analytics.mobile.iro.base.asserts.Asserts;
import com.moat.analytics.mobile.iro.base.functional.Optional;
import com.moat.analytics.mobile.iro.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes2.dex */
class s<T> implements InvocationHandler {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final Object[] f1214 = new Object[0];

    /* renamed from: ˋ, reason: contains not printable characters */
    private final LinkedList<s<T>.e> f1215;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final Class<T> f1216;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f1217;

    /* renamed from: ॱ, reason: contains not printable characters */
    private final a<T> f1218;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private T f1219;

    interface a<T> {
        /* renamed from: ˏ */
        Optional<T> mo1169() throws o;
    }

    class e {

        /* renamed from: ˊ, reason: contains not printable characters */
        private final Method f1221;

        /* renamed from: ˋ, reason: contains not printable characters */
        private final LinkedList<Object> f1222;

        /* renamed from: ˎ, reason: contains not printable characters */
        private final WeakReference[] f1223;

        /* synthetic */ e(s sVar, Method method, Object[] objArr, byte b2) {
            this(method, objArr);
        }

        private e(Method method, Object... objArr) {
            this.f1222 = new LinkedList<>();
            objArr = objArr == null ? s.f1214 : objArr;
            WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                if ((obj instanceof Map) || (obj instanceof Integer) || (obj instanceof Double)) {
                    this.f1222.add(obj);
                }
                weakReferenceArr[i2] = new WeakReference(obj);
                i++;
                i2++;
            }
            this.f1223 = weakReferenceArr;
            this.f1221 = method;
        }
    }

    private s(a<T> aVar, Class<T> cls) throws o {
        Asserts.checkNotNull(aVar);
        Asserts.checkNotNull(cls);
        this.f1218 = aVar;
        this.f1216 = cls;
        this.f1215 = new LinkedList<>();
        t.m1319().m1329(new t.a() { // from class: com.moat.analytics.mobile.iro.s.1
            @Override // com.moat.analytics.mobile.iro.t.a
            /* renamed from: ॱ */
            public final void mo1265() throws o {
                s.this.m1312();
            }
        });
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static <T> T m1310(a<T> aVar, Class<T> cls) throws o {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new s(aVar, cls));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static Boolean m1309(Method method) {
        try {
            return Boolean.TYPE.equals(method.getReturnType()) ? true : null;
        } catch (Exception e2) {
            o.m1290(e2);
            return null;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Class<?> declaringClass = method.getDeclaringClass();
            t m1319 = t.m1319();
            if (Object.class.equals(declaringClass)) {
                String name = method.getName();
                if ("getClass".equals(name)) {
                    return this.f1216;
                }
                if ("toString".equals(name)) {
                    Object invoke = method.invoke(this, objArr);
                    return String.valueOf(invoke).replace(s.class.getName(), this.f1216.getName());
                }
                return method.invoke(this, objArr);
            }
            if (this.f1217 && this.f1219 == null) {
                this.f1215.clear();
                return m1309(method);
            }
            if (m1319.f1230 == t.c.f1247) {
                m1312();
                if (this.f1219 != null) {
                    return method.invoke(this.f1219, objArr);
                }
            }
            if (m1319.f1230 == t.c.f1246 && (!this.f1217 || this.f1219 != null)) {
                if (this.f1215.size() >= 15) {
                    this.f1215.remove(5);
                }
                this.f1215.add(new e(this, method, objArr, (byte) 0));
            }
            return m1309(method);
        } catch (Exception e2) {
            o.m1290(e2);
            return m1309(method);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public void m1312() throws o {
        if (!this.f1217) {
            try {
                this.f1219 = this.f1218.mo1169().orElse(null);
            } catch (Exception e2) {
                b.m1178("OnOffTrackerProxy", this, "Could not create instance", e2);
                o.m1290(e2);
            }
            this.f1217 = true;
        }
        if (this.f1219 == null) {
            return;
        }
        Iterator<s<T>.e> it = this.f1215.iterator();
        while (it.hasNext()) {
            s<T>.e next = it.next();
            try {
                Object[] objArr = new Object[((e) next).f1223.length];
                WeakReference[] weakReferenceArr = ((e) next).f1223;
                int length = weakReferenceArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    objArr[i2] = weakReferenceArr[i].get();
                    i++;
                    i2++;
                }
                ((e) next).f1221.invoke(this.f1219, objArr);
            } catch (Exception e3) {
                o.m1290(e3);
            }
        }
        this.f1215.clear();
    }
}
