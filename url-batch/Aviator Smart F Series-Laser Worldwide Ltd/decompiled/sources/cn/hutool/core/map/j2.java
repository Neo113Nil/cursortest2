package cn.hutool.core.map;

import cn.hutool.core.collection.CollUtil;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j2 {
    public static boolean a(k2 k2Var, Object obj) {
        return cn.hutool.core.util.e0.isNotNull(k2Var.getChild(obj));
    }

    public static boolean b(k2 k2Var, Object obj) {
        return cn.hutool.core.util.e0.isNotNull(k2Var.getParent(obj));
    }

    public static boolean c(k2 k2Var) {
        return CollUtil.isNotEmpty((Map<?, ?>) k2Var.getDeclaredChildren());
    }

    public static boolean d(k2 k2Var) {
        return cn.hutool.core.util.e0.isNotNull(k2Var.getDeclaredParent());
    }
}
