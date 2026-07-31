package Y;

import W.g;
import W.i;
import e0.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.C0046e;
import p0.AbstractC0090a;

/* loaded from: classes.dex */
public abstract class b implements W.d, c, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final W.d f398b;

    /* renamed from: c, reason: collision with root package name */
    public final i f399c;

    /* renamed from: d, reason: collision with root package name */
    public transient W.d f400d;

    public b(W.d dVar) {
        i i2 = dVar != null ? dVar.i() : null;
        this.f398b = dVar;
        this.f399c = i2;
    }

    public W.d b(Object obj, W.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object c(Object obj);

    @Override // W.d
    public final void d(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        W.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            W.d dVar2 = bVar.f398b;
            h.b(dVar2);
            try {
                obj = bVar.c(obj);
                if (obj == X.a.f395b) {
                    return;
                }
            } catch (Throwable th) {
                obj = a.a.h(th);
            }
            W.d dVar3 = bVar.f400d;
            if (dVar3 != null && dVar3 != bVar) {
                i iVar = bVar.f399c;
                h.b(iVar);
                g k2 = iVar.k(W.e.f393b);
                h.b(k2);
                p0.h hVar = (p0.h) dVar3;
                do {
                    atomicReferenceFieldUpdater = p0.h.f1139i;
                } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0090a.f1129d);
                Object obj2 = atomicReferenceFieldUpdater.get(hVar);
                C0046e c0046e = obj2 instanceof C0046e ? (C0046e) obj2 : null;
                if (c0046e != null) {
                    c0046e.n();
                }
            }
            bVar.f400d = a.f397b;
            if (!(dVar2 instanceof b)) {
                dVar2.d(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @Override // Y.c
    public final c g() {
        W.d dVar = this.f398b;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // W.d
    public final i i() {
        i iVar = this.f399c;
        h.b(iVar);
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar != null) {
            int v2 = dVar.v();
            if (v2 > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
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
            C.b bVar = e.f402b;
            C.b bVar2 = e.f401a;
            if (bVar == null) {
                try {
                    C.b bVar3 = new C.b(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    e.f402b = bVar3;
                    bVar = bVar3;
                } catch (Exception unused2) {
                    e.f402b = bVar2;
                    bVar = bVar2;
                }
            }
            if (bVar != bVar2 && (method = (Method) bVar.f13a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) bVar.f14b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = (Method) bVar.f15c;
                String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
            }
            if (str2 == null) {
                str = dVar.c();
            } else {
                str = str2 + '/' + dVar.c();
            }
            str2 = new StackTraceElement(str, dVar.m(), dVar.f(), i3);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }
}
