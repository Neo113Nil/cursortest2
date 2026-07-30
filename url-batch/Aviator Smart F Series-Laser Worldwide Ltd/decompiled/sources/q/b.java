package q;

import cn.hutool.core.map.WeakConcurrentMap;
import cn.hutool.core.util.e1;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes.dex */
public class b {
    private static final WeakConcurrentMap<Type, Map<Type, Type>> CACHE = new WeakConcurrentMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Class] */
    private static Map<Type, Type> createTypeMap(Type type) {
        HashMap hashMap = new HashMap();
        while (type != 0) {
            ParameterizedType parameterizedType = e1.toParameterizedType(type);
            if (parameterizedType == null) {
                break;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            type = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = type.getTypeParameters();
            for (int i8 = 0; i8 < typeParameters.length; i8++) {
                Type type2 = actualTypeArguments[i8];
                if (!(type2 instanceof TypeVariable)) {
                    hashMap.put(typeParameters[i8], type2);
                }
            }
        }
        return hashMap;
    }

    public static Map<Type, Type> get(final Type type) {
        return CACHE.computeIfAbsent((WeakConcurrentMap<Type, Map<Type, Type>>) type, (Function<? super WeakConcurrentMap<Type, Map<Type, Type>>, ? extends Map<Type, Type>>) new Function() { // from class: q.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map lambda$get$0;
                lambda$get$0 = b.lambda$get$0(type, (Type) obj);
                return lambda$get$0;
            }
        });
    }

    public static Type getActualType(Type type, TypeVariable<?> typeVariable) {
        Map<Type, Type> map = get(type);
        Type type2 = map.get(typeVariable);
        while (true) {
            Type type3 = type2;
            if (!(type3 instanceof TypeVariable)) {
                return type3;
            }
            type2 = map.get(type3);
        }
    }

    public static Type[] getActualTypes(Type type, Type... typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i8 = 0; i8 < typeArr.length; i8++) {
            Type type2 = typeArr[i8];
            if (type2 instanceof TypeVariable) {
                type2 = getActualType(type, (TypeVariable) type2);
            }
            typeArr2[i8] = type2;
        }
        return typeArr2;
    }

    public static Map<String, Type> getStrKeyMap(Type type) {
        return cn.hutool.core.convert.d.toMap(String.class, Type.class, get(type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$get$0(Type type, Type type2) {
        return createTypeMap(type);
    }
}
