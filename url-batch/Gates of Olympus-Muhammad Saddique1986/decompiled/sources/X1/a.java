package X1;

import f2.j;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a implements V1.d, d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final V1.d f4640d;

    public a(V1.d dVar) {
        this.f4640d = dVar;
    }

    @Override // X1.d
    public d k() {
        V1.d dVar = this.f4640d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public V1.d o(V1.d dVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement p() {
        int i3;
        String str;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v3 = eVar.v();
        if (v3 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i3 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i3 = -1;
        }
        int i4 = i3 >= 0 ? eVar.l()[i3] : -1;
        P2.i iVar = f.f4645b;
        P2.i iVar2 = f.f4644a;
        if (iVar == null) {
            try {
                P2.i iVar3 = new P2.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f4645b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f4645b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2) {
            Method method = iVar.f3936a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = iVar.f3937b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = iVar.f3938c;
                    Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                    if (invoke3 instanceof String) {
                        str2 = (String) invoke3;
                    }
                }
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i4);
    }

    public abstract Object q(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object p3 = p();
        if (p3 == null) {
            p3 = getClass().getName();
        }
        sb.append(p3);
        return sb.toString();
    }

    @Override // V1.d
    public final void u(Object obj) {
        V1.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            V1.d dVar2 = aVar.f4640d;
            j.c(dVar2);
            try {
                obj = aVar.q(obj);
                if (obj == W1.a.f4608d) {
                    return;
                }
            } catch (Throwable th) {
                obj = R1.a.b(th);
            }
            aVar.r();
            if (!(dVar2 instanceof a)) {
                dVar2.u(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public void r() {
    }
}
