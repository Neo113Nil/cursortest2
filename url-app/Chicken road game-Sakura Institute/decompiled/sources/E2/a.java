package E2;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public abstract class a implements C2.a, d, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final C2.a f2309d;

    public a(C2.a aVar) {
        this.f2309d = aVar;
    }

    @Override // E2.d
    public d e() {
        C2.a aVar = this.f2309d;
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return null;
    }

    public C2.a j(C2.a completion, Object obj) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement k() {
        int i2;
        String str;
        Intrinsics.checkNotNullParameter(this, "<this>");
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v4 = eVar.v();
        if (v4 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v4 + ". Please update the Kotlin standard library.").toString());
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
        int i4 = i2 >= 0 ? eVar.l()[i2] : -1;
        g.f2316a.getClass();
        Intrinsics.checkNotNullParameter(this, "continuation");
        f fVar = g.f2318c;
        f fVar2 = g.f2317b;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.f2318c = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f2318c = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2) {
            Method method = fVar.f2313a;
            Object invoke = method != null ? method.invoke(getClass(), null) : null;
            if (invoke != null) {
                Method method2 = fVar.f2314b;
                Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                if (invoke2 != null) {
                    Method method3 = fVar.f2315c;
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

    public abstract Object l(Object obj);

    public void m() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object k4 = k();
        if (k4 == null) {
            k4 = getClass().getName();
        }
        sb.append(k4);
        return sb.toString();
    }

    @Override // C2.a
    public final void u(Object obj) {
        C2.a frame = this;
        while (true) {
            Intrinsics.checkNotNullParameter(frame, "frame");
            a aVar = (a) frame;
            C2.a aVar2 = aVar.f2309d;
            Intrinsics.c(aVar2);
            try {
                obj = aVar.l(obj);
            } catch (Throwable th) {
                AbstractC1341p.a aVar3 = AbstractC1341p.f11673d;
                obj = AbstractC1343r.a(th);
            }
            if (obj == D2.a.f2163d) {
                return;
            }
            AbstractC1341p.a aVar4 = AbstractC1341p.f11673d;
            aVar.m();
            if (!(aVar2 instanceof a)) {
                aVar2.u(obj);
                return;
            }
            frame = aVar2;
        }
    }
}
