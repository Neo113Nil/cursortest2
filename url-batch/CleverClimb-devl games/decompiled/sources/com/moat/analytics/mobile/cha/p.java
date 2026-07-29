package com.moat.analytics.mobile.cha;

import com.moat.analytics.mobile.cha.base.asserts.Asserts;
import com.moat.analytics.mobile.cha.base.functional.Optional;
import com.moat.analytics.mobile.cha.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes2.dex */
class p<T> implements InvocationHandler {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final Object[] f973 = new Object[0];

    /* renamed from: ˊ, reason: contains not printable characters */
    private final c<T> f974;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f975;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final LinkedList<p<T>.d> f976;

    /* renamed from: ॱ, reason: contains not printable characters */
    private final Class<T> f977;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private T f978;

    interface c<T> {
        /* renamed from: ˋ */
        Optional<T> mo990() throws o;
    }

    class d {

        /* renamed from: ˊ, reason: contains not printable characters */
        private final WeakReference[] f980;

        /* renamed from: ˋ, reason: contains not printable characters */
        private final Method f981;

        /* renamed from: ˎ, reason: contains not printable characters */
        private final LinkedList<Object> f982;

        /* synthetic */ d(p pVar, Method method, Object[] objArr, byte b2) {
            this(method, objArr);
        }

        private d(Method method, Object... objArr) {
            this.f982 = new LinkedList<>();
            objArr = objArr == null ? p.f973 : objArr;
            WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                if ((obj instanceof Map) || (obj instanceof Integer) || (obj instanceof Double)) {
                    this.f982.add(obj);
                }
                weakReferenceArr[i2] = new WeakReference(obj);
                i++;
                i2++;
            }
            this.f980 = weakReferenceArr;
            this.f981 = method;
        }
    }

    private p(c<T> cVar, Class<T> cls) throws o {
        Asserts.checkNotNull(cVar);
        Asserts.checkNotNull(cls);
        this.f974 = cVar;
        this.f977 = cls;
        this.f976 = new LinkedList<>();
        t.m1144().m1149(new t.b() { // from class: com.moat.analytics.mobile.cha.p.1
            @Override // com.moat.analytics.mobile.cha.t.b
            /* renamed from: ˎ */
            public final void mo1033() throws o {
                p.this.m1114();
            }
        });
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static <T> T m1113(c<T> cVar, Class<T> cls) throws o {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new p(cVar, cls));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static Boolean m1112(Method method) {
        try {
            return Boolean.TYPE.equals(method.getReturnType()) ? true : null;
        } catch (Exception e) {
            o.m1110(e);
            return null;
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Class<?> declaringClass = method.getDeclaringClass();
            t m1144 = t.m1144();
            if (Object.class.equals(declaringClass)) {
                String name = method.getName();
                if ("getClass".equals(name)) {
                    return this.f977;
                }
                if ("toString".equals(name)) {
                    Object invoke = method.invoke(this, objArr);
                    return String.valueOf(invoke).replace(p.class.getName(), this.f977.getName());
                }
                return method.invoke(this, objArr);
            }
            if (this.f975 && this.f978 == null) {
                this.f976.clear();
                return m1112(method);
            }
            if (m1144.f1011 == t.a.f1022) {
                m1114();
                if (this.f978 != null) {
                    return method.invoke(this.f978, objArr);
                }
            }
            if (m1144.f1011 == t.a.f1023 && (!this.f975 || this.f978 != null)) {
                if (this.f976.size() >= 15) {
                    this.f976.remove(5);
                }
                this.f976.add(new d(this, method, objArr, (byte) 0));
            }
            return m1112(method);
        } catch (Exception e) {
            o.m1110(e);
            return m1112(method);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m1114() throws o {
        if (!this.f975) {
            try {
                this.f978 = this.f974.mo990().orElse(null);
            } catch (Exception e) {
                a.m996("OnOffTrackerProxy", this, "Could not create instance", e);
                o.m1110(e);
            }
            this.f975 = true;
        }
        if (this.f978 == null) {
            return;
        }
        Iterator<p<T>.d> it = this.f976.iterator();
        while (it.hasNext()) {
            p<T>.d next = it.next();
            try {
                Object[] objArr = new Object[((d) next).f980.length];
                WeakReference[] weakReferenceArr = ((d) next).f980;
                int length = weakReferenceArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    objArr[i2] = weakReferenceArr[i].get();
                    i++;
                    i2++;
                }
                ((d) next).f981.invoke(this.f978, objArr);
            } catch (Exception e2) {
                o.m1110(e2);
            }
        }
        this.f976.clear();
    }
}
