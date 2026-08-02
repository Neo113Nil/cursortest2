package J0;

import H0.i;
import Q0.h;
import Y0.C0112f;
import d1.AbstractC0184a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b implements H0.d, c, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final H0.d f736e;

    /* renamed from: f, reason: collision with root package name */
    public final i f737f;

    /* renamed from: g, reason: collision with root package name */
    public transient H0.d f738g;

    public b(H0.d dVar, i iVar) {
        this.f736e = dVar;
        this.f737f = iVar;
    }

    public H0.d b(H0.d dVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // J0.c
    public c e() {
        H0.d dVar = this.f736e;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // H0.d
    public i f() {
        i iVar = this.f737f;
        h.b(iVar);
        return iVar;
    }

    @Override // H0.d
    public final void j(Object obj) {
        H0.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            H0.d dVar2 = bVar.f736e;
            h.b(dVar2);
            try {
                obj = bVar.l(obj);
                if (obj == I0.a.f733e) {
                    return;
                }
            } catch (Throwable th) {
                obj = i1.a.b(th);
            }
            bVar.m();
            if (!(dVar2 instanceof b)) {
                dVar2.j(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public StackTraceElement k() {
        int i2;
        String str;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
        int v = dVar.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
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
        e eVar = f.f743b;
        e eVar2 = f.f742a;
        if (eVar == null) {
            try {
                e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f743b = eVar3;
                eVar = eVar3;
            } catch (Exception unused2) {
                f.f743b = eVar2;
                eVar = eVar2;
            }
        }
        if (eVar != eVar2) {
            Method method = eVar.f739a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = eVar.f740b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = eVar.f741c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = dVar.c();
        } else {
            str = str2 + '/' + dVar.c();
        }
        return new StackTraceElement(str, dVar.m(), dVar.f(), i3);
    }

    public abstract Object l(Object obj);

    public void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        H0.d dVar = this.f738g;
        if (dVar != null && dVar != this) {
            H0.g k2 = f().k(H0.e.f502e);
            h.b(k2);
            d1.h hVar = (d1.h) dVar;
            do {
                atomicReferenceFieldUpdater = d1.h.f2075l;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0184a.f2065d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0112f c0112f = obj instanceof C0112f ? (C0112f) obj : null;
            if (c0112f != null) {
                c0112f.r();
            }
        }
        this.f738g = a.f735e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object k2 = k();
        if (k2 == null) {
            k2 = getClass().getName();
        }
        sb.append(k2);
        return sb.toString();
    }

    public b(H0.d dVar) {
        this(dVar, dVar != null ? dVar.f() : null);
    }
}
