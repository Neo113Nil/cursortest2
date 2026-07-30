package cn.hutool.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p3 {
    public static Annotation a(q3 q3Var) {
        return q3Var.getOriginal().getAnnotation();
    }

    public static Annotation b(q3 q3Var, Class cls) {
        return q3Var.getOriginal().getAnnotation(cls);
    }

    public static Method d(q3 q3Var) {
        return q3Var.getOriginal().getAttribute();
    }

    public static Class f(q3 q3Var) {
        return q3Var.getOriginal().getAttributeType();
    }

    public static boolean h(q3 q3Var) {
        return true;
    }
}
