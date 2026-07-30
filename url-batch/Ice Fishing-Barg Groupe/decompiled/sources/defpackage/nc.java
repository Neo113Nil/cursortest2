package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class nc implements bt, tu, Serializable {
    public final bt rtx2ld2ELZv4;

    public nc(bt btVar) {
        this.rtx2ld2ELZv4 = btVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bt
    public final void RAsUl2FVSrh6(Object obj) {
        while (true) {
            nc ncVar = this;
            bt btVar = ncVar.rtx2ld2ELZv4;
            btVar.getClass();
            try {
                obj = ncVar.RfyTYNmI9Srp(obj);
                if (obj == su.rtx2ld2ELZv4) {
                    return;
                }
            } catch (Throwable th) {
                obj = new uv1(th);
            }
            ncVar.EcgxDIVH5in8();
            if (!(btVar instanceof nc)) {
                btVar.RAsUl2FVSrh6(obj);
                return;
            }
            this = btVar;
        }
    }

    public abstract Object RfyTYNmI9Srp(Object obj);

    public tu TSizfFm2Yiuu() {
        bt btVar = this.rtx2ld2ELZv4;
        if (btVar instanceof tu) {
            return (tu) btVar;
        }
        return null;
    }

    public StackTraceElement XL4ISE6Oc65B() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        yv yvVar = (yv) getClass().getAnnotation(yv.class);
        String str2 = null;
        if (yvVar == null || yvVar.v() < 1) {
            return null;
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
        int i2 = i >= 0 ? yvVar.l()[i] : -1;
        m9 m9Var = cs0.yQRudnv4La6p;
        m9 m9Var2 = cs0.KUoIVIumpKat;
        if (m9Var2 == null) {
            try {
                m9 m9Var3 = new m9(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 12);
                cs0.KUoIVIumpKat = m9Var3;
                m9Var2 = m9Var3;
            } catch (Exception unused2) {
                cs0.KUoIVIumpKat = m9Var;
                m9Var2 = m9Var;
            }
        }
        if (m9Var2 != m9Var && (method = (Method) m9Var2.OPXfSBeufaJ8) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) m9Var2.wdg6QnbFHrFF) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) m9Var2.dgRBjINgWbAK;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = yvVar.c();
        } else {
            str = str2 + '/' + yvVar.c();
        }
        return new StackTraceElement(str, yvVar.m(), yvVar.f(), i2);
    }

    public bt gPXPFXrUH4XX(bt btVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object XL4ISE6Oc65B = XL4ISE6Oc65B();
        if (XL4ISE6Oc65B == null) {
            XL4ISE6Oc65B = getClass().getName();
        }
        sb.append(XL4ISE6Oc65B);
        return sb.toString();
    }

    public void EcgxDIVH5in8() {
    }
}
