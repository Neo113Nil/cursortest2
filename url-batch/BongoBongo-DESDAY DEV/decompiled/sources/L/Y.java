package L;

import a1.AbstractC0066b;
import a1.InterfaceC0065a;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Y implements g1.p, h1.c, Y0.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Y0.a f498a;

    /* renamed from: b, reason: collision with root package name */
    public final int f499b;

    /* renamed from: c, reason: collision with root package name */
    public int f500c;
    public /* synthetic */ Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f501e;

    public Y(View view, Y0.a aVar) {
        this.f501e = view;
        this.f498a = aVar;
        if (aVar != null && aVar.f() != Y0.b.f988a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f499b = 2;
    }

    @Override // Y0.a
    public final void a(Object obj) {
        Y0.a aVar = this;
        while (true) {
            Y y2 = (Y) aVar;
            Y0.a aVar2 = y2.f498a;
            h1.d.b(aVar2);
            try {
                obj = y2.g(obj);
                if (obj == Z0.a.f1224a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new V0.c(th);
            }
            y2.getClass();
            if (!(aVar2 instanceof Y)) {
                aVar2.a(obj);
                return;
            }
            aVar = aVar2;
        }
    }

    @Override // g1.p
    public final Object c(Object obj, Serializable serializable) {
        Y y2 = new Y(this.f501e, (Y0.a) serializable);
        y2.d = (n1.e) obj;
        return y2.g(V0.e.f946c);
    }

    @Override // h1.c
    public final int d() {
        return this.f499b;
    }

    @Override // Y0.a
    public final Y0.b f() {
        return Y0.b.f988a;
    }

    public final Object g(Object obj) {
        Object obj2;
        Object obj3 = Z0.a.f1224a;
        int i = this.f500c;
        View view = this.f501e;
        if (i == 0) {
            A1.m.k0(obj);
            n1.e eVar = (n1.e) this.d;
            this.d = eVar;
            this.f500c = 1;
            eVar.f3391b = view;
            eVar.f3390a = 3;
            eVar.d = this;
            return obj3;
        }
        Object obj4 = V0.e.f946c;
        if (i == 1) {
            n1.e eVar2 = (n1.e) this.d;
            A1.m.k0(obj);
            if (view instanceof ViewGroup) {
                this.d = null;
                this.f500c = 2;
                eVar2.getClass();
                C0025x c0025x = new C0025x(new X(0, (ViewGroup) view));
                if (c0025x.f584b.hasNext()) {
                    eVar2.f3392c = c0025x;
                    eVar2.f3390a = 2;
                    eVar2.d = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            A1.m.k0(obj);
        }
        return obj4;
    }

    public void h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public final String i() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0065a interfaceC0065a = (InterfaceC0065a) getClass().getAnnotation(InterfaceC0065a.class);
        String str2 = null;
        if (interfaceC0065a != null) {
            int v2 = interfaceC0065a.v();
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
            int i2 = i >= 0 ? interfaceC0065a.l()[i] : -1;
            B1.i iVar = AbstractC0066b.f1304b;
            B1.i iVar2 = AbstractC0066b.f1303a;
            if (iVar == null) {
                try {
                    B1.i iVar3 = new B1.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    AbstractC0066b.f1304b = iVar3;
                    iVar = iVar3;
                } catch (Exception unused2) {
                    AbstractC0066b.f1304b = iVar2;
                    iVar = iVar2;
                }
            }
            if (iVar != iVar2) {
                Method method = iVar.f55a;
                Object invoke = method != null ? method.invoke(getClass(), null) : null;
                if (invoke != null) {
                    Method method2 = iVar.f56b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                    if (invoke2 != null) {
                        Method method3 = iVar.f57c;
                        String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = interfaceC0065a.c();
            } else {
                str = str2 + '/' + interfaceC0065a.c();
            }
            str2 = new StackTraceElement(str, interfaceC0065a.m(), interfaceC0065a.f(), i2);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }

    public final String toString() {
        if (this.f498a != null) {
            return i();
        }
        h1.h.f2651a.getClass();
        String obj = Y.class.getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        h1.d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
