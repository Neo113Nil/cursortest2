package com.moat.analytics.mobile.tjy;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
class ay implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f7246a = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    private final ap f7247b;

    /* renamed from: c, reason: collision with root package name */
    private final ba f7248c;

    /* renamed from: d, reason: collision with root package name */
    private final bc f7249d;
    private final LinkedList e;
    private final LinkedList f;
    private boolean g;
    private Object h;

    ay(ap apVar, ba baVar, bc bcVar) {
        com.moat.analytics.mobile.tjy.base.asserts.a.a(apVar);
        com.moat.analytics.mobile.tjy.base.asserts.a.a(baVar);
        com.moat.analytics.mobile.tjy.base.asserts.a.a(bcVar);
        this.f7247b = apVar;
        this.f7248c = baVar;
        this.f7249d = bcVar;
        apVar.a(new az(this));
        this.e = new LinkedList();
        this.f = new LinkedList();
    }

    static Object a(ap apVar, ba baVar, bc bcVar) {
        Class a2 = bcVar.a();
        return Proxy.newProxyInstance(a2.getClassLoader(), new Class[]{a2}, new ay(apVar, baVar, bcVar));
    }

    private Object a(Method method) {
        try {
            return Boolean.TYPE.equals(method.getReturnType()) ? true : null;
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            return null;
        }
    }

    private Object a(Method method, Object[] objArr) {
        if (Object.class.equals(method.getDeclaringClass())) {
            String name = method.getName();
            Class a2 = this.f7249d.a();
            if ("getClass".equals(name)) {
                return a2;
            }
            if (!"toString".equals(name)) {
                return method.invoke(this, objArr);
            }
            Object invoke = method.invoke(this, objArr);
            return String.valueOf(invoke).replace(ay.class.getName(), a2.getName());
        }
        if (this.g && this.h == null) {
            c();
            return a(method);
        }
        if (this.f7247b.a() == ar.ON) {
            b();
            if (this.h != null) {
                return method.invoke(this.h, objArr);
            }
        }
        if (this.f7247b.a() == ar.OFF && (!this.g || this.h != null)) {
            b(method, objArr);
        }
        return a(method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        WeakReference[] weakReferenceArr;
        WeakReference[] weakReferenceArr2;
        Method method;
        if (!this.g) {
            try {
                this.h = this.f7248c.a().c(null);
            } catch (Exception unused) {
            }
            this.g = true;
        }
        if (this.h == null) {
            return;
        }
        LinkedList<LinkedList> linkedList = new LinkedList();
        linkedList.add(this.e);
        linkedList.add(this.f);
        for (LinkedList linkedList2 : linkedList) {
            Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                bb bbVar = (bb) it.next();
                try {
                    weakReferenceArr = bbVar.f7255b;
                    Object[] objArr = new Object[weakReferenceArr.length];
                    weakReferenceArr2 = bbVar.f7255b;
                    int length = weakReferenceArr2.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        objArr[i2] = weakReferenceArr2[i].get();
                        i++;
                        i2++;
                    }
                    method = bbVar.f7257d;
                    method.invoke(this.h, objArr);
                } catch (Exception unused2) {
                }
            }
            linkedList2.clear();
        }
    }

    private void b(Method method, Object[] objArr) {
        LinkedList linkedList;
        bb bbVar;
        az azVar = null;
        if (this.e.size() < 5) {
            linkedList = this.e;
            bbVar = new bb(this, method, objArr, azVar);
        } else {
            if (this.f.size() >= 10) {
                this.f.removeFirst();
            }
            linkedList = this.f;
            bbVar = new bb(this, method, objArr, azVar);
        }
        linkedList.add(bbVar);
    }

    private void c() {
        this.e.clear();
        this.f.clear();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return a(method, objArr);
        } catch (Exception e) {
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            return a(method);
        }
    }
}
