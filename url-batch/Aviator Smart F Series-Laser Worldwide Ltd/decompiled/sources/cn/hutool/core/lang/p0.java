package cn.hutool.core.lang;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p0 {
    public static Number a(q0 q0Var) {
        Number number = (Number) q.notNull(q0Var.getStartIndex(), "Start index must be not null!", new Object[0]);
        return (Number) cn.hutool.core.convert.d.convert((Type) number.getClass(), (Object) cn.hutool.core.util.d0.sub((Number) q.notNull(q0Var.getEndIndex(), "End index must be not null!", new Object[0]), number).abs());
    }
}
