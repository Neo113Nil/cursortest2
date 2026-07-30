package x0;

import e0.h0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v0.h;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public abstract class b implements v0.d, c, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final v0.d f1230b;

    /* renamed from: c, reason: collision with root package name */
    public final h f1231c;

    /* renamed from: d, reason: collision with root package name */
    public transient v0.d f1232d;

    public b(v0.d dVar) {
        h d2 = dVar != null ? dVar.d() : null;
        this.f1230b = dVar;
        this.f1231c = d2;
    }

    @Override // x0.c
    public final c b() {
        v0.d dVar = this.f1230b;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // v0.d
    public final h d() {
        h hVar = this.f1231c;
        hVar.getClass();
        return hVar;
    }

    public v0.d e(Object obj, v0.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // v0.d
    public final void f(Object obj) {
        v0.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            v0.d dVar2 = bVar.f1230b;
            dVar2.getClass();
            try {
                obj = bVar.i(obj);
                if (obj == w0.a.f1227b) {
                    return;
                }
            } catch (Throwable th) {
                obj = new t0.c(th);
            }
            v0.d dVar3 = bVar.f1232d;
            if (dVar3 != null && dVar3 != bVar) {
                h hVar = bVar.f1231c;
                hVar.getClass();
                v0.f j2 = hVar.j(v0.e.f1195b);
                j2.getClass();
                p1.h hVar2 = (p1.h) dVar3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.h.f1046i;
                while (atomicReferenceFieldUpdater.get(hVar2) == p1.a.f1036d) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(hVar2);
                k1.d dVar4 = obj2 instanceof k1.d ? (k1.d) obj2 : null;
                if (dVar4 != null) {
                    dVar4.n();
                }
            }
            bVar.f1232d = a.f1229b;
            if (!(dVar2 instanceof b)) {
                dVar2.f(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public abstract Object i(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() {
        int i2;
        String str;
        StringBuilder sb = new StringBuilder("Continuation at ");
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar != null) {
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
            h0 h0Var = e.f1234b;
            h0 h0Var2 = e.f1233a;
            if (h0Var == null) {
                try {
                    h0 h0Var3 = new h0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    e.f1234b = h0Var3;
                    h0Var = h0Var3;
                } catch (Exception unused2) {
                    e.f1234b = h0Var2;
                    h0Var = h0Var2;
                }
            }
            if (h0Var != h0Var2) {
                Method method = (Method) h0Var.f151a;
                Object invoke = method != null ? method.invoke(getClass(), null) : null;
                if (invoke != null) {
                    Method method2 = (Method) h0Var.f152b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                    if (invoke2 != null) {
                        Method method3 = (Method) h0Var.f153c;
                        String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
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
