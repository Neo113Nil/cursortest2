package cn.hutool.core.annotation;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t2 {
    public static int a(u2 u2Var, u2 u2Var2) {
        Comparator comparing;
        comparing = Comparator.comparing(new d());
        return cn.hutool.core.comparator.d.compare(u2Var, u2Var2, (Comparator<u2>) comparing);
    }

    public static int c(u2 u2Var) {
        return Integer.MAX_VALUE;
    }
}
