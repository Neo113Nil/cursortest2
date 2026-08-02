package f2;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0324a implements InterfaceC0300c, InterfaceC0327d, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0300c f4979a;

    public AbstractC0324a(InterfaceC0300c interfaceC0300c) {
        this.f4979a = interfaceC0300c;
    }

    public InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // f2.InterfaceC0327d
    public InterfaceC0327d c() {
        InterfaceC0300c interfaceC0300c = this.f4979a;
        if (interfaceC0300c instanceof InterfaceC0327d) {
            return (InterfaceC0327d) interfaceC0300c;
        }
        return null;
    }

    public StackTraceElement e() {
        int i3;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
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
        f fVar = g.f4987b;
        f fVar2 = g.f4986a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                g.f4987b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f4987b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.f4983a) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = fVar.f4984b) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
            Method method3 = fVar.f4985c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + IOUtils.DIR_SEPARATOR_UNIX + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i4);
    }

    @Override // d2.InterfaceC0300c
    public final void f(Object obj) {
        InterfaceC0300c interfaceC0300c = this;
        while (true) {
            AbstractC0324a abstractC0324a = (AbstractC0324a) interfaceC0300c;
            InterfaceC0300c interfaceC0300c2 = abstractC0324a.f4979a;
            j.b(interfaceC0300c2);
            try {
                obj = abstractC0324a.g(obj);
                if (obj == EnumC0317a.f4969a) {
                    return;
                }
            } catch (Throwable th) {
                obj = android.support.v4.media.session.a.k(th);
            }
            abstractC0324a.h();
            if (!(interfaceC0300c2 instanceof AbstractC0324a)) {
                interfaceC0300c2.f(obj);
                return;
            }
            interfaceC0300c = interfaceC0300c2;
        }
    }

    public abstract Object g(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object e3 = e();
        if (e3 == null) {
            e3 = getClass().getName();
        }
        sb.append(e3);
        return sb.toString();
    }

    public void h() {
    }
}
