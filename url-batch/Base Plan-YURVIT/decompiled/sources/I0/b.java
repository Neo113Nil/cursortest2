package I0;

import G0.i;
import P0.h;
import W0.C0066f;
import a.AbstractC0086a;
import b1.AbstractC0115a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b implements G0.d, c, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final G0.d f526e;

    /* renamed from: f, reason: collision with root package name */
    public final i f527f;

    /* renamed from: g, reason: collision with root package name */
    public transient G0.d f528g;

    public b(G0.d dVar, i iVar) {
        this.f526e = dVar;
        this.f527f = iVar;
    }

    public G0.d b(G0.d dVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // I0.c
    public c d() {
        G0.d dVar = this.f526e;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // G0.d
    public i e() {
        i iVar = this.f527f;
        h.b(iVar);
        return iVar;
    }

    @Override // G0.d
    public final void g(Object obj) {
        G0.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            G0.d dVar2 = bVar.f526e;
            h.b(dVar2);
            try {
                obj = bVar.m(obj);
                if (obj == H0.a.f511e) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0086a.l(th);
            }
            bVar.o();
            if (!(dVar2 instanceof b)) {
                dVar2.g(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public StackTraceElement l() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null || dVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i2 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        int i3 = i2 >= 0 ? dVar.l()[i2] : -1;
        e eVar = f.f533b;
        e eVar2 = f.f532a;
        if (eVar == null) {
            try {
                e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f533b = eVar3;
                eVar = eVar3;
            } catch (Exception unused2) {
                f.f533b = eVar2;
                eVar = eVar2;
            }
        }
        if (eVar != eVar2 && (method = eVar.f529a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = eVar.f530b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = eVar.f531c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = dVar.c();
        } else {
            str = str2 + '/' + dVar.c();
        }
        return new StackTraceElement(str, dVar.m(), dVar.f(), i3);
    }

    public abstract Object m(Object obj);

    public void o() {
        G0.d dVar = this.f528g;
        if (dVar != null && dVar != this) {
            G0.g m2 = e().m(G0.e.f499e);
            h.b(m2);
            b1.h hVar = (b1.h) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1.h.f1748l;
            while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0115a.f1738d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0066f c0066f = obj instanceof C0066f ? (C0066f) obj : null;
            if (c0066f != null) {
                c0066f.q();
            }
        }
        this.f528g = a.f525e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object l2 = l();
        if (l2 == null) {
            l2 = getClass().getName();
        }
        sb.append(l2);
        return sb.toString();
    }

    public b(G0.d dVar) {
        this(dVar, dVar != null ? dVar.e() : null);
    }
}
