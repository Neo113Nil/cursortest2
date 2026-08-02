package com.squareup.moshi;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.moshi.ClassJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public final class MapJsonAdapter extends JsonAdapter {
    public final /* synthetic */ int $r8$classId = 0;
    public final JsonAdapter keyAdapter;
    public final Object valueAdapter;
    public static final AnonymousClass1 FACTORY$1 = new AnonymousClass1(1);
    public static final AnonymousClass1 FACTORY = new AnonymousClass1(0);

    /* renamed from: com.squareup.moshi.MapJsonAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 implements JsonAdapter.Factory {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        public static void throwIfIsCollectionClass(Type type2, Class cls) {
            Class<?> rawType = Types.getRawType(type2);
            if (cls.isAssignableFrom(rawType)) {
                StringBuilder sb = new StringBuilder("No JsonAdapter for ");
                sb.append(type2);
                String simpleName = cls.getSimpleName();
                String simpleName2 = rawType.getSimpleName();
                sb.append(", you should probably use ");
                sb.append(simpleName);
                sb.append(" instead of ");
                sb.append(simpleName2);
                sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
                throw new IllegalArgumentException(sb.toString());
            }
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        public final JsonAdapter create(Type type2, Set set, final Moshi moshi) {
            Class rawType;
            Type[] actualTypeArguments;
            int i;
            Json json;
            JsonAdapter jsonAdapter;
            Class<?> cls;
            Constructor<?> declaredConstructor;
            Object[] objArr;
            Type type3 = type2;
            int i2 = 0;
            switch (this.$r8$classId) {
                case 0:
                    if (set.isEmpty() && (rawType = Types.getRawType(type3)) == Map.class) {
                        if (type3 == Properties.class) {
                            actualTypeArguments = new Type[]{String.class, String.class};
                        } else if (Map.class.isAssignableFrom(rawType)) {
                            Type resolve = Util.resolve(type3, rawType, Util.getGenericSupertype(type3, rawType, Map.class), new LinkedHashSet());
                            actualTypeArguments = resolve instanceof ParameterizedType ? ((ParameterizedType) resolve).getActualTypeArguments() : new Type[]{Object.class, Object.class};
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$3();
                        }
                        return new MapJsonAdapter(moshi, actualTypeArguments[0], actualTypeArguments[1]).nullSafe();
                    }
                    return null;
                case 1:
                    Type genericComponentType = type3 instanceof GenericArrayType ? ((GenericArrayType) type3).getGenericComponentType() : type3 instanceof Class ? ((Class) type3).getComponentType() : null;
                    if (genericComponentType != null && set.isEmpty()) {
                        return new MapJsonAdapter(Types.getRawType(genericComponentType), moshi.adapter(genericComponentType)).nullSafe();
                    }
                    return null;
                case 2:
                    if ((type3 instanceof Class) || (type3 instanceof ParameterizedType)) {
                        Class rawType2 = Types.getRawType(type3);
                        if (!rawType2.isInterface() && !rawType2.isEnum() && set.isEmpty()) {
                            if (Util.isPlatformType(rawType2)) {
                                throwIfIsCollectionClass(type3, List.class);
                                throwIfIsCollectionClass(type3, Set.class);
                                throwIfIsCollectionClass(type3, Map.class);
                                throwIfIsCollectionClass(type3, Collection.class);
                                String str = "Platform " + rawType2;
                                if (type3 instanceof ParameterizedType) {
                                    str = str + " in " + type3;
                                }
                                a$$ExternalSyntheticBUOutline0.m$3(str.concat(" requires explicit JsonAdapter to be registered"));
                                return null;
                            }
                            if (rawType2.isAnonymousClass()) {
                                a$$ExternalSyntheticBUOutline0.m$3("Cannot serialize anonymous class ".concat(rawType2.getName()));
                            } else if (rawType2.isLocalClass()) {
                                a$$ExternalSyntheticBUOutline0.m$3("Cannot serialize local class ".concat(rawType2.getName()));
                            } else {
                                if (rawType2.getEnclosingClass() != null && !Modifier.isStatic(rawType2.getModifiers())) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Cannot serialize non-static nested class ".concat(rawType2.getName()));
                                    return null;
                                }
                                if (!Modifier.isAbstract(rawType2.getModifiers())) {
                                    Class<? extends Annotation> cls2 = Util.METADATA;
                                    if (cls2 != null && rawType2.isAnnotationPresent(cls2)) {
                                        a$$ExternalSyntheticBUOutline0.m$3(re$$ExternalSyntheticOutline0.m(rawType2, new StringBuilder("Cannot serialize Kotlin type "), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact."));
                                        return null;
                                    }
                                    ClassFactory classFactory = ClassFactory.get(rawType2);
                                    TreeMap treeMap = new TreeMap();
                                    while (type3 != Object.class) {
                                        Class rawType3 = Types.getRawType(type3);
                                        boolean isPlatformType = Util.isPlatformType(rawType3);
                                        Field[] declaredFields = rawType3.getDeclaredFields();
                                        int length = declaredFields.length;
                                        int i3 = i2;
                                        while (i3 < length) {
                                            Field field = declaredFields[i3];
                                            int modifiers = field.getModifiers();
                                            if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !isPlatformType) || ((json = (Json) field.getAnnotation(Json.class)) != null && json.ignore()))) {
                                                i = i2;
                                            } else {
                                                i = i2;
                                                Type resolve2 = Util.resolve(type3, rawType3, field.getGenericType(), new LinkedHashSet());
                                                Set jsonAnnotations = Util.jsonAnnotations(field.getAnnotations());
                                                String name = field.getName();
                                                JsonAdapter adapter = moshi.adapter(resolve2, jsonAnnotations, name);
                                                field.setAccessible(true);
                                                if (json != null) {
                                                    String name2 = json.name();
                                                    if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(name2)) {
                                                        name = name2;
                                                    }
                                                }
                                                ClassJsonAdapter.FieldBinding fieldBinding = (ClassJsonAdapter.FieldBinding) treeMap.put(name, new ClassJsonAdapter.FieldBinding(name, field, adapter));
                                                if (fieldBinding != null) {
                                                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Conflicting fields:\n    ", fieldBinding.field, "\n    ", field);
                                                }
                                            }
                                            i3++;
                                            i2 = i;
                                        }
                                        Class rawType4 = Types.getRawType(type3);
                                        type3 = Util.resolve(type3, rawType4, rawType4.getGenericSuperclass(), new LinkedHashSet());
                                    }
                                    return new ClassJsonAdapter(classFactory, treeMap).nullSafe();
                                }
                                a$$ExternalSyntheticBUOutline0.m$3("Cannot serialize abstract class ".concat(rawType2.getName()));
                            }
                        }
                    }
                    return null;
                case 3:
                    Class rawType5 = Types.getRawType(type3);
                    if (!set.isEmpty()) {
                        return null;
                    }
                    if (rawType5 == List.class || rawType5 == Collection.class) {
                        return new CollectionJsonAdapter$2(moshi.adapter(Types.collectionElementType(type3)), 0).nullSafe();
                    }
                    if (rawType5 == Set.class) {
                        return new CollectionJsonAdapter$2(moshi.adapter(Types.collectionElementType(type3)), 1).nullSafe();
                    }
                    return null;
                case 4:
                    return null;
                default:
                    if (!set.isEmpty()) {
                        return null;
                    }
                    Class cls3 = Boolean.TYPE;
                    StandardJsonAdapters$2 standardJsonAdapters$2 = Types.BOOLEAN_JSON_ADAPTER;
                    if (type3 == cls3) {
                        return standardJsonAdapters$2;
                    }
                    Class cls4 = Byte.TYPE;
                    StandardJsonAdapters$2 standardJsonAdapters$22 = Types.BYTE_JSON_ADAPTER;
                    if (type3 == cls4) {
                        return standardJsonAdapters$22;
                    }
                    Class cls5 = Character.TYPE;
                    StandardJsonAdapters$2 standardJsonAdapters$23 = Types.CHARACTER_JSON_ADAPTER;
                    if (type3 == cls5) {
                        return standardJsonAdapters$23;
                    }
                    Class cls6 = Double.TYPE;
                    StandardJsonAdapters$2 standardJsonAdapters$24 = Types.DOUBLE_JSON_ADAPTER;
                    if (type3 == cls6) {
                        return standardJsonAdapters$24;
                    }
                    Class cls7 = Float.TYPE;
                    StandardJsonAdapters$2 standardJsonAdapters$25 = Types.FLOAT_JSON_ADAPTER;
                    if (type3 == cls7) {
                        return standardJsonAdapters$25;
                    }
                    Class cls8 = Integer.TYPE;
                    StandardJsonAdapters$2 standardJsonAdapters$26 = Types.INTEGER_JSON_ADAPTER;
                    if (type3 == cls8) {
                        return standardJsonAdapters$26;
                    }
                    Class cls9 = Long.TYPE;
                    StandardJsonAdapters$2 standardJsonAdapters$27 = Types.LONG_JSON_ADAPTER;
                    if (type3 == cls9) {
                        return standardJsonAdapters$27;
                    }
                    Class cls10 = Short.TYPE;
                    StandardJsonAdapters$2 standardJsonAdapters$28 = Types.SHORT_JSON_ADAPTER;
                    if (type3 == cls10) {
                        return standardJsonAdapters$28;
                    }
                    if (type3 == Boolean.class) {
                        return standardJsonAdapters$2.nullSafe();
                    }
                    if (type3 == Byte.class) {
                        return standardJsonAdapters$22.nullSafe();
                    }
                    if (type3 == Character.class) {
                        return standardJsonAdapters$23.nullSafe();
                    }
                    if (type3 == Double.class) {
                        return standardJsonAdapters$24.nullSafe();
                    }
                    if (type3 == Float.class) {
                        return standardJsonAdapters$25.nullSafe();
                    }
                    if (type3 == Integer.class) {
                        return standardJsonAdapters$26.nullSafe();
                    }
                    if (type3 == Long.class) {
                        return standardJsonAdapters$27.nullSafe();
                    }
                    if (type3 == Short.class) {
                        return standardJsonAdapters$28.nullSafe();
                    }
                    if (type3 == String.class) {
                        return Types.STRING_JSON_ADAPTER.nullSafe();
                    }
                    if (type3 == Object.class) {
                        return new JsonAdapter(moshi) { // from class: com.squareup.moshi.StandardJsonAdapters$ObjectJsonAdapter
                            public final JsonAdapter booleanAdapter;
                            public final JsonAdapter doubleAdapter;
                            public final JsonAdapter listJsonAdapter;
                            public final JsonAdapter mapAdapter;
                            public final Moshi moshi;
                            public final JsonAdapter stringAdapter;

                            {
                                this.moshi = moshi;
                                Set set2 = Util.NO_ANNOTATIONS;
                                this.listJsonAdapter = moshi.adapter(List.class, set2, null);
                                this.mapAdapter = moshi.adapter(Map.class, set2, null);
                                this.stringAdapter = moshi.adapter(String.class, set2, null);
                                this.doubleAdapter = moshi.adapter(Double.class, set2, null);
                                this.booleanAdapter = moshi.adapter(Boolean.class, set2, null);
                            }

                            @Override // com.squareup.moshi.JsonAdapter
                            public final Object fromJson(JsonReader jsonReader) {
                                int ordinal = jsonReader.peek().ordinal();
                                if (ordinal == 0) {
                                    return this.listJsonAdapter.fromJson(jsonReader);
                                }
                                if (ordinal == 2) {
                                    return this.mapAdapter.fromJson(jsonReader);
                                }
                                if (ordinal == 5) {
                                    return this.stringAdapter.fromJson(jsonReader);
                                }
                                if (ordinal == 6) {
                                    return this.doubleAdapter.fromJson(jsonReader);
                                }
                                if (ordinal == 7) {
                                    return this.booleanAdapter.fromJson(jsonReader);
                                }
                                if (ordinal == 8) {
                                    jsonReader.nextNull();
                                    return null;
                                }
                                StringBuilder sb = new StringBuilder("Expected a value but was ");
                                sb.append(jsonReader.peek());
                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(sb, " at path ", jsonReader.getPath());
                                return null;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
                            
                                if (r1.isAssignableFrom(r0) != false) goto L8;
                             */
                            @Override // com.squareup.moshi.JsonAdapter
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void toJson(JsonWriter jsonWriter, Object obj) {
                                Class<?> cls11 = obj.getClass();
                                if (cls11 == Object.class) {
                                    jsonWriter.beginObject();
                                    jsonWriter.endObject();
                                    return;
                                }
                                Class<?> cls12 = Map.class;
                                if (!cls12.isAssignableFrom(cls11)) {
                                    cls12 = Collection.class;
                                }
                                cls11 = cls12;
                                this.moshi.adapter(cls11, Util.NO_ANNOTATIONS, null).toJson(jsonWriter, obj);
                            }

                            public final String toString() {
                                return "JsonAdapter(Object)";
                            }
                        }.nullSafe();
                    }
                    final Class rawType6 = Types.getRawType(type3);
                    Set set2 = Util.NO_ANNOTATIONS;
                    JsonClass jsonClass = (JsonClass) rawType6.getAnnotation(JsonClass.class);
                    if (jsonClass == null || !jsonClass.generateAdapter()) {
                        jsonAdapter = null;
                    } else {
                        try {
                            try {
                                cls = Class.forName(rawType6.getName().replace("$", "_") + "JsonAdapter", true, rawType6.getClassLoader());
                                try {
                                    if (type3 instanceof ParameterizedType) {
                                        Type[] actualTypeArguments2 = ((ParameterizedType) type3).getActualTypeArguments();
                                        try {
                                            declaredConstructor = cls.getDeclaredConstructor(Moshi.class, Type[].class);
                                            objArr = new Object[]{moshi, actualTypeArguments2};
                                        } catch (NoSuchMethodException unused) {
                                            declaredConstructor = cls.getDeclaredConstructor(Type[].class);
                                            objArr = new Object[]{actualTypeArguments2};
                                        }
                                    } else {
                                        try {
                                            declaredConstructor = cls.getDeclaredConstructor(Moshi.class);
                                            objArr = new Object[]{moshi};
                                        } catch (NoSuchMethodException unused2) {
                                            declaredConstructor = cls.getDeclaredConstructor(null);
                                            objArr = new Object[0];
                                        }
                                    }
                                    declaredConstructor.setAccessible(true);
                                    jsonAdapter = ((JsonAdapter) declaredConstructor.newInstance(objArr)).nullSafe();
                                } catch (NoSuchMethodException e) {
                                    e = e;
                                    if ((type3 instanceof ParameterizedType) || cls.getTypeParameters().length == 0) {
                                        a$$ExternalSyntheticBUOutline0.m$1("Failed to find the generated JsonAdapter constructor for ", (Object) type3, (Throwable) e);
                                        return null;
                                    }
                                    StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                                    sb.append(type3);
                                    String canonicalName = cls.getCanonicalName();
                                    sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                                    sb.append(canonicalName);
                                    sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                                    throw new RuntimeException(sb.toString(), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                cls = null;
                            }
                        } catch (ClassNotFoundException e3) {
                            a$$ExternalSyntheticBUOutline0.m$1("Failed to find the generated JsonAdapter class for ", (Object) type3, (Throwable) e3);
                            return null;
                        } catch (IllegalAccessException e4) {
                            a$$ExternalSyntheticBUOutline0.m$1("Failed to access the generated JsonAdapter for ", (Object) type3, (Throwable) e4);
                            return null;
                        } catch (InstantiationException e5) {
                            a$$ExternalSyntheticBUOutline0.m$1("Failed to instantiate the generated JsonAdapter for ", (Object) type3, (Throwable) e5);
                            return null;
                        } catch (InvocationTargetException e6) {
                            Util.rethrowCause(e6);
                            throw null;
                        }
                    }
                    if (jsonAdapter != null) {
                        return jsonAdapter;
                    }
                    if (rawType6.isEnum()) {
                        return new JsonAdapter(rawType6) { // from class: com.squareup.moshi.StandardJsonAdapters$EnumJsonAdapter
                            public final Enum[] constants;
                            public final Class enumType;
                            public final String[] nameStrings;
                            public final JsonReader.Options options;

                            {
                                this.enumType = rawType6;
                                try {
                                    Enum[] enumArr = (Enum[]) rawType6.getEnumConstants();
                                    this.constants = enumArr;
                                    this.nameStrings = new String[enumArr.length];
                                    int i4 = 0;
                                    while (true) {
                                        Enum[] enumArr2 = this.constants;
                                        if (i4 >= enumArr2.length) {
                                            this.options = JsonReader.Options.of(this.nameStrings);
                                            return;
                                        }
                                        String name3 = enumArr2[i4].name();
                                        String[] strArr = this.nameStrings;
                                        Field field2 = rawType6.getField(name3);
                                        Set set3 = Util.NO_ANNOTATIONS;
                                        Json json2 = (Json) field2.getAnnotation(Json.class);
                                        if (json2 != null) {
                                            String name4 = json2.name();
                                            if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(name4)) {
                                                name3 = name4;
                                            }
                                        }
                                        strArr[i4] = name3;
                                        i4++;
                                    }
                                } catch (NoSuchFieldException e7) {
                                    throw new AssertionError("Missing field in ".concat(rawType6.getName()), e7);
                                }
                            }

                            @Override // com.squareup.moshi.JsonAdapter
                            public final Object fromJson(JsonReader jsonReader) {
                                int selectString = jsonReader.selectString(this.options);
                                if (selectString != -1) {
                                    return this.constants[selectString];
                                }
                                String path = jsonReader.getPath();
                                String nextString = jsonReader.nextString();
                                StringBuilder sb2 = new StringBuilder("Expected one of ");
                                Recorder$$ExternalSyntheticOutline2.m(" but was ", nextString, " at path ", sb2, Arrays.asList(this.nameStrings));
                                sb2.append(path);
                                throw new JsonDataException(sb2.toString());
                            }

                            @Override // com.squareup.moshi.JsonAdapter
                            public final void toJson(JsonWriter jsonWriter, Object obj) {
                                jsonWriter.value(this.nameStrings[((Enum) obj).ordinal()]);
                            }

                            public final String toString() {
                                return re$$ExternalSyntheticOutline0.m(this.enumType, new StringBuilder("JsonAdapter("), ")");
                            }
                        }.nullSafe();
                    }
                    return null;
            }
        }
    }

    public MapJsonAdapter(Moshi moshi, Type type2, Type type3) {
        this.keyAdapter = moshi.adapter(type2);
        this.valueAdapter = moshi.adapter(type3);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader) {
        int i = this.$r8$classId;
        Object obj = this.valueAdapter;
        JsonAdapter jsonAdapter = this.keyAdapter;
        switch (i) {
            case 0:
                LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    jsonReader.promoteNameToValue();
                    Object fromJson = jsonAdapter.fromJson(jsonReader);
                    Object fromJson2 = ((JsonAdapter) obj).fromJson(jsonReader);
                    Object put = linkedHashTreeMap.put(fromJson, fromJson2);
                    if (put != null) {
                        StringBuilder sb = new StringBuilder("Map key '");
                        sb.append(fromJson);
                        String path = jsonReader.getPath();
                        sb.append("' has multiple values at path ");
                        sb.append(path);
                        sb.append(": ");
                        sb.append(put);
                        sb.append(" and ");
                        sb.append(fromJson2);
                        throw new JsonDataException(sb.toString());
                    }
                }
                jsonReader.endObject();
                return linkedHashTreeMap;
            default:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(jsonAdapter.fromJson(jsonReader));
                }
                jsonReader.endArray();
                Object newInstance = Array.newInstance((Class<?>) obj, arrayList.size());
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    Array.set(newInstance, i2, arrayList.get(i2));
                }
                return newInstance;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Object obj) {
        int i = this.$r8$classId;
        JsonAdapter jsonAdapter = this.keyAdapter;
        switch (i) {
            case 0:
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new JsonDataException("Map key is null at ".concat(jsonWriter.getPath()));
                    }
                    int peekScope = jsonWriter.peekScope();
                    if (peekScope != 5 && peekScope != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("Nesting problem.");
                        return;
                    } else {
                        jsonWriter.promoteValueToName = true;
                        jsonAdapter.toJson(jsonWriter, entry.getKey());
                        ((JsonAdapter) this.valueAdapter).toJson(jsonWriter, entry.getValue());
                    }
                }
                jsonWriter.endObject();
                return;
            default:
                jsonWriter.beginArray();
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    jsonAdapter.toJson(jsonWriter, Array.get(obj, i2));
                }
                jsonWriter.endArray();
                return;
        }
    }

    public final String toString() {
        int i = this.$r8$classId;
        JsonAdapter jsonAdapter = this.keyAdapter;
        switch (i) {
            case 0:
                return "JsonAdapter(" + jsonAdapter + "=" + ((JsonAdapter) this.valueAdapter) + ")";
            default:
                return jsonAdapter + ".array()";
        }
    }

    public MapJsonAdapter(Class cls, JsonAdapter jsonAdapter) {
        this.valueAdapter = cls;
        this.keyAdapter = jsonAdapter;
    }
}
