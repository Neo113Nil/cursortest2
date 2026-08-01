package d1;

import H1.l;
import I1.i;
import c1.EnumC0088a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0093a implements b1.d, InterfaceC0096d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final b1.d f2472a;

    public AbstractC0093a(b1.d dVar) {
        this.f2472a = dVar;
    }

    public b1.d a(Object obj, b1.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // b1.d
    public final void b(Object obj) {
        b1.d dVar = this;
        while (true) {
            AbstractC0093a abstractC0093a = (AbstractC0093a) dVar;
            b1.d dVar2 = abstractC0093a.f2472a;
            k1.e.b(dVar2);
            try {
                obj = abstractC0093a.i(obj);
                if (obj == EnumC0088a.f2060a) {
                    return;
                }
            } catch (Throwable th) {
                obj = l.w(th);
            }
            abstractC0093a.j();
            if (!(dVar2 instanceof AbstractC0093a)) {
                dVar2.b(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @Override // d1.InterfaceC0096d
    public final InterfaceC0096d e() {
        b1.d dVar = this.f2472a;
        if (dVar instanceof InterfaceC0096d) {
            return (InterfaceC0096d) dVar;
        }
        return null;
    }

    public abstract Object i(Object obj);

    public void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0097e interfaceC0097e = (InterfaceC0097e) getClass().getAnnotation(InterfaceC0097e.class);
        String str2 = null;
        if (interfaceC0097e != null) {
            int v2 = interfaceC0097e.v();
            if (v2 > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            int i2 = i >= 0 ? interfaceC0097e.l()[i] : -1;
            i iVar = AbstractC0098f.f2477b;
            i iVar2 = AbstractC0098f.f2476a;
            if (iVar == null) {
                try {
                    i iVar3 = new i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC0098f.f2477b = iVar3;
                    iVar = iVar3;
                } catch (Exception unused2) {
                    AbstractC0098f.f2477b = iVar2;
                    iVar = iVar2;
                }
            }
            if (iVar != iVar2) {
                Method method = iVar.f556a;
                Object invoke = method != null ? method.invoke(getClass(), null) : null;
                if (invoke != null) {
                    Method method2 = iVar.f557b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                    if (invoke2 != null) {
                        Method method3 = iVar.f558c;
                        String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = interfaceC0097e.c();
            } else {
                str = str2 + '/' + interfaceC0097e.c();
            }
            str2 = new StackTraceElement(str, interfaceC0097e.m(), interfaceC0097e.f(), i2);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }
}
