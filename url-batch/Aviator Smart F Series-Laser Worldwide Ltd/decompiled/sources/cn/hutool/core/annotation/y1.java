package cn.hutool.core.annotation;

import java.lang.reflect.Method;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return e1.isAttributeMethod((Method) obj);
    }
}
