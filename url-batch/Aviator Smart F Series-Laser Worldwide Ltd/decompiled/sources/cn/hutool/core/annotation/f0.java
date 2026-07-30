package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f0 {
    public static Annotation a(g0 g0Var, Class cls) {
        return g0Var.getAttribute().getAnnotation(cls);
    }

    public static Class b(g0 g0Var) {
        return g0Var.getAttribute().getDeclaringClass();
    }

    public static String c(g0 g0Var) {
        return g0Var.getAttribute().getName();
    }

    public static Class d(g0 g0Var) {
        return g0Var.getAttribute().getReturnType();
    }

    public static Object e(g0 g0Var) {
        return cn.hutool.core.util.y0.invoke(g0Var.getAnnotation(), g0Var.getAttribute(), new Object[0]);
    }

    public static boolean f(g0 g0Var) {
        return false;
    }
}
