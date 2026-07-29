package com.google.gson.internal.bind;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes2.dex */
final class h<T> extends t<T> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.e f6603a;

    /* renamed from: b, reason: collision with root package name */
    private final t<T> f6604b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f6605c;

    h(com.google.gson.e eVar, t<T> tVar, Type type) {
        this.f6603a = eVar;
        this.f6604b = tVar;
        this.f6605c = type;
    }

    @Override // com.google.gson.t
    public T b(com.google.gson.c.a aVar) throws IOException {
        return this.f6604b.b(aVar);
    }

    @Override // com.google.gson.t
    public void a(com.google.gson.c.c cVar, T t) throws IOException {
        t<T> tVar = this.f6604b;
        Type a2 = a(this.f6605c, t);
        if (a2 != this.f6605c) {
            tVar = this.f6603a.a((com.google.gson.b.a) com.google.gson.b.a.get(a2));
            if ((tVar instanceof ReflectiveTypeAdapterFactory.a) && !(this.f6604b instanceof ReflectiveTypeAdapterFactory.a)) {
                tVar = this.f6604b;
            }
        }
        tVar.a(cVar, t);
    }

    private Type a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
