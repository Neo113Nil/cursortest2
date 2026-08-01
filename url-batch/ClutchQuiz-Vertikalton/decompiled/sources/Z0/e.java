package Z0;

import K.C0012m;
import X0.g;
import X0.i;
import g1.f;
import g1.j;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o1.C0285d;
import o1.InterfaceC0306z;
import o1.W;

/* loaded from: classes.dex */
public abstract class e implements g1.e, X0.d, b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final X0.d f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1173b;

    /* renamed from: c, reason: collision with root package name */
    public transient X0.d f1174c;
    public final int d;

    public e(X0.d dVar) {
        i h = dVar != null ? dVar.h() : null;
        this.f1172a = dVar;
        this.f1173b = h;
        this.d = 2;
    }

    public abstract X0.d a(Object obj, X0.d dVar);

    @Override // X0.d
    public final void b(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X0.d dVar = this;
        while (true) {
            e eVar = (e) dVar;
            X0.d dVar2 = eVar.f1172a;
            f.b(dVar2);
            try {
                obj = eVar.i(obj);
                if (obj == Y0.a.f1163a) {
                    return;
                }
            } catch (Throwable th) {
                obj = T.d.p(th);
            }
            X0.d dVar3 = eVar.f1174c;
            if (dVar3 != null && dVar3 != eVar) {
                i iVar = eVar.f1173b;
                f.b(iVar);
                g j2 = iVar.j(X0.e.f1155a);
                f.b(j2);
                s1.f fVar = (s1.f) dVar3;
                do {
                    atomicReferenceFieldUpdater = s1.f.h;
                } while (atomicReferenceFieldUpdater.get(fVar) == s1.a.f3641c);
                Object obj2 = atomicReferenceFieldUpdater.get(fVar);
                C0285d c0285d = obj2 instanceof C0285d ? (C0285d) obj2 : null;
                if (c0285d != null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0285d.h;
                    InterfaceC0306z interfaceC0306z = (InterfaceC0306z) atomicReferenceFieldUpdater2.get(c0285d);
                    if (interfaceC0306z != null) {
                        interfaceC0306z.e();
                        atomicReferenceFieldUpdater2.set(c0285d, W.f3329a);
                    }
                }
            }
            eVar.f1174c = a.f1169a;
            if (!(dVar2 instanceof e)) {
                dVar2.b(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @Override // Z0.b
    public final b e() {
        X0.d dVar = this.f1172a;
        if (dVar instanceof b) {
            return (b) dVar;
        }
        return null;
    }

    @Override // g1.e
    public final int f() {
        return this.d;
    }

    @Override // X0.d
    public final i h() {
        i iVar = this.f1173b;
        f.b(iVar);
        return iVar;
    }

    public abstract Object i(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public final String j() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder("Continuation at ");
        c cVar = (c) getClass().getAnnotation(c.class);
        String str2 = null;
        if (cVar != null) {
            int v2 = cVar.v();
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
            int i2 = i >= 0 ? cVar.l()[i] : -1;
            C0012m c0012m = d.f1171b;
            C0012m c0012m2 = d.f1170a;
            if (c0012m == null) {
                try {
                    C0012m c0012m3 = new C0012m(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    d.f1171b = c0012m3;
                    c0012m = c0012m3;
                } catch (Exception unused2) {
                    d.f1171b = c0012m2;
                    c0012m = c0012m2;
                }
            }
            if (c0012m != c0012m2) {
                Method method = (Method) c0012m.f422b;
                Object invoke = method != null ? method.invoke(getClass(), null) : null;
                if (invoke != null) {
                    Method method2 = (Method) c0012m.f423c;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, null) : null;
                    if (invoke2 != null) {
                        Method method3 = (Method) c0012m.d;
                        String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                        if (invoke3 instanceof String) {
                            str2 = invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = cVar.c();
            } else {
                str = str2 + '/' + cVar.c();
            }
            str2 = new StackTraceElement(str, cVar.m(), cVar.f(), i2);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }

    public final String toString() {
        if (this.f1172a != null) {
            return j();
        }
        j.f2571a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        f.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
