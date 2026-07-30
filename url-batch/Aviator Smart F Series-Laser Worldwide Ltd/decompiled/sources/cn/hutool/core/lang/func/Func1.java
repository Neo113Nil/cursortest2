package cn.hutool.core.lang.func;

import java.io.Serializable;

@FunctionalInterface
/* loaded from: classes.dex */
public interface Func1<P, R> extends Serializable {
    R call(P p8);

    R callWithRuntimeException(P p8);
}
