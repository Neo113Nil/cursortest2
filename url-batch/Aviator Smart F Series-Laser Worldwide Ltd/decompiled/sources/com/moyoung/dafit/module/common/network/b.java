package com.moyoung.dafit.module.common.network;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.i;
import retrofit2.v;

/* loaded from: classes4.dex */
public class b extends i.a {
    private final Gson gson;

    private b(Gson gson) {
        this.gson = gson;
    }

    public static b create() {
        return create(new Gson());
    }

    @Override // retrofit2.i.a
    public i requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, v vVar) {
        return new d5.b(this.gson, this.gson.getAdapter(TypeToken.get(type)));
    }

    @Override // retrofit2.i.a
    public i responseBodyConverter(Type type, Annotation[] annotationArr, v vVar) {
        return new d5.a(this.gson, this.gson.getAdapter(TypeToken.get(type)));
    }

    private static b create(Gson gson) {
        if (gson != null) {
            return new b(gson);
        }
        throw new NullPointerException("gson == null");
    }
}
