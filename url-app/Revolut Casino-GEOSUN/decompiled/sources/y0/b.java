package y0;

import M0.C0048f;
import R0.AbstractC0068a;
import R0.h;
import h.Y;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w0.g;
import w0.i;

/* loaded from: classes.dex */
public abstract class b implements w0.d, c, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final w0.d f3097e;

    /* renamed from: f, reason: collision with root package name */
    public final i f3098f;

    /* renamed from: g, reason: collision with root package name */
    public transient w0.d f3099g;

    public b(w0.d dVar, i iVar) {
        this.f3097e = dVar;
        this.f3098f = iVar;
    }

    public w0.d b(Object obj, w0.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public c g() {
        w0.d dVar = this.f3097e;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // w0.d
    public i getContext() {
        i iVar = this.f3098f;
        F0.i.b(iVar);
        return iVar;
    }

    public StackTraceElement k() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar == null) {
            return null;
        }
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
        Y y2 = e.f3101b;
        Y y3 = e.f3100a;
        if (y2 == null) {
            try {
                Y y4 = new Y(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                e.f3101b = y4;
                y2 = y4;
            } catch (Exception unused2) {
                e.f3101b = y3;
                y2 = y3;
            }
        }
        if (y2 != y3 && (method = y2.f2153a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = y2.f2154b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = y2.f2155c;
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

    public abstract Object l(Object obj);

    public void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w0.d dVar = this.f3099g;
        if (dVar != null && dVar != this) {
            g f2 = getContext().f(w0.e.f3081e);
            F0.i.b(f2);
            h hVar = (h) dVar;
            do {
                atomicReferenceFieldUpdater = h.f906l;
            } while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0068a.f896d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0048f c0048f = obj instanceof C0048f ? (C0048f) obj : null;
            if (c0048f != null) {
                c0048f.p();
            }
        }
        this.f3099g = a.f3096e;
    }

    @Override // w0.d
    public final void resumeWith(Object obj) {
        w0.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            w0.d dVar2 = bVar.f3097e;
            F0.i.b(dVar2);
            try {
                obj = bVar.l(obj);
                if (obj == x0.a.f3094e) {
                    return;
                }
            } catch (Throwable th) {
                obj = o.g.f(th);
            }
            bVar.m();
            if (!(dVar2 instanceof b)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
        }
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

    public b(w0.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
