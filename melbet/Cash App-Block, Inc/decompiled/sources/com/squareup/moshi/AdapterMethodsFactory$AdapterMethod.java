package com.squareup.moshi;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class AdapterMethodsFactory$AdapterMethod {
    public final Object adapter;
    public final int adaptersOffset;
    public final Set annotations;
    public final JsonAdapter[] jsonAdapters;
    public final Method method;
    public final boolean nullable;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1222type;

    public AdapterMethodsFactory$AdapterMethod(Type type2, Set set, Object obj, Method method, int i, int i2, boolean z) {
        this.f1222type = Util.canonicalize(type2);
        this.annotations = set;
        this.adapter = obj;
        this.method = method;
        this.adaptersOffset = i2;
        this.jsonAdapters = new JsonAdapter[i - i2];
        this.nullable = z;
    }

    public void bind(Moshi moshi, Moshi.AnonymousClass1 anonymousClass1) {
        JsonAdapter[] jsonAdapterArr = this.jsonAdapters;
        if (jsonAdapterArr.length > 0) {
            Method method = this.method;
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = genericParameterTypes.length;
            int i = this.adaptersOffset;
            for (int i2 = i; i2 < length; i2++) {
                Type type2 = ((ParameterizedType) genericParameterTypes[i2]).getActualTypeArguments()[0];
                Set jsonAnnotations = Util.jsonAnnotations(parameterAnnotations[i2]);
                jsonAdapterArr[i2 - i] = (Types.equals(this.f1222type, type2) && this.annotations.equals(jsonAnnotations)) ? moshi.nextAdapter(anonymousClass1, type2, jsonAnnotations) : moshi.adapter(type2, jsonAnnotations, null);
            }
        }
    }

    public Object fromJson(JsonReader jsonReader) {
        throw new AssertionError();
    }

    public final Object invoke(Object obj) {
        JsonAdapter[] jsonAdapterArr = this.jsonAdapters;
        Object[] objArr = new Object[jsonAdapterArr.length + 1];
        objArr[0] = obj;
        System.arraycopy(jsonAdapterArr, 0, objArr, 1, jsonAdapterArr.length);
        try {
            return this.method.invoke(this.adapter, objArr);
        } catch (IllegalAccessException unused) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return null;
        }
    }

    public void toJson(JsonWriter jsonWriter, Object obj) {
        throw new AssertionError();
    }
}
