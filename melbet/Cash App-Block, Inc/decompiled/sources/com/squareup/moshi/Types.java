package com.squareup.moshi;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.moshi.MapJsonAdapter;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class Types {
    public static final MapJsonAdapter.AnonymousClass1 FACTORY = new MapJsonAdapter.AnonymousClass1(5);
    public static final StandardJsonAdapters$2 BOOLEAN_JSON_ADAPTER = new StandardJsonAdapters$2(0);
    public static final StandardJsonAdapters$2 BYTE_JSON_ADAPTER = new StandardJsonAdapters$2(3);
    public static final StandardJsonAdapters$2 CHARACTER_JSON_ADAPTER = new StandardJsonAdapters$2(4);
    public static final StandardJsonAdapters$2 DOUBLE_JSON_ADAPTER = new StandardJsonAdapters$2(5);
    public static final StandardJsonAdapters$2 FLOAT_JSON_ADAPTER = new StandardJsonAdapters$2(6);
    public static final StandardJsonAdapters$2 INTEGER_JSON_ADAPTER = new StandardJsonAdapters$2(7);
    public static final StandardJsonAdapters$2 LONG_JSON_ADAPTER = new StandardJsonAdapters$2(8);
    public static final StandardJsonAdapters$2 SHORT_JSON_ADAPTER = new StandardJsonAdapters$2(9);
    public static final StandardJsonAdapters$2 STRING_JSON_ADAPTER = new StandardJsonAdapters$2(2);

    public static Type collectionElementType(Type type2) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        Type resolve = Util.resolve(type2, Collection.class, Util.getGenericSupertype(type2, Collection.class, Collection.class), new LinkedHashSet());
        if (resolve instanceof WildcardType) {
            resolve = ((WildcardType) resolve).getUpperBounds()[0];
        }
        return resolve instanceof ParameterizedType ? ((ParameterizedType) resolve).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean equals(Type type2, Type type3) {
        if (type2 == type3) {
            return true;
        }
        if (type2 instanceof Class) {
            return type3 instanceof GenericArrayType ? equals(((Class) type2).getComponentType(), ((GenericArrayType) type3).getGenericComponentType()) : type2.equals(type3);
        }
        if (type2 instanceof ParameterizedType) {
            if (!(type3 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            ParameterizedType parameterizedType2 = (ParameterizedType) type3;
            return equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof Util.ParameterizedTypeImpl ? ((Util.ParameterizedTypeImpl) parameterizedType).typeArguments : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof Util.ParameterizedTypeImpl ? ((Util.ParameterizedTypeImpl) parameterizedType2).typeArguments : parameterizedType2.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
            if (type3 instanceof Class) {
                return equals(((Class) type3).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            if (type3 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type2).getGenericComponentType(), ((GenericArrayType) type3).getGenericComponentType());
            }
            return false;
        }
        if (type2 instanceof WildcardType) {
            if (!(type3 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            WildcardType wildcardType2 = (WildcardType) type3;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type2 instanceof TypeVariable) || !(type3 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type2;
        TypeVariable typeVariable2 = (TypeVariable) type3;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Class getRawType(Type type2) {
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type2).getRawType();
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) getRawType(((GenericArrayType) type2).getGenericComponentType()), 0).getClass();
        }
        if (type2 instanceof TypeVariable) {
            return Object.class;
        }
        if (type2 instanceof WildcardType) {
            return getRawType(((WildcardType) type2).getUpperBounds()[0]);
        }
        Handlers$$ExternalSyntheticBUOutline0.m$1("Expected a Class, ParameterizedType, or GenericArrayType, but <", type2, "> is of type ", type2 == null ? "null" : type2.getClass().getName());
        return null;
    }

    public static Util.ParameterizedTypeImpl newParameterizedType(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new Util.ParameterizedTypeImpl(null, cls, typeArr);
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(cls, "Missing type arguments for "));
        return null;
    }

    public static int rangeCheckNextInt(JsonReader jsonReader, String str, int i, int i2) {
        int nextInt = jsonReader.nextInt();
        if (nextInt >= i && nextInt <= i2) {
            return nextInt;
        }
        String path = jsonReader.getPath();
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Expected ", nextInt, str, " but was ", " at path ");
        m.append(path);
        throw new JsonDataException(m.toString());
    }
}
