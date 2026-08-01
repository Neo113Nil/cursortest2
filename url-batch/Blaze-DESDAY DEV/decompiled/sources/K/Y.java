package K;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Y implements f1.p, g1.c, X0.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final X0.a f448a;

    /* renamed from: b, reason: collision with root package name */
    public final int f449b;

    /* renamed from: c, reason: collision with root package name */
    public int f450c;
    public /* synthetic */ Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f451e;

    public Y(View view, X0.a aVar) {
        this.f451e = view;
        this.f448a = aVar;
        if (aVar != null && aVar.f() != X0.b.f945a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f449b = 2;
    }

    @Override // X0.a
    public final void a(Object obj) {
        X0.a aVar = this;
        while (true) {
            Y y2 = (Y) aVar;
            X0.a aVar2 = y2.f448a;
            g1.d.b(aVar2);
            try {
                obj = y2.g(obj);
                if (obj == Y0.a.f1171a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new U0.d(th);
            }
            y2.getClass();
            if (!(aVar2 instanceof Y)) {
                aVar2.a(obj);
                return;
            }
            aVar = aVar2;
        }
    }

    @Override // f1.p
    public final Object c(Object obj, Serializable serializable) {
        Y y2 = new Y(this.f451e, (X0.a) serializable);
        y2.d = (m1.e) obj;
        return y2.g(U0.f.f904c);
    }

    @Override // g1.c
    public final int d() {
        return this.f449b;
    }

    @Override // X0.a
    public final X0.b f() {
        return X0.b.f945a;
    }

    public final Object g(Object obj) {
        Object obj2;
        Object obj3 = Y0.a.f1171a;
        int i = this.f450c;
        View view = this.f451e;
        if (i == 0) {
            z1.l.a0(obj);
            m1.e eVar = (m1.e) this.d;
            this.d = eVar;
            this.f450c = 1;
            eVar.f3219b = view;
            eVar.f3218a = 3;
            eVar.d = this;
            return obj3;
        }
        Object obj4 = U0.f.f904c;
        if (i == 1) {
            m1.e eVar2 = (m1.e) this.d;
            z1.l.a0(obj);
            if (view instanceof ViewGroup) {
                this.d = null;
                this.f450c = 2;
                eVar2.getClass();
                C0025x c0025x = new C0025x(new X(0, (ViewGroup) view));
                if (c0025x.f531b.hasNext()) {
                    eVar2.f3220c = c0025x;
                    eVar2.f3218a = 2;
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
            z1.l.a0(obj);
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
        Z0.a aVar = (Z0.a) getClass().getAnnotation(Z0.a.class);
        String str2 = null;
        if (aVar != null) {
            int v2 = aVar.v();
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
            int i2 = i >= 0 ? aVar.l()[i] : -1;
            A1.j jVar = Z0.b.f1180b;
            A1.j jVar2 = Z0.b.f1179a;
            if (jVar == null) {
                try {
                    A1.j jVar3 = new A1.j(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    Z0.b.f1180b = jVar3;
                    jVar = jVar3;
                } catch (Exception unused2) {
                    Z0.b.f1180b = jVar2;
                    jVar = jVar2;
                }
            }
            if (jVar != jVar2) {
                Method method = jVar.f14a;
                Object invoke = method != null ? method.invoke(getClass(), null) : null;
                if (invoke != null) {
                    Method method2 = jVar.f15b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                    if (invoke2 != null) {
                        Method method3 = jVar.f16c;
                        String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = aVar.c();
            } else {
                str = str2 + '/' + aVar.c();
            }
            str2 = new StackTraceElement(str, aVar.m(), aVar.f(), i2);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }

    public final String toString() {
        if (this.f448a != null) {
            return i();
        }
        g1.h.f2552a.getClass();
        String obj = Y.class.getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        g1.d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
