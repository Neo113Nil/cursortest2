package com.squareup.moshi.internal;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonQualifier;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Types;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class Util {
    public static final Class DEFAULT_CONSTRUCTOR_MARKER;
    public static final Class METADATA;
    public static final Set NO_ANNOTATIONS = Collections.EMPTY_SET;
    public static final Type[] EMPTY_TYPE_ARRAY = new Type[0];

    public final class GenericArrayTypeImpl implements GenericArrayType {
        public final Type componentType;

        public GenericArrayTypeImpl(Type type2) {
            this.componentType = Util.canonicalize(type2);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Types.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.componentType;
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final String toString() {
            return Util.typeToString(this.componentType) + "[]";
        }
    }

    public final class ParameterizedTypeImpl implements ParameterizedType {
        public final Type ownerType;
        public final Type rawType;
        public final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type2, Type type3, Type... typeArr) {
            if (type3 instanceof Class) {
                Class<?> enclosingClass = ((Class) type3).getEnclosingClass();
                if (type2 != null) {
                    if (enclosingClass == null || Types.getRawType(type2) != enclosingClass) {
                        Handlers$$ExternalSyntheticBUOutline0.m$1("unexpected owner type for ", type3, ": ", type2);
                        throw null;
                    }
                } else if (enclosingClass != null) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$2("unexpected owner type for ", type3, ": null");
                    throw null;
                }
            }
            this.ownerType = type2 != null ? Util.canonicalize(type2) : null;
            this.rawType = Util.canonicalize(type3);
            this.typeArguments = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.typeArguments;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i].getClass();
                Util.checkNotPrimitive(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = Util.canonicalize(typeArr3[i]);
                i++;
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Types.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.rawType;
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            Set set = Util.NO_ANNOTATIONS;
            Type type2 = this.ownerType;
            return (type2 != null ? type2.hashCode() : 0) ^ hashCode;
        }

        public final String toString() {
            Type[] typeArr = this.typeArguments;
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(Util.typeToString(this.rawType));
            if (typeArr.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(Util.typeToString(typeArr[0]));
            for (int i = 1; i < typeArr.length; i++) {
                sb.append(", ");
                sb.append(Util.typeToString(typeArr[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes4.dex */
    public final class WildcardTypeImpl implements WildcardType {
        public final Type lowerBound;
        public final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                throw null;
            }
            if (typeArr.length != 1) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                throw null;
            }
            if (typeArr2.length != 1) {
                typeArr[0].getClass();
                Util.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = Util.canonicalize(typeArr[0]);
                return;
            }
            typeArr2[0].getClass();
            Util.checkNotPrimitive(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                throw null;
            }
            this.lowerBound = Util.canonicalize(typeArr2[0]);
            this.upperBound = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Types.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type2 = this.lowerBound;
            return type2 != null ? new Type[]{type2} : Util.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public final int hashCode() {
            Type type2 = this.lowerBound;
            return (this.upperBound.hashCode() + 31) ^ (type2 != null ? type2.hashCode() + 31 : 1);
        }

        public final String toString() {
            Type type2 = this.lowerBound;
            if (type2 != null) {
                return "? super " + Util.typeToString(type2);
            }
            Type type3 = this.upperBound;
            if (type3 == Object.class) {
                return "?";
            }
            return "? extends " + Util.typeToString(type3);
        }
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        METADATA = cls;
        DEFAULT_CONSTRUCTOR_MARKER = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type canonicalize(Type type2) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            return cls.isArray() ? new GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type2 instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedTypeImpl) {
                return type2;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
            return type2 instanceof GenericArrayTypeImpl ? type2 : new GenericArrayTypeImpl(((GenericArrayType) type2).getGenericComponentType());
        }
        if (!(type2 instanceof WildcardType) || (type2 instanceof WildcardTypeImpl)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void checkNotPrimitive(Type type2) {
        if ((type2 instanceof Class) && ((Class) type2).isPrimitive()) {
            OptionalProvider$$ExternalSyntheticLambda0.m$2("Unexpected primitive ", type2, ". Use the boxed type.");
        }
    }

    public static Type getGenericSupertype(Type type2, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type2;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static boolean isPlatformType(Class cls) {
        String name = cls.getName();
        return name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("kotlin.") || name.startsWith("kotlinx.") || name.startsWith("scala.");
    }

    public static Set jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : NO_ANNOTATIONS;
    }

    public static JsonDataException missingProperty(String str, String str2, JsonReader jsonReader) {
        String sb;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            sb = CameraSelector$$ExternalSyntheticOutline0.m("Required value '", str, "' missing at ", path);
        } else {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Required value '", str, "' (JSON name '", str2, "') missing at ");
            m.append(path);
            sb = m.toString();
        }
        return new JsonDataException(sb);
    }

    public static Type removeSubtypeWildcard(Type type2) {
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        if (wildcardType.getLowerBounds().length != 0) {
            return type2;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    public static Type resolve(Type type2, Class cls, Type type3, LinkedHashSet linkedHashSet) {
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (!(type3 instanceof TypeVariable)) {
                if (type3 instanceof Class) {
                    Class cls2 = (Class) type3;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type resolve = resolve(type2, cls, componentType, linkedHashSet);
                        return componentType == resolve ? cls2 : new GenericArrayTypeImpl(resolve);
                    }
                }
                if (type3 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type3;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type resolve2 = resolve(type2, cls, genericComponentType, linkedHashSet);
                    return genericComponentType == resolve2 ? genericArrayType : new GenericArrayTypeImpl(resolve2);
                }
                if (type3 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type resolve3 = resolve(type2, cls, ownerType, linkedHashSet);
                    boolean z = resolve3 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i < length) {
                        Type resolve4 = resolve(type2, cls, actualTypeArguments[i], linkedHashSet);
                        if (resolve4 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = resolve4;
                        }
                        i++;
                    }
                    return z ? new ParameterizedTypeImpl(resolve3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                }
                boolean z2 = type3 instanceof WildcardType;
                Type type4 = type3;
                if (z2) {
                    WildcardType wildcardType = (WildcardType) type3;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type resolve5 = resolve(type2, cls, lowerBounds[0], linkedHashSet);
                        type4 = wildcardType;
                        if (resolve5 != lowerBounds[0]) {
                            return new WildcardTypeImpl(new Type[]{Object.class}, resolve5 instanceof WildcardType ? ((WildcardType) resolve5).getLowerBounds() : new Type[]{resolve5});
                        }
                    } else {
                        type4 = wildcardType;
                        if (upperBounds.length == 1) {
                            Type resolve6 = resolve(type2, cls, upperBounds[0], linkedHashSet);
                            type4 = wildcardType;
                            if (resolve6 != upperBounds[0]) {
                                return new WildcardTypeImpl(resolve6 instanceof WildcardType ? ((WildcardType) resolve6).getUpperBounds() : new Type[]{resolve6}, EMPTY_TYPE_ARRAY);
                            }
                        }
                    }
                }
                return type4;
            }
            typeVariable = (TypeVariable) type3;
            if (linkedHashSet.contains(typeVariable)) {
                return type3;
            }
            linkedHashSet.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type genericSupertype = getGenericSupertype(type2, cls, cls3);
                if (genericSupertype instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i])) {
                            type3 = ((ParameterizedType) genericSupertype).getActualTypeArguments()[i];
                        } else {
                            i++;
                        }
                    }
                    a$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
            }
            type3 = typeVariable;
        } while (type3 != typeVariable);
        return type3;
    }

    public static void rethrowCause(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (targetException instanceof RuntimeException) {
            throw ((RuntimeException) targetException);
        }
        if (!(targetException instanceof Error)) {
            throw new RuntimeException(targetException);
        }
        throw ((Error) targetException);
    }

    public static String typeAnnotatedWithAnnotations(Type type2, Set set) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(type2);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb.append(str);
        return sb.toString();
    }

    public static String typeToString(Type type2) {
        return type2 instanceof Class ? ((Class) type2).getName() : type2.toString();
    }

    public static JsonDataException unexpectedNull(String str, String str2, JsonReader jsonReader) {
        String sb;
        String path = jsonReader.getPath();
        if (str2.equals(str)) {
            sb = CameraSelector$$ExternalSyntheticOutline0.m("Non-null value '", str, "' was null at ", path);
        } else {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Non-null value '", str, "' (JSON name '", str2, "') was null at ");
            m.append(path);
            sb = m.toString();
        }
        return new JsonDataException(sb);
    }
}
