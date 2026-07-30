package m;

import cn.hutool.core.bean.q;
import cn.hutool.core.lang.func.Func0;
import cn.hutool.core.lang.func.Func1;
import cn.hutool.core.map.WeakConcurrentMap;
import cn.hutool.core.text.l;
import cn.hutool.core.util.p;
import cn.hutool.core.util.y0;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.util.function.Function;

/* loaded from: classes.dex */
public class e {
    private static final WeakConcurrentMap<String, SerializedLambda> cache = new WeakConcurrentMap<>();

    private static SerializedLambda _resolve(final Serializable serializable) {
        return cache.computeIfAbsent((WeakConcurrentMap<String, SerializedLambda>) serializable.getClass().getName(), (Function<? super WeakConcurrentMap<String, SerializedLambda>, ? extends SerializedLambda>) new Function() { // from class: m.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                SerializedLambda lambda$_resolve$0;
                lambda$_resolve$0 = e.lambda$_resolve$0(serializable, (String) obj);
                return lambda$_resolve$0;
            }
        });
    }

    private static void checkLambdaTypeCanGetClass(int i8) {
        if (i8 != 5 && i8 != 6) {
            throw new IllegalArgumentException("该lambda不是合适的方法引用");
        }
    }

    public static <T> String getFieldName(Func1<T, ?> func1) {
        return q.getFieldName(getMethodName(func1));
    }

    public static <P> String getMethodName(Func1<P, ?> func1) {
        return resolve(func1).getImplMethodName();
    }

    public static <R> Class<R> getRealClass(Func0<?> func0) {
        SerializedLambda resolve = resolve(func0);
        checkLambdaTypeCanGetClass(resolve.getImplMethodKind());
        return p.loadClass(resolve.getImplClass());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SerializedLambda lambda$_resolve$0(Serializable serializable, String str) {
        return (SerializedLambda) y0.invoke(serializable, "writeReplace", new Object[0]);
    }

    public static <T> SerializedLambda resolve(Func1<T, ?> func1) {
        return _resolve(func1);
    }

    public static <T> String getFieldName(Func0<T> func0) {
        return q.getFieldName(getMethodName(func0));
    }

    public static <R> String getMethodName(Func0<R> func0) {
        return resolve(func0).getImplMethodName();
    }

    public static <R> SerializedLambda resolve(Func0<R> func0) {
        return _resolve(func0);
    }

    public static <P, R> Class<P> getRealClass(Func1<P, R> func1) {
        SerializedLambda resolve = resolve(func1);
        checkLambdaTypeCanGetClass(resolve.getImplMethodKind());
        String instantiatedMethodType = resolve.getInstantiatedMethodType();
        return p.loadClass(l.sub(instantiatedMethodType, 2, l.indexOf(instantiatedMethodType, ';')));
    }
}
