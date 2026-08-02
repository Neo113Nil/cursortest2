package com.squareup.moshi;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class Moshi {
    public static final ArrayList BUILT_IN_FACTORIES;
    public final List factories;
    public final int lastOffset;
    public final ThreadLocal lookupChainThreadLocal = new ThreadLocal();
    public final LinkedHashMap adapterCache = new LinkedHashMap();

    /* renamed from: com.squareup.moshi.Moshi$1, reason: invalid class name */
    public final class AnonymousClass1 implements JsonAdapter.Factory {
        public final /* synthetic */ int $r8$classId;
        public final Object val$jsonAdapter;
        public final Object val$type;

        public /* synthetic */ AnonymousClass1(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$type = obj;
            this.val$jsonAdapter = obj2;
        }

        public static AdapterMethodsFactory$AdapterMethod get(ArrayList arrayList, Type type2, Set set) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod = (AdapterMethodsFactory$AdapterMethod) arrayList.get(i);
                if (Types.equals(adapterMethodsFactory$AdapterMethod.f1222type, type2) && adapterMethodsFactory$AdapterMethod.annotations.equals(set)) {
                    return adapterMethodsFactory$AdapterMethod;
                }
            }
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter.Factory
        public final JsonAdapter create(final Type type2, final Set set, final Moshi moshi) {
            int i = this.$r8$classId;
            Object obj = this.val$jsonAdapter;
            Object obj2 = this.val$type;
            JsonAdapter jsonAdapter = null;
            switch (i) {
                case 0:
                    if (!set.isEmpty()) {
                        return null;
                    }
                    Set set2 = Util.NO_ANNOTATIONS;
                    if (Types.equals((Type) obj2, type2)) {
                        return (JsonAdapter) obj;
                    }
                    return null;
                default:
                    final AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod = get((ArrayList) obj2, type2, set);
                    final AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod2 = get((ArrayList) obj, type2, set);
                    if (adapterMethodsFactory$AdapterMethod == null && adapterMethodsFactory$AdapterMethod2 == null) {
                        return null;
                    }
                    if (adapterMethodsFactory$AdapterMethod == null || adapterMethodsFactory$AdapterMethod2 == null) {
                        try {
                            jsonAdapter = moshi.nextAdapter(this, type2, set);
                        } catch (IllegalArgumentException e) {
                            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("No ", adapterMethodsFactory$AdapterMethod == null ? "@ToJson" : "@FromJson", " adapter for ");
                            m3m.append(Util.typeAnnotatedWithAnnotations(type2, set));
                            throw new IllegalArgumentException(m3m.toString(), e);
                        }
                    }
                    final JsonAdapter jsonAdapter2 = jsonAdapter;
                    if (adapterMethodsFactory$AdapterMethod != null) {
                        adapterMethodsFactory$AdapterMethod.bind(moshi, this);
                    }
                    if (adapterMethodsFactory$AdapterMethod2 != null) {
                        adapterMethodsFactory$AdapterMethod2.bind(moshi, this);
                    }
                    return new JsonAdapter(jsonAdapter2, moshi, adapterMethodsFactory$AdapterMethod2, set, type2) { // from class: com.squareup.moshi.AdapterMethodsFactory$1
                        public final /* synthetic */ Set val$annotations;
                        public final /* synthetic */ JsonAdapter val$delegate;
                        public final /* synthetic */ AdapterMethodsFactory$AdapterMethod val$fromAdapter;
                        public final /* synthetic */ Type val$type;

                        {
                            this.val$fromAdapter = adapterMethodsFactory$AdapterMethod2;
                            this.val$annotations = set;
                            this.val$type = type2;
                        }

                        @Override // com.squareup.moshi.JsonAdapter
                        public final Object fromJson(JsonReader jsonReader) {
                            AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod3 = this.val$fromAdapter;
                            if (adapterMethodsFactory$AdapterMethod3 == null) {
                                return this.val$delegate.fromJson(jsonReader);
                            }
                            if (!adapterMethodsFactory$AdapterMethod3.nullable && jsonReader.peek() == JsonReader.Token.NULL) {
                                jsonReader.nextNull();
                                return null;
                            }
                            try {
                                return adapterMethodsFactory$AdapterMethod3.fromJson(jsonReader);
                            } catch (InvocationTargetException e2) {
                                Throwable cause = e2.getCause();
                                if (cause instanceof IOException) {
                                    throw ((IOException) cause);
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(cause);
                                String path = jsonReader.getPath();
                                sb.append(" at ");
                                sb.append(path);
                                throw new JsonDataException(sb.toString(), cause);
                            }
                        }

                        @Override // com.squareup.moshi.JsonAdapter
                        public final void toJson(JsonWriter jsonWriter, Object obj3) {
                            AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod3 = AdapterMethodsFactory$AdapterMethod.this;
                            if (adapterMethodsFactory$AdapterMethod3 == null) {
                                this.val$delegate.toJson(jsonWriter, obj3);
                                return;
                            }
                            if (!adapterMethodsFactory$AdapterMethod3.nullable && obj3 == null) {
                                jsonWriter.nullValue();
                                return;
                            }
                            try {
                                adapterMethodsFactory$AdapterMethod3.toJson(jsonWriter, obj3);
                            } catch (InvocationTargetException e2) {
                                Throwable cause = e2.getCause();
                                if (cause instanceof IOException) {
                                    throw ((IOException) cause);
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(cause);
                                String path = jsonWriter.getPath();
                                sb.append(" at ");
                                sb.append(path);
                                throw new JsonDataException(sb.toString(), cause);
                            }
                        }

                        public final String toString() {
                            return "JsonAdapter" + this.val$annotations + "(" + this.val$type + ")";
                        }
                    };
            }
        }
    }

    public final class Lookup extends JsonAdapter {
        public JsonAdapter adapter;
        public final Object cacheKey;
        public final String fieldName;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1224type;

        public Lookup(Type type2, String str, Object obj) {
            this.f1224type = type2;
            this.fieldName = str;
            this.cacheKey = obj;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final Object fromJson(JsonReader jsonReader) {
            JsonAdapter jsonAdapter = this.adapter;
            if (jsonAdapter != null) {
                return jsonAdapter.fromJson(jsonReader);
            }
            a$$ExternalSyntheticBUOutline0.m$1("JsonAdapter isn't ready");
            return null;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public final void toJson(JsonWriter jsonWriter, Object obj) {
            JsonAdapter jsonAdapter = this.adapter;
            if (jsonAdapter != null) {
                jsonAdapter.toJson(jsonWriter, obj);
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("JsonAdapter isn't ready");
            }
        }

        public final String toString() {
            JsonAdapter jsonAdapter = this.adapter;
            return jsonAdapter != null ? jsonAdapter.toString() : super.toString();
        }
    }

    public final class LookupChain {
        public boolean exceptionAnnotated;
        public final ArrayList callLookups = new ArrayList();
        public final ArrayDeque stack = new ArrayDeque();

        public LookupChain() {
        }

        public final IllegalArgumentException exceptionWithLookupStack(IllegalArgumentException illegalArgumentException) {
            if (!this.exceptionAnnotated) {
                this.exceptionAnnotated = true;
                ArrayDeque arrayDeque = this.stack;
                if (arrayDeque.size() != 1 || ((Lookup) arrayDeque.getFirst()).fieldName != null) {
                    StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator descendingIterator = arrayDeque.descendingIterator();
                    while (descendingIterator.hasNext()) {
                        Lookup lookup = (Lookup) descendingIterator.next();
                        sb.append("\nfor ");
                        Type type2 = lookup.f1224type;
                        String str = lookup.fieldName;
                        sb.append(type2);
                        if (str != null) {
                            sb.append(' ');
                            sb.append(str);
                        }
                    }
                    return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        public final void pop(boolean z) {
            this.stack.removeLast();
            if (this.stack.isEmpty()) {
                Moshi.this.lookupChainThreadLocal.remove();
                if (z) {
                    synchronized (Moshi.this.adapterCache) {
                        try {
                            int size = this.callLookups.size();
                            for (int i = 0; i < size; i++) {
                                Lookup lookup = (Lookup) this.callLookups.get(i);
                                JsonAdapter jsonAdapter = (JsonAdapter) Moshi.this.adapterCache.put(lookup.cacheKey, lookup.adapter);
                                if (jsonAdapter != null) {
                                    lookup.adapter = jsonAdapter;
                                    Moshi.this.adapterCache.put(lookup.cacheKey, jsonAdapter);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        BUILT_IN_FACTORIES = arrayList;
        arrayList.add(Types.FACTORY);
        arrayList.add(CollectionJsonAdapter$2.FACTORY);
        arrayList.add(MapJsonAdapter.FACTORY);
        arrayList.add(MapJsonAdapter.FACTORY$1);
        arrayList.add(RecordJsonAdapter.FACTORY);
        arrayList.add(ClassJsonAdapter.FACTORY);
    }

    public Moshi(Builder builder) {
        ArrayList arrayList = builder.factories;
        int size = arrayList.size();
        ArrayList arrayList2 = BUILT_IN_FACTORIES;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.factories = Collections.unmodifiableList(arrayList3);
        this.lastOffset = builder.lastOffset;
    }

    public final JsonAdapter adapter(Type type2, Set set, String str) {
        JsonAdapter jsonAdapter = null;
        if (type2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2("type == null");
            return null;
        }
        if (set == null) {
            a$$ExternalSyntheticBUOutline0.m$2("annotations == null");
            return null;
        }
        Type removeSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type2));
        Object asList = set.isEmpty() ? removeSubtypeWildcard : Arrays.asList(removeSubtypeWildcard, set);
        synchronized (this.adapterCache) {
            try {
                JsonAdapter jsonAdapter2 = (JsonAdapter) this.adapterCache.get(asList);
                if (jsonAdapter2 != null) {
                    return jsonAdapter2;
                }
                LookupChain lookupChain = (LookupChain) this.lookupChainThreadLocal.get();
                if (lookupChain == null) {
                    lookupChain = new LookupChain();
                    this.lookupChainThreadLocal.set(lookupChain);
                }
                ArrayDeque arrayDeque = lookupChain.stack;
                ArrayList arrayList = lookupChain.callLookups;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        Lookup lookup = new Lookup(removeSubtypeWildcard, str, asList);
                        arrayList.add(lookup);
                        arrayDeque.add(lookup);
                        break;
                    }
                    Lookup lookup2 = (Lookup) arrayList.get(i);
                    if (lookup2.cacheKey.equals(asList)) {
                        arrayDeque.add(lookup2);
                        jsonAdapter = lookup2.adapter;
                        if (jsonAdapter == null) {
                            jsonAdapter = lookup2;
                        }
                    } else {
                        i++;
                    }
                }
                try {
                    if (jsonAdapter != null) {
                        return jsonAdapter;
                    }
                    try {
                        int size2 = this.factories.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            JsonAdapter create = ((JsonAdapter.Factory) this.factories.get(i2)).create(removeSubtypeWildcard, set, this);
                            if (create != null) {
                                ((Lookup) lookupChain.stack.getLast()).adapter = create;
                                lookupChain.pop(true);
                                return create;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + Util.typeAnnotatedWithAnnotations(removeSubtypeWildcard, set));
                    } catch (IllegalArgumentException e) {
                        throw lookupChain.exceptionWithLookupStack(e);
                    }
                } finally {
                    lookupChain.pop(false);
                }
            } finally {
            }
        }
    }

    public final Builder newBuilder() {
        List list;
        int i;
        Builder builder = new Builder();
        int i2 = 0;
        while (true) {
            list = this.factories;
            i = this.lastOffset;
            if (i2 >= i) {
                break;
            }
            builder.add((JsonAdapter.Factory) list.get(i2));
            i2++;
        }
        int size = list.size() - BUILT_IN_FACTORIES.size();
        while (i < size) {
            JsonAdapter.Factory factory = (JsonAdapter.Factory) list.get(i);
            if (factory == null) {
                a$$ExternalSyntheticBUOutline0.m$3("factory == null");
                return null;
            }
            builder.factories.add(factory);
            i++;
        }
        return builder;
    }

    public final JsonAdapter nextAdapter(AnonymousClass1 anonymousClass1, Type type2, Set set) {
        if (set == null) {
            a$$ExternalSyntheticBUOutline0.m$2("annotations == null");
            return null;
        }
        Type removeSubtypeWildcard = Util.removeSubtypeWildcard(Util.canonicalize(type2));
        List list = this.factories;
        int indexOf = list.indexOf(anonymousClass1);
        if (indexOf == -1) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) anonymousClass1, "Unable to skip past unknown factory ");
            return null;
        }
        int size = list.size();
        for (int i = indexOf + 1; i < size; i++) {
            JsonAdapter create = ((JsonAdapter.Factory) list.get(i)).create(removeSubtypeWildcard, set, this);
            if (create != null) {
                return create;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("No next JsonAdapter for ".concat(Util.typeAnnotatedWithAnnotations(removeSubtypeWildcard, set)));
        return null;
    }

    public final class Builder {
        public final ArrayList factories;
        public int lastOffset;

        public Builder() {
            this.factories = new ArrayList();
            this.lastOffset = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:82:0x01fa, code lost:
        
            com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0.m$2(r2, r4, ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x01ff, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0130, code lost:
        
            com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0.m$2(r23, r4, ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0137, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01e4  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01e8 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x011c A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void add(final Object obj) {
            String str;
            Type type2;
            String str2;
            Method[] methodArr;
            int i;
            int i2;
            Class<?> cls;
            Object obj2;
            Class cls2;
            final boolean z;
            AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod;
            Object obj3;
            AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod2;
            Type type3;
            Object obj4;
            String str3;
            AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod3;
            AdapterMethodsFactory$AdapterMethod adapterMethodsFactory$AdapterMethod4;
            final boolean z2;
            if (obj == null) {
                a$$ExternalSyntheticBUOutline0.m$3("adapter == null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Class<?> cls3 = obj.getClass();
            loop0: while (true) {
                boolean z3 = true;
                if (cls3 == Object.class) {
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(obj, "Expected at least one @ToJson or @FromJson method on "));
                        return;
                    } else {
                        add((JsonAdapter.Factory) new AnonymousClass1(1, arrayList, arrayList2));
                        return;
                    }
                }
                Method[] declaredMethods = cls3.getDeclaredMethods();
                int length = declaredMethods.length;
                int i3 = 0;
                while (i3 < length) {
                    final Method method = declaredMethods[i3];
                    boolean isAnnotationPresent = method.isAnnotationPresent(ToJson.class);
                    String str4 = "Nullable";
                    Class cls4 = Void.TYPE;
                    if (isAnnotationPresent) {
                        method.setAccessible(z3);
                        final Type genericReturnType = method.getGenericReturnType();
                        final Type[] genericParameterTypes = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                        boolean z4 = z3;
                        if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == JsonWriter.class && genericReturnType == cls4) {
                            int length2 = genericParameterTypes.length;
                            int i4 = 2;
                            while (i4 < length2) {
                                int i5 = length2;
                                Type type4 = genericParameterTypes[i4];
                                String str5 = str4;
                                if ((type4 instanceof ParameterizedType) && ((ParameterizedType) type4).getRawType() == JsonAdapter.class) {
                                    i4++;
                                    length2 = i5;
                                    str4 = str5;
                                } else {
                                    type2 = JsonAdapter.class;
                                    obj4 = "\n    ";
                                    str3 = "Unexpected signature for ";
                                    i2 = i3;
                                    str = str5;
                                }
                            }
                            String str6 = str4;
                            final Set jsonAnnotations = Util.jsonAnnotations(parameterAnnotations[z4 ? 1 : 0]);
                            final Type type5 = genericParameterTypes[z4 ? 1 : 0];
                            final int length3 = genericParameterTypes.length;
                            final boolean z5 = true;
                            final int i6 = 0;
                            final int i7 = 2;
                            i2 = i3;
                            obj4 = "\n    ";
                            str3 = "Unexpected signature for ";
                            type2 = JsonAdapter.class;
                            str = str6;
                            adapterMethodsFactory$AdapterMethod3 = new AdapterMethodsFactory$AdapterMethod(type5, jsonAnnotations, obj, method, length3, i7, z5) { // from class: com.squareup.moshi.AdapterMethodsFactory$2
                                @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                                public Object fromJson(JsonReader jsonReader) {
                                    switch (i6) {
                                        case 1:
                                            return invoke(jsonReader);
                                        default:
                                            return super.fromJson(jsonReader);
                                    }
                                }

                                @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                                public void toJson(JsonWriter jsonWriter, Object obj5) {
                                    switch (i6) {
                                        case 0:
                                            JsonAdapter[] jsonAdapterArr = this.jsonAdapters;
                                            Object[] objArr = new Object[jsonAdapterArr.length + 2];
                                            objArr[0] = jsonWriter;
                                            objArr[1] = obj5;
                                            System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
                                            try {
                                                this.method.invoke(this.adapter, objArr);
                                                break;
                                            } catch (IllegalAccessException unused) {
                                                Path$$ExternalSyntheticBUOutline0.m$2();
                                                return;
                                            }
                                        default:
                                            super.toJson(jsonWriter, obj5);
                                            break;
                                    }
                                }
                            };
                            methodArr = declaredMethods;
                            i = length;
                            cls = cls3;
                            cls2 = cls4;
                            adapterMethodsFactory$AdapterMethod4 = AnonymousClass1.get(arrayList, adapterMethodsFactory$AdapterMethod3.f1222type, adapterMethodsFactory$AdapterMethod3.annotations);
                            if (adapterMethodsFactory$AdapterMethod4 == null) {
                                StringBuilder sb = new StringBuilder("Conflicting @ToJson methods:\n    ");
                                sb.append(adapterMethodsFactory$AdapterMethod4.method);
                                Handlers$$ExternalSyntheticBUOutline0.m(sb, obj4, adapterMethodsFactory$AdapterMethod3.method);
                                return;
                            } else {
                                arrayList.add(adapterMethodsFactory$AdapterMethod3);
                                obj2 = obj4;
                                str2 = str3;
                            }
                        } else {
                            str = "Nullable";
                            type2 = JsonAdapter.class;
                            obj4 = "\n    ";
                            str3 = "Unexpected signature for ";
                            i2 = i3;
                        }
                        if (genericParameterTypes.length != z4 || genericReturnType == cls4) {
                            break loop0;
                        }
                        Set set = Util.NO_ANNOTATIONS;
                        final Set jsonAnnotations2 = Util.jsonAnnotations(method.getAnnotations());
                        final Set jsonAnnotations3 = Util.jsonAnnotations(parameterAnnotations[0]);
                        Annotation[] annotationArr = parameterAnnotations[0];
                        int length4 = annotationArr.length;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length4) {
                                z2 = false;
                                break;
                            } else {
                                if (annotationArr[i8].annotationType().getSimpleName().equals(str)) {
                                    z2 = true;
                                    break;
                                }
                                i8++;
                            }
                        }
                        int i9 = length;
                        final Type type6 = genericParameterTypes[0];
                        final int length5 = genericParameterTypes.length;
                        final int i10 = 0;
                        methodArr = declaredMethods;
                        cls = cls3;
                        cls2 = cls4;
                        i = i9;
                        adapterMethodsFactory$AdapterMethod3 = new AdapterMethodsFactory$AdapterMethod(type6, jsonAnnotations3, obj, method, length5, z2) { // from class: com.squareup.moshi.AdapterMethodsFactory$3
                            public JsonAdapter delegate;

                            @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                            public final void bind(Moshi moshi, Moshi.AnonymousClass1 anonymousClass1) {
                                int i11 = i10;
                                Set set2 = jsonAnnotations2;
                                Type type7 = genericReturnType;
                                Type[] typeArr = genericParameterTypes;
                                Set set3 = jsonAnnotations3;
                                switch (i11) {
                                    case 0:
                                        super.bind(moshi, anonymousClass1);
                                        this.delegate = (Types.equals(typeArr[0], type7) && set3.equals(set2)) ? moshi.nextAdapter(anonymousClass1, type7, set2) : moshi.adapter(type7, set2, null);
                                        break;
                                    default:
                                        super.bind(moshi, anonymousClass1);
                                        this.delegate = (Types.equals(typeArr[0], type7) && set3.equals(set2)) ? moshi.nextAdapter(anonymousClass1, typeArr[0], set3) : moshi.adapter(typeArr[0], set3, null);
                                        break;
                                }
                            }

                            @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                            public Object fromJson(JsonReader jsonReader) {
                                switch (i10) {
                                    case 1:
                                        return invoke(this.delegate.fromJson(jsonReader));
                                    default:
                                        return super.fromJson(jsonReader);
                                }
                            }

                            @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                            public void toJson(JsonWriter jsonWriter, Object obj5) {
                                switch (i10) {
                                    case 0:
                                        this.delegate.toJson(jsonWriter, invoke(obj5));
                                        break;
                                    default:
                                        super.toJson(jsonWriter, obj5);
                                        break;
                                }
                            }
                        };
                        adapterMethodsFactory$AdapterMethod4 = AnonymousClass1.get(arrayList, adapterMethodsFactory$AdapterMethod3.f1222type, adapterMethodsFactory$AdapterMethod3.annotations);
                        if (adapterMethodsFactory$AdapterMethod4 == null) {
                        }
                    } else {
                        str = "Nullable";
                        type2 = JsonAdapter.class;
                        str2 = "Unexpected signature for ";
                        methodArr = declaredMethods;
                        i = length;
                        i2 = i3;
                        cls = cls3;
                        obj2 = "\n    ";
                        cls2 = cls4;
                    }
                    if (method.isAnnotationPresent(FromJson.class)) {
                        method.setAccessible(true);
                        String str7 = str2;
                        final Type genericReturnType2 = method.getGenericReturnType();
                        Set set2 = Util.NO_ANNOTATIONS;
                        final Set jsonAnnotations4 = Util.jsonAnnotations(method.getAnnotations());
                        final Type[] genericParameterTypes2 = method.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                        if (genericParameterTypes2.length >= 1 && genericParameterTypes2[0] == JsonReader.class && genericReturnType2 != cls2) {
                            int length6 = genericParameterTypes2.length;
                            int i11 = 1;
                            while (i11 < length6) {
                                Type type7 = genericParameterTypes2[i11];
                                if ((type7 instanceof ParameterizedType) && ((ParameterizedType) type7).getRawType() == (type3 = type2)) {
                                    i11++;
                                    type2 = type3;
                                }
                            }
                            final int length7 = genericParameterTypes2.length;
                            final boolean z6 = true;
                            final int i12 = 1;
                            final int i13 = 1;
                            adapterMethodsFactory$AdapterMethod = new AdapterMethodsFactory$AdapterMethod(genericReturnType2, jsonAnnotations4, obj, method, length7, i13, z6) { // from class: com.squareup.moshi.AdapterMethodsFactory$2
                                @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                                public Object fromJson(JsonReader jsonReader) {
                                    switch (i12) {
                                        case 1:
                                            return invoke(jsonReader);
                                        default:
                                            return super.fromJson(jsonReader);
                                    }
                                }

                                @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                                public void toJson(JsonWriter jsonWriter, Object obj5) {
                                    switch (i12) {
                                        case 0:
                                            JsonAdapter[] jsonAdapterArr = this.jsonAdapters;
                                            Object[] objArr = new Object[jsonAdapterArr.length + 2];
                                            objArr[0] = jsonWriter;
                                            objArr[1] = obj5;
                                            System.arraycopy(jsonAdapterArr, 0, objArr, 2, jsonAdapterArr.length);
                                            try {
                                                this.method.invoke(this.adapter, objArr);
                                                break;
                                            } catch (IllegalAccessException unused) {
                                                Path$$ExternalSyntheticBUOutline0.m$2();
                                                return;
                                            }
                                        default:
                                            super.toJson(jsonWriter, obj5);
                                            break;
                                    }
                                }
                            };
                            obj3 = obj2;
                            adapterMethodsFactory$AdapterMethod2 = AnonymousClass1.get(arrayList2, adapterMethodsFactory$AdapterMethod.f1222type, adapterMethodsFactory$AdapterMethod.annotations);
                            if (adapterMethodsFactory$AdapterMethod2 == null) {
                                StringBuilder sb2 = new StringBuilder("Conflicting @FromJson methods:\n    ");
                                sb2.append(adapterMethodsFactory$AdapterMethod2.method);
                                Handlers$$ExternalSyntheticBUOutline0.m(sb2, obj3, adapterMethodsFactory$AdapterMethod.method);
                                return;
                            }
                            arrayList2.add(adapterMethodsFactory$AdapterMethod);
                        }
                        if (genericParameterTypes2.length != 1 || genericReturnType2 == cls2) {
                            break loop0;
                        }
                        final Set jsonAnnotations5 = Util.jsonAnnotations(parameterAnnotations2[0]);
                        Annotation[] annotationArr2 = parameterAnnotations2[0];
                        int length8 = annotationArr2.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length8) {
                                z = false;
                                break;
                            } else {
                                if (annotationArr2[i14].annotationType().getSimpleName().equals(str)) {
                                    z = true;
                                    break;
                                }
                                i14++;
                            }
                        }
                        Object obj5 = obj2;
                        final int length9 = genericParameterTypes2.length;
                        final int i15 = 1;
                        obj3 = obj5;
                        adapterMethodsFactory$AdapterMethod = new AdapterMethodsFactory$AdapterMethod(genericReturnType2, jsonAnnotations4, obj, method, length9, z) { // from class: com.squareup.moshi.AdapterMethodsFactory$3
                            public JsonAdapter delegate;

                            @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                            public final void bind(Moshi moshi, Moshi.AnonymousClass1 anonymousClass1) {
                                int i112 = i15;
                                Set set22 = jsonAnnotations4;
                                Type type72 = genericReturnType2;
                                Type[] typeArr = genericParameterTypes2;
                                Set set3 = jsonAnnotations5;
                                switch (i112) {
                                    case 0:
                                        super.bind(moshi, anonymousClass1);
                                        this.delegate = (Types.equals(typeArr[0], type72) && set3.equals(set22)) ? moshi.nextAdapter(anonymousClass1, type72, set22) : moshi.adapter(type72, set22, null);
                                        break;
                                    default:
                                        super.bind(moshi, anonymousClass1);
                                        this.delegate = (Types.equals(typeArr[0], type72) && set3.equals(set22)) ? moshi.nextAdapter(anonymousClass1, typeArr[0], set3) : moshi.adapter(typeArr[0], set3, null);
                                        break;
                                }
                            }

                            @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                            public Object fromJson(JsonReader jsonReader) {
                                switch (i15) {
                                    case 1:
                                        return invoke(this.delegate.fromJson(jsonReader));
                                    default:
                                        return super.fromJson(jsonReader);
                                }
                            }

                            @Override // com.squareup.moshi.AdapterMethodsFactory$AdapterMethod
                            public void toJson(JsonWriter jsonWriter, Object obj52) {
                                switch (i15) {
                                    case 0:
                                        this.delegate.toJson(jsonWriter, invoke(obj52));
                                        break;
                                    default:
                                        super.toJson(jsonWriter, obj52);
                                        break;
                                }
                            }
                        };
                        adapterMethodsFactory$AdapterMethod2 = AnonymousClass1.get(arrayList2, adapterMethodsFactory$AdapterMethod.f1222type, adapterMethodsFactory$AdapterMethod.annotations);
                        if (adapterMethodsFactory$AdapterMethod2 == null) {
                        }
                    }
                    i3 = i2 + 1;
                    length = i;
                    declaredMethods = methodArr;
                    cls3 = cls;
                    z3 = true;
                }
                cls3 = cls3.getSuperclass();
            }
        }

        public Builder(ArrayList arrayList) {
            this.factories = arrayList;
        }

        public void add(Class cls, JsonAdapter jsonAdapter) {
            ArrayList arrayList = Moshi.BUILT_IN_FACTORIES;
            if (cls == null) {
                a$$ExternalSyntheticBUOutline0.m$3("type == null");
            } else if (jsonAdapter != null) {
                add((JsonAdapter.Factory) new AnonymousClass1(0, cls, jsonAdapter));
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("jsonAdapter == null");
            }
        }

        public void add(JsonAdapter.Factory factory) {
            if (factory != null) {
                int i = this.lastOffset;
                this.lastOffset = i + 1;
                this.factories.add(i, factory);
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("factory == null");
        }
    }

    public final JsonAdapter adapter(Type type2, Set set) {
        return adapter(type2, set, null);
    }

    public final JsonAdapter adapter(Type type2) {
        return adapter(type2, Util.NO_ANNOTATIONS, null);
    }
}
