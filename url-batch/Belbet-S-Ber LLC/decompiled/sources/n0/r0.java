package n0;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class r0 implements h3.p, a3.a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final a3.a f2825f;

    /* renamed from: g, reason: collision with root package name */
    public int f2826g;
    public /* synthetic */ Object h;
    public final /* synthetic */ View i;

    public r0(View view, a3.a aVar) {
        this.i = view;
        this.f2825f = aVar;
        if (aVar != null && aVar.a() != a3.b.f137f) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // a3.a
    public final a3.b a() {
        return a3.b.f137f;
    }

    @Override // a3.a
    public final void b(Object obj) {
        a3.a aVar = this;
        while (true) {
            r0 r0Var = (r0) aVar;
            a3.a aVar2 = r0Var.f2825f;
            i3.d.b(aVar2);
            try {
                obj = r0Var.c(obj);
                if (obj == b3.a.f826f) {
                    return;
                }
            } catch (Throwable th) {
                obj = new w2.b(th);
            }
            r0Var.getClass();
            if (!(aVar2 instanceof r0)) {
                aVar2.b(obj);
                return;
            }
            aVar = aVar2;
        }
    }

    public final Object c(Object obj) {
        Object obj2;
        Object obj3 = w2.d.f3820c;
        int i = this.f2826g;
        View view = this.i;
        Object obj4 = b3.a.f826f;
        if (i == 0) {
            r1.b.C(obj);
            o3.f fVar = (o3.f) this.h;
            this.h = fVar;
            this.f2826g = 1;
            fVar.f3032g = view;
            fVar.f3031f = 3;
            fVar.i = this;
            return obj4;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r1.b.C(obj);
            return obj3;
        }
        o3.f fVar2 = (o3.f) this.h;
        r1.b.C(obj);
        if (view instanceof ViewGroup) {
            this.h = null;
            this.f2826g = 2;
            fVar2.getClass();
            x xVar = new x(new i3.a(1, (ViewGroup) view));
            if (xVar.f2847g.hasNext()) {
                fVar2.h = xVar;
                fVar2.f3031f = 2;
                fVar2.i = this;
                obj2 = obj4;
            } else {
                obj2 = obj3;
            }
            if (obj2 != obj4) {
                obj2 = obj3;
            }
            if (obj2 == obj4) {
                return obj4;
            }
        }
        return obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public final String e() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        c3.a aVar = (c3.a) getClass().getAnnotation(c3.a.class);
        String str2 = null;
        if (aVar != null) {
            int v4 = aVar.v();
            if (v4 > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v4 + ". Please update the Kotlin standard library.").toString());
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
            int i4 = i >= 0 ? aVar.l()[i] : -1;
            c3.b bVar = c3.c.f882b;
            c3.b bVar2 = c3.c.f881a;
            if (bVar == null) {
                try {
                    c3.b bVar3 = new c3.b(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    c3.c.f882b = bVar3;
                    bVar = bVar3;
                } catch (Exception unused2) {
                    c3.c.f882b = bVar2;
                    bVar = bVar2;
                }
            }
            if (bVar != bVar2 && (method = bVar.f878a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = bVar.f879b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = bVar.f880c;
                String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
            }
            if (str2 == null) {
                str = aVar.c();
            } else {
                str = str2 + '/' + aVar.c();
            }
            str2 = new StackTraceElement(str, aVar.m(), aVar.f(), i4);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }

    public final String toString() {
        if (this.f2825f != null) {
            return e();
        }
        i3.g.f2075a.getClass();
        String obj = r0.class.getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        i3.d.d(obj, "renderLambdaToString(...)");
        return obj;
    }

    public void d() {
    }
}
