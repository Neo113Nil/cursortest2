package K;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Y implements c1.p, d1.c, U0.a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final U0.a f431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432b;

    /* renamed from: c, reason: collision with root package name */
    public int f433c;
    public /* synthetic */ Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f434e;

    public Y(View view, U0.a aVar) {
        this.f434e = view;
        this.f431a = aVar;
        if (aVar != null && aVar.f() != U0.b.f888a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
        this.f432b = 2;
    }

    @Override // U0.a
    public final void a(Object obj) {
        U0.a aVar = this;
        while (true) {
            Y y2 = (Y) aVar;
            U0.a aVar2 = y2.f431a;
            d1.d.b(aVar2);
            try {
                obj = y2.g(obj);
                if (obj == V0.a.f889a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new R0.d(th);
            }
            y2.getClass();
            if (!(aVar2 instanceof Y)) {
                aVar2.a(obj);
                return;
            }
            aVar = aVar2;
        }
    }

    @Override // c1.p
    public final Object c(Object obj, Serializable serializable) {
        Y y2 = new Y(this.f434e, (U0.a) serializable);
        y2.d = (j1.e) obj;
        return y2.g(R0.f.f780c);
    }

    @Override // d1.c
    public final int d() {
        return this.f432b;
    }

    @Override // U0.a
    public final U0.b f() {
        return U0.b.f888a;
    }

    public final Object g(Object obj) {
        Object obj2;
        Object obj3 = V0.a.f889a;
        int i = this.f433c;
        View view = this.f434e;
        if (i == 0) {
            w1.l.Z(obj);
            j1.e eVar = (j1.e) this.d;
            this.d = eVar;
            this.f433c = 1;
            eVar.f2605b = view;
            eVar.f2604a = 3;
            eVar.d = this;
            return obj3;
        }
        Object obj4 = R0.f.f780c;
        if (i == 1) {
            j1.e eVar2 = (j1.e) this.d;
            w1.l.Z(obj);
            if (view instanceof ViewGroup) {
                this.d = null;
                this.f433c = 2;
                eVar2.getClass();
                C0025x c0025x = new C0025x(new X(0, (ViewGroup) view));
                if (c0025x.f514b.hasNext()) {
                    eVar2.f2606c = c0025x;
                    eVar2.f2604a = 2;
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
            w1.l.Z(obj);
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
        W0.a aVar = (W0.a) getClass().getAnnotation(W0.a.class);
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
            W0.b bVar = W0.c.f915b;
            W0.b bVar2 = W0.c.f914a;
            if (bVar == null) {
                try {
                    W0.b bVar3 = new W0.b(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    W0.c.f915b = bVar3;
                    bVar = bVar3;
                } catch (Exception unused2) {
                    W0.c.f915b = bVar2;
                    bVar = bVar2;
                }
            }
            if (bVar != bVar2) {
                Method method = bVar.f911a;
                Object invoke = method != null ? method.invoke(getClass(), null) : null;
                if (invoke != null) {
                    Method method2 = bVar.f912b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                    if (invoke2 != null) {
                        Method method3 = bVar.f913c;
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
        if (this.f431a != null) {
            return i();
        }
        d1.h.f2020a.getClass();
        String obj = Y.class.getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        d1.d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
