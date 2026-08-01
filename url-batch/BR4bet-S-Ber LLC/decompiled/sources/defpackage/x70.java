package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class x70 implements qo, le, jf, Serializable {
    public final le f;
    public final ye g;
    public transient le h;
    public final int i;

    public x70(le leVar) {
        ye d = leVar != null ? leVar.d() : null;
        this.f = leVar;
        this.g = d;
        this.i = 2;
    }

    @Override // defpackage.qo
    public final int b() {
        return this.i;
    }

    @Override // defpackage.jf
    public final jf c() {
        le leVar = this.f;
        if (leVar instanceof jf) {
            return (jf) leVar;
        }
        return null;
    }

    @Override // defpackage.le
    public final ye d() {
        ye yeVar = this.g;
        yeVar.getClass();
        return yeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le
    public final void e(Object obj) {
        while (true) {
            x70 x70Var = this;
            le leVar = x70Var.f;
            leVar.getClass();
            try {
                obj = x70Var.i(obj);
                if (obj == hf.f) {
                    return;
                }
            } catch (Throwable th) {
                obj = new q30(th);
            }
            le leVar2 = x70Var.h;
            if (leVar2 != null && leVar2 != x70Var) {
                ye yeVar = x70Var.g;
                yeVar.getClass();
                we h = yeVar.h(ej.h);
                h.getClass();
                yh yhVar = (yh) leVar2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yh.m;
                while (atomicReferenceFieldUpdater.get(yhVar) == la0.k) {
                }
                atomicReferenceFieldUpdater.get(yhVar);
            }
            x70Var.h = jc.f;
            if (!(leVar instanceof x70)) {
                leVar.e(obj);
                return;
            }
            this = leVar;
        }
    }

    public abstract le h(le leVar);

    public abstract Object i(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.StackTraceElement] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    public final String j() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        wf wfVar = (wf) getClass().getAnnotation(wf.class);
        String str2 = null;
        if (wfVar != null) {
            int v = wfVar.v();
            if (v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
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
            int i2 = i >= 0 ? wfVar.l()[i] : -1;
            sb sbVar = b9.d;
            sb sbVar2 = b9.e;
            if (sbVar2 == null) {
                try {
                    sb sbVar3 = new sb(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    b9.e = sbVar3;
                    sbVar2 = sbVar3;
                } catch (Exception unused2) {
                    b9.e = sbVar;
                    sbVar2 = sbVar;
                }
            }
            if (sbVar2 != sbVar && (method = sbVar2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = sbVar2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = sbVar2.c;
                String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
            }
            if (str2 == null) {
                str = wfVar.c();
            } else {
                str = str2 + '/' + wfVar.c();
            }
            str2 = new StackTraceElement(str, wfVar.m(), wfVar.f(), i2);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }

    public final String toString() {
        if (this.f != null) {
            return j();
        }
        u20.a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
