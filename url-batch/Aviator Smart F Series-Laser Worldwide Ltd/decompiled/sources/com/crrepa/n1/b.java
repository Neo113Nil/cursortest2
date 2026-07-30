package com.crrepa.n1;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f13385a = new Type[0];

    private static final class a implements GenericArrayType, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private static final long f13386b = 0;

        /* renamed from: a, reason: collision with root package name */
        private final Type f13387a;

        public a(Type type) {
            this.f13387a = b.b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.a((Type) this, (Type) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f13387a;
        }

        public int hashCode() {
            return this.f13387a.hashCode();
        }

        public String toString() {
            return b.h(this.f13387a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* renamed from: com.crrepa.n1.b$b, reason: collision with other inner class name */
    private static final class C0229b implements ParameterizedType, Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final long f13388d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final Type f13389a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f13390b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f13391c;

        public C0229b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z7 = true;
                boolean z8 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z8) {
                    z7 = false;
                }
                com.crrepa.n1.a.a(z7);
            }
            this.f13389a = type == null ? null : b.b(type);
            this.f13390b = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f13391c = typeArr2;
            int length = typeArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                com.crrepa.n1.a.a(this.f13391c[i8]);
                b.c(this.f13391c[i8]);
                Type[] typeArr3 = this.f13391c;
                typeArr3[i8] = b.b(typeArr3[i8]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.a((Type) this, (Type) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f13391c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f13389a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f13390b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f13391c) ^ this.f13390b.hashCode()) ^ b.a((Object) this.f13389a);
        }

        public String toString() {
            int length = this.f13391c.length;
            if (length == 0) {
                return b.h(this.f13390b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.h(this.f13390b));
            sb.append("<");
            sb.append(b.h(this.f13391c[0]));
            for (int i8 = 1; i8 < length; i8++) {
                sb.append(", ");
                sb.append(b.h(this.f13391c[i8]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    private static final class c implements WildcardType, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f13392c = 0;

        /* renamed from: a, reason: collision with root package name */
        private final Type f13393a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f13394b;

        public c(Type[] typeArr, Type[] typeArr2) {
            com.crrepa.n1.a.a(typeArr2.length <= 1);
            com.crrepa.n1.a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                com.crrepa.n1.a.a(typeArr[0]);
                b.c(typeArr[0]);
                this.f13394b = null;
                this.f13393a = b.b(typeArr[0]);
                return;
            }
            com.crrepa.n1.a.a(typeArr2[0]);
            b.c(typeArr2[0]);
            com.crrepa.n1.a.a(typeArr[0] == Object.class);
            this.f13394b = b.b(typeArr2[0]);
            this.f13393a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.a((Type) this, (Type) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f13394b;
            return type != null ? new Type[]{type} : b.f13385a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f13393a};
        }

        public int hashCode() {
            Type type = this.f13394b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f13393a.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb;
            Type type;
            if (this.f13394b != null) {
                sb = new StringBuilder();
                sb.append("? super ");
                type = this.f13394b;
            } else {
                if (this.f13393a == Object.class) {
                    return "?";
                }
                sb = new StringBuilder();
                sb.append("? extends ");
                type = this.f13393a;
            }
            sb.append(b.h(type));
            return sb.toString();
        }
    }

    private b() {
        throw new UnsupportedOperationException();
    }

    static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C0229b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void c(Type type) {
        com.crrepa.n1.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static Type d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Class<?> e(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.crrepa.n1.a.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return e(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static WildcardType f(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f13385a);
    }

    public static WildcardType g(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static int a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (obj.equals(objArr[i8])) {
                return i8;
            }
        }
        throw new NoSuchElementException();
    }

    static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.crrepa.n1.a.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    private static Class<?> a(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static Type[] b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b8 = b(type, cls, Map.class);
        return b8 instanceof ParameterizedType ? ((ParameterizedType) b8).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static ParameterizedType a(Type type, Type type2, Type... typeArr) {
        return new C0229b(type, type2, typeArr);
    }

    public static Type a(Type type, Class<?> cls) {
        Type b8 = b(type, cls, Collection.class);
        if (b8 instanceof WildcardType) {
            b8 = ((WildcardType) b8).getUpperBounds()[0];
        }
        return b8 instanceof ParameterizedType ? ((ParameterizedType) b8).getActualTypeArguments()[0] : Object.class;
    }

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i8 = 0; i8 < length; i8++) {
                Class<?> cls3 = interfaces[i8];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i8];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return a(cls.getGenericInterfaces()[i8], interfaces[i8], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d9, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00db, code lost:
    
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00de, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (a((java.lang.Object) r1, (java.lang.Object) r9) != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Type a(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        Type a8;
        TypeVariable typeVariable = null;
        while (true) {
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) map.get(typeVariable2);
                if (type3 != null) {
                    return type3 == Void.TYPE ? type2 : type3;
                }
                map.put(typeVariable2, Void.TYPE);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                type2 = a(type, cls, (TypeVariable<?>) typeVariable2);
                if (type2 == typeVariable2) {
                    break;
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls2 = type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        a8 = a(type, cls, componentType, map);
                        if (a((Object) componentType, (Object) a8)) {
                            type2 = cls2;
                        }
                        type2 = a(a8);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    a8 = a(type, cls, genericComponentType, map);
                } else {
                    if (type2 instanceof ParameterizedType) {
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type a9 = a(type, cls, ownerType, map);
                        boolean z7 = !a((Object) a9, (Object) ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        int length = actualTypeArguments.length;
                        for (int i8 = 0; i8 < length; i8++) {
                            Type a10 = a(type, cls, actualTypeArguments[i8], map);
                            if (!a((Object) a10, (Object) actualTypeArguments[i8])) {
                                if (!z7) {
                                    actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                    z7 = true;
                                }
                                actualTypeArguments[i8] = a10;
                            }
                        }
                        if (z7) {
                            type2 = a(a9, type2.getRawType(), actualTypeArguments);
                        }
                    } else if (type2 instanceof WildcardType) {
                        type2 = (WildcardType) type2;
                        Type[] lowerBounds = type2.getLowerBounds();
                        Type[] upperBounds = type2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type a11 = a(type, cls, lowerBounds[0], map);
                            if (a11 != lowerBounds[0]) {
                                type2 = g(a11);
                            }
                        } else if (upperBounds.length == 1) {
                            Type a12 = a(type, cls, upperBounds[0], map);
                            if (a12 != upperBounds[0]) {
                                type2 = f(a12);
                            }
                        }
                    }
                }
            }
        }
    }

    static Type a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> a8 = a(typeVariable);
        if (a8 == null) {
            return typeVariable;
        }
        Type a9 = a(type, cls, a8);
        if (!(a9 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a9).getActualTypeArguments()[a((Object[]) a8.getTypeParameters(), (Object) typeVariable)];
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }
}
